package mc.sn.buyus.YbjVO;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Component("memVO")
public class YbjMemVO {
	private String yaId;
	private String yaEmail;
	private String yaPwd;
	private String yaName;
	private String[] yaMyott;
	private String yaMyottS;
	private String yaPhNum;
	private int yaLevel;
	private int yaPoint;
	@JsonIgnore
	private Date timestamp;

	public YbjMemVO() {

	}

	public YbjMemVO(String yaEmail, String yaPwd) {
		this.yaEmail = yaEmail;
		this.yaPwd = yaPwd;
	}

	public YbjMemVO(String yaId, String yaEmail, String yaPwd, String yaName, String[] yaMyott, String yaPhNum) {
		// super();
		this.yaId = yaId;
		this.yaEmail = yaEmail;
		this.yaPwd = yaPwd;
		this.yaName = yaName;
		for (int i = 0; i < yaMyott.length; i++) {
			this.yaMyottS += yaMyott[i] + " ";
		}
		this.yaPhNum = yaPhNum;
		this.yaLevel = 1;
		this.yaPoint = 0;
		this.timestamp = null;

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

	@JsonIgnore
	public String getYaPwd() {
		return yaPwd;
	}

	@JsonProperty
	public void setYaPwd(String yaPwd) {
		this.yaPwd = yaPwd;
	}

	public String getYaName() {
		return yaName;
	}

	public void setYaName(String yaName) {
		this.yaName = yaName;
	}

	// 배열설정
	public String[] getYaMyott() {
		return yaMyott;
	}

//	public void setYaMyott(String[] yaMyott) {
//		if (yaMyott.length == 1) {
//			this.yaMyottS = yaMyott[0];
//		} else {
//			for (int i = 0; i < yaMyott.length; i++) {
//				this.yaMyottS += yaMyott[i] + ",";
//			}
//		}
//	}

	public void setYaMyott(String[] yaMyott) {
		for (int i = 0; i < yaMyott.length; i++) {
			this.yaMyottS += yaMyott[i] + " ";
		}
	}

	public String getYaMyottS() {
		return this.yaMyottS;
	}

	public void setYaMyottS(String yaMyottS) {
		this.yaMyottS = yaMyottS;
	}
	//

	public String getYaPhNum() {
		return yaPhNum;
	}

	public void setYaPhNum(String yaPhNum) {
		this.yaPhNum = yaPhNum;
	}

	public int getYaLevel() {
		return yaLevel;
	}

	public void setYaLevel(int yaLevel) {
		this.yaLevel = yaLevel;
	}

	public int getYaPoint() {
		return yaPoint;
	}

	public void setYaPoint(int yaPoint) {
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
		return "{yaId:\"" + yaId + "\", yaEmail:\"" + yaEmail + "\", yaPwd:\"" + yaPwd + "\", yaName:\"" + yaName
				+ "\", yaMyottS:\"" + yaMyottS + "\", yaPhNum:\"" + yaPhNum + "\", yaLevel:\"" + yaLevel
				+ "\", yaPoint:\"" + yaPoint + "\", timestamp:\"" + timestamp + "\"}";
	}

}
