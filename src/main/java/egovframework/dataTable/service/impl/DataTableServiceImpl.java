package egovframework.dataTable.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.dataTable.service.DataTableService;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("dataTableService")
public class DataTableServiceImpl extends EgovAbstractServiceImpl implements DataTableService{
	
	@Resource(name="dataTableDAO")
	private DataTableDAO dataTableDAO;
	
	public List<?> ajax(Map mapSearch) throws Exception {
		return dataTableDAO.ajax(mapSearch);
	}
	
	public int ajaxTotCnt(Map mapSearch) {
		return dataTableDAO.ajaxTotCnt(mapSearch);
	}
}
