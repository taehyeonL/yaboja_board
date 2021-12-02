package mc.sn.buyus.ybjVO;

import java.util.Date;

public class ybjBoardVO {
	private int index;
	private String id;
	private String boardTitle;
	private String boardBody;
	private Date timestamp;
	private int viewCount;
	private int boardRecommand;
	private int report;
	private String contentTitle;
	
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
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardBody() {
		return boardBody;
	}
	public void setBoardBody(String boardBody) {
		this.boardBody = boardBody;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public int getViewCount() {
		return viewCount;
	}
	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}
	public int getBoardRecommand() {
		return boardRecommand;
	}
	public void setBoardRecommand(int boardRecommand) {
		this.boardRecommand = boardRecommand;
	}
	public int getReport() {
		return report;
	}
	public void setReport(int report) {
		this.report = report;
	}
	public String getContentTitle() {
		return contentTitle;
	}
	public void setContentTitle(String contentTitle) {
		this.contentTitle = contentTitle;
	}
	@Override
	public String toString() {
		return "ybjBoardVO [index=" + index + ", id=" + id + ", boardTitle=" + boardTitle + ", boardBody=" + boardBody
				+ ", timestamp=" + timestamp + ", viewCount=" + viewCount + ", boardRecommand=" + boardRecommand
				+ ", report=" + report + ", contentTitle=" + contentTitle + "]";
	}
	
}
