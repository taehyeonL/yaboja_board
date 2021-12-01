package mc.sn.ybjVO;

import java.util.Date;

public class ybjBoardReplyVO {
	private int boardIndex;
	private String id;
	private String replyBody;
	private Date timestamp;
	
	public int getBoardIndex() {
		return boardIndex;
	}
	public void setBoardIndex(int boardIndex) {
		this.boardIndex = boardIndex;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getReplyBody() {
		return replyBody;
	}
	public void setReplyBody(String replyBody) {
		this.replyBody = replyBody;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	@Override
	public String toString() {
		return "ybjBoardReplyVO [boardIndex=" + boardIndex + ", id=" + id + ", replyBody=" + replyBody + ", timestamp="
				+ timestamp + "]";
	}
	
}
