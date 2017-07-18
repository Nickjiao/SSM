<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- saved from url=(0062)http://www.gbtags.com/gb/rtreplayerpreview-standalone/1422.htm -->
<html lang="zh"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册界面</title>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="Description" content="众生相社区注册">
<meta name="Keywords" content="众生相，社区，注册">
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css"/>
<link rel="stylesheet" href="css/font-awesome.min.css" type="text/css"/>
<style>



.contact {
  padding: 25px 0 450px 0;
  background: url(images/world-wallpaper.jpg) no-repeat center center fixed;
  -webkit-background-size: cover;
  -moz-background-size: cover;
  -o-background-size: cover;
  background-size: cover;
}

.contact i {
  padding: 0 20px;
  font-size: 0.8em;
}

.contact h2 {
  font-family: 'Open Sans', sans-serif;
  font-size: 2.5em;
  border: 1px solid #555;
  background-color: rgba(0,0,0,0.6);
  padding-top: 20px;
  height: 75px;
  color: #fff;
  font-weight: 500;
  line-height: 40px;
  padding-left: 50px;
  text-align: center;
}

#comments {
  margin-top: 0;
}

#contactform {
  height: 215px;
}

#contactform .right {
  float: right;
}

#contactform input,
#contactform textarea {
  margin-bottom: 14px;
  width: 100%;
  outline: none;
  border: none;
  text-transform: uppercase;
  letter-spacing: 2px;
  font-size: 11px;
}

#contactform input {
  padding-left: 15px;
  height: 44px;
  border-radius: 0;
}

#contactform textarea {
  padding: 15px;
  height: 218px;
  border-radius: 0;
}

#contactform .btn {
  width: 100%;
  height: 50px;
  border-radius: 0;
  border: 1px solid #333;
  background: rgba(0,0,0,0.8);
  color: #fff;
}

#contactform .btn:hover {
  background: rgba(9,8,77,0.7);
}

#map-canvas {
  text-align: center;
  width: 100%;
  height: 72px;
  margin-bottom: 15px;
  border: 2px solid #fff;
}
</style>
<script>
function validate_email(field,alerttxt)
{
with (field)
{
apos=value.indexOf("@")
dotpos=value.lastIndexOf(".")
if (apos<1||dotpos-apos<2) 
  {alert(alerttxt);return false}
else {return true}
}
}

function validate_form(thisform)
{
with (thisform)
{
if (validate_email(email,"邮件格式不对!")==false)
  {email.focus();return false}
}
}
</script>
</head>
<body>
<section class="contact" id="contact">
  <div class="container">
    <div class="row">
        <div class="col-md-4 column">
        </div>
        <div class="col-md-4 column">
        <div id="map-canvas"><div style="height: 100%; width: 100%;"></div></div>
        <h2>Contact Me<i class="fa fa-paper-plane-o"></i></h2>
        <form method="post" action="${pageContext.request.contextPath}/regPos" name="contactform" id="contactform"
      	onsubmit="return validate_form(this)";>
         <fieldset>
            <input name="username" type="text" id="name" size="30" placeholder="Name" required autofocus >
            <br>
            <input name="email" type="text" id="email" size="30" placeholder="Email" required>
            <br>
            <input name="password" type="password" id="pwd" size="30" placeholder="Password" required>
            <br>
          </fieldset>
          <fieldset>
            <button type="submit" class="btn btn-lg" id="submit" value="Submit">注册</button>
          </fieldset>
          </form>
        </div>
        <div class="col-md-4 column">
        </div>
    </div>
  </div>
</section>
</body></html>