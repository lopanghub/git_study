package com.jsppractice.bbs.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsppractice.bbs.dao.WasherDao;
import com.jsppractice.bbs.vo.Washer;

@WebServlet("/washerList")
public class WasherListController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		WasherDao dao = new WasherDao();
		List<Washer> washerList = dao.washerList();
		
		request.setAttribute("washerList", washerList);
		
		RequestDispatcher rd=
				request.getRequestDispatcher("/WEB-INF/washer/washerList.jsp");
		rd.forward(request, response);
		
	}
	

}
