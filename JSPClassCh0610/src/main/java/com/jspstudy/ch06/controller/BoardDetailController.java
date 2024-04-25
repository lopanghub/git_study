package com.jspstudy.ch06.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jspstudy.ch06.dao.BoardDao;
import com.jspstudy.ch06.vo.Board;

@WebServlet("/boardDetail")
public class BoardDetailController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String no = request.getParameter("no");
		
		BoardDao dao = new BoardDao();
		Board board = dao.getBoard(Integer.parseInt(no));
		
		request.setAttribute("board", board);
		
		
		
		RequestDispatcher rd=
				request.getRequestDispatcher("/WEB-INF/board/boardDetail.jsp");
		rd.forward(request, response);
	}
	
}