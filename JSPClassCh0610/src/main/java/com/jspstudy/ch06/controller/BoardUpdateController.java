package com.jspstudy.ch06.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspstudy.ch06.dao.BoardDao;
import com.jspstudy.ch06.vo.Board;

@WebServlet("/updateProcess")
public class BoardUpdateController extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String sNo = request.getParameter("no");
		String pass = request.getParameter("pass");
		
		// 비밀번호 맞는지 체크
		BoardDao dao = new BoardDao();
		
		boolean isPassCheck = dao.isPassCheck(Integer.parseInt(sNo), pass);
		
		if(!isPassCheck) { // 직접 자바스크립트로 응답 - 
			// 비밀번호가 틀리다고 알려주고 이전으로 돌려보낸다.
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("	alert('비밀번호가 틀립니다.')");
			out.println("	history.back();");
			out.println("</script>");
			out.close();
			return;
		}
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String content = request.getParameter("content");
		
		Board board = new Board();
		
		board.setNo(Integer.parseInt(sNo));
		board.setTitle(title);
		board.setWriter(writer);
		board.setContent(content);
		board.setPass(pass);
			
		dao.updateBoard(board);
		
		response.sendRedirect("boardList");
		
	}
	
}

