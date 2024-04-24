package com.jsppractice.bbs.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsppractice.bbs.dao.WasherDao;
import com.jsppractice.bbs.vo.Washer;

@WebServlet("/washerDetail")
public class WasherDetailController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String no = request.getParameter("no");
		
		WasherDao dao = new WasherDao();
		Washer washer = dao.getWasher(Integer.parseInt(no));
		
		request.setAttribute("washer", washer);
		
		RequestDispatcher rd=
				request.getRequestDispatcher("/WEB-INF/washer/washerDetail.jsp");
		rd.forward(request, response);
	}
	
}
