package com.jspstudy.ch06.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspstduy.ch06.dao.BoardDao;
import com.jspstudy.ch06.vo.Board;

@WebServlet("/deleteProcess")
public class BoardDeleteController2 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");

		// 입력 처리
		String sNo = request.getParameter("no");

		String pass = request.getParameter("pass");

		// 수정 자격 검증
		BoardDao dao = new BoardDao();
		boolean isPassCheck = dao.isPassCheck(pass, Integer.parseInt(sNo));

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

		dao.deleteBoard(Integer.parseInt(sNo));

		// 게시글 리스트로 Redirect 시킨다
		// 자원이 이동되었다고 응답하면서 그쪽으로 이동하라고 주소를 알려주는 것
		response.sendRedirect("boardList");
	}

}
