
<%@page import="com.jspstudy.ch03.vo.LottoNum"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	ArrayList <LottoNum> lottoList = new ArrayList<LottoNum>();
	LottoNum lotto = new LottoNum("907회",21,27,29,38,40,44,37);
	lottoList.add(lotto);
	lotto = new LottoNum("908회",3,16,21,22,23,44,30);
	lottoList.add(lotto);
	lotto = new LottoNum("909회",21,27,29,38,40,44,37);
	lottoList.add(lotto);
	lotto = new LottoNum("910회",1,11,17,27,35,39,31);
	lottoList.add(lotto);
	lotto = new LottoNum("911회",4,5,12,14,32,42,35);
	lottoList.add(lotto);
	lotto = new LottoNum("912회",5,8,18,21,22,38,10);
	lottoList.add(lotto);
	lotto = new LottoNum("913회",6,14,16,21,27,37,40);
	lottoList.add(lotto);
	lotto = new LottoNum("914회",16,19,24,33,42,44,27);
	lottoList.add(lotto);
	lotto = new LottoNum("915회",2,6,11,13,22,37,14);
	lottoList.add(lotto);
	lotto = new LottoNum("916회",9,21,22,32,35,36,17);
	lottoList.add(lotto);
	
	request.setAttribute("lottoList", lottoList);
	
	pageContext.forward("lottoNumListResult.jsp");
%>