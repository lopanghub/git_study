package com.jspPractice.ch02.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/today")
public class TodayServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Calendar today = Calendar.getInstance();

		resp.setContentType("text/html; charset=utf-8");

		PrintWriter out = resp.getWriter();

		out.println("<html>");
		out.println("	<head><title>오늘의 날짜</title></head>");
		out.println("	<body>");
		out.print("			오늘은 " + today.get(Calendar.YEAR) + "년 ");
		out.print((today.get(Calendar.MONTH) + 1) + "월 ");
		out.print(today.get(Calendar.DAY_OF_MONTH) + "일 입니다.");
		out.println("	</body>");
		out.println("<html>");

		out.close();
	}

}
