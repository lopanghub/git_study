package com.jspstudy.ch06.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspstduy.ch06.dao.BoardDao;
import com.jspstudy.ch06.vo.Board;

@WebServlet("/updateForm")
public class BoardUpdateFormController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");

		// 입력값 받기
		String sNo = request.getParameter("no");
		String pass = request.getParameter("pass");

		// 비밀번호 맞는지 체크
		BoardDao dao = new BoardDao();
		int no = Integer.parseInt(sNo);
		boolean isPassCheck = dao.isPassCheck(pass, no);

		// 비밀번호가 틀린 경우
		if (!isPassCheck) {// 직접 자바스크립트로 응답 - 이전으로 돌려보낸다
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('비밀번호가 틀립니다')");
			out.println("history.back()");
			out.println("</script>");
			out.close();
			return;
		}

		// 비밀번호가 맞는 경우 - no에 해당하는 게시글을 db에서 읽어와서 폼에 출력
		Board board = dao.getBoard(no);
		request.setAttribute("board", board);

		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/board/updateForm.jsp");

		rd.forward(request, response);

	}

}
