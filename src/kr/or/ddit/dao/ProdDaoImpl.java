package kr.or.ddit.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import config.SqlMapConfig;
import kr.or.ddit.vo.ProdVO;

public class ProdDaoImpl implements ProdDao {

	private SqlMapClient  sqlMap;
	private static ProdDao  dao = new ProdDaoImpl();
	
	private ProdDaoImpl(){
		sqlMap = SqlMapConfig.getSqlMapInstance();
	}
	
	public static ProdDao  getDao(){
		return dao;
	}
	
	@Override
	public List<ProdVO> selectByLgu(String lprod_gu) throws SQLException {
		// TODO Auto-generated method stub
		return sqlMap.queryForList("prod.selectBylgu", lprod_gu);
	}

	@Override
	public ProdVO selectDetail(String prod_id) throws SQLException {
		// TODO Auto-generated method stub
		return (ProdVO) sqlMap.queryForObject("prod.selectDetail", prod_id);
	}

}
