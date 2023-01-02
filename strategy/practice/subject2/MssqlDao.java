package week2.strategy.subject2;

public class MssqlDao extends UserInfoDao {
	private String db = "MSSQL DB";
	private static UserInfoDao singleton = new MssqlDao();

	public static UserInfoDao getDao(){
		return singleton;
	}
	public void insert(String id){
		System.out.println("insert into " + db + "userID = " + getUserId());
		setUserId(id);
	};
	public void update(String id){
		System.out.println("update into " + db + "userID = " + getUserId());
		setUserId(id);
	};

	public void delete(String id){
		System.out.println("delete from " + db + "userID = " + getUserId());
	};
}
