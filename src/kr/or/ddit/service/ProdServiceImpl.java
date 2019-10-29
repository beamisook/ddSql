package kr.or.ddit.service;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.dao.ProdDao;
import kr.or.ddit.dao.ProdDaoImpl;
import kr.or.ddit.vo.ProdVO;

public class ProdServiceImpl implements ProdService{

	private ProdDao dao ;
	private static ProdService  service = new ProdServiceImpl();
	
	private ProdServiceImpl(){
		dao = ProdDaoImpl.getDao();
	}
	
	public static ProdService getService(){
		return service;
	}
	
	@Override
	public List<ProdVO> selectByLgu(String lprod_gu) {
		List<ProdVO> list = null;
		try {
			list = dao.selectByLgu(lprod_gu);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public ProdVO selectDetail(String prod_id) {
		ProdVO  vo = null;
		try {
			vo = dao.selectDetail(prod_id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vo;
	}

}
