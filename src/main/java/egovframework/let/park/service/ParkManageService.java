package egovframework.let.park.service;

import java.util.List;
import java.util.Map;

import egovframework.com.cmm.ComDefaultVO;
import egovframework.let.cop.smt.sim.service.IndvdlSchdulManageVO;

public interface ParkManageService {
	public void deleteIndvdlSchdulManage(IndvdlSchdulManageVO indvdlSchdulManageVO) throws Exception;

	/**
	 * 일정를(을) 등록한다.
	 *
	 * @param indvdlSchdulManageVO    - 일정 정보 담김 VO
	 * @exception Exception Exception
	 */
	public void insertParkManage(ParkManaeVO parkManaeVO) throws Exception;

	/**
	 * 일정를(을) 상세조회 한다.
	 * @return List
	 *
	 * @param indvdlSchdulManageVO    - 일정 정보 담김 VO
	 * @exception Exception Exception
	 */
	public List<?> selectIndvdlSchdulManageDetail(IndvdlSchdulManageVO indvdlSchdulManageVO) throws Exception;

	/**
	 * 일정 목록을 VO(model)형식으로 조회한다.
	 * @return List
	 *
	 * @param indvdlSchdulManageVO    - 조회할 정보가 담긴 VO
	 * @exception Exception Exception
	 */
	public IndvdlSchdulManageVO selectIndvdlSchdulManageDetailVO(IndvdlSchdulManageVO indvdlSchdulManageVO) throws Exception;

	/**
	 * 일정 목록을 조회한다.
	 * @return List
	 *
	 * @param searchVO    - 조회할 정보가 담긴 VO
	 * @exception Exception Exception
	 */
	public List<?> selectIndvdlSchdulManageList(ComDefaultVO searchVO) throws Exception;

	/**
	 * 일정를(을) 목록 전체 건수를(을) 조회한다.
	 * @return int
	 *
	 * @param searchVO    - 조회할 정보가 담긴 VO
	 * @exception Exception Exception
	 */
	public int selectIndvdlSchdulManageListCnt(ComDefaultVO searchVO) throws Exception;

	/**
	 * 메인페이지/일정관리조회
	 * @return List
	 *
	 * @param map    - 조회할 정보가 담긴 map
	 * @exception Exception Exception
	 */
	public List<?> selectIndvdlSchdulManageMainList(Map<?, ?> map) throws Exception;

	/**
	 * 일정 목록을 Map(map)형식으로 조회한다.
	 * @param Map(map) - 조회할 정보가 담긴 Map
	 * @return List
	 *
	 * @param map
	 * @exception Exception Exception
	 */
	public List<?> selectParkIndvdlSchdulManageRetrieve(Map<?, ?> map) throws Exception;

	/**
	 * 일정를(을) 수정한다.
	 *
	 * @param indvdlSchdulManageVO    - 일정 정보 담김 VO
	 * @exception Exception Exception
	 */
	public void updateIndvdlSchdulManage(IndvdlSchdulManageVO indvdlSchdulManageVO) throws Exception;
}