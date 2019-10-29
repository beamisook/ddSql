package kr.or.ddit.service;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.dao.LprodDao;
import kr.or.ddit.dao.LprodDaoImpl;
import kr.or.ddit.vo.LprodVO;

public class LprodServiceImpl  implements LprodService{

	private LprodDao  dao ;
	private static LprodService  service= new LprodServiceImpl();
	
	
	private LprodServiceImpl(){
		
		dao = LprodDaoImpl.getDao();
	}
	public static LprodService getService(){
		return service;
	}
	
	@Override
	public List<LprodVO> selectLprod() {
		List<LprodVO>  list = null;
		
		try {
			list = dao.selectLprod();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

}












