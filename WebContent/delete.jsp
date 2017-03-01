<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
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
<body>
<div class="panel admin-panel">
  <div class="panel-head" id="add"><strong><span class="icon-pencil-square-o"></span>删除车次</strong></div>
  <div class="body-content">
    <form method="post" class="form-x" action="/Ticket/delticket.jhtml">  
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