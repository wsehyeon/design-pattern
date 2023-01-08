import productdao.MysqlProductDao;
import productdao.ProductDao;
import userinfodao.MysqlUserInfoDao;
import userinfodao.UserInfoDao;

public class MysqlDaoFactory extends DaoFactory {
	@Override
	public UserInfoDao createUserInfoDao() {
	return new MysqlUserInfoDao(); }
	@Override
	public ProductDao createProductDao() {
	return new MysqlProductDao(); }
}
