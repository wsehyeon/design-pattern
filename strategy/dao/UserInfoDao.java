package strategy.dao;

public interface UserInfoDao {
	public abstract void insert(UserInfo data);
	public abstract void update(UserInfo data);
	public abstract void delete(UserInfo data);
}
