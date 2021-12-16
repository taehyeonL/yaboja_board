package mc.sn.buyus.YbjVO;

public class SecurityVO {
	private YbjMemVO memVO;
	private String token;
	
	public SecurityVO(YbjMemVO vo, String token) {
		this.memVO = vo;
		this.token = token;
	}

	public YbjMemVO getMemVO() {
		return memVO;
	}

	public void setMemVO(YbjMemVO memVO) {
		this.memVO = memVO;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return "[\"memVO\":\""+this.memVO+"\", \"jwt\":\""+this.token+"\"]";
//	}
}
