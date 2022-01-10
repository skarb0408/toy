<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>직원 관리 프로그램</h1>
	
	<form method="post">
		<table>
			<tr>
				<th>직원번호</th>
				<th>직급</th>
				<th>이름</th>
				<th>전화번호</th>
				<th>이메일</th>
			</tr>
			
			<tr>
				<td><input type="text" name="num" value="${sawon.num }"></td>
				<td><input type="text" name="rank" value="${sawon.rank }"></td>
				<td><input type="text" name="name" value="${sawon.name }"></td>
				<td><input type="text" name="phone" value="${sawon.phone }"></td>
				<td><input type="email" name="mail" value="${sawon.mail }"></td>
				<td><input type="hidden" name="no" value="${sawon.no }"></td>					
			</tr>
		</table>
		
		<button type="submit">수정하기</button>
	</form>
</body>
</html>