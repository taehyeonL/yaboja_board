package mc.sn.ybjVO;

import java.util.Date;

public class ybjReviewVO {
	private int index;
	private String id;
	private String ottName;
	private String reviewTitle;
	private int eval;
	private String reviewBody;
	private int reviewRecommand;
	private boolean spo;
	private Date timestamp;
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOttName() {
		return ottName;
	}
	public void setOttName(String ottName) {
		this.ottName = ottName;
	}
	public String getReviewTitle() {
		return reviewTitle;
	}
	public void setReviewTitle(String reviewTitle) {
		this.reviewTitle = reviewTitle;
	}
	public int getEval() {
		return eval;
	}
	public void setEval(int eval) {
		this.eval = eval;
	}
	public String getReviewBody() {
		return reviewBody;
	}
	public void setReviewBody(String reviewBody) {
		this.reviewBody = reviewBody;
	}
	public int getReviewRecommand() {
		return reviewRecommand;
	}
	public void setReviewRecommand(int reviewRecommand) {
		this.reviewRecommand = reviewRecommand;
	}
	public boolean isSpo() {
		return spo;
	}
	public void setSpo(boolean spo) {
		this.spo = spo;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	@Override
	public String toString() {
		return "ybjReviewVO [index=" + index + ", id=" + id + ", ottName=" + ottName + ", reviewTitle=" + reviewTitle
				+ ", eval=" + eval + ", reviewBody=" + reviewBody + ", reviewRecommand=" + reviewRecommand + ", spo="
				+ spo + ", timestamp=" + timestamp + "]";
	}
	
}
