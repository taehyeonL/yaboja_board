package mc.sn.ybjVO;

import java.util.Date;

public class ybjContentVO {
	private String title;
	private String ottName;
	private String plot;
	private String mainActor;
	private String producer;
	private String produceCom;
	private Date timestamp;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getOttName() {
		return ottName;
	}
	public void setOttName(String ottName) {
		this.ottName = ottName;
	}
	public String getPlot() {
		return plot;
	}
	public void setPlot(String plot) {
		this.plot = plot;
	}
	public String getMainActor() {
		return mainActor;
	}
	public void setMainActor(String mainActor) {
		this.mainActor = mainActor;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public String getProduceCom() {
		return produceCom;
	}
	public void setProduceCom(String produceCom) {
		this.produceCom = produceCom;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	@Override
	public String toString() {
		return "ybjContentVO [title=" + title + ", ottName=" + ottName + ", plot=" + plot + ", mainActor=" + mainActor
				+ ", producer=" + producer + ", produceCom=" + produceCom + ", timestamp=" + timestamp + "]";
	}
	
}
