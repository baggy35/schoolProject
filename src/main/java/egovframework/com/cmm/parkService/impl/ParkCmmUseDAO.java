package egovframework.com.cmm.parkService.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.com.cmm.ComDefaultCodeVO;
import egovframework.com.cmm.service.CmmnDetailCode;
import egovframework.com.cmm.service.impl.EgovComAbstractDAO;

@Repository("parkCmmUseDAO")
public class ParkCmmUseDAO extends EgovComAbstractDAO{
	 @SuppressWarnings("unchecked")
		public List<CmmnDetailCode> selectCmmCodeDetail(ComDefaultCodeVO vo) throws Exception {
		return (List<CmmnDetailCode>) list("CmmUseDAO.selectCmmCodeDetail", vo);
	    }

	    /**
	     * 공통코드로 사용할 조직정보를 를 불러온다.
	     *
	     * @param vo
	     * @return
	     * @throws Exception
	     */
	    @SuppressWarnings("unchecked")
	    public List<CmmnDetailCode> selectOgrnztIdDetail(ComDefaultCodeVO vo) throws Exception {
		return (List<CmmnDetailCode>) list("CmmUseDAO.selectOgrnztIdDetail", vo);
	    }

	    /**
	     * 공통코드로 사용할그룹정보를 를 불러온다.
	     *
	     * @param vo
	     * @return
	     * @throws Exception
	     */
	    @SuppressWarnings("unchecked")
	    public List<CmmnDetailCode> selectGroupIdDetail(ComDefaultCodeVO vo) throws Exception {
		return (List<CmmnDetailCode>) list("CmmUseDAO.selectGroupIdDetail", vo);
	    }
	}
