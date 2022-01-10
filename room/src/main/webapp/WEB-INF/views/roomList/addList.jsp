<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="content">
		<form action="${pageContext.request.contextPath }/addList" method="post">
			<table>
				<tr>
					<th>작성자</th>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<th>제목</th>
					<td><input type="text" name="title"></td>
				</tr>
				<tr>
					<th>본문내용</th>
					<td>
						<textarea rows="4" cols="30" name="content"></textarea>
					</td>
				</tr>
			</table>
			
			<button type="submit">등록</button>
			<a href="${pageContext.request.contextPath }/allList"></a>
		</form>
	</div>
</body>
</html>