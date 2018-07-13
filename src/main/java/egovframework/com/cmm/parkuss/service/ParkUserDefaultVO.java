package egovframework.com.cmm.parkuss.service;

public class ParkUserDefaultVO {
	private int firstIndex=1;
	
	private int lastIndex=1;
	
	private int pageIndex=1;
	
	private int pageSize=10;
	
	private int pageUnit=10;
	
	private int recordCountPerPage=10;
	
	private String sbscrbSttus="0";
	
	private String searchCondition="";
	
	private String searchKeyword="";
	
	private String searchUseYn="";

	public int getFirstIndex() {
		return firstIndex;
	}

	public int getLastIndex() {
		return lastIndex;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public int getPageSize() {
		return pageSize;
	}

	public int getPageUnit() {
		return pageUnit;
	}

	public int getRecordCountPerPage() {
		return recordCountPerPage;
	}

	public String getSbscrbSttus() {
		return sbscrbSttus;
	}

	public String getSearchCondition() {
		return searchCondition;
	}

	public String getSearchKeyword() {
		return searchKeyword;
	}

	public String getSearchUseYn() {
		return searchUseYn;
	}

	public void setFirstIndex(int firstIndex) {
		this.firstIndex = firstIndex;
	}

	public void setLastIndex(int lastIndex) {
		this.lastIndex = lastIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public void setPageUnit(int pageUnit) {
		this.pageUnit = pageUnit;
	}

	public void setRecordCountPerPage(int recordCountPerPage) {
		this.recordCountPerPage = recordCountPerPage;
	}

	public void setSbscrbSttus(String sbscrbSttus) {
		this.sbscrbSttus = sbscrbSttus;
	}

	public void setSearchCondition(String searchCondition) {
		this.searchCondition = searchCondition;
	}

	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}

	public void setSearchUseYn(String searchUseYn) {
		this.searchUseYn = searchUseYn;
	}
	
	
}
