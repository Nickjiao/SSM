<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html> 
<html>  
<head>
        <title>技术讨论区</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="description" content="The host page" />
        <meta name="keywords" content="host,page"/>
        <link rel="stylesheet" href="css/style.css" type="text/css"/>
        <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css"/>
        <script type="text/javaScript" src="js/jquery.min.js"></script>
		<script type="text/javascript" src="js/bootstrap.min.js"></script>
</head>  

<body>

<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="page-header">
				<h1>
					技术讨论区<small>${requestScope.date}</small>
				</h1>
			</div>
			<div class="jumbotron">
				<h1>
					Hello, world!
				</h1>
				<p>
					This is a template for a simple marketing or informational website. It includes a large callout called the hero unit and three supporting pieces of content. Use it as a starting point to create something more unique.
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
			<ul class="pagination">
				<li>
					 <a href="#">Prev</a>
				</li>
				<li>
					 <a href="#">1</a>
				</li>
				<li>
					 <a href="#">2</a>
				</li>
				<li>
					 <a href="#">3</a>
				</li>
				<li>
					 <a href="#">4</a>
				</li>
				<li>
					 <a href="#">5</a>
				</li>
				<li>
					 <a href="#">Next</a>
				</li>
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
							回复时间
						</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>
							${requestScope.title_1}
						</td>
						<td>
							${requestScope.author_1}
						</td>
						<td>
							${requestScope.clicknum}
						</td>
						<td>
							${requestScope.replynum}
						</td>
						<td>
							${requestScope.lastreplydate}
						</td>
					</tr>
					<tr class="success">
						<td>
							1
						</td>
						<td>
							TB - Monthly
						</td>
						<td>
							01/04/2012
						</td>
						<td>
							Approved
						</td>
					</tr>
					<tr class="error">
						<td>
							2
						</td>
						<td>
							TB - Monthly
						</td>
						<td>
							02/04/2012
						</td>
						<td>
							Declined
						</td>
					</tr>
					<tr class="warning">
						<td>
							3
						</td>
						<td>
							TB - Monthly
						</td>
						<td>
							03/04/2012
						</td>
						<td>
							Pending
						</td>
					</tr>
					<tr class="info">
						<td>
							4
						</td>
						<td>
							TB - Monthly
						</td>
						<td>
							04/04/2012
						</td>
						<td>
							Call in to confirm
						</td>
					</tr>
				</tbody>
			</table>
			<div>
			<ul class="pagination">
				<li>
					 <a href="#">Prev</a>
				</li>
				<li>
					 <a href="#">1</a>
				</li>
				<li>
					 <a href="#">2</a>
				</li>
				<li>
					 <a href="#">3</a>
				</li>
				<li>
					 <a href="#">4</a>
				</li>
				<li>
					 <a href="#">5</a>
				</li>
				<li>
					 <a href="#">Next</a>
				</li>
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