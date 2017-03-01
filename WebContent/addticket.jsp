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
</head>
<body>
<div class="panel admin-panel">
  <div class="panel-head" id="add"><strong><span class="icon-pencil-square-o"></span>增加车次</strong></div>
  <div class="body-content">
    <form method="post" class="form-x" action="/Ticket/addticket.jhtml">  
      <div class="form-group">
        <div class="label">
          <label>出发站：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" value="" name="starts" data-validate="required:请输入始发站" />
          <div class="tips"></div>
        </div>
      </div>  
       <div class="form-group">
        <div class="label">
          <label>到下一站的价格：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" name="p" />
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="form-group">
        <div class="label">
          <label>途径站1：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" name="station1" />
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="form-group">
        <div class="label">
          <label>到下一站的价格：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" name="p1" />
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="form-group">
        <div class="label">
          <label>途径站2：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" name="station2" />
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="form-group">
        <div class="label">
          <label>到下一站的价格：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" name="p2" />
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="form-group">
        <div class="label">
          <label>途径站3：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" name="station3" />
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="form-group">
        <div class="label">
          <label>到下一站的价格：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" name="p3" />
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="form-group">
        <div class="label">
          <label>途径站4：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" name="station4" />
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="form-group">
        <div class="label">
          <label>到下一站的价格：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" name="p4" />
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="form-group">
        <div class="label">
          <label>途径站5：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" name="station5" />
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="form-group">
        <div class="label">
          <label>到下一站的价格：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" name="p5" />
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="clear"></div>
      <div class="form-group">
        <div class="label">
          <label>到达站：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" name="ends" />
          <div class="tips"></div>
        </div>
      </div>
      
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
          <label>出发时间：</label>
        </div>
        <div class="field"> 
          <script src="js/laydate/laydate.js"></script>
          <input type="text" class="laydate-icon input w50" name="starttime" placeholder="格式YYYY-MM-DD hh:mm:ss"onclick="laydate({istime: true, format: 'YYYY-MM-DD hh:mm:ss'})" value="" data-validate="required:日期不能为空" style="padding:10px!important; height:auto!important;border:1px solid #ddd!important;" />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>途径站1到达时间：</label>
        </div>
        <div class="field"> 
          <script src="js/laydate/laydate.js"></script>
          <input type="text" class="laydate-icon input w50" name="s1" onclick="laydate({istime: true, format: 'YYYY-MM-DD hh:mm:ss'})" value=""  data-validate="required:日期不能为空" style="padding:10px!important; height:auto!important;border:1px solid #ddd!important;" />
          <div class="tips"></div>
        </div>
      </div>
        <div class="form-group">
        <div class="label">
          <label>途径站2到达时间：</label>
        </div>
        <div class="field"> 
          <script src="js/laydate/laydate.js"></script>
          <input type="text" class="laydate-icon input w50" name="s2" onclick="laydate({istime: true, format: 'YYYY-MM-DD hh:mm:ss'})" value=""  data-validate="required:日期不能为空" style="padding:10px!important; height:auto!important;border:1px solid #ddd!important;" />
          <div class="tips"></div>
        </div>
      </div>
        <div class="form-group">
        <div class="label">
          <label>途径站3到达时间：</label>
        </div>
        <div class="field"> 
          <script src="js/laydate/laydate.js"></script>
          <input type="text" class="laydate-icon input w50" name="s3" onclick="laydate({istime: true, format: 'YYYY-MM-DD hh:mm:ss'})" value=""  data-validate="required:日期不能为空" style="padding:10px!important; height:auto!important;border:1px solid #ddd!important;" />
          <div class="tips"></div>
        </div>
      </div>
        <div class="form-group">
        <div class="label">
          <label>途径站4到达时间：</label>
        </div>
        <div class="field"> 
          <script src="js/laydate/laydate.js"></script>
          <input type="text" class="laydate-icon input w50" name="s4" onclick="laydate({istime: true, format: 'YYYY-MM-DD hh:mm:ss'})" value=""  data-validate="required:日期不能为空" style="padding:10px!important; height:auto!important;border:1px solid #ddd!important;" />
          <div class="tips"></div>
        </div>
      </div>
        <div class="form-group">
        <div class="label">
          <label>途径站5到达时间：</label>
        </div>
        <div class="field"> 
          <script src="js/laydate/laydate.js"></script>
          <input type="text" class="laydate-icon input w50" name="s5" onclick="laydate({istime: true, format: 'YYYY-MM-DD hh:mm:ss'})" value=""  data-validate="required:日期不能为空" style="padding:10px!important; height:auto!important;border:1px solid #ddd!important;" />
          <div class="tips"></div>
        </div>
      </div>
      
	  <div class="form-group">
        <div class="label">
          <label>终点到达时间：</label>
        </div>
        <div class="field"> 
          <script src="js/laydate/laydate.js"></script>
          <input type="text" class="laydate-icon input w50" name="endtime" onclick="laydate({istime: true, format: 'YYYY-MM-DD hh:mm:ss'})" value=""  data-validate="required:日期不能为空" style="padding:10px!important; height:auto!important;border:1px solid #ddd!important;" />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>商务座：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" name="busniess" value="" data-validate="member:只能为数字"  />
          <div class="tips"></div>
        </div>
      </div>
	  
	   <div class="form-group">
        <div class="label">
          <label>一等座：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" name="first" value="" data-validate="member:只能为数字"  />
          <div class="tips"></div>
        </div>
      </div>
	  
	   <div class="form-group">
        <div class="label">
          <label>二等座：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" name="second" value="" data-validate="member:只能为数字"  />
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