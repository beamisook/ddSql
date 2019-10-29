package kr.or.ddit.service;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.dao.BuyerDao;
import kr.or.ddit.dao.BuyerDaoImpl;
import kr.or.ddit.vo.BuyerVO;

public class BuyerServiceImpl  implements BuyerService{

	private BuyerDao  dao;
	private static BuyerService  service = new BuyerServiceImpl();
	
	private  BuyerServiceImpl() {
		dao = BuyerDaoImpl.getDao();
	}
	
	public static BuyerService getService(){
		return service;
	}
	@Override
	public List<BuyerVO> selectNameList() {
		List<BuyerVO>  list = null;
		try {
			list = dao.selectNameList();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public BuyerVO selectByDetail(String id) {
		BuyerVO  vo = null;
		try {
			vo = dao.selectByDetail(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return vo;
	}

}
