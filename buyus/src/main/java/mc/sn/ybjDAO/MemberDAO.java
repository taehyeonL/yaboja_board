package mc.sn.ybjDAO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import mc.sn.ybjVO.ybjMemVO;
import mc.sn.ybjVO.ybjfollowVO;



@Repository("memberDAO")
public class MemberDAO {

	boolean flag = false;
	
	@Autowired
	private SqlSession sqlSession;
		
		//회원가입
		public boolean insertMember(ybjMemVO memberVO) throws DataAccessException {
			int affectedCount = sqlSession.insert("mapper.member.insertMember", memberVO);
			if(affectedCount>0) {
				flag = true;
			}
			return flag;
		}

		//이메일 중복체크 result=0 이면 중복없음 result=>1이면 중복임 
		public boolean checkEmail(String email) throws DataAccessException {
			int affectedCount = sqlSession.selectOne("mapper.yamember.checkEmail", email);
			if(affectedCount>0) {
				flag = true;
			}
			return flag;
		}
		
		//아이디 중복체크 result=0 이면 중복없음 result=>1이면 중복임 
		public boolean checkId(String id) throws DataAccessException {
			int affectedCount = sqlSession.selectOne("mapper.yamember.checkId", id);
			if(affectedCount>0) {
				flag = true;
			}
			return flag;
		}
		
		//vo에 id,pwd값이 들어있는 객체를 전달받아서 이 두개가 db내용과 일치할 경우 그 정보를 memvo로 전달받아 리턴
		public ybjMemVO loginByIdPw(ybjMemVO vo) {
			ybjMemVO memvo=null;
			memvo=sqlSession.selectOne("mapper.yamember.loginById", vo);
			return memvo;
		}
		
		//회원탈퇴
		public boolean deleteMember(ybjMemVO vo) {
			int affectedCount = sqlSession.delete("mapper.yamember.deleteById", vo);
			if(affectedCount>0) {
				flag = true;
			}
			return flag;
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
