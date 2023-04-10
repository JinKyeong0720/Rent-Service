<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<jsp:include page="header" />
<body>
	<section>
		<%
		//String booking_register_Num;
		//String booking_vehicle_ID ;
		//booking_client_Password varchar(100) NOT NULL,
		//booking_client_ID varchar(100) NOT NULL,
		//booking_venue_Locate varchar(100) NOT NULL,
		//booking_Time TIMESTAMP DEFAULT current_timestamp,
		//booking_register_Date TIMESTAMP,
		//booking_use_Day int(100) NOT NULL,
		//booking_use_Hour int(100) NOT NULL,
		//booking_total_Payment int(100)  NOT NULL,
		%>
		<th>예약하기</th>

		<tr>
			<td>예약번호</td>
			<td></td>
		</tr>
		<tr>
			<td>차량 종류</td>
			<td></td>
		</tr>
		<tr>
			<td>차량 번호</td>
			<td></td>
		</tr>
		<tr>
			<td>운전자</td>
			<td></td>
		</tr>
		<tr>
			<td>차량 이용할 날짜</td>
			<td></td>
		</tr>
		<tr>
			<td>차량 이용할 시간</td>
			<td></td>
		</tr>

	</section>
</body>
<jsp:include page="footer" />
</html>