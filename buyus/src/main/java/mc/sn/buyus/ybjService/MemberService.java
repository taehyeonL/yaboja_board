package mc.sn.buyus.ybjService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import mc.sn.buyus.ybjDAO.MemberDAO;
import mc.sn.buyus.ybjVO.ybjMemVO;
import mc.sn.buyus.ybjVO.ybjfollowVO;

@Service("memberService")
public class MemberService {
	
	@Autowired
	private MemberDAO memberDAO;
	
	public int addMember(ybjMemVO memberVO) throws DataAccessException {
		int result = memberDAO.insertMember(memberVO);
		return result;
	}

	//이메일 중복체크 result=0 이면 중복없음 result=>1이면 중복임 
	public int CompareEmail(String email) throws DataAccessException {
		int result = memberDAO.checkEmail(email);
		return result;
	}
	
	//아이디 중복체크 result=0 이면 중복없음 result=>1이면 중복임 
	public int CompareId(String id) throws DataAccessException {
		int result = memberDAO.checkId(id);
		return result;
	}
	//vo에 id,pwd값이 들어있는 객체를 전달받아서 이 두개가 db내용과 일치할 경우 그 정보를 memvo로 전달받아 리턴
	public ybjMemVO login(ybjMemVO vo) {
		ybjMemVO memvo=null;
		memvo=memberDAO.loginByIdPw(memvo);
		return memvo;
	}
	//회원탈퇴
	public int eraseMember() {
		int result=0;
		return result;
	}
	//레벨조회
	public ybjMemVO readLevel() {
		ybjMemVO vo=null;
		
		return vo;		
	}
	
	//포인트조회
	public ybjMemVO readPoint() {
		ybjMemVO vo=null;
		
		return vo;		
	}
	//내가 구독하는 사람 조회
	public ybjfollowVO readFollowing() {
		ybjfollowVO vo=null;
		
		return vo;		
	}
	
	//나를 구독하는 사람 조회
	
	public ybjfollowVO readFollowed() {
		ybjfollowVO vo=null;
		
		return vo;		
	}
}
