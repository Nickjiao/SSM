<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>文件下载</title>
	<link href="<c:url value='css/bootstrap.css' />"  rel="stylesheet"></link>
	<link href="<c:url value='css/app.css' />" rel="stylesheet"></link>
	<script>
	function mkSure(thisInput)
	  {
	  if(!confirm("确定要下载？")){
		  return false;
	  }
	  }
	</script>
</head>
<body>
	<div class="form-container">
		<h1>欢迎下载</h1>
		
		<br/><br/>
		<h2>下载列表</h2>
		<c:forEach var="file" items="${requestScope.fileName}" varStatus="status">
        		<a style="font-size:30px;" href="${pageContext.request.contextPath}/download/${file.key}" 
        		onclick="return mkSure(this)">${status.index}&nbsp--&nbsp${file.value}</a>  
        		<br/>
        </c:forEach>
	</div> 
</body>
</html>
