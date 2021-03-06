<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*,com.jiao.domain.Reply,java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
        "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>帖子</title>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8"/>
    <script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/ueditor/ueditor.config.js"></script>
    <script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/ueditor/ueditor.all.min.js"> </script>
    <!--建议手动加在语言，避免在ie下有时因为加载语言失败导致编辑器加载失败-->
    <!--这里加载的语言文件会覆盖你在配置项目里添加的语言类型，比如你在配置项目里配置的是英文，这里加载的中文，那最后就是中文-->
    <script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/ueditor/lang/zh-cn/zh-cn.js"></script>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css" type="text/css"/>
    <style type="text/css">
        div{
            width:100%;
        }
        #header{
        	max-width:1280px;
        	margin:auto;
        	font-family:Microsoft YaHei;
        }
        #txtar{
        	border: medium double rgb(100,100,100);
        	font-size:15px;
        	background:#EEE9E9;
        	width:100%;
        }
        #image{
        	border-radius:5px;
        }
    </style>
</head>
<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<ul class="breadcrumb">
				<li>
					 <a style="font-size:15px" href="${pageContext.request.contextPath}/">Home</a>
				</li>
				<li style="font-size:15px" class="active">
					Talk
				</li>
			</ul>
	<div class="row clearfix">
				<div class="col-md-3 column">
					<p><img class="img-circle"
						src="${pageContext.request.contextPath}/images/user/man.png" />
					</p>
				</div>
				<div class="col-md-9 column">
				
    <div id="header">
        <h1 style="text-align:center;">${requestScope.title}</h1><br/>

        <div>${requestScope.content}</div>
        <form action="${pageContext.request.contextPath}/UeditorReply" method="post">
        	<input type="hidden" name=pid   value=${requestScope.pid}></input>
        	<input type="hidden" name=title value=${requestScope.title}></input>
        	<script id="container" name="content" type="text/plain"></script>  
        <script type="text/javascript">  
            var editor = UE.getEditor('container',{  
                //这里可以选择自己需要的工具按钮名称,此处仅选择如下五个  
                toolbars:[['FullScreen', 'Source', 'Undo', 'Redo','bold','test','emotion','spechars']],  
                //focus时自动清空初始化时的内容  
                autoClearinitialContent:true,  
                //字数统计  
                wordCount:true,  
                //关闭elementPath  
                elementPathEnabled:false,
                //默认的编辑区域高度  
                initialFrameHeight:150  
                //更多其他参数，请参考ueditor.config.js中的配置项  
            });  
        </script>   
        	<input type="submit" value="回复"/>
        </form>
        	<c:forEach  var="reply" items="${requestScope.replys}" varStatus="status">
        		<br/>
        		<table id="txtar">
        		<tr"><td>${status.index}</td></tr>
        		<tr style="text-align:center;"><td>${reply}</td></tr>
        		</table>
        	</c:forEach >
    </div>
    </div>
	</div>
    </div>
    </div>
    </div>
</body>
</html>