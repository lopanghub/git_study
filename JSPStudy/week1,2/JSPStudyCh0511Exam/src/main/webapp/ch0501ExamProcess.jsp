<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 폼으로 부터 전송된 데이터를 저장하기 위한 변수 선언
	String name, color, food, phone2, phone3;
	
	// 폼에서 하나의 name 속성으로 전송된 여러 데이터를 저장하기 위한 String 배열 선언
	String[] animal, hobby;
	
	// 폼에서 하나의 name 속성에 하나의 데이터만 전송된 경우 
	name = request.getParameter("name");
	color = request.getParameter("color");
	food = request.getParameter("food");	
	
	/* 폼에서 하나의 name 속성으로 여러 데이터가 전송된 경우 넘어온 데이터를 String 
	 * 배열로 받을 수 있다. 주로 체크 박스의 name 속성의 값을 동일하게 설정하여 여러 
	 * 데이터를 선택할 수 있도록 구성하는 경우와 선택 박스에 multiple이 지정되어 다중
	 * 선택 모드인 경우 getParameterValues()로 받아 데이터를 처리한다.
	 **/		
	animal = request.getParameterValues("animal");
	hobby = request.getParameterValues("hobby");
	
	// 최종적으로 메시지를 저장할 변수
	String sAnimal = "";
	String sHobby = "";
	
	// checkbox에서 하나도 선택되지 않았을 경우와 다중으로 선택되었을 경우 처리
	if(animal == null) {
		sAnimal = "좋아하는 동물은 없고 ";
	} else {
		for(int i = 0; i < animal.length; i++) {		
			sAnimal += (i == animal.length - 1) ? animal[i] : animal[i] + ", ";
		}
		sAnimal = "좋아하는 동물은 " + sAnimal + "이고";
	}
	
	// 콤보박스에서 하나도 선택되지 않았을 경우와 다중으로 선택되었을 경우 처리
	if(hobby == null) {
		sHobby = "취미는 없습니다.";
	} else {
		for(int i = 0; i < hobby.length; i++) {		
			sHobby += (i == hobby.length - 1) ? hobby[i] : hobby[i] + ", ";
		}
		sHobby = sHobby + "의 취미를 가지고 계십니다.";	
	}
	
	
	// View 페이지에서 출력하가 위해 요청을 처리한 결과를 request 내장객체의 속성에 저장한다.
	request.setAttribute("name", name);
	request.setAttribute("color", color);
	request.setAttribute("food", food);
	request.setAttribute("sAnimal", sAnimal);
	request.setAttribute("sHobby", sHobby);
	
	// pageContext 내장객체의 forward() 메서드를 사용해 다른 JSP 페이지로 포워딩 한다.
	pageContext.forward("ch0501ExamResult.jsp");
%>    
