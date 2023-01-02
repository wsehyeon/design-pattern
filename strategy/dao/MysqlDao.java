package strategy.dao;

public class MysqlDao implements UserInfoDao{

	public void insert(UserInfo data){
		System.out.println("insert into Mysql userId = " + data.getUserId());
	};
	public void update(UserInfo data){
		System.out.println("update into Mysql userId = " + data.getUserId());
	};
	public void delete(UserInfo data){
		System.out.println("delete from Mysql userId = " + data.getUserId());
	};
}
