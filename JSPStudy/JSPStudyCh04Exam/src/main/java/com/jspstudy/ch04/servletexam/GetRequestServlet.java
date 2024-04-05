package com.jspstudy.ch04.servletexam;

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
		String num1 = req.getParameter("num1");
		String num2 = req.getParameter("num2");
		String method = req.getMethod();
		
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		int firstNum = Integer.parseInt(num1);
		int secondNum = Integer.parseInt(num2);
		int sum=0;
		for(int i=firstNum;i<=secondNum;i++) {
			sum += i;
		}
		
		out.println("<h1>"+num1+"~"+num2+"의 합</h1>");
		out.println(num1+"부터 "+num2+"까지의 합은 "+sum+"입니다.");
		
		out.close();
	}
	
}
