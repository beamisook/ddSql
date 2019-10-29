package kr.or.ddit.dao;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.vo.MemberVO;
import kr.or.ddit.vo.ZipVO;

public interface MemberDao {
	public List<MemberVO> selectMember() throws SQLException;
	
	public  String       insertMember(MemberVO  vo) throws SQLException;
    public  String       selectById(String id) throws SQLException;
    public  List<ZipVO>  selectByDong(String dong) throws SQLException;
}
