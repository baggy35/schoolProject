package egovframework.com.cmm.parkService.impl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import egovframework.com.cmm.ComDefaultCodeVO;
import egovframework.com.cmm.parkService.ParkCmmUseService;
import egovframework.com.cmm.service.CmmnDetailCode;
import egovframework.com.cmm.service.impl.CmmUseDAO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
@Service("parkCmmUseServiceImpl")
public class ParkCmmUseServiceImpl extends EgovAbstractServiceImpl implements ParkCmmUseService{
	@Resource(name = "cmmUseDAO")
	private CmmUseDAO cmmUseDAO;
	
	@Resource(name="parkCmmUseDAO")
	private ParkCmmUseDAO parkCmmUseDAO;

	/**
	 * 공통코드를 조회한다.
	 *
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<CmmnDetailCode> selectCmmCodeDetail(ComDefaultCodeVO vo) throws Exception {
		return cmmUseDAO.selectCmmCodeDetail(vo);
	}

	/**
	 * ComDefaultCodeVO의 리스트를 받아서 여러개의 코드 리스트를 맵에 담아서 리턴한다.
	 *
	 * @param voList
	 * @return
	 * @throws Exception
	 */
	@Override
	public Map<String, List<CmmnDetailCode>> selectCmmCodeDetails(List<?> voList) throws Exception {
		ComDefaultCodeVO vo;
		Map<String, List<CmmnDetailCode>> map = new HashMap<String, List<CmmnDetailCode>>();

		Iterator<?> iter = voList.iterator();
		while (iter.hasNext()) {
			vo = (ComDefaultCodeVO) iter.next();
			map.put(vo.getCodeId(), cmmUseDAO.selectCmmCodeDetail(vo));
		}

		return map;
	}

	/**
	 * 조직정보를 코드형태로 리턴한다.
	 *
	 * @param 조회조건정보 vo
	 * @return 조직정보 List
	 * @throws Exception
	 */
	@Override
	public List<CmmnDetailCode> selectOgrnztIdDetail(ComDefaultCodeVO vo) throws Exception {
		return cmmUseDAO.selectOgrnztIdDetail(vo);
	}

	/**
	 * 그룹정보를 코드형태로 리턴한다.
	 *
	 * @param 조회조건정보 vo
	 * @return 그룹정보 List
	 * @throws Exception
	 */
	@Override
	public List<CmmnDetailCode> selectGroupIdDetail(ComDefaultCodeVO vo) throws Exception {
		return cmmUseDAO.selectGroupIdDetail(vo);
	}
}
