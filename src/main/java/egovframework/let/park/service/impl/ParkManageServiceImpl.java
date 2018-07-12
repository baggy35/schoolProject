package egovframework.let.park.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.com.cmm.ComDefaultVO;
import egovframework.let.cop.smt.sim.service.IndvdlSchdulManageVO;
import egovframework.let.cop.smt.sim.service.impl.IndvdlSchdulManageDao;
import egovframework.let.park.service.ParkManaeVO;
import egovframework.let.park.service.ParkManageService;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;

@Service("parkManageService")
public class ParkManageServiceImpl extends EgovAbstractServiceImpl implements ParkManageService{
	@Resource(name="indvdlSchdulManageDao")
	private IndvdlSchdulManageDao dao;
	
	@Resource(name="ParkManageDao")
	private ParkManageDao parkManageDao;


	@Resource(name="deptSchdulManageIdGnrService")
	private EgovIdGnrService idgenService;


    /**
	 * 메인페이지/일정관리조회
	 * @param map - 조회할 정보가 담긴 map
	 * @return List
	 * @throws Exception
	 */
	@Override
	public List<?> selectIndvdlSchdulManageMainList(Map<?, ?> map) throws Exception{
		return dao.selectIndvdlSchdulManageMainList(map);
	}

    /**
	 * 일정 목록을 Map(map)형식으로 조회한다.
	 * @param Map(map) - 조회할 정보가 담긴 VO
	 * @return List
	 * @throws Exception
	 */
	@Override
	public List<?> selectIndvdlSchdulManageRetrieve(Map<?, ?> map) throws Exception{
		return dao.selectIndvdlSchdulManageRetrieve(map);
	}

    /**
	 * 일정 목록을 VO(model)형식으로 조회한다.
	 * @param indvdlSchdulManageVO - 조회할 정보가 담긴 VO
	 * @return List
	 * @throws Exception
	 */
	@Override
	public IndvdlSchdulManageVO selectIndvdlSchdulManageDetailVO(IndvdlSchdulManageVO indvdlSchdulManageVO) throws Exception{
		return dao.selectIndvdlSchdulManageDetailVO(indvdlSchdulManageVO);
	}

    /**
	 * 일정 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return List
	 * @throws Exception
	 */
	@Override
	public List<?> selectIndvdlSchdulManageList(ComDefaultVO searchVO) throws Exception{
		return dao.selectIndvdlSchdulManageList(searchVO);
	}

    /**
	 * 일정를(을) 상세조회 한다.
	 * @param IndvdlSchdulManage - 회정정보가 담김 VO
	 * @return List
	 * @throws Exception
	 */
	@Override
	public List<?> selectIndvdlSchdulManageDetail(IndvdlSchdulManageVO indvdlSchdulManageVO) throws Exception{
		return dao.selectIndvdlSchdulManageDetail(indvdlSchdulManageVO);
	}

    /**
	 * 일정를(을) 목록 전체 건수를(을) 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return int
	 * @throws Exception
	 */
	@Override
	public int selectIndvdlSchdulManageListCnt(ComDefaultVO searchVO) throws Exception{
		return dao.selectIndvdlSchdulManageListCnt(searchVO);
	}

    /**
	 * 일정를(을) 등록한다.
	 * @param indvdlSchdulManageVO - 조회할 정보가 담긴 VO
	 * @throws Exception
	 */
	@Override
	public void insertParkManage(ParkManaeVO parkManaeVO) throws Exception {
		String sMakeId = idgenService.getNextStringId();
		parkManaeVO.setSchdulId(sMakeId);

		parkManageDao.insertParkManage(parkManaeVO);
	}

    /**
	 * 일정를(을) 수정한다.
	 * @param indvdlSchdulManageVO - 조회할 정보가 담긴 VO
	 * @throws Exception
	 */
	@Override
	public void updateIndvdlSchdulManage(IndvdlSchdulManageVO indvdlSchdulManageVO) throws Exception{
		dao.updateIndvdlSchdulManage(indvdlSchdulManageVO);
	}

    /**
	 * 일정를(을) 삭제한다.
	 * @param indvdlSchdulManageVO - 조회할 정보가 담긴 VO
	 * @throws Exception
	 */
	@Override
	public void deleteIndvdlSchdulManage(IndvdlSchdulManageVO indvdlSchdulManageVO) throws Exception{
		dao.deleteIndvdlSchdulManage(indvdlSchdulManageVO);
	}
}
