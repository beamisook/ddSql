package kr.or.ddit.service;

import java.util.List;

import kr.or.ddit.vo.MemberVO;
import kr.or.ddit.vo.ZipVO;

public interface MemberService {
	public List<MemberVO> selectMember();
	
	public  String       insertMember(MemberVO  vo);
    public  String     selectById(String id);
    public  List<ZipVO>  selectByDong(String dong);
}
