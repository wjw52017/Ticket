<%@page import="cn.nutshell.entity.Query"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-cn">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title></title>  
    <link rel="stylesheet" href="css/pintuer.css">
    <link rel="stylesheet" href="css/admin.css">
    <script src="js/jquery.js"></script>
    <script src="js/pintuer.js"></script>  
    <style type="text/css">.form-group{margin:0 auto}</style>
</head>
<style type="text/css">
*{margin:0;padding:0;}
body{ font-size:12px;}
#query_info{ border:2px solid #0FF; height:60px;}
table{margin:auto; width:1000px;  vertical-align:middle; }
#single_both div input{margin:5px 3px 0px 15px;}
#role div input{margin:5px 3px 0px 15px;}
#where_date input{ width:120px; margin:auto 5px;}
#choice_info{margin-top:10px;}
#choise_other{ border:2px solid #0FF; padding:5px 10px;}
#choise_other th{font-size:13px; text-align:left; padding:5px 0 3px 0;}
#choice_date td{ border: 1px solid #999; text-align:center; height:20px; }
#query_result{border:2px solid #0FF;margin-top:10px;}
#query_result td,#query_result th{ border:1px inset #999;}
#query_resule_title{ background-color:#09C; color:#fff; }
</style>

<body>
<div class="panel admin-panel">
  <div class="panel-head" id="add"><strong><span class="icon-pencil-square-o"></span>查询车票</strong></div>
  <div class="body-content">
    <form method="post" class="form-x" action="/Ticket/adq.jhtml">  
      <if condition="$iscid eq 1">
        <div class="form-group">
          <div class="label">
            <label>车次分类：</label>
          </div>
          <div class="field">
            <select name="cid" class="input w50">
              <option value="">请选择车次</option>
              <option  value="G123">G123</option>
              <option   value="G234">G234</option>
              <option  value="G345">G345</option>
              <option   value="G456">G456</option>
            </select>
            <div class="tips"></div>
          </div>
        </div>
      <div class="form-group">
        <div class="label">
          <label>车次：</label>
        </div>
        <div class="field">
              <tr><td>
       	<table id="query_result" cellspacing="0" >
        	<tr id="query_resule_title" align="center">
            	<th>车次</th>
                <th>出发站</th>
                <th>中途站1</th>
                <th>  中途站2</th>
                <th>中途站3</th>
                <th>中途站4 </th>
                <th>中途站5</th>
                <th>到达站</th>
                <th>发车时间<br/>到达时间</th>
                <th>商务座</th>
                <th>一等座</th>
                <th>二等座</th>
           
            </tr>
            <tr id="query_resule_title" align="center">
    
            	<th>${adq.trainnum}</th>
                <th>${adq.startstation}</th>
                <th>${st.station1}</th>
                <th> ${st.station2}</th>
                <th>${st.station3}</th>
                <th>${st.station4}</th>
                <th>${st.station5}</th>
                <th>${adq.endstation}</th>
                <th>${adq.starttime}<br/>${adq.endtime}</th>
                <th>${adq.business}</th>
                <th>${adq.first}</th>
                <th>${adq.second}</th>
            </tr>
        </table>
        </td></tr>
          <div class="tips"></div>
        </div>
      </div>
      
	  
      <div class="form-group">
        <div class="label">
          <label></label>
        </div>
        <div class="field">
          <button class="button bg-main icon-check-square-o" type="submit"> 提交</button>
        </div>
      </div>
    </form>
  </div>
</div>

</body></html>