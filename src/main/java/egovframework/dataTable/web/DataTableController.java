package egovframework.dataTable.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.annotation.Resource;
import javax.servlet.ServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import egovframework.dataTable.service.DataTableService;

@Controller
public class DataTableController {
	@Resource(name ="dataTableService")
	private DataTableService dataTableService;
	
	@RequestMapping("/dataTable.do")
	 public String dataTable() throws Exception {
		 
		  
		  return "dataTable/list";
	 }
	  
	 @RequestMapping("/ajax.do")
	 public @ResponseBody Map<String, Object> ajax(ServletRequest req) throws Exception{
	  Map<String,Object> mapReturn = new HashMap<String, Object>();
	  Map<String,Object> mapSearch = new HashMap<String, Object>();
	  List listData=new ArrayList();
	  
	  List<String>listColumns=new ArrayList<String>();
	  for(int i=0; ;i++){
		  String colName=req.getParameter("columns["+i+"][data]");
		  if(colName!=null && colName.length() >0){
			  listColumns.add(colName);
		  }else{
			  break;
		  }
	  }
	  
	  String sDraw=req.getParameter("draw");
	  String sLength=req.getParameter("length");
	  String sStart=req.getParameter("start");
	  String sTable=req.getParameter("table");
	  String sOrderColumn=req.getParameter("order[0][column]");
	  String sOrderDir=req.getParameter("order[0][dir]");
	  String sSearch=req.getParameter("search[value]");
	  int nStart=0;
	  int nLength=10;
	  try{
		  nStart=Integer.parseInt(sStart);
	  }catch(NumberFormatException e){}
	  try{
		  nLength=Integer.parseInt(sLength);
	  }catch(NumberFormatException e){}
	  int nOrderColumn=0;
	  String sOrderColumnName=null;
	  try{
		  nOrderColumn=Integer.parseInt(sOrderColumn);
	  }catch(NumberFormatException e){
		  nOrderColumn=0;
	  }
	  if(nOrderColumn>=0 && nOrderColumn<listColumns.size()){
		  sOrderColumnName=listColumns.get(nOrderColumn);
	  }
	  
	  mapSearch.put("sTable", sTable);
	  mapSearch.put("nStart", nStart);
	  mapSearch.put("nLength", nLength);
	  mapSearch.put("sSearch", sSearch);
	  mapSearch.put("sOrderDir", sOrderDir);
	  mapSearch.put("sOrderColumnName", sOrderColumnName);
	  mapSearch.put("listColumns", listColumns);
	  listData=dataTableService.ajax(mapSearch);
	  int nRecordTotal=dataTableService.ajaxTotCnt(mapSearch);
	  
	  dispParams(req);
	  
	  mapReturn.put("draw", sDraw);
	  mapReturn.put("recordsTotal", nRecordTotal);
	  mapReturn.put("recordsFiltered", nRecordTotal);
	  mapReturn.put("data", listData);
	  
	  return mapReturn;
	 } 
	 
	 private void dispParams(ServletRequest req)
		{
			Map<String, String[]> map = req.getParameterMap();
			SortedSet<String> set = new TreeSet<String>();
			set.addAll(map.keySet());
			
			for(String key : set)
			{
				String[] values = map.get(key);
				System.out.print(key);
				System.out.print(" : ");
				for(String value : values)
				{
					if (value != null)
					{
						System.out.print(value);
						System.out.print(",");
					}
				}
				System.out.println();
			}
		}
}
