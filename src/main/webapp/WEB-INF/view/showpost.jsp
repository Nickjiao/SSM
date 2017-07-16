<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
        "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>帖子</title>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8"/>
    <link rel="stylesheet" href="css/style.css" type="text/css"/>
</head>
<body style="background:#F4FBFF;">
    <div id="header" style="vertical-align:middle;">
        <h1 style="text-align:center;">${requestScope.title}</h1><br/>
        <div>${requestScope.content}</div>
    </div>
</body>
</html>