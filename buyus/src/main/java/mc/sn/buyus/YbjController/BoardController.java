package mc.sn.buyus.YbjController;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import mc.sn.buyus.YbjService.BoardService;
import mc.sn.buyus.YbjVO.YbjBoardReplyVO;
import mc.sn.buyus.YbjVO.YbjBoardVO;
import mc.sn.buyus.YbjVO.YbjReviewReplyVO;
import mc.sn.buyus.YbjVO.YbjReviewVO;

@Controller("boardController")

public class BoardController {
	@Autowired
	private BoardService dao;
	@Autowired
	private YbjBoardVO boardVO;
	
	@Autowired
	private YbjBoardReplyVO boardRPVO;
	
	@Autowired
	private YbjReviewVO reviewVO;
	
	@Autowired
	private YbjReviewReplyVO reviewRPVO;
	

	@ResponseBody
	@RequestMapping(value = "createboard", method = RequestMethod.GET)
	public boolean writeBoard(HttpServletRequest req, HttpServletResponse resp) {
		boolean flag=false;
		boardVO.setBoardTitle("nojam");
		boardVO.setBoardBody("realnojam");
		boardVO.setId("lee");
		boardVO.setContentTitle("ironman");
		flag = dao.writeBoard(boardVO);
		if(flag==true) {
			System.out.println("삽입성공");
		}
		return flag;
		}
	
	@ResponseBody
	@RequestMapping(value = "createboardreply", method = RequestMethod.GET)
	public boolean writeBoardReply(HttpServletRequest req, HttpServletResponse resp) {
		boolean flag=false;
		boardRPVO.setBoardIndex(4);
		boardRPVO.setId("lee");
		boardRPVO.setReplyBody("nojam");
		flag = dao.writeBoard_reply(boardRPVO);
		if(flag==true) {
			System.out.println("삽입성공");
		}
		return flag;
		}
	@ResponseBody
	@RequestMapping(value = "createreview", method = RequestMethod.GET)
	public boolean writeReview(HttpServletRequest req, HttpServletResponse resp) {
		boolean flag=false;
		
		reviewVO.setId("lee");
		reviewVO.setOttName("netflix");
		reviewVO.setReviewTitle("ironman");
		reviewVO.setEval(3);
		reviewVO.setReviewBody("무지재밌다");
		flag = dao.writeReview(reviewVO);
		if(flag==true) {
			System.out.println("삽입성공");
		}
		return flag;
		}
	@ResponseBody
	@RequestMapping(value = "createreviewreply", method = RequestMethod.GET)
	public boolean writeReviewReply(HttpServletRequest req, HttpServletResponse resp) {
		boolean flag=false;
	
		reviewRPVO.setReviewIndex(2);
		reviewRPVO.setId("lee");
		reviewRPVO.setReplyBody("realfun");
		flag = dao.writeReview_reply(reviewRPVO);
		if(flag==true) {
			System.out.println("삽입성공");
		}
		return flag;
		}
	
	@ResponseBody
	@RequestMapping(value = "readboard", method = RequestMethod.GET)
	public List<YbjBoardVO> readBoard(HttpServletRequest req, HttpServletResponse resp) {
		List<YbjBoardVO> vo = null;
		String contentTitle="ironman";
		vo = dao.readAllBoard(contentTitle);
		System.out.println(vo.toString());
		return vo;
	}
	
	@ResponseBody
	@RequestMapping(value = "readboardreply", method = RequestMethod.GET)
	public List<YbjBoardReplyVO> readBoardReply(HttpServletRequest req, HttpServletResponse resp) {
		List<YbjBoardReplyVO> vo = null;
		int boardIndex=4;
		vo = dao.readAllBoard_reply(boardIndex);
		System.out.println(vo.toString());
		return vo;
	}
	
	@ResponseBody
	@RequestMapping(value = "readreview", method = RequestMethod.GET)
	public List<YbjReviewVO> readReview(HttpServletRequest req, HttpServletResponse resp) {
		List<YbjReviewVO> vo = null;
		String contentTitle="ironman";
		vo = dao.readAllReview(contentTitle);
		System.out.println(vo.toString());
		return vo;
	}
	
	@ResponseBody
	@RequestMapping(value = "readreviewreply", method = RequestMethod.GET)
	public List<YbjReviewReplyVO> readReviewReply(HttpServletRequest req, HttpServletResponse resp) {
		List<YbjReviewReplyVO> vo = null;
		int reviewIndex=2;
		vo = dao.readAllReview_reply(reviewIndex);
		System.out.println(vo.toString());
		return vo;
	}
		
	@ResponseBody
	@RequestMapping(value = "updateboard", method = RequestMethod.GET)
	public boolean updateBoard(HttpServletRequest req, HttpServletResponse resp) {
		boolean flag=false;
		boardVO.setBoardTitle("nojam2");
		boardVO.setBoardBody("realnojam2");
		boardVO.setIndex(3);
		
		flag = dao.modBoard(boardVO);
		if(flag==true) {
			System.out.println("수정성공");
		}
		return flag;
		}
	
	@ResponseBody
	@RequestMapping(value = "updateboardreply", method = RequestMethod.GET)
	public boolean updateBoardReply(HttpServletRequest req, HttpServletResponse resp) {
		boolean flag=false;
		boardRPVO.setBoardIndex(1);
		boardRPVO.setReplyBody("nojam2");
		flag = dao.modBoard_reply(boardRPVO);
		if(flag==true) {
			System.out.println("수정성공");
		}
		return flag;
		}
	@ResponseBody
	@RequestMapping(value = "updatereview", method = RequestMethod.GET)
	public boolean updateReview(HttpServletRequest req, HttpServletResponse resp) {
		boolean flag=false;
		reviewVO.setEval(4);
		reviewVO.setReviewBody("무지재밌다2");
		reviewVO.setIndex(1);
		flag = dao.modReview(reviewVO);
		if(flag==true) {
			System.out.println("수정성공");
		}
		return flag;
		}
	@ResponseBody
	@RequestMapping(value = "updatereviewreply", method = RequestMethod.GET)
	public boolean updateReviewReply(HttpServletRequest req, HttpServletResponse resp) {
		boolean flag=false;
		reviewRPVO.setReplyBody("realfun2");
		reviewRPVO.setReviewReplyIndex(1);
		flag = dao.modReview_reply(reviewRPVO);
		if(flag==true) {
			System.out.println("수정성공");
		}
		return flag;
		}

	@ResponseBody
	@RequestMapping(value = "deleteboard", method = RequestMethod.GET)
	public boolean deleteBoard(HttpServletRequest req, HttpServletResponse resp) {
		boolean flag=false;
		boardVO.setIndex(3);
		flag = dao.eraseBoard(boardVO.getIndex());
		if(flag==true) {
			System.out.println("삭제성공");
		}
		return flag;
		}
	
	@ResponseBody
	@RequestMapping(value = "deleteboardreply", method = RequestMethod.GET)
	public boolean deleteBoardReply(HttpServletRequest req, HttpServletResponse resp) {
		boolean flag=false;
		boardRPVO.setBoardIndex(1);
		flag = dao.eraseBoard_reply(boardRPVO.getBoardIndex());
		if(flag==true) {
			System.out.println("삭제성공");
		}
		return flag;
		}
	@ResponseBody
	@RequestMapping(value = "deletereview", method = RequestMethod.GET)
	public boolean deleteReview(HttpServletRequest req, HttpServletResponse resp) {
		boolean flag=false;
		reviewVO.setIndex(1);
		flag = dao.eraseReview(reviewVO.getIndex());
		if(flag==true) {
			System.out.println("삭제성공");
		}
		return flag;
		}
	@ResponseBody
	@RequestMapping(value = "deletereviewreply", method = RequestMethod.GET)
	public boolean deleteReviewReply(HttpServletRequest req, HttpServletResponse resp) {
		boolean flag=false;
		reviewRPVO.setReviewReplyIndex(1);
		flag = dao.eraseReview_reply(reviewRPVO.getReviewReplyIndex());
		if(flag==true) {
			System.out.println("삭제성공");
		}
		return flag;
		}
	@ResponseBody
	@RequestMapping(value = "countview", method = RequestMethod.GET)
	public boolean updateCountView(HttpServletRequest req, HttpServletResponse resp) {
		boolean flag=false;
		boardVO.setIndex(6);
		flag = dao.countview(boardVO.getIndex());
		if(flag==true) {
			System.out.println("조회수+");
		}
		return flag;
		}
	

}
