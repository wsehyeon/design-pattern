package userinfodao;

public class MysqlUserInfoDao extends UserInfoDao{
	public void insertUserInfo(UserInfo userinfo){
		System.out.println("insert : " + userinfo.getUserName() + " in mysql");
	};
	public void updateUserInfo(UserInfo userinfo){
		System.out.println("update : " + userinfo.getUserName() + " in mysql");

	};
	public void deleteUserInfo(UserInfo userinfo){
		System.out.println("delete : " + userinfo.getUserName() + " in mysql");

	};
}