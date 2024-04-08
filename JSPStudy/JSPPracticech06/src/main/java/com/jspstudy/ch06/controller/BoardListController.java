package com.jspstudy.ch06.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsppractice.ch06.vo.Board;
import com.jspstudy.ch06.dao.BoardDao01;

@WebServlet("/boardList")
public class BoardListController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
				throws ServletException, IOException {
		BoardDao01 dao =new BoardDao01();
		ArrayList<Board> bList = dao.boardList();	
		
		request.setAttribute("bList", bList);
		
		RequestDispatcher rd =
				request.getRequestDispatcher("/WEB-INF/board/boardList01.jsp");
				rd.forward(request, response);
	}// end doGet(req, resp); 

}
