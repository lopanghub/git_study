package com.jspstudy.ch05.exam;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/postRequest")
public class JSPStudyCh0501Exam extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String name, color;
					
		
		name = request.getParameter("name");
		color = request.getParameter("color");
		color = "red".equals(color)? "빨강색" : "blue".equals(color) ? "파랑색" : "초록색";
		 
		Map<String, String> foodMap = new HashMap<>();
		    foodMap.put("food1", "짜장면");
		    foodMap.put("food2", "짬뽕");
		    foodMap.put("food3", "탕수육");
	    String foodLabel = foodMap.get(request.getParameter("food"));
		
	    Map<String, String> animalMap = new HashMap<>();
	    animalMap.put("ham", "햄스터");
	    animalMap.put("cat", "고양이");
	    animalMap.put("tiger", "호랑이");
	    animalMap.put("lion", "사자");
	    animalMap.put("dog", "개");
	    String[] animals = request.getParameterValues("animal");
	    String[] animalLabels = Arrays.stream(animals)
	                                  .map(animalMap::get)
	                                  .toArray(String[]::new);
	    StringBuilder animal= new StringBuilder();
	    for(int i=0;i<animalLabels.length;i++) {
	    	animal.append(animalLabels[i]);
	    	if(i<animalLabels.length-1) {
	    		animal.append(", ");
	    	}
	    }
	    
	    Map<String, String> hobbyMap = new HashMap<>();
	    hobbyMap.put("game", "게임");
	    hobbyMap.put("travel", "여행");
	    hobbyMap.put("book", "독서");
	    hobbyMap.put("fish", "낚시");
	    String[] hobbies = request.getParameterValues("hobby");
	    String[] hobbyLabels = Arrays.stream(hobbies)
	                                 .map(hobbyMap::get)
	                                 .toArray(String[]::new);
	    StringBuilder hobby = new StringBuilder();
	    for(int i=0;i<hobbyLabels.length;i++) {
	    	hobby.append(hobbyLabels[i]);
	    	if(i<hobbyLabels.length-1) {
	    		hobby.append(", ");
	    	}
	    }
	    
	   
	    
	    
		request.setAttribute("name", name);
		request.setAttribute("color", color);
		request.setAttribute("food", foodLabel);
		request.setAttribute("animal", animal);
		request.setAttribute("hobby", hobby);
		
		RequestDispatcher rd = 
				request.getRequestDispatcher("ch0501ExamResult.jsp");
		rd.forward(request, response);

	}
	
}
