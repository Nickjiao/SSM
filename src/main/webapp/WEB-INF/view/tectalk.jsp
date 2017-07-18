<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html> 
<html>  
<head>
        <title>技术讨论区</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="description" content="The host page" />
        <meta name="keywords" content="host,page"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" type="text/css"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css" type="text/css"/>
        <script type="text/javaScript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
</head>  

<body>

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
			<div class="page-header">
				<h1>
					学术讨论区<small>&nbsp &nbsp &nbsp ${requestScope.date}</small>
				</h1>
			</div>
			<div class="jumbotron">
				<h2>
					他的呼唤<small>&nbsp &nbsp &nbsp 饶孟侃</small>
				</h2>
				<p>
					 <br />　　有一次我在白杨林中， 
					 <br />　　听到亲切的一声呼唤；
					  <br />　　那时月光正望着翁仲，
					   <br />　　翁仲正望着我。 
					   <br />　　再听不到呼唤的声音，
					    <br />　　我吃了一惊， <br />　　四面寻找——翁仲只是对月光出神， 
					    <br />　　月光只对我冷笑。
				</p>
				<p>
					 <a class="btn btn-primary btn-large" href="#">Learn more</a>
				</p>
			</div>
			<div class="alert alert-success alert-dismissable">
				 <button type="button" class="close" data-dismiss="alert" aria-hidden="true">×</button>
				<h4>
					注意!
				</h4> <strong>Warning!</strong>免责声明:本网站内容仅代表发表者个人观点,不代表众生相论坛立场。本站禁止色情,政治,反动等国家法律不允许的内容,注意自我保护,谨防上当受骗!
				<a href="http://www.mps.gov.cn/" class="alert-link">alert link</a>
			</div>
			<ul class="nav nav-tabs">
				<li class="active">
					 <a href="#">日常生活 </a>
				</li>
				<li>
					 <a href="#">興趣交流</a>
				</li>
				<li>
					 <a href="#">時事經濟</a>
				</li>
				<li>
					 <a href="#">會員閑談吹水區</a>
				</li>
				<li class="disabled">
					 <a href="#">信息</a>
				</li>
				<li class="dropdown pull-right">
					 <a href="#" data-toggle="dropdown" class="dropdown-toggle">下拉<strong class="caret"></strong></a>
					<ul class="dropdown-menu">
						<li>
							 <a href="#">操作</a>
						</li>
						<li>
							 <a href="#">设置栏目</a>
						</li>
						<li>
							 <a href="#">更多设置</a>
						</li>
						<li class="divider">
						</li>
						<li>
							 <a href="#">分割线</a>
						</li>
					</ul>
				</li>
			</ul>
			<div>
			<%int pageInx = ((Integer)request.getAttribute("index"));
			  int prePage = pageInx - 1;
			  int nextPage = pageInx + 1;
			  int pageNum = ((Integer)request.getAttribute("pageNum"));%>
			<ul class="pagination">
				<%if(pageInx != 0) {%>
				<li>
					 <a href="${pageContext.request.contextPath}/tectalk/page/<%=prePage%>">Prev</a>
				</li>
				<%} %>
				<%for(int i = 1;i <= pageNum;i++) {%>
						<li><a href="${pageContext.request.contextPath}/tectalk/page/<%=i-1%>"><%=i%></a></li>
				<%} %>
				<%if(nextPage < pageNum) {%>
				<li>
					 <a href="${pageContext.request.contextPath}/tectalk/page/<%=nextPage%>">Next</a>
				</li>
				<%} %>
			</ul>
			</div>
			<table class="table">
				<thead>
					<tr>
						<th>
							标题
						</th>
						<th>
							作者
						</th>
						<th>
							点击
						</th>
						<th>
							回复
						</th>
						<th>
							最后回帖时间
						</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="content" items="${requestScope.showCont}" varStatus="s">
						<tr class="info">
							<td><a href="${pageContext.request.contextPath}/showpost/bytitle/${content.post_id}">${content.title}</a></td>
							<td><a href="${pageContext.request.contextPath}/showpost/bytitle/${content.post_id}">${content.author}</a></td>
							<td>${content.clickNum}</td>
							<td>${content.replyNum}</td>
							<td>${content.replyTime}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<div>

			<ul class="pagination">
				<%if(pageInx != 0) {%>
				<li>
					 <a href="${pageContext.request.contextPath}/tectalk/page/<%=prePage%>">Prev</a>
				</li>
				<%} %>
				<%for(int i = 1;i <= pageNum;i++) {%>
						<li><a href="${pageContext.request.contextPath}/tectalk/page/<%=i-1%>"><%=i%></a></li>
				<%} %>
				<%if(nextPage < pageNum) {%>
				<li>
					 <a href="${pageContext.request.contextPath}/tectalk/page/<%=nextPage%>">Next</a>
				</li>
				<%} %>
			</ul>
			</div>
			
			 <a id="modal-423821" href="#modal-container-423821" role="button" class="btn" data-toggle="modal">触发遮罩窗体</a>
			
			<div class="modal fade" id="modal-container-423821" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							 <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
							<h4 class="modal-title" id="myModalLabel">
								标题
							</h4>
						</div>
						<div class="modal-body">
							内容...
						</div>
						<div class="modal-footer">
							 <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button> <button type="button" class="btn btn-primary">保存</button>
						</div>
					</div>
					
				</div>
				
			</div>
			
		</div>
	</div>
</div>
</body>
</html>