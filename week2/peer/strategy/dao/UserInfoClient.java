package strategy.dao;

public class UserInfoClient {
	// 만약 useinfo 배열을 여기 만들고, 데이터 갱신은 Dao를 이용하도록?
    
	private UserInfoDao myDao;

	public void setMyDao(UserInfoDao dao){
		this.myDao = dao;
	}

	public UserInfoDao uses(){
		return myDao;
	}
}
