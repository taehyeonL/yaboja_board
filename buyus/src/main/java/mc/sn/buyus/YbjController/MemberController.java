package mc.sn.buyus.YbjController;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import mc.sn.buyus.YbjService.MemberService;
import mc.sn.buyus.YbjService.SecurityService;
import mc.sn.buyus.YbjService.SecurityServiceImpl;
import mc.sn.buyus.YbjVO.SecurityVO;
import mc.sn.buyus.YbjVO.YbjMemVO;

//	@ResponseBody 모두 생략가능 <== RestController 어노테이션 사용시 모두에게 적용 
@RestController("memberController")
//@RequestMapping("/member/*")
public class MemberController {
	boolean flag = false;

	@Autowired
	private MemberService memberService;
	@Autowired
	private YbjMemVO memberVO;
	@Autowired
	private SecurityService securityService;
//	private SecurityVO securityVO;

	// 아이디 중복확인
	@RequestMapping(value = "join/checkId", method = RequestMethod.GET)
	public void checkId(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//	public void checkId(@RequestParam("id") String id, HttpServletRequest req, HttpServletResponse resp) {
		String id = req.getParameter("id");
		boolean flag = memberService.compareId(id);
		if (flag) {
			System.out.println(id + ": Already exist");
			resp.sendError(HttpServletResponse.SC_NOT_FOUND);
		} else {
			System.out.println(id + ": Available");
			resp.sendError(HttpServletResponse.SC_OK);
		}
	}

	// 이메일 중복확인
	@RequestMapping(value = "join/checkEmail", method = RequestMethod.GET)
	public void checkEmail(@RequestParam("email") String email, HttpServletResponse resp) throws IOException {
		flag = memberService.compareEmail(email);
		if (flag) {
			System.out.println(email + ": Already exist");
			resp.sendError(HttpServletResponse.SC_NOT_FOUND);
		} else {
			System.out.println(email + ": Available");
			resp.sendError(HttpServletResponse.SC_OK);
		}
	}

	// 회원가입
	@RequestMapping(value = "join", method = RequestMethod.POST)
	public void join(@RequestBody String json, HttpServletResponse resp) throws IOException {
		memberVO = new ObjectMapper().readValue(json, YbjMemVO.class);
		System.out.println(memberVO);
		flag = memberService.addMember(memberVO);
		if (flag) {
			resp.sendError(HttpServletResponse.SC_OK);
		}
	}

	/*
	 * // 회원가입 하드코딩 테스트
	 * 
	 * @RequestMapping(value = "join", method = RequestMethod.GET) public void
	 * join() { memberVO = new YbjMemVO("id2", "bo@bo.com", "1234", "보", "와챠",
	 * "010", null); memberService.addMember(memberVO); }
	 */

	// 로그인
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public SecurityVO logIn(@RequestBody String json, HttpServletResponse resp) throws IOException {

		String token = null;
		memberVO = new ObjectMapper().readValue(json, YbjMemVO.class);
		securityService = new SecurityServiceImpl();
		SecurityVO securityVO = null;
		YbjMemVO resultVO = new YbjMemVO();
		resultVO = memberService.login(memberVO);
		if (resultVO != null) {
			System.out.println("success! " + resultVO);
			token = securityService.createJWT(resultVO.getYaId(), (2 * 1000 * 60 * 60));
			securityVO = new SecurityVO(resultVO, token);
		} else {
			System.out.println("fail");
			resp.sendError(HttpServletResponse.SC_NOT_FOUND);
			return null;
		}
		System.out.println("{resultVO:" + resultVO + ", jwt:[" + token + "]}");

//		return "{resultVO:" + resultVO + ", jwt:\"" + token + "\"}";
		return securityVO;
	}

	// 이메일 찾기
	@RequestMapping(value = "login/findEmail", method = RequestMethod.POST)
	public String findEmail(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String name = req.getParameter("yaName");
		System.out.println(name);
		String email = memberService.findEmail(name);
		System.out.println(email);
		if (email != null) {
			System.out.println("success! " + email);
		} else {
			System.out.println("fail");
			resp.sendError(HttpServletResponse.SC_NOT_FOUND);
			return null;
		}
		return email;
	}

	// 비밀번호 찾기
	@RequestMapping(value = "login/findPwd", method = RequestMethod.POST)
	public String findPwd(@RequestBody String json, HttpServletResponse resp) throws IOException {
		memberVO = new ObjectMapper().readValue(json, YbjMemVO.class);
		String pwd = memberService.findPwd(memberVO);
		System.out.println(pwd);
		if (pwd != null) {
			System.out.println("success! " + pwd);
		} else {
			System.out.println("fail");
			resp.sendError(HttpServletResponse.SC_NOT_FOUND);
			return null;
		}
		return pwd;
	}

	// 회원탈퇴
	@RequestMapping(value = "signout", method = RequestMethod.POST)
	public boolean eraseMember(@RequestBody String json, HttpServletResponse resp) throws IOException {
		memberVO = new ObjectMapper().readValue(json, YbjMemVO.class);
		flag = memberService.eraseMember(memberVO);
		if (flag) {
			System.out.println("delete success!");
		} else {
			System.out.println("fail");
			resp.sendError(HttpServletResponse.SC_NOT_FOUND);
		}
		return flag;
	}

/////////////////////////////////////////////////////////////////////////////////////	

	@RequestMapping("/CJWT")
	public Map<String, Object> genToken() {
		securityService = new SecurityServiceImpl();
		String token = securityService.createJWT("테스트", (2 * 1000 * 60 * 60)); // 토큰 유효시간:2시간
		System.out.println(token);
		String result = securityService.verifyJWT(token);
		System.out.println(result);
//		System.out.println("[\"result\":\"" + result + "\", \"jwt\":\"" + token + "\"]");
//		System.out.println("[result:" + result + ", jwt:" + token + "]");
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("jwt", token);
		return map;
	}

}

/*
 * BackEnd 테스트용 페이지 호출 코드
 * 
 * @RequestMapping(value = "main", method = RequestMethod.GET) public
 * ModelAndView home(HttpServletRequest req, HttpServletResponse resp) {
 * ModelAndView mav = new ModelAndView(); String url = "main";
 * mav.setViewName(url); return mav; }
 * 
 * @RequestMapping(value = "/main", method = RequestMethod.GET) public
 * ModelAndView main(HttpServletRequest req, HttpServletResponse resp) {
 * ModelAndView mav = new ModelAndView(); String url = "/App";
 * mav.setViewName(url); return mav; }
 * 
 * @RequestMapping(value = "view_join", method = RequestMethod.GET) public
 * ModelAndView viewJoin(HttpServletRequest req, HttpServletResponse resp) {
 * ModelAndView mav = new ModelAndView(); String url = "join";
 * mav.setViewName(url); return mav; }
 * 
 * @RequestMapping(value = "signout", method = RequestMethod.POST) public
 * ModelAndView signout(HttpServletRequest req, HttpServletResponse resp) {
 * ModelAndView mav = new ModelAndView(); String url = "signOut";
 * mav.setViewName(url); return mav; }
 */

//@RequestMapping(value = "login", method = RequestMethod.POST)
//public String logIn(@RequestBody String memVo, HttpServletResponse resp) {
//	YbjMemVO vo = new YbjMemVO();
//	try {
//		vo = new ObjectMapper().readValue(memVo, YbjMemVO.class);
//	} catch (JsonMappingException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} catch (JsonProcessingException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	System.out.println("controller : " + vo);
//	System.out.println(memberService.login(vo));
//	return memberService.login(vo).getYaId();
//}

//JWT참고용 코드
//public Map<String, Object> genToken(@RequestParam(value="subject") String subject) {
//    String token = securityService.createJWT(subject, (2 * 1000 * 60 * 60)); //토큰 유효시간:2시간
//    System.out.println(token);
//    Map<String, Object> map = new LinkedHashMap<String, Object>();
//    map.put("jwt", token);
//    return map;
//}
//
//public Map<String, Object> getSubject(@RequestParam(value="token") String token) {
//    String subject = securityService.verifyJWT(token);
//    Map<String, Object> map = new LinkedHashMap<String, Object>();
//    map.put("jwt", subject);
//    return map;
//}
