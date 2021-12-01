package mc.sn.ybjDAO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import mc.sn.ybjVO.ybjMemVO;
import mc.sn.ybjVO.ybjfollowVO;



@Repository("memberDAO")
public class MemberDAO {

	@Autowired
	private SqlSession sqlSession;
		
		//회원가입
		public int insertMember(ybjMemVO memberVO) throws DataAccessException {
			int result = sqlSession.insert("mapper.member.insertMember", memberVO);
			return result;
		}

		//이메일 중복체크 result=0 이면 중복없음 result=>1이면 중복임 
		public int checkEmail(String email) throws DataAccessException {
			int result = sqlSession.selectOne("mapper.yamember.checkEmail", email);
			return result;
		}
		
		//아이디 중복체크 result=0 이면 중복없음 result=>1이면 중복임 
		public int checkId(String id) throws DataAccessException {
			int result = sqlSession.selectOne("mapper.yamember.checkId", id);
			return result;
		}
		//vo에 id,pwd값이 들어있는 객체를 전달받아서 이 두개가 db내용과 일치할 경우 그 정보를 memvo로 전달받아 리턴
		public ybjMemVO loginByIdPw(ybjMemVO vo) {
			ybjMemVO memvo=null;
			memvo=sqlSession.selectOne("mapper.yamember.loginById", vo);
			return memvo;
		}
		
		//회원탈퇴
		public int deleteMember() {
			int result=0;
			return result;
		}
		//레벨조회
		public ybjMemVO selectLevel() {
			ybjMemVO vo=null;
			
			return vo;		
		}
		
		//포인트조회
		public ybjMemVO selectPoint() {
			ybjMemVO vo=null;
			
			return vo;		
		}
		//내가 구독하는 사람 조회
		public ybjfollowVO selectFollowing() {
			ybjfollowVO vo=null;
			
			return vo;		
		}
		
		//나를 구독하는 사람 조회
		
		public ybjfollowVO selectFollowed() {
			ybjfollowVO vo=null;
			
			return vo;		
		}
}
