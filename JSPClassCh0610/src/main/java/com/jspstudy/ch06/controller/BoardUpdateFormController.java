package com.jspstudy.ch06.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspstudy.ch06.dao.BoardDao;
import com.jspstudy.ch06.vo.Board;

@WebServlet("/updateForm")
public class BoardUpdateFormController extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String sNo = request.getParameter("no");
		String pass = request.getParameter("pass");
		
		BoardDao dao= new BoardDao();
		int no = Integer.parseInt(sNo);
		boolean isPassCheck = dao.isPassCheck(no, pass);
		
		if(!isPassCheck) {
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script>alert('비밀번호 틀립니다.')");
			out.println("history.back();</script>");
			out.close();
			return;
		}
		
		Board board = dao.getBoard(no);
		request.setAttribute("board", board);
		
		RequestDispatcher rd=
				request.getRequestDispatcher("/WEB-INF/board/updateForm.jsp");
		rd.forward(request, response);
	}
	
}