<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/myStyle.css" >
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
<script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
</head>
<body>
	<%@ include file="header.jsp" %>
	<div class="container-fluid main-container">
	<%@ include file="sidebarLeft.jsp" %>
		<div class="col-md-10">
			<div class="panel panel-default">
 		 		<div class="panel-body">
    				<form action="admin/staff/add" method="post">
    					<label>ID</label>
					    <input type="text" name="staffID" class="span3">
					    <br>
    					<label>Họ tên</label>
					    <input type="text" name="firstname" class="span3">
					    <br>
					    <label>Năm sinh</label>
					    <input type="text" name="email" class="span3">
					    <br>
					    <label>Quê quán</label>
					    <input type="text" name="username" class="span3">
					    <br>
					    <label>Phòng ban</label>
					    <input type="text" name="" class="span3">
					    <br>
					    <label>Chức vụ</label>
					    <input type="text" name="" class="span3">
					    <br>
					    <label>Ngày làm việc</label>
					    <input type="text" name="" class="span3">
					    <br>
					    <label>Phụ cấp</label>
					    <input type="text" name="" class="span3">
					    <br>
					    <label>Hệ số lương</label>
					    <input type="text" name="" class="span3">
					    <br>
					    <input type="submit" value="Sign up" class="btn btn-primary pull-right">
    				</form>
 	 			</div>
			</div>
		</div>
	</div>
</body>
</html>