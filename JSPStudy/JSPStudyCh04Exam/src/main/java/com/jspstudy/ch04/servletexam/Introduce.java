package com.jspstudy.ch04.servletexam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/me")
public class Introduce extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException{
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<b>이름 : </b>이현학<br>");
		out.println("<b>나이 : </b>92년생<br>");
		out.println("<b>주소 : </b>관악구 신림로23길");
		
		out.close();
	}
}
