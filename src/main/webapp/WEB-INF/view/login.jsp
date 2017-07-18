<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>  
<html lang="zh-cn">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>登录  - 众生相论坛</title>
 
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/signin.css" rel="stylesheet">
</head>

<body>

<div class="signin">
	<div class="signin-head"><img src="images/test/login.jpg" width=120 height=120 alt="" class="img-circle"></div>
	<form class="form-signin" role="form" method="POST" action="${pageContext.request.contextPath}/check">
		<input type="text" class="form-control" name=username placeholder="用户名" required autofocus />
		<input type="password"  class="form-control" name=password placeholder="密码" required />
		<button class="btn btn-lg btn-warning btn-block" type="submit">登录</button>
		<label class="checkbox">
			<input type="checkbox" value="remember-me"> 记住我
		</label>
	</form>
</div>

</body>
</html>