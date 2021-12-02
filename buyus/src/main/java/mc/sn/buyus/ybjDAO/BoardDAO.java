package mc.sn.buyus.ybjDAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mc.sn.buyus.ybjVO.ybjBoardReplyVO;
import mc.sn.buyus.ybjVO.ybjBoardVO;
import mc.sn.buyus.ybjVO.ybjReviewReplyVO;
import mc.sn.buyus.ybjVO.ybjReviewVO;

@Repository("BoardDAO")

public class BoardDAO {
	@Autowired
	private SqlSession sqlSession;

	// id, ottName, review_title, eval, review_body
	public int insertReview(ybjReviewVO vo) {
		int result = 0;
		result = sqlSession.insert("mapper.yaboard.insertReview", vo);
		System.out.println(result);
		return result;
	}

	// find_review, id, reply_body
	public int insertReview_reply(ybjReviewReplyVO vo) {
		int result = 0;
		result = sqlSession.insert("mapper.yaboard.insertReviewReply", vo);
		System.out.println(result);
		return result;
	}

	// Board_Tile, Board_Body,ya_id, content_title
	public int insertBoard(ybjBoardVO vo) {
		int result = 0;
		result = sqlSession.insert("mapper.yaboard.insertBoard", vo);
		System.out.println(result);
		return result;
	}

	public int insertBoard_reply(ybjBoardReplyVO vo) {
		int result = 0;
		result = sqlSession.insert("mapper.yaboard.insertBoard_reply", vo);
		System.out.println(result);
		return result;
	}

	//
	public List<ybjReviewVO> selectAllReview(String ottName) {
		List<ybjReviewVO> list = null;
		list = sqlSession.selectList("mapper.yaboard.selectReview", ottName);
		return list;
	}

	public List<ybjReviewReplyVO> selectAllReview_reply(String find_review) {
		List<ybjReviewReplyVO> list = null;
		list = sqlSession.selectList("mapper.yaboard.selectReviewReply", find_review);
		return list;
	}

	public List<ybjBoardVO> selectAllBoard(String content_title) {
		List<ybjBoardVO> list = null;
		list = sqlSession.selectList("mapper.yaboard.selectBoard", content_title);
		return list;
	}

	public List<ybjBoardReplyVO> selectAllBoard_reply(String find_board) {
		List<ybjBoardReplyVO> list = null;
		list = sqlSession.selectList("mapper.yaboard.selectBoardReply", find_board);
		return list;
	}

	// review_title, review_body, seq_review
	public int updateReview(ybjReviewVO vo) {
		int result = 0;
		result = sqlSession.update("mapper.yaboard.updateReview", vo);
		return result;
	}

	// reply_body, seq_reviewreply
	public int updateReview_reply(ybjReviewReplyVO vo) {
		int result = 0;
		result = sqlSession.update("mapper.yaboard.updateReviewReply", vo);
		return result;

	}

	// Board_Title, Board_Body, seq_board
	public int updateBoard(ybjBoardVO vo) {
		int result = 0;
		result = sqlSession.update("mapper.yaboard.updateBoard", vo);
		return result;

	}

	// Board_Title, Board_Body, seq_boardreply
	public int updateBoard_reply(ybjBoardReplyVO vo) {
		int result = 0;
		result = sqlSession.update("mapper.yaboard.updateBoardReply", vo);
		return result;

	}

	public int deleteReview(String seq_review) {
		int result = 0;
		result = sqlSession.update("mapper.yaboard.deleteReview", seq_review);
		return result;
	}

	public int deleteReview_reply(String seq_reviewreply) {
		int result = 0;
		result = sqlSession.update("mapper.yaboard.deleteReviewReply", seq_reviewreply);
		return result;

	}

	public int deleteBoard(String seq_board) {
		int result = 0;
		result = sqlSession.update("mapper.yaboard.deleteBoard", seq_board);
		return result;

	}

	public int deleteBoard_reply(String seq_boardreply) {
		int result = 0;
		result = sqlSession.update("mapper.yaboard.deleteBoardReply", seq_boardreply);
		return result;

	}

}
