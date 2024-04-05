package com.jsppractice.ch04.requestmethod;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getRequest")
public class GetRequestServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				
		String num1 =req.getParameter("num1");
		String num2 =req.getParameter("num2");
		
		
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter out =resp.getWriter();
		String method = req.getMethod();
		
		int firstNum = Integer.parseInt(num1);
		int secondNum = Integer.parseInt(num2);
		
		out.println("<h2>"+method+"방식 요청 처리</h2>");
		out.println("첫 번째 입력값 : "+firstNum+"<br>");
		out.println("두 번째 입력값 : "+secondNum+"<br>");
		out.println("두 수의 곱 : "+secondNum*firstNum+"<br>");
		
		out.close();
	}
	
}
