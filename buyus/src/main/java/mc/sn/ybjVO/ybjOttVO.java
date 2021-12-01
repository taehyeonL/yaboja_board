package mc.sn.ybjVO;

import java.util.Date;

public class ybjOttVO {
	private String ottName;
	private int clientNum;
	private int action;
	private int adventure;
	private int romance;
	private int comedy;
	private int animation;
	private int fantasy;
	private int horror;
	private int documentary;
	private Date timestamp;
	
	public String getOttName() {
		return ottName;
	}
	public void setOttName(String ottName) {
		this.ottName = ottName;
	}
	public int getClientNum() {
		return clientNum;
	}
	public void setClientNum(int clientNum) {
		this.clientNum = clientNum;
	}
	public int getAction() {
		return action;
	}
	public void setAction(int action) {
		this.action = action;
	}
	public int getAdventure() {
		return adventure;
	}
	public void setAdventure(int adventure) {
		this.adventure = adventure;
	}
	public int getRomance() {
		return romance;
	}
	public void setRomance(int romance) {
		this.romance = romance;
	}
	public int getComedy() {
		return comedy;
	}
	public void setComedy(int comedy) {
		this.comedy = comedy;
	}
	public int getAnimation() {
		return animation;
	}
	public void setAnimation(int animation) {
		this.animation = animation;
	}
	public int getFantasy() {
		return fantasy;
	}
	public void setFantasy(int fantasy) {
		this.fantasy = fantasy;
	}
	public int getHorror() {
		return horror;
	}
	public void setHorror(int horror) {
		this.horror = horror;
	}
	public int getDocumentary() {
		return documentary;
	}
	public void setDocumentary(int documentary) {
		this.documentary = documentary;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	@Override
	public String toString() {
		return "ybjOttVO [ottName=" + ottName + ", clientNum=" + clientNum + ", action=" + action + ", adventure="
				+ adventure + ", romance=" + romance + ", comedy=" + comedy + ", animation=" + animation + ", fantasy="
				+ fantasy + ", horror=" + horror + ", documentary=" + documentary + ", timestamp=" + timestamp + "]";
	}
	
	
}
