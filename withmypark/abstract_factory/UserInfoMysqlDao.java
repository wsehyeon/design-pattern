public class UserInfoMysqlDao extends UserInfoDao{
  public void insertUserInfo(UserInfo userInfo){
    System.out.println("INSERT " + userInfo.getUserName() + " to MYSQL" );
  };

  public void updateUserInfo(UserInfo userInfo){
    System.out.println("UPDATE " + userInfo.getUserName() + " to MYSQL" );

  };

  public void deleteUserInfo(UserInfo userInfo){
    System.out.println("DELETE " + userInfo.getUserName() + " to MYSQL" );

  };
}