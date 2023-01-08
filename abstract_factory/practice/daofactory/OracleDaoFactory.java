import productdao.OracleProductDao;
import productdao.ProductDao;
import userinfodao.OracleUserInfoDao;
import userinfodao.UserInfoDao;

public class OracleDaoFactory extends DaoFactory {
	@Override
	public UserInfoDao createUserInfoDao() {
	return new OracleUserInfoDao(); }
	@Override
	public ProductDao createProductDao() {
	return new OracleProductDao(); }
}
