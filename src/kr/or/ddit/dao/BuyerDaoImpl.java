package kr.or.ddit.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import config.SqlMapConfig;
import kr.or.ddit.vo.BuyerVO;

public class BuyerDaoImpl implements BuyerDao {
	
	private SqlMapClient  sqlMap;
	private static BuyerDao dao = new BuyerDaoImpl();

	private BuyerDaoImpl(){
		sqlMap = SqlMapConfig.getSqlMapInstance();
	}
	public static  BuyerDao  getDao(){
		return dao;
	}
	//@Override
	public List<BuyerVO> selectNameList() throws SQLException {
		// TODO Auto-generated method stub
		return sqlMap.queryForList("buyer.selectNameList");
	}

	//@Override
	public BuyerVO selectByDetail(String id) throws SQLException {
		// TODO Auto-generated method stub
		return (BuyerVO) sqlMap.queryForObject("buyer.selectByDetail", id);
	}
	
}
