package com.jspstudy.ch06.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspstudy.ch06.dao.BoardDao;
import com.jspstudy.ch06.vo.Board;

@WebServlet("/boardDetail")
public class BoardDetailController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 입력 값
		String no = request.getParameter("no");

		// 화면을 구성할 데이터를 작성 - DB
		BoardDao dao = new BoardDao();
		Board board = dao.getBoard(Integer.parseInt(no));

		// JSP에서 사용하기 위해서 HttpServletRequest 객체의 속성에 저장
		// 요청을 처리한 결과 데이터 모델(Model)
		request.setAttribute("board", board);

		// 화면을 작성 - JSP에서 가서
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/board/boardDetail.jsp");
		rd.forward(request, response);
	}

}
