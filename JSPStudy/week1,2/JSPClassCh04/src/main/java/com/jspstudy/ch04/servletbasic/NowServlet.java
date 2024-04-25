package com.jspstudy.ch04.servletbasic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NowServlet extends HttpServlet {
	// Get - doGet()
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();// charStream
		out.println("<h2>서블릿 작성하기<h2>");
		out.println("<div>Hi Servlet</div>");

		out.close();
	}

	// Post - doPost()
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
}