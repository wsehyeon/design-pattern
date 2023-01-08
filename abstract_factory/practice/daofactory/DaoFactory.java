import productdao.ProductDao;
import userinfodao.UserInfoDao;

public abstract class DaoFactory {
		public abstract UserInfoDao createUserInfoDao();
		public abstract ProductDao createProductDao();
}