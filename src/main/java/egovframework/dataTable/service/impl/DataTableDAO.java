package egovframework.dataTable.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import egovframework.com.cmm.service.impl.EgovComAbstractDAO;

@Repository("dataTableDAO")
public class DataTableDAO extends EgovComAbstractDAO{
	public List<?> ajax(Map mapSearch) throws Exception {
		return list("dataTableDAO.ajax", mapSearch);
	}
	
	public int ajaxTotCnt(Map mapSearch) {
		return (Integer) select("dataTableDAO.ajaxTotCnt", mapSearch);
	}

}
