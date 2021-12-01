package mc.sn.ybjService;

import org.springframework.beans.factory.annotation.Autowired;

import mc.sn.ybjDAO.BoardDAO;
import mc.sn.ybjVO.ybjBoardReplyVO;
import mc.sn.ybjVO.ybjBoardVO;
import mc.sn.ybjVO.ybjReviewReplyVO;
import mc.sn.ybjVO.ybjReviewVO;

public class BoardService {
	@Autowired
	private BoardDAO boardDAO; 
	
	//Create
	public void writeReview() {
		
	}
	public void writeReview_reply() {
			
		}
	public void writeBoard() {
		
	}
	public void writeBoard_reply() {
		
	}
	
	//Select
	public ybjReviewVO readAllReview() {
		ybjReviewVO vo=null;
		
		return vo;		
	}
	public ybjReviewReplyVO readAllReview_reply() {
		ybjReviewReplyVO vo=null;
		return vo;
	}
	public ybjBoardVO readAllBoard() {
		ybjBoardVO vo=null;
		return vo;
	}
	public ybjBoardReplyVO readAllBoard_reply() {
		ybjBoardReplyVO vo=null;
		return vo;
	}
	
	//Update
	
	public int modReview() {
		int result=0;
		return result;
	}
	public int modReview_reply() {
		int result=0;
		return result;
			
		}
	public int modBoard() {
		int result=0;
		return result;
		
	}
	public int modBoard_reply() {
		int result=0;
		return result;
		
	}
	
	//Delete
	
	public int eraseReview() {
		int result=0;
		return result;
	}
	public int eraseReview_reply() {
		int result=0;
		return result;
			
		}
	public int eraseBoard() {
		int result=0;
		return result;
		
	}
	public int eraseBoard_reply() {
		int result=0;
		return result;
		
	}
}
