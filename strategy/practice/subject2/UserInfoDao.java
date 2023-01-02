package week2.strategy.subject2;

// Dao : Date Acess Object(데이터 접근을 위한 객체)

public abstract class UserInfoDao {
	private String userId;
	private String passwd;
	private String userName;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getUserName() {
		 return userName;
	}
	
	public void setUserName(String userName) {
		 this.userName = userName;
	}

	public abstract void insert(String id);
	public abstract void update(String id);
	public abstract void delete(String id);
}

