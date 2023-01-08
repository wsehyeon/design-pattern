package userinfodao;
public class OracleUserInfoDao extends UserInfoDao{
	public void insertUserInfo(UserInfo userinfo){
		System.out.println("insert : " + userinfo.getUserName() + " in oracle");

	};
	public void updateUserInfo(UserInfo userinfo){
		System.out.println("update : " + userinfo.getUserName() + " in oracle");

	};
	public void deleteUserInfo(UserInfo userinfo){
		System.out.println("delete : " + userinfo.getUserName() + " in oracle");

	};
}