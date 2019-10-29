package kr.or.ddit.service;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.dao.MemberDao;
import kr.or.ddit.dao.MemberDaoImpl;
import kr.or.ddit.vo.MemberVO;
import kr.or.ddit.vo.ZipVO;

public class MemberSeriveImpl implements MemberService {
	
	private MemberDao memberDao;
	private static MemberService memberService;
	
	public static MemberService getMemberService(){
		if(memberService == null){
			memberService = new MemberSeriveImpl();
		}
		return memberService;
	}
	
	private MemberSeriveImpl(){
		memberDao = MemberDaoImpl.getMemberDao();
	}
	
	@Override
	public List<MemberVO> selectMember(){
		List<MemberVO> list = null;
		
		try {
			list = memberDao.selectMember();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public String insertMember(MemberVO vo) {
		String  id = null;
		
		 try {
			id = memberDao.insertMember(vo);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return id;
	}

	@Override
	public String selectById(String id) {
		String res=null;
		try {
			res= memberDao.selectById(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public List<ZipVO> selectByDong(String dong) {
		List<ZipVO> list = null;
		try {
			list = memberDao.selectByDong(dong);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
