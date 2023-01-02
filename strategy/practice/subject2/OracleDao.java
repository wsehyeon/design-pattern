package week2.strategy.subject2;

public class OracleDao extends UserInfoDao {
	private String db = "ORACLE DB";
	
	private static UserInfoDao singleton = new OracleDao();

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
