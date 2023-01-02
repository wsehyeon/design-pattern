package strategy.dao;

public class OracleDao implements UserInfoDao{

	public void insert(UserInfo data){
		System.out.println("insert into Oracle userId = " + data.getUserId());
	};
	public void update(UserInfo data){
		System.out.println("update into Oracle userId = " + data.getUserId());
	};
	public void delete(UserInfo data){
		System.out.println("delete from Oracle userId = " + data.getUserId());
	};
}
