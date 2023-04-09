<%@page import="client.Client"%>
<%@page import="client.controller.ClientDao"%>
<%@page import="util.DBManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<jsp:include page="header" />
<body>
	<h2>메인화면</h2>
	
	<%
		ClientDao clientDao = ClientDao.getInstance();
		//Client client = clientDao.getClientById("1");
		//session.setAttribute("log", client);
	%>

</body>
<jsp:include page="footer" />
</html>