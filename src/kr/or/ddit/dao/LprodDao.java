package kr.or.ddit.dao;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.vo.LprodVO;

public interface LprodDao {

	
	public List<LprodVO> selectLprod() throws SQLException;
}
