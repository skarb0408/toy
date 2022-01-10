<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">


#title{
	width: 500px;
	margin: 0 auto;
}

#content {
	width: 1000px;
	margin: 0 auto;
}

#content table {
	border: 1px solid black;
	border-collapse: collapse;
}

#content table th, #content table td {
	border: 1px solid black;
}



</style>
</head>
<body>
	<div id="title">
		<h1>직원 관리 프로그램</h1>
	</div>
	
	<div id="content">
		<table>
			<tr>
				<th>직원번호</th>
				<th>직급</th>
				<th>이름</th>
				<th>전화번호</th>
				<th>이메일</th>
				<th>수정</th>
				<th>삭제</th>
			</tr>
			<c:forEach var="sawon" items="${sawonList }">
				<tr>
					<td>${sawon.num }</td>
					<td>${sawon.rank }</td>
					<td>${sawon.name }</td>
					<td>${sawon.phone }</td>
					<td>${sawon.mail }</td>
					<td><a href="${pageContext.request.contextPath }/updateSawon/${sawon.no }">수정</a></td>
					<td><a href="${pageContext.request.contextPath }/delete/${sawon.no }">삭제</a></td>
				</tr>
			</c:forEach>	
		</table>
		
		<div id="insertSawon">
			<form name="f" method="post">
				<table>
					<tr>
						<th>사원번호</th>
						<td><input type="text" name="num"></td>
					</tr>
					<tr>
						<th>직급</th>
						<td><input type="text" name="rank"></td>
					</tr>
					<tr>
						<th>이름</th>
						<td><input type="text" name="name"></td>
					</tr>
					<tr>
						<th>전화번호</th>
						<td><input type="text" name="phone"></td>
					</tr>
					<tr>
						<th>이메일</th>
						<td><input type="email" name="mail"></td>
					</tr>
				</table>
			</form>
			<div class="btn_insert" onclick="chk_form();" style="width: 65px; border: 1px solid black;">추가하기</div>
		</div>
	</div>
	<script type="text/javascript">
		var ojb = document.f;
		
		function chk_form(){
			var msg = confirm("등록하시겠습니까?")		
			
			if(ojb.num.value=="") {
				alert("사원번호를 입력해 주세요.");
				ojb.num.focus();
				return;
			}
			
			if(ojb.rank.value=="") {
				alert("직급을 입력해 주세요.");
				ojb.rank.focus();
				return;
			}
					
			if(ojb.name.value=="") {
				alert("이름을 입력해 주세요.");
				ojb.name.focus();
				return;
			}
			
			if(ojb.phone.value=="") {
				alert("전화번호을 입력해 주세요.");
				ojb.phone.focus();
				return;
			}

			var phoneReg=/(01[016789])-\d{3,4}-\d{4}/g;
			if(!phoneReg.test(ojb.phone.value)) {
				alert("전화번호를 형식에 맞게 입력해주세요.");
				ojb.phone.focus();
				return;
			}
			
			if (msg) {
				ojb.submit();
			}
		}
	</script>
</body>
</html>