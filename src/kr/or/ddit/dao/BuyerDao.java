package kr.or.ddit.dao;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.vo.BuyerVO;

public interface BuyerDao {
	public List<BuyerVO>  selectNameList() throws SQLException;
    public BuyerVO  selectByDetail(String id) throws SQLException;
}
