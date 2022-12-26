package week2.strategy.subject2;

public class Main {
	public static void main(String[] args) {

		Client web = new Client();

		web.setDao(OracleDao.getDao());
		web.useDao().setUserId("00001");
		web.useDao().setPasswd("4242");
		web.useDao().setUserName("swang");

		web.useDao().insert("12345");
		web.useDao().update("54321");
		web.useDao().delete("54321");

		web.setDao(MysqlDao.getDao());
		// set하기전엔 비어있음.. userinfo를 별도로 관리하고, 정보를 위한 Dao객체를 만들어야 할까?
		web.useDao().insert("42421");
		web.useDao().update("55555");
		web.useDao().delete("55555");
	
	}
}
