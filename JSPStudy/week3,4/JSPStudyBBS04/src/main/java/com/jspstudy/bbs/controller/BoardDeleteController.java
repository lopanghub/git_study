package com.jspstudy.bbs.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspstudy.bbs.dao.BoardDao;

@WebServlet("/deleteProcess")
public class BoardDeleteController extends HttpServlet {

	// post 방식의 요청을 처리하는 메소드
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// POST 요청 방식의 문자 셋 처리
		request.setCharacterEncoding("utf-8");

		String sNo = request.getParameter("no");
		String pass = request.getParameter("pass");
		String pageNum = request.getParameter("pageNum");
		String type = request.getParameter("type");
		String keyword = request.getParameter("keyword");

		/*
		 * no 또는 pageNum이 비어 있으면 비정상적인 요청이므로 경고 창을 띄우고 브라우저의 history 객체를 이용해 바로 이전으로
		 * 돌려보내기 위해서 자바스크립트로 응답을 작성해 클라이언트로 보낸다.
		 **/
		if (sNo == null || sNo.equals("") || pass == null || pass.equals("") || pageNum == null || pageNum.equals("")) {
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("	alert('잘못된 접근입니다.');");
			out.println("	history.back();");
			out.println("</script>");
			return;
		}

		// BoardDao 객체 생성
		BoardDao dao = new BoardDao();
		int no = Integer.parseInt(sNo);

		// 게시 글의 비밀번호를 체크해 맞지 않으면 이전으로 돌려보낸다.
		boolean isPassCheck = dao.isPassCheck(no, pass);
		if (!isPassCheck) {
			System.out.println("비밀번호 맞지 않음");
			StringBuilder sb = new StringBuilder();
			sb.append("<script>");
			sb.append("	alert('비밀번호가 맞지 않습니다.');");
			sb.append("	history.back();");
			sb.append("</script>");

			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println(sb.toString());
			return;
		}

		// BoardDao 객체를 이용해 게시 글을 삭제한다.
		dao.deleteBoard(no);

		/*
		 * 요청 파라미터에서 type이나 keyword가 비어 있으면 일반 게시 글 리스트에서 넘어온 요청으로 간주하여 false 값을 갖게 한다.
		 * 이 정보는 게시 글 리스트와 검색 리스트로 구분해 돌려보내기 위해 필요하다.
		 **/
		boolean searchOption = (type == null || type.equals("") || keyword == null || keyword.equals("")) ? false
				: true;

		/*
		 * 리다이렉트 할 때 게시 글 리스트의 페이지 번호를 파라미터로 넘겨 사용자가 게시 글 수정을 요청한 페이지와 동일한 페이지로 리다이렉트
		 * 시킨다.
		 **/
		String url = "boardList?pageNum=" + pageNum;

		/*
		 * 검색 리스트 상태에서 게시 글 상세보기로 들어와 게시 글을 삭제하는 것이라면 검색 옵션에 해당하는 검색한 결과에 대한 게시 글 리스트
		 * 페이지로 Redirect 시켜야 하므로 type과 keyword를 Redirect 주소에 추가한다. Redirect 기법은 요청한 결과가
		 * 이동했다고 브라우저에게 이동할 주소를 응답하는 것으로 브라우저는 주소 표시줄에 주소를 입력해 요청하게 되므로 GET 방식 요청이다.
		 **/
		if (searchOption) {

			/*
			 * 리다이렉트 할 때 파라미터에 한글이 포함되어 있으면 한글로 된 파라미터 값은 공백문자로 변경되어 리다이렉트 되기 때문에 한글 데이터는
			 * 깨지게 된다. 이런 경우에는 java.net 패키지의 URLEncoder 클래스를 이용해 아래와 같이 수동으로 URL 인코딩을 하면 이
			 * 문제를 해결할 수 있다.
			 **/
			keyword = URLEncoder.encode(keyword, "utf-8");
			url += "&type=" + type + "&keyword=" + keyword;
		}

		/*
		 * 게시 글 삭제가 완료된 후 response 내장객체의 sendRedirect() 메서드를 이용해 게시 글 리스트로 Redirect 시킨다.
		 * response 내장객체의 sendRedirect() 메서드는 요청한 자원이 다른 곳으로 이동되었다고 웹브라우저에게 응답하면서 이동할
		 * URL을 알려주고 그 쪽으로 다시 요청하라고 응답하는 메소드이다. 웹 브라우저가 요청한 컨텐츠가 다른 곳으로 이동되었다고 응답하면서 그
		 * 쪽으로 다시 요청하라고 이동할 주소를 웹브라우저에게 알려주면 웹브라우저는 그 주소로 다시 요청하게 되는데 이를 리다이렉션이라고 한다.
		 * 
		 * 게시 글 삭제가 완료된 후 Redirect 시키지 않으면 이 페이지를 새로 고침 하여 재요청 할 때 마다 이미 삭제된 게시 글을 계속해서
		 * 삭제하려고 하는 문제가 발생한다.
		 * 
		 * 리다이렉트 할 때 페이지 번호를 요청 파라미터로 넘겨줘야 사용자가 이전에 있었던 게시 글 리스트 페이지로 이동할 수 있다.
		 **/
		response.sendRedirect(url);
	}
}
