package mc.sn.ybjVO;

import java.util.Date;

public class ybjReviewReplyVO {
	private int reviewIndex;
	private String id;
	private String replyBody;
	private String replyRecommand;
	private String replyNotRecommand;
	private Date timestamp;
	
	public int getReviewIndex() {
		return reviewIndex;
	}
	public void setReviewIndex(int reviewIndex) {
		this.reviewIndex = reviewIndex;
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
	public String getReplyRecommand() {
		return replyRecommand;
	}
	public void setReplyRecommand(String replyRecommand) {
		this.replyRecommand = replyRecommand;
	}
	public String getReplyNotRecommand() {
		return replyNotRecommand;
	}
	public void setReplyNotRecommand(String replyNotRecommand) {
		this.replyNotRecommand = replyNotRecommand;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	@Override
	public String toString() {
		return "ybjReviewReplyVO [reviewIndex=" + reviewIndex + ", id=" + id + ", replyBody=" + replyBody
				+ ", replyRecommand=" + replyRecommand + ", replyNotRecommand=" + replyNotRecommand + ", timestamp="
				+ timestamp + "]";
	}
	
}
