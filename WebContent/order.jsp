<%@page import="cn.nutshell.entity.Order"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">
<title>用户订单</title>
<link rel="stylesheet" href="css/pintuer.css">
<link rel="stylesheet" href="css/admin.css">
<script src="js/jquery.js"></script>
<script src="js/pintuer.js"></script>
</head>
<body>
<form method="post" action="" id="listform">
  <div class="panel admin-panel">
    <div class="panel-head"><strong class="icon-reorder"> 订单列表</strong> <a href="" style="float:right; display:none;">添加字段</a></div>
    <div class="padding border-bottom">
    </div>
    <table class="table table-hover text-center">
      <tr>
        <th width="100" style="text-align:left; padding-left:20px;">订单号</th>
        <th width="10%">车次</th>
        <th>出发站</th>
        <th>到达站</th>
        <th>价格</th>
        <th>车厢号</th>
		<th width="310">座位号</th>
        <th width="10%">出发时间</th>
      </tr>
      <c:forEach items="${order}" var="od">	
      <volist name="list" id="vo">
        <tr>
          <td style="text-align:left; padding-left:20px;">${od.num}</td>
          <td>${od.trainnum}</td>
          <td width="10%">${od.startstation}</td>
          <td>${od.endstation}</td>
          <td><font color="#00CC99">${od.price}</font></td>
          <td>${od.carr}</td>
          <td>${od.seat}</td>
          <td><div class="button-group">${od. starttime}</div></td>
        </tr>
	</c:forEach>
     
      <tr>
        <td colspan="8"><div class="pagelist"> <a href="">上一页</a> <span class="current">1</span><a href="">2</a><a href="">3</a><a href="">下一页</a><a href="">尾页</a> </div></td>
      </tr>
    </table>
  </div>
</form>
<script type="text/javascript">
//搜索
function changesearch(){	
		
}
</script>
</body>
</html>