<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>上传多个文件</title>
</head>
<body>
 
   <h3>Upload Multiple File:</h3>
    
    <form method="POST" action="/SSM/doUpload" enctype="multipart/form-data">
 
        File to upload (1): <input type="file" name="file"><br />      
        File to upload (2): <input type="file" name="file"><br />  

         
        <input type="submit" value="Upload">
    </form>
</body>
</html>