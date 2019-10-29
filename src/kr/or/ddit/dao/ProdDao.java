package kr.or.ddit.dao;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.vo.ProdVO;

public interface ProdDao {
	public List<ProdVO>  selectByLgu(String lprod_gu) throws SQLException ;
	public ProdVO  selectDetail(String prod_id) throws SQLException;
}
