<%@page import="client.controller.ClientDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<jsp:include page="header"></jsp:include>
<body>
	<%
	if (session.getAttribute("log") != null) {
		session.removeAttribute("log");
	}

	ClientDao clientDao = ClientDao.getInstance();
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String phone = request.getParameter("phone");
	%>
	<section>
		<h2>회원가입</h2>
		<form method="POST" action="../service">
			<table border="1">
				<tr>
					<th>아이디</th>
					<td><input type="text" placeholder="아이디를 입력하세요" id="id"
						name="id" value="<%=id != null ? id : ""%>"
						<%=id == null ? "autofocus" : ""%>>
					</td>
				</tr>

				<tr>
					<th>비밀번호</th>
					<td><input type="password" placeholder="비밀번호를 입력하세요" id="pw"
						name="pw" value="<%=pw != null ? pw : ""%>"
						<%=pw == null ? "autofocus" : ""%>>
					</td>
				</tr>

				<tr>
					<th>이름</th>
					<td><input type="text" placeholder="이름를 입력하세요" id="name" name="name"
						value="<%=name != null ? name : ""%>"
						<%=name == null ? "autofocus" : ""%>>
					</td>
				</tr>

				<tr>
					<th>전화번호</th>
					<td><input type="text" placeholder="전화번호를 입력하세요" id="phone"
						name="phone" value="<%=phone != null ? phone : ""%>"
						<%=phone == null ? "autofocus" : ""%>>
					</td>
				</tr>
			</table>
			<input type="button" value="회원가입" onclick="checkValues(form)">
		</form>
	</section>
	<script src="../resources/validation.js" charset="UTF-8"></script>
</body>

<jsp:include page="footer"/>
</html>