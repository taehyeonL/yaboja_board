package mc.sn.buyus.ybjVO;

import java.util.Date;

public class ybjReviewReportVO {
	private int index;
	private String id;
	private String reportTitle;
	private String reportBody;
	private int reviewIndex;
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
	public int getReviewIndex() {
		return reviewIndex;
	}
	public void setReviewIndex(int reviewIndex) {
		this.reviewIndex = reviewIndex;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	@Override
	public String toString() {
		return "ybjReviewReportVO [index=" + index + ", id=" + id + ", reportTitle=" + reportTitle + ", reportBody="
				+ reportBody + ", reviewIndex=" + reviewIndex + ", timestamp=" + timestamp + "]";
	}
	
}
