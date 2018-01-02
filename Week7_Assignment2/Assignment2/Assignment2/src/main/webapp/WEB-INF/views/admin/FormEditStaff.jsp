<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/formStyle.css" >
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/myStyle.css" >
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
<script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
<script type="text/javascript" src="http://code.jquery.com/jquery-1.7.2.js"></script>
<script>
$(document).ready(function(){ 
	$("select[name=position]").change(function(){
		var Position = $(this).val();
		if(Position == "Trưởng phòng"){
			$("select[name=allowance]").val("1000")
		}else if(Position == "Phó phòng"){
			$("select[name=allowance]").val("600")
		}else if(Position == "Nhân viên"){
			$("select[name=allowance]").val("400")
		}
  });
});
</script>

</head>
<body>  
  <%@ include file="header.jsp" %>
  <div class="container-fluid main-container">
  <%@ include file="sidebarLeft.jsp" %>
	<div class="col-md-10">
	  <div class="panel panel-default">
 	    <div class="panel-body">
    	  <form class="formEdit" action="edit" method="post">
            <h1>Chỉnh sửa thông tin</h1>
    		<label>ID</label>
			<input type="text" name="staffId" class="" value="${staff.staffId}" readonly>
			<br>
    		<label>Họ tên</label>
			<input type="text" name="name" class="" value="${staff.name}">
			<br>
			<label>Năm sinh</label>
			<input type="text" name="birthYear" class="" value="${staff.birthYear}">
			<br>
			<label>Quê quán</label>
			<input type="text" name="country" class="" value="${staff.country}">
			<br>
			<label>Phòng ban</label>
			<input type="text" name="department" class="" value="${staff.department}">
			<br>
			<label>Chức vụ</label>
			<select name="position">
			  <option value="Trưởng phòng" ${staff.position.equals("Trưởng phòng") ? 'selected="selected"' : ''}>
			  Trưởng phòng
			  </option>
			  <option value="Phó phòng" ${staff.position.equals("Phó phòng") ? 'selected="selected"' : ''}>
			  Phó phòng
			  </option>
			  <option value="Nhân viên" ${staff.position.equals("Nhân viên") ? 'selected="selected"' : ''}>
			  Nhân viên
			  </option>
			</select>
			
			<br>
			<label>Ngày làm việc</label>
			<input type="text" name="workDays" value="${staff.workDays}">
			<br>
			<label>Phụ cấp</label>
			<select name="allowance">
			  <option value="1000" ${staff.allowance == 1000 ? 'selected="selected"' : ''}>
			  1000
			  </option>
			  <option value="600" ${staff.allowance == 600 ? 'selected="selected"' : ''}>
			  600
			  </option>
			  <option value="400" ${staff.allowance == 400 ? 'selected="selected"' : ''}>
			  400
			  </option>
			</select>
			<br>
			<label>Hệ số lương</label>
			<input type="text" name="coefficientSalary" value="${staff.coefficientSalary}">
			<br>
			<input type="submit" value="Chỉnh sửa" class="btn btn-primary pull-right">
    	  </form>
 	    </div>
	  </div>
	</div>
  </div>
</body>
</html>