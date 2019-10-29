package kr.or.ddit.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import config.SqlMapConfig;
import kr.or.ddit.vo.LprodVO;

public class LprodDaoImpl  implements LprodDao{
	
	private SqlMapClient  sqlMap ;
	private static LprodDao   dao = new LprodDaoImpl();
	
	private  LprodDaoImpl() {
		
		sqlMap = SqlMapConfig.getSqlMapInstance();
	}
	public static LprodDao  getDao(){
		return dao;
	}
	

	@Override
	public List<LprodVO> selectLprod() throws SQLException {
		
		return sqlMap.queryForList("lprod.selectLprod");
	}

}










