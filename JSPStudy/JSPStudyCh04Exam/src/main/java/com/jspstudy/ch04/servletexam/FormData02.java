package com.jspstudy.ch04.servletexam;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/formData02")
public class FormData02 extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		StudentInfo student = new StudentInfo();
		StringBuilder sb= new StringBuilder();
		
		student.setName(req.getParameter("name"));
		student.setGender(req.getParameter("gender"));
		String tel =	req.getParameter("tel1")+req.getParameter("tel2")+req.getParameter("tel3");	
		student.setTel1(tel);
		
		String[] jobs = req.getParameterValues("job");
		for(int i =0;i<jobs.length;i++) {
			sb.append(jobs[i]);
			if(i<jobs.length-1) {
				sb.append(", ");
			}
		}
		String selectedJobs = sb.toString();
		student.setJob(selectedJobs);
		sb.setLength(0);
		
		String[] subjects = req.getParameterValues("subject");
		for(int i =0;i<subjects.length;i++) {
			sb.append(subjects[i]);
			if(i<subjects.length-1) {
				sb.append(", ");
			}
		}
		String selectedSubjects =sb.toString();
		student.setSubject(selectedSubjects);
		
		req.setAttribute("student", student);
		
		RequestDispatcher rd =
				req.getRequestDispatcher("view/formDataView02.jsp");
		rd.forward(req, resp);
	}
	
	
}
