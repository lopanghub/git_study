<%@page import="com.jspstudy.ch03.vo.LottoNum"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	List<LottoNum> lottoList = new ArrayList<>();
	LottoNum lotto = new LottoNum("986회", 2, 6,7,11,34,41,43);
	lottoList.add(lotto);
	lotto = new LottoNum("987회", 2, 6,7,11,34,41,11);
	lottoList.add(lotto);
	lotto = new LottoNum("988회", 2, 6,7,11,34,41,21);
	lottoList.add(lotto);
	lotto = new LottoNum("989회", 2, 6,7,11,34,41,31);
	lottoList.add(lotto);
	lotto = new LottoNum("990회", 2, 6,7,11,34,40,41);
	lottoList.add(lotto);
	
	request.setAttribute("lottoList", lottoList);
	
	pageContext.forward("lottoNumResult.jsp");
%>