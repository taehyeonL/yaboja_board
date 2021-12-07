package temp;

import java.util.Date;

public class YbjMemVO {
	private String yaId;
	private String yaEmail;
	private String yaPwd;
	private String yaName;
	private String yaMyott;
	private String yaPhNum;
	private String yaLevel;
	private String yaPoint;
	private Date timestamp;
	
	
	public YbjMemVO(String yaId,String yaPwd) {
		this.yaId=yaId;
		this.yaPwd=yaPwd;
	}
	
	
	public YbjMemVO(String yaId, String yaEmail, String yaPwd, String yaName, String yaMyott, String yaPhNum,
			String yaLevel, String yaPoint, Date timestamp) {
		super();
		this.yaId = yaId;
		this.yaEmail = yaEmail;
		this.yaPwd = yaPwd;
		this.yaName = yaName;
		this.yaMyott = yaMyott;
		this.yaPhNum = yaPhNum;
	}


	public String getYaId() {
		return yaId;
	}
	public void setYaId(String yaId) {
		this.yaId = yaId;
	}
	public String getYaEmail() {
		return yaEmail;
	}
	public void setYaEmail(String yaEmail) {
		this.yaEmail = yaEmail;
	}
	public String getYaPwd() {
		return yaPwd;
	}
	public void setYaPwd(String yaPwd) {
		this.yaPwd = yaPwd;
	}
	public String getYaName() {
		return yaName;
	}
	public void setYaName(String yaName) {
		this.yaName = yaName;
	}
	public String getYaMyott() {
		return yaMyott;
	}
	public void setYaMyott(String yaMyott) {
		this.yaMyott = yaMyott;
	}
	public String getYaPhNum() {
		return yaPhNum;
	}
	public void setYaPhNum(String yaPhNum) {
		this.yaPhNum = yaPhNum;
	}
	public String getYaLevel() {
		return yaLevel;
	}
	public void setYaLevel(String yaLevel) {
		this.yaLevel = yaLevel;
	}
	public String getYaPoint() {
		return yaPoint;
	}
	public void setYaPoint(String yaPoint) {
		this.yaPoint = yaPoint;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}


	@Override
	public String toString() {
		return "ybjMemVO [yaId=" + yaId + ", yaEmail=" + yaEmail + ", yaPwd=" + yaPwd + ", yaName=" + yaName
				+ ", yaMyott=" + yaMyott + ", yaPhNum=" + yaPhNum + ", yaLevel=" + yaLevel + ", yaPoint=" + yaPoint
				+ ", timestamp=" + timestamp + "]";
	}
	
	
}
