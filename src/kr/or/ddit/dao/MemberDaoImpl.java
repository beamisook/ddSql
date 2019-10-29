package kr.or.ddit.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import config.SqlMapConfig;
import kr.or.ddit.vo.MemberVO;
import kr.or.ddit.vo.ZipVO;

public class MemberDaoImpl implements MemberDao {
	//Mapper에 접근하기 위한 sqlMapClient객체 얻어오기
	private SqlMapClient sqlMap;
	private static MemberDao memberDao; 
	
	private MemberDaoImpl(){
		sqlMap = SqlMapConfig.getSqlMapInstance();
	}
		
	public static MemberDao getMemberDao(){
		if(memberDao == null){
			memberDao = new MemberDaoImpl();
		}
		return memberDao;
	}
	
	@Override
	public List<MemberVO> selectMember() throws SQLException {
		return sqlMap.queryForList("member.selectMember");
	}

	@Override
	public String insertMember(MemberVO vo) throws SQLException {
		return (String)sqlMap.insert("member.insertMember", vo);
	}

	@Override
	public String selectById(String id) throws SQLException {
		
		return (String)sqlMap.queryForObject("member.selectById", id);
	}

	@Override
	public List<ZipVO> selectByDong(String dong) throws SQLException {
		return sqlMap.queryForList("member.selectByDong", dong);
	}
}
