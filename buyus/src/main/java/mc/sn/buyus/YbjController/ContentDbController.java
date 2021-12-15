package mc.sn.buyus.YbjController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import mc.sn.buyus.YbjService.ContentDbService;
import mc.sn.buyus.YbjVO.ContentDbVO;

@Controller("contentDbController")
public class ContentDbController {

	@Autowired
	private ContentDbService contentDbService;

	
	
	@ResponseBody
	@RequestMapping(value = "movie", method = RequestMethod.GET)
	public void writeDB(){
		for(int i=1;i<915756;i++) {
		contentDbService.getContent(i);
		}
	
	}
	
}
