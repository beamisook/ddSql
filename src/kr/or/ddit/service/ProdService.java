package kr.or.ddit.service;

import java.util.List;

import kr.or.ddit.vo.ProdVO;

public interface ProdService {

	public List<ProdVO>  selectByLgu(String lprod_gu) ;
	public ProdVO  selectDetail(String prod_id);
 }
