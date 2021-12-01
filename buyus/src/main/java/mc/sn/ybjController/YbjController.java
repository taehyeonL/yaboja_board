package mc.sn.ybjController;

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

@Controller
public class YbjController {

	@Autowired
	MemberService service;

	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView home(HttpServletRequest req, HttpServletResponse resp) {
		ModelAndView mav = new ModelAndView();
		String url = "/App";
		mav.setViewName(url);
		return mav;
	}
	
	@ResponseBody
	@RequestMapping(value="/main", method = RequestMethod.GET)
	public ModelAndView main(HttpServletRequest req, HttpServletResponse resp) {
		ModelAndView mav = new ModelAndView();
		String url = "/App";
		mav.setViewName(url);
		return mav;
	}
	
	@ResponseBody
	@RequestMapping(value="/join", method = RequestMethod.GET)
	public int signIn(HttpServletRequest req, HttpServletResponse resp) {
		//테스트용 하드코딩
		ybjMemVO memberVO = new ybjMemVO("id1","ya@ya.com","1234","lee","netflix","010", null, null, null);
		int num = service.addMember(memberVO);
		return num;
	}
	
	@ResponseBody
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public ybjMemVO logIn(HttpServletRequest req, HttpServletResponse resp) {
		ybjMemVO vo = service.login(null);
		return vo;
	}
	
	
}
