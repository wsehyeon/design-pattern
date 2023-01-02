package strategy.dao;

public class Main {
	public static void main(String[] args) {
		UserInfoClient web = new UserInfoClient();
		UserInfoDao mysql = new MysqlDao();
		UserInfoDao oracle = new OracleDao();
		
		UserInfo data = new UserInfo();
		data.setPasswd("4242");
		data.setUserName("seoul");
		data.setUserId("swang");

		// web.getData();
		web.setMyDao(mysql);
		web.uses().insert(data);
		web.uses().update(data);
		web.uses().delete(data);
		
		System.out.println("------change Dao strategy----");
		web.setMyDao(oracle);
		web.uses().insert(data);
		web.uses().update(data);
		web.uses().delete(data);
	}
}
