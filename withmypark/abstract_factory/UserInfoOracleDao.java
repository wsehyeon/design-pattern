public class UserInfoOracleDao extends UserInfoDao{
  public void insertUserInfo(UserInfo userInfo){
    System.out.println("INSERT " + userInfo.getUserName() + " to Oracle" );
  };

  public void updateUserInfo(UserInfo userInfo){
    System.out.println("UPDATE " + userInfo.getUserName() + " to Oracle" );

  };

  public void deleteUserInfo(UserInfo userInfo){
    System.out.println("DELETE " + userInfo.getUserName() + " to Oracle" );

  };
}