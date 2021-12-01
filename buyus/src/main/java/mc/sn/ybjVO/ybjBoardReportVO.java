package mc.sn.ybjVO;

import java.util.Date;

public class ybjBoardReportVO {
	private int index;
	private String id;
	private String reportTitle;
	private String reportBody;
	private int boardIndex;
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
	public String getReportTitle() {
		return reportTitle;
	}
	public void setReportTitle(String reportTitle) {
		this.reportTitle = reportTitle;
	}
	public String getReportBody() {
		return reportBody;
	}
	public void setReportBody(String reportBody) {
		this.reportBody = reportBody;
	}
	public int getBoardIndex() {
		return boardIndex;
	}
	public void setBoardIndex(int boardIndex) {
		this.boardIndex = boardIndex;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	@Override
	public String toString() {
		return "ybjBoardReportVO [index=" + index + ", id=" + id + ", reportTitle=" + reportTitle + ", reportBody="
				+ reportBody + ", boardIndex=" + boardIndex + ", timestamp=" + timestamp + "]";
	}
	
}
