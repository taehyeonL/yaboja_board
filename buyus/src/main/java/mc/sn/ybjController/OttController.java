package mc.sn.ybjController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller("ottController")
@RequestMapping("/ott/*")
public class OttController {

//	@Autowired
//	OttService ottservice;
	
	@ResponseBody
	@RequestMapping(value="/ottSortByClientNum", method = RequestMethod.GET)
	public ModelAndView ottSortByClientNum(HttpServletRequest req, HttpServletResponse resp) {
		ModelAndView mav = new ModelAndView();
		String url = "/App";
		mav.setViewName(url);
		return mav;
	}
	
	@ResponseBody
	@RequestMapping(value="/ottSortByJenre", method = RequestMethod.GET)
	public ModelAndView ottSortByJenre(HttpServletRequest req, HttpServletResponse resp) {
		ModelAndView mav = new ModelAndView();
		String url = "/App";
		mav.setViewName(url);
		return mav;
	}
	
}
