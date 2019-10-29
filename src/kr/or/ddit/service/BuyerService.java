package kr.or.ddit.service;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.vo.BuyerVO;

public interface BuyerService {

	public List<BuyerVO>  selectNameList() ;
    public BuyerVO  selectByDetail(String id) ;
}
