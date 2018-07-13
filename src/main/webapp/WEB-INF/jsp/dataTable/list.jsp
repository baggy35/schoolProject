<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="ko" xml:lang="ko">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title><spring:message code="title.sample" /></title>

	<link rel="stylesheet" type="text/css" href="https://code.jquery.com/jquery-3.3.1.js">
	<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.19/css/dataTables.material.min.css">
	<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.19/css/dataTables.material.min.css">

	<script type="text/javascript" language="javascript" src="https://code.jquery.com/jquery-3.3.1.js"></script>
	<script type="text/javascript" language="javascript" src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
	<script type="text/javascript" language="javascript" src="https://cdn.datatables.net/1.10.19/js/dataTables.material.min.js"></script>

	<script type="text/javascript" class="init">
	
	$.extend( true,$.fn.dataTable.defaults,
	{
		"language":{
			"url":"http://cdn.datatables.net/plug-ins/9dcbecd42ad/i18n/Korean.json"			
		}	
	})
	$(document).ready(function(){
		var table=$('#example').DataTable({
			"processing":true,
			"serverSide":true,
			"ajax":{
				"url":"<c:url value='/ajax.do'/>",
				"data":function(d){
					d.table="lettnschdulinfo"
				}
			},
			"columns":[
				{"title":"일정ID","data":"SCHDUL_ID"},
				{"title":"일정종류","data":"SCHDUL_KND_CODE"},
				{"title":"일정시작일자","data":"SCHDUL_BEGINDE"},
				{"title":"일정종료일자","data":"SCHDUL_ENDDE"},
				{"title":"일정명","data":"SCHDUL_NM"},
				{"title":"일정내용","data":"SCHDUL_CN"},
				{"title":"일정장소","data":"SCHDUL_PLACE"},
				{"title":"첨부파일ID","data":"ATCH_FILE_ID"},
				{"title":"최초등록시점","data":"FRST_REGIST_PNTTM"},
				{"title":"최종수정시점","data":"LAST_UPDT_PNTTM"},
				{"title":"반복구분","data":"REPTIT_SE_CODE"}
			],
			"order":[[1,'asc']]	
		});
	});
	</script>	
</head>
<body>
	<div class="container">
		<div><h1>일정 목록</h1><a href="${pageContext.request.contextPath}/cop/smt/sim/ParkManageMonthList.do" ><span>돌아가기</span></a></div>
		<table style="100%" id="example" class="table table-striped table-bordered">
		</table>
	</div>
</body>
</html>