<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 페이지</title>
</head>
<body>
	<div id="header">
		<div class="top_navi">
			<ul>
				<li>메인페이지</li>
				<li>게시판</li>
				<li>ㅁㄴㅇ러ㅏㄴ</li>
				<li>ㄴㅇ러ㅏㄴ</li>
			</ul>
		</div>
		
	</div>
	
	<div id="content">
		<div class="list">
			<table>
				<tr>
					<th>글번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>내용</th>
					<th>작성일자</th>
					<th>상태</th>
				</tr>
				
				<c:forEach var="room" items="${roomList }">
				<tr>
					<td>${room.num }</td>
					<td>${room.title }</td>
					<td>${room.name }</td>
					<td>${room.content }</td>
					<td>${room.days }</td>
					<td colspan="2">
						<a href="#">삭제</a>
						<a href="#">수정</a>
					</td>
				</tr>
				</c:forEach>
			</table>
		</div>
		<div class="btn">
			<a href="${pageContext.request.contextPath }/addList">등록하기</a>
		</div>
	</div>
</body>
</html>