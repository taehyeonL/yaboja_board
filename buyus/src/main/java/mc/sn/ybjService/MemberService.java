package mc.sn.ybjService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import mc.sn.ybjDAO.MemberDAO;
import mc.sn.ybjVO.ybjMemVO;

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
}
