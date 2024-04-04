package com.jspstudy.ch02.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//서블릿 클래스 - HttpServlet -2가지 Get방식 Post 방식 요청을 처리하는 메서드가 따로 있다
@WebServlet("/today")
public class TodayServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Object obj;
		
		resp.setContentType("text/html; charset=UTF-8");
		
		String id = req.getParameter("id");
		if(id ==null|| id.trim().isEmpty()) {
			id="guest";
		}
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		
		out.println("<body>");
		out.println("<h1>입력값</h1>");
		out.println("안녕하세요"+id+"님<br>");
	
		out.println(req.getMethod()+"방식 요청 처리");
		out.println("</body>");
		out.println("</html>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		doGet(req, resp);
	}
	
}
