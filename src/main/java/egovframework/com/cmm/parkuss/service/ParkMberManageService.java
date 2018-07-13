package egovframework.com.cmm.parkuss.service;

import java.util.List;

public interface ParkMberManageService {
	
	public void deleteMber(String i)throws Exception;
	
	public String inserMber(ParkMberManageVO parkMberManageVO)throws Exception;
	
	public ParkMberManageVO selectMber(String i)throws Exception;
	
	public List<ParkMberManageVO>selectMberList(ParkUserDefaultVO parkUserDefaultVO)throws Exception;
	
	public int selectMberListTotCnt(ParkUserDefaultVO parkUserDefaultVO)throws Exception;
	
	public ParkMberManageVO selectPassword(ParkMberManageVO parkMberManageVO)throws Exception;
	
	public List selectStplat(String i)throws Exception;
	
	public void updateMber(ParkMberManageVO parkMberManageVO)throws Exception;
	
	public void updatePassword(ParkMberManageVO parkMberManageVO)throws Exception;
	
	
}
