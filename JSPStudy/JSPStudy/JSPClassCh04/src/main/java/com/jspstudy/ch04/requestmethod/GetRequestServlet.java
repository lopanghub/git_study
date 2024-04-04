package com.jspstudy.ch04.requestmethod;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/getRequest")
public class GetRequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;        


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num1 =request.getParameter("num1");
		String num2 = request.getParameter("num2");
		
		String method =request.getMethod();
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		int firstNum = Integer.parseInt(num1);
		int secondNum = Integer.parseInt(num2);
		
		out.println("<h2>" +method+" 방식 요청 처리</h2>");
		out.println("첫 번째 입력 값 : " + firstNum + "<br/>");
		out.println("두 번째 입력 값 : " + secondNum + "<br/>");
		out.println("두 수를 곱한 값 : " + (firstNum * secondNum) + "<br/>");
		
		out.close();
	}
	
}
