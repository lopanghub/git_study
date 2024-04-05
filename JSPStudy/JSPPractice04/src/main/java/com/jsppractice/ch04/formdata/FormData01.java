package com.jsppractice.ch04.formdata;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/formData01")
public class FormData01 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserInfo userInfo = new UserInfo();
		
		userInfo.setName(req.getParameter("name"));      
	    userInfo.setId(req.getParameter("id"));
	    userInfo.setPass(req.getParameter("pass"));
	    userInfo.setGender(req.getParameter("gender"));     
	    userInfo.setnMail(receiveMail(req.getParameter("nMail")));
	    userInfo.setaMail(receiveMail(req.getParameter("aMail")));
	    userInfo.setiMail(receiveMail(req.getParameter("iMail")));
 	    userInfo.setJob(req.getParameter("job"));
	    
	    req.setAttribute("user", userInfo);
	    
	    RequestDispatcher rd =
	    		req.getRequestDispatcher("view/formDataView01.jsp");
	    rd.forward(req, resp);
	}
	
	private String receiveMail(String mail) {
		if(mail == null) {
			return "받지 않음";
		} else {
			return "받음";
		}
	}
	
}
