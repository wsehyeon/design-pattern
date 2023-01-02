package strategy.dao;

public class MssqlDao implements UserInfoDao{

	public void insert(UserInfo data){
		System.out.println("insert into Mssql userId = " + data.getUserId());
	};
	public void update(UserInfo data){
		System.out.println("update into Mssql userId = " + data.getUserId());
	};
	public void delete(UserInfo data){
		System.out.println("delete from Mssql userId = " + data.getUserId());
	};
}
