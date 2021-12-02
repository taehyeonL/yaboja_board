package mc.sn.buyus.ybjService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import mc.sn.buyus.ybjDAO.BoardDAO;
import mc.sn.buyus.ybjVO.ybjBoardReplyVO;
import mc.sn.buyus.ybjVO.ybjBoardVO;
import mc.sn.buyus.ybjVO.ybjReviewReplyVO;
import mc.sn.buyus.ybjVO.ybjReviewVO;

public class BoardService {
	@Autowired
	private BoardDAO boardDAO; 
	
	//Create
	public int writeReview(ybjReviewVO vo) {
		int result=0;
		result=boardDAO.insertReview(vo);
		return result;
	}
	public int writeReview_reply(ybjReviewReplyVO vo) {
		int result=0;
		result=boardDAO.insertReview_reply(vo);
		return result;
		}
	public int writeBoard(ybjBoardVO vo) {
		int result=0;
		result=boardDAO.insertBoard(vo);
		return result;
	}
	public int writeBoard_reply(ybjBoardReplyVO vo) {
		int result=0;
		result=boardDAO.insertBoard_reply(vo);
		return result;
	}
	
	//Select
	public List<ybjReviewVO> readAllReview(String ottName) {
		List<ybjReviewVO> list=null;
		list=boardDAO.selectAllReview(ottName);
		return list;		
	}
	public List<ybjReviewReplyVO> readAllReview_reply(String find_review) {
		List<ybjReviewReplyVO> list=null;
		list=boardDAO.selectAllReview_reply(find_review);
		return list;		
	}
	public List<ybjBoardVO> readAllBoard(String content_title) {
		List<ybjBoardVO> list=null;
		list=boardDAO.selectAllBoard(content_title);
		return list;		
	}
	public List<ybjBoardReplyVO> readAllBoard_reply(String find_board) {
		List<ybjBoardReplyVO> list=null;
		list=boardDAO.selectAllBoard_reply(find_board);
		return list;		
	}
	
	//Update
	
	public int modReview(ybjReviewVO vo) {
		int result=0;
		result=boardDAO.updateReview(vo);
		return result;
	}
	// reply_body, seq_reviewreply
	public int modReview_reply(ybjReviewReplyVO vo) {
		int result=0;
		result=boardDAO.updateReview_reply(vo);
		return result;
			
		}
	//Board_Title, Board_Body, seq_board
	public int modBoard(ybjBoardVO vo) {
		int result=0;
		result=boardDAO.updateBoard(vo);
		return result;
		
	}
	//Board_Title, Board_Body, seq_boardreply
	public int modBoard_reply(ybjBoardReplyVO vo) {
		int result=0;
		result=boardDAO.updateBoard_reply(vo);
		return result;
		
	}
	
	//Delete
	
	public int eraseReview(String seq_review) {
		int result=0;
		result=boardDAO.deleteReview(seq_review);
		return result;
	}
	public int eraseReview_reply(String seq_reviewreply) {
		int result=0;
		result=boardDAO.deleteReview_reply(seq_reviewreply);
		return result;
			
		}
	public int eraseBoard(String seq_board) {
		int result=0;
		result=boardDAO.deleteBoard(seq_board);
		return result;
		
	}
	public int eraseBoard_reply(String seq_boardreply) {
		int result=0;
		result=boardDAO.deleteBoard_reply(seq_boardreply);
		return result;
		
	}
}
