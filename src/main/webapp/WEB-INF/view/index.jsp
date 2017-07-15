<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>  
<%@ page import="com.jiao.handleCookie.CookieUtil"%>
<html>  
<head>
        <title>首页</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="description" content="The host page" />
        <meta name="keywords" content="host,page"/>
        <link rel="stylesheet" href="css/style.css" type="text/css"/>
        <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css"/>
        <script type="text/javaScript" src="js/jquery.min.js"></script>
		<script type="text/javascript" src="js/bootstrap.min.js"></script>
		<script type="text/javascript">  
            function time() {  
                var date = new Date();  
                var year = date.getFullYear();  
                var month = date.getMonth()+1;  
                var day = date.getDate();  
                var house = date.getHours();  
                var minutes = date.getMinutes();  
                var second = date.getSeconds();  
                document.getElementById("showtime").innerHTML = year + "-" + month + "-" + day + " " + house + ":" + minutes + ":" + second;  
  
                setTimeout("time()", 100);  
            }  
        </script>  
</head>  
<body onload="time()">
<div id="header">
<div class="banner" style="padding-left:5px;"><a href="http://www.baidu.com"><font size="7" color="blue"><b>众生相社区</b></font></a></div>
<div class="h guide" colspan="2">&#187;
    <%if(CookieUtil.getValByName(request,"isLogin") != null){%>
	<!--mb--> 欢迎 <!--mbend-->
	| <a href="http://www.baidu.com">帮助</a>
	| <a href="${pageContext.request.contextPath}/download">下载文件</a>
	| <a href="${pageContext.request.contextPath}/uploadOneFile">上传单个文件</a>
	| <a href="${pageContext.request.contextPath}/uploadMultiFile">上传多个文件</a>
    <% } else { %>
    <!--mb-->您尚未　<a href="${pageContext.request.contextPath}/login" class="navbar-link" target="_blank">登陆</a> | 
    <a href="${pageContext.request.contextPath}/register" class="navbar-link" target="_blank">注册</a><!--mbend-->
	| <a href="http://www.baidu.com">帮助</a>
	| <a href="${pageContext.request.contextPath}/download">下载文件</a>
	| <a href="${pageContext.request.contextPath}/uploadOneFile">上传单个文件</a>
	| <a href="${pageContext.request.contextPath}/uploadMultiFile">上传多个文件</a>
	<% } %>
</div>

<div id="blank" style="height:10px; clear:both"></div>
</div>

<div id="main">

<!--ads begin-->

<!--ads end-->

<div class="t"><table cellspacing="0" cellpadding="0" width="100%">
	<tbody><tr class="tr2">
	<td width="*" style="padding-right:8px; height:24px; border-top:0">
		<marquee direction="left" scrolldelay="1" scrollamount="2" onmouseout="if(document.all!=null){this.start()}" onmouseover="if(document.all!=null){this.stop()}"><a href="http://www.baidu.com">■■■ 新手引导 ■■■
        <span class="top">  
            <font id="showtime"></font>
        </span>  </a> &nbsp; &nbsp; &nbsp; &nbsp; 
		</marquee>
	</td>
	</tr><tr><td></td></tr>
</tbody></table>
<table cellspacing="0" cellpadding="0" width="100%">
	<tbody><tr class="tr3">
	<td style="line-height:1.4em;border-right:0;word-break:keep-all">
	<form class="navbar-form navbar-left" role="search">
						<div class="form-group">
							<input type="text" class="form-control" placeholder="搜索感兴趣内容"/>
						</div> <button type="submit" class="btn btn-default">搜索</button>
	</form>
	</td>
	<td style="border-left:0;text-align:right;padding-right:12px;line-height:1.4em;word-break:keep-all">

		今日 2696 帖 <br/>
		共 618290 篇主题 | 10882839  篇帖子 | 1876  位会员
		</td>
	</tr>
</tbody></table></div>

<div class="t"><table cellspacing="0" cellpadding="0" width="100%">
	<tbody><tr><th class="h" colspan="6">

		&#187; <h2><a href="http://www.baidu.com" class="cfont">浮生百态众生相</a></h2> </th>
	</tr>	
	<tr></tr>
	<tr class="tr2 tac">
	<td width="*" colspan="2">版块</td>
	<td style="width:20%">主题</td>
	<td style="width:20%">文章</td>
	<td style="width:20%">最后发表</td>
	</tr>
	</tbody><tbody id="cate_6" style="">

	<tr class="tr3 f_one">
		<td class="icon tac" width="4%"><a href="http://www.baidu.com" target="_blank">.:.</a></td>
		<th><a href="http://www.baidu.com" target="_blank"></a><h2><a href="${pageContext.request.contextPath}/tectalk">技术讨论区</a></h2>

		<br><span class="smalltxt gray">科研探讨 编程珠玑 经验分享</span>

		</th>
		<td class="tac"><span class="f12">14869</span><br></td>
		<td class="tac"><span class="f12">3869483</span><br></td>
		<th>

		<a href="http://www.baidu.com" class="a2">Re:土匪敢不敢和阿三干架</a><br>
		<span class="f12">秦时明月汉王</span> <span class="f10 gray"> 2017-07-12 15:41</span>

		&nbsp;</th>
	</tr>

	<tr class="tr3 f_one">
		<td class="icon tac" width="4%"><a href="http://www.baidu.com" target="_blank">.:.</a></td>
		<th><a href="http://www.baidu.com" target="_blank"></a><h2><a href="http://www.baidu.com">生活区</a></h2>

		<br><span class="smalltxt gray">日常生活 兴趣交流 校园动态 最新政策</span>

		</th>
		<td class="tac"><span class="f12">23604</span><br></td>
		<td class="tac"><span class="f12">178882</span><br></td>
		<th>

		<a href="http://www.baidu.com" class="a2">Re:artistic-photo-shoot[ ..</a><br>
		<span class="f12">一个孤独的狼</span> <span class="f10 gray"> 2017-07-12 15:37</span>

		&nbsp;</th>
	</tr>

	<tr class="tr3 f_one">
		<td class="icon tac" width="4%"><a href="http://www.baidu.com" target="_blank">.:.</a></td>
		<th><a href="http://www.baidu.com" target="_blank"></a><h2><a href="http://www.baidu.com">吹水区</a></h2>

		<br><span class="smalltxt gray">吹水區</span>

		</th>
		<td class="tac"><span class="f12">15165</span><br></td>
		<td class="tac"><span class="f12">1544238</span><br></td>
		<th>

		<a href="http://www.baidu.com" class="a2">草民 ..</a><br>
		<span class="f12">六道阿修罗</span> <span class="f10 gray"> 2017-07-12 15:30</span>

		&nbsp;</th>
		
	</tr>


	<tr><td style="height:8px"></td></tr>
	</tbody>
</table>
</div>

			<div class="carousel slide" id="carousel-102346">
				<ol class="carousel-indicators">
					<li class="active" data-slide-to="0" data-target="#carousel-102346">
					</li>
					<li data-slide-to="1" data-target="#carousel-102346">
					</li>
					<li data-slide-to="2" data-target="#carousel-102346">
					</li>
				</ol>
				<div class="carousel-inner">
					<div class="item active">
						<img alt="" src="images/法拉利.jpg" />
						<div class="carousel-caption">
							<h4>
								Ferrari
							</h4>
							<p>
								法拉利是举世闻名的赛车和运动跑车的生产厂家，总部位于意大利马拉内罗（Maranello），由恩佐·法拉利（Enzo Ferrari）于1947年创办，主要制造一级方程式赛车、赛车及高性能跑车。
							</p>
						</div>
					</div>
					<div class="item">
						<img alt="" src="images/兰博基尼.jpg" />
						<div class="carousel-caption">
							<h4>
								Automobili Lamborghini
							</h4>
							<p>
								兰博基尼（Automobili Lamborghini S.p.A.）是一家意大利汽车生产商，全球顶级跑车制造商及欧洲奢侈品标志之一，公司坐落于意大利圣亚加塔·波隆尼（Sant'Agata Bolognese），由费鲁吉欧·兰博基尼在1963年创立。
							</p>
						</div>
					</div>
					<div class="item">
						<img alt="" src="images/玛莎.jpg"/>
						<div class="carousel-caption">
							<h4>
								Maserati
							</h4>
							<p>
								意式血统 玛莎拉蒂成就全球典范,传承辉煌百年的优雅、设计、运动和性能。
							</p>
						</div>
					</div>
				</div> <a class="left carousel-control" href="#carousel-102346" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a> <a class="right carousel-control" href="#carousel-102346" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
			</div>

		<div>
			 	<address> <strong>Twitter, Inc.</strong><br /> 795 Folsom Ave, Suite 600<br /> San Francisco, CA 94107<br /> <abbr title="Phone">P:</abbr> (123) 456-7890</address>
		</div>

</div>
</body>

</html>