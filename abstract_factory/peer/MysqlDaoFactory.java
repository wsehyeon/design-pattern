public class MysqlDaoFactory extends DaoFactory{
  @Override
  public UserInfoDao createUserInfoDao() {
      return new UserInfoMysqlDao();
  }
  @Override
  public ProductDao createProductDao() {
      return new ProductMysqlDao();
  }
}