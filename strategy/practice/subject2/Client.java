package week2.strategy.subject2;

public class Client {

	private UserInfoDao dao;

	public void setDao(UserInfoDao d){
		this.dao = d;
	}

	public UserInfoDao useDao(){
		return this.dao;
	}
}
