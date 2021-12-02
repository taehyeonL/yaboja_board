package mc.sn.buyus.ybjVO;

public class ybjfollowVO {
	private int followIndex;
	private String follower_id;
	private String followed_id;
	
	public int getFollowIndex() {
		return followIndex;
	}
	public void setFollowIndex(int followIndex) {
		this.followIndex = followIndex;
	}
	public String getFollower_id() {
		return follower_id;
	}
	public void setFollower_id(String follower_id) {
		this.follower_id = follower_id;
	}
	public String getFollowed_id() {
		return followed_id;
	}
	public void setFollowed_id(String followed_id) {
		this.followed_id = followed_id;
	}
	
	@Override
	public String toString() {
		return "ybjfollowVO [followIndex=" + followIndex + ", follower_id=" + follower_id + ", followed_id="
				+ followed_id + "]";
	}
}
