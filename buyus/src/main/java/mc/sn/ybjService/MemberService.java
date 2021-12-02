package mc.sn.ybjService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import mc.sn.ybjDAO.MemberDAO;
import mc.sn.ybjVO.ybjMemVO;
import mc.sn.ybjVO.ybjfollowVO;

@Service("memberService")
//@Service
public class MemberService {
	
	boolean flag = false;
	
	@Autowired
	private MemberDAO memberDAO;
	
	//회원가입
	public boolean addMember(ybjMemVO memberVO) throws DataAccessException {
		flag = memberDAO.insertMember(memberVO);
		return flag;
	}

	//이메일 중복체크 result=0 이면 중복없음 result=>1이면 중복임 
	public boolean CompareEmail(String email) throws DataAccessException {
		flag = memberDAO.checkEmail(email);
		return flag;
	}
	
	//아이디 중복체크 result=0 이면 중복없음 result=>1이면 중복임 
	public boolean CompareId(String id) throws DataAccessException {
		flag = memberDAO.checkId(id);
		return flag;
	}
	//vo에 id,pwd값이 들어있는 객체를 전달받아서 이 두개가 db내용과 일치할 경우 그 정보를 memvo로 전달받아 리턴
	public ybjMemVO login(ybjMemVO vo) {
		ybjMemVO memvo = memberDAO.loginByIdPw(vo);
		return memvo;
	}
	//회원탈퇴
	public boolean eraseMember(ybjMemVO memberVO) {
		flag = memberDAO.deleteMember(memberVO);
		return flag;
	}
	/*
	 * //레벨조회 public ybjMemVO readLevel() { ybjMemVO vo=null;
	 * 
	 * return vo; }
	 * 
	 * //포인트조회 public ybjMemVO readPoint() { ybjMemVO vo=null;
	 * 
	 * return vo; } //내가 구독하는 사람 조회 public ybjfollowVO readFollowing() { ybjfollowVO
	 * vo=null;
	 * 
	 * return vo; }
	 * 
	 * //나를 구독하는 사람 조회
	 * 
	 * public ybjfollowVO readFollowed() { ybjfollowVO vo=null;
	 * 
	 * return vo; }
	 */
}
