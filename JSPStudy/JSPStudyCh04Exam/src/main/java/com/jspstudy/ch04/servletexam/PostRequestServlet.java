package com.jspstudy.ch04.servletexam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/postRequest")
public class PostRequestServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException{
		request.setCharacterEncoding("utf-8");
		
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String addr = request.getParameter("addr");
		String gender = request.getParameter("gender");
		gender = "male".equals(gender) ? "남성" : "여성";
		
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("<h1>회원정보</h1>");
		out.println("이름 : "+name+"<br>");
		out.println("나이 : "+age+"<br>");
		out.println("성별 : "+gender+"<br>");
		out.println("주소 : "+addr+"<br>");
		
		out.close();
	}
	
	

}

