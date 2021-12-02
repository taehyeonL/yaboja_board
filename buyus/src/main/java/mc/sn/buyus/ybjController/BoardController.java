package mc.sn.buyus.ybjController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import mc.sn.buyus.ybjService.BoardService;

@Controller("boardController")
@RequestMapping("/board/*")
public class BoardController {
	
	@Autowired
	private BoardService boardservice;
	
	//리뷰 CRUD
	@ResponseBody
	@RequestMapping(value="/reviewC", method = RequestMethod.GET)
	public ModelAndView reviewC(HttpServletRequest req, HttpServletResponse resp) {
		ModelAndView mav = new ModelAndView();
		String url = "/App";
		mav.setViewName(url);
		return mav;
	}
	
	@ResponseBody
	@RequestMapping(value="/reviewR", method = RequestMethod.GET)
	public ModelAndView reviewR(HttpServletRequest req, HttpServletResponse resp) {
		ModelAndView mav = new ModelAndView();
		String url = "/App";
		mav.setViewName(url);
		return mav;
	}
	
	@ResponseBody
	@RequestMapping(value="/reviewU", method = RequestMethod.GET)
	public ModelAndView reveiwU(HttpServletRequest req, HttpServletResponse resp) {
		ModelAndView mav = new ModelAndView();
		String url = "/App";
		mav.setViewName(url);
		return mav;
	}
	
	@ResponseBody
	@RequestMapping(value="/reviewD", method = RequestMethod.GET)
	public ModelAndView reviewD(HttpServletRequest req, HttpServletResponse resp) {
		ModelAndView mav = new ModelAndView();
		String url = "/App";
		mav.setViewName(url);
		return mav;
	}
	
	
	//리뷰댓글 CRUD
	@ResponseBody
	@RequestMapping(value="/reviewReplyC", method = RequestMethod.GET)
	public ModelAndView replyC(HttpServletRequest req, HttpServletResponse resp) {
		ModelAndView mav = new ModelAndView();
		String url = "/App";
		mav.setViewName(url);
		return mav;
	}
	
	@ResponseBody
	@RequestMapping(value="/reviewReplyR", method = RequestMethod.GET)
	public ModelAndView replyR(HttpServletRequest req, HttpServletResponse resp) {
		ModelAndView mav = new ModelAndView();
		String url = "/App";
		mav.setViewName(url);
		return mav;
	}
	
	@ResponseBody
	@RequestMapping(value="/reviewReplyU", method = RequestMethod.GET)
	public ModelAndView replyU(HttpServletRequest req, HttpServletResponse resp) {
		ModelAndView mav = new ModelAndView();
		String url = "/App";
		mav.setViewName(url);
		return mav;
	}
	
	@ResponseBody
	@RequestMapping(value="/reviewReplyD", method = RequestMethod.GET)
	public ModelAndView replyD(HttpServletRequest req, HttpServletResponse resp) {
		ModelAndView mav = new ModelAndView();
		String url = "/App";
		mav.setViewName(url);
		return mav;
	}
	
	
	//게시판 CRUD
	@ResponseBody
	@RequestMapping(value="/boardC", method = RequestMethod.GET)
	public ModelAndView boardC(HttpServletRequest req, HttpServletResponse resp) {
		ModelAndView mav = new ModelAndView();
		String url = "/App";
		mav.setViewName(url);
		return mav;
	}
	
	@ResponseBody
	@RequestMapping(value="/boardR", method = RequestMethod.GET)
	public ModelAndView boardR(HttpServletRequest req, HttpServletResponse resp) {
		ModelAndView mav = new ModelAndView();
		String url = "/App";
		mav.setViewName(url);
		return mav;
	}
	
	@ResponseBody
	@RequestMapping(value="/boardU", method = RequestMethod.GET)
	public ModelAndView boardU(HttpServletRequest req, HttpServletResponse resp) {
		ModelAndView mav = new ModelAndView();
		String url = "/App";
		mav.setViewName(url);
		return mav;
	}
	
	@ResponseBody
	@RequestMapping(value="/boardD", method = RequestMethod.GET)
	public ModelAndView boardD(HttpServletRequest req, HttpServletResponse resp) {
		ModelAndView mav = new ModelAndView();
		String url = "/App";
		mav.setViewName(url);
		return mav;
	}
	
	
	//게시판댓글 CRUD
	@ResponseBody
	@RequestMapping(value="/boardReplyC", method = RequestMethod.GET)
	public ModelAndView boardReplyC(HttpServletRequest req, HttpServletResponse resp) {
		ModelAndView mav = new ModelAndView();
		String url = "/App";
		mav.setViewName(url);
		return mav;
	}
	
	@ResponseBody
	@RequestMapping(value="/boardReplyR", method = RequestMethod.GET)
	public ModelAndView boardReplyR(HttpServletRequest req, HttpServletResponse resp) {
		ModelAndView mav = new ModelAndView();
		String url = "/App";
		mav.setViewName(url);
		return mav;
	}
	
	@ResponseBody
	@RequestMapping(value="/boardReplyU", method = RequestMethod.GET)
	public ModelAndView boardReplyU(HttpServletRequest req, HttpServletResponse resp) {
		ModelAndView mav = new ModelAndView();
		String url = "/App";
		mav.setViewName(url);
		return mav;
	}
	
	@ResponseBody
	@RequestMapping(value="/boardReplyD", method = RequestMethod.GET)
	public ModelAndView boardReplyD(HttpServletRequest req, HttpServletResponse resp) {
		ModelAndView mav = new ModelAndView();
		String url = "/App";
		mav.setViewName(url);
		return mav;
	}
}
