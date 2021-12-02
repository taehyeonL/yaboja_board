package mc.sn.buyus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import mc.sn.ybjService.MemberService;
import mc.sn.ybjVO.ybjMemVO;

@Controller("memberController")
//@Controller
@RequestMapping("member/*")
public class MemberController {

	boolean flag = false;

	@Autowired(required = false)
	private MemberService memberService;
	
	@Autowired(required = false)
	private ybjMemVO memberVO;
	
	

	@RequestMapping(value = "main", method = RequestMethod.GET)
	public ModelAndView home(HttpServletRequest req, HttpServletResponse resp) {
		ModelAndView mav = new ModelAndView();
		String url = "main";
		mav.setViewName(url);
		return mav;
	}

	/*
	 * @ResponseBody
	 * 
	 * @RequestMapping(value="/main", method = RequestMethod.GET) public
	 * ModelAndView main(HttpServletRequest req, HttpServletResponse resp) {
	 * ModelAndView mav = new ModelAndView(); String url = "/App";
	 * mav.setViewName(url); return mav; }
	 */

	@ResponseBody
	@RequestMapping(value = "checkId", method = RequestMethod.GET)
	public boolean checkId(HttpServletRequest req, HttpServletResponse resp) {
		flag = memberService.CompareId(null);
		return flag;
	}

	@ResponseBody
	@RequestMapping(value = "checkEmail", method = RequestMethod.GET)
	public boolean checkEmail(HttpServletRequest req, HttpServletResponse resp) {
		flag = memberService.CompareEmail(null);
		return flag;
	}

	@ResponseBody
	@RequestMapping(value = "join", method = RequestMethod.GET)
	public boolean signIn(HttpServletRequest req, HttpServletResponse resp) {
		// 테스트용 하드코딩
		memberVO = new ybjMemVO("id1", "ya@ya.com", "1234", "lee", "netflix", "010", null, null, null);
		flag = memberService.addMember(memberVO);
		return flag;
	}

	@ResponseBody
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public ybjMemVO logIn(HttpServletRequest req, HttpServletResponse resp) {
		ybjMemVO vo = memberService.login(null);
		return vo;
	}

	@ResponseBody
	@RequestMapping(value = "eraseMember", method = RequestMethod.GET)
	public boolean eraseMember(HttpServletRequest req, HttpServletResponse resp) {
		flag = memberService.eraseMember(null);
		return flag;
	}

}
