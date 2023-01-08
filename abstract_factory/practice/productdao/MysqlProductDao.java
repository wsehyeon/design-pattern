package productdao;
public class MysqlProductDao extends ProductDao{
	public void insertProduct(Product product){
		System.out.println("insert : " + product.getProductName() + " in mysql");

	};
	public void updateProduct(Product product){
		System.out.println("update : " + product.getProductName() + " in mysql");

	};
	public void deleteProduct(Product product){
		System.out.println("delete : " + product.getProductName() + " in mysql");
	};
}
