<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Upload One File</title>
</head>
<body>
 
    <h3>上传文件：</h3>
 
    <form method="POST" action="/SSM/doUpload" enctype="multipart/form-data">
        File to upload: <input type="file" name="file"><br />       
        <input type="submit" value="Upload">
    </form>
     
</body>
</html>