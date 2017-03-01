<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ticket</title>
<link type="text/css" rel="stylesheet" href="css/login.css">
</head>
<body>
<div class="top_div">
  <h1 align="center">&nbsp;	</h1>
  <h1 align="center">&nbsp;</h1>
  <h1 align="center">&nbsp;</h1>
  <h1 align="center"><strong>后台管理</strong></h1>
</div>
<div style="background: rgb(255, 255, 255); margin: -100px auto auto; border: 1px solid rgb(231, 231, 231); border-image: none; width: 400px; height: 200px; text-align: center;">
	<div style="width: 165px; height: 96px; position: absolute;">
	<div class="tou"><%
	if(request.getAttribute("pswd")==null){
							out.print(" ");
						}
						else{
							out.print(request.getAttribute("pswd"));
						} %></div>
	<div class="initial_left_hand" id="left_hand"></div>
	<div class="initial_right_hand" id="right_hand">	</div>
</div>
<form method="post"  action="/Ticket/AdminLogin.jhtml">
<P style="padding: 30px 0px 10px; position: relative;">
	<SPAN 	class="u_logo"></SPAN>
	<INPUT class="ipt"  name = "name" type="text" placeholder="请输入用户名" value=""> 
 </P>
<P style="position: relative;"><SPAN class="p_logo"></SPAN>         
<INPUT class="ipt" id="password" name = "password" type="password" placeholder="请输入密码" value="">   
 </P>
<DIV style="height: 50px; line-height: 50px; margin-top: 30px; border-top-color: rgb(231, 231, 231); border-top-width: 1px; border-top-style: solid;">
<P style="margin: 0px 35px 20px 45px;">
              <input type = "submit"style="background: rgb(0, 142, 173); padding: 7px 10px; border-radius: 4px; border: 1px solid rgb(26, 117, 152); border-image: none; color: rgb(255, 255, 255); font-weight: bold;" 
value="登录"/>       
  </SPAN>         </P></DIV></DIV>
   </form>
		   <div style="text-align:center;">
</div>
</body>
</html>