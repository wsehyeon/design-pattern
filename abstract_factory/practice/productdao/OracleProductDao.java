package productdao;
public class OracleProductDao extends ProductDao{
	public void insertProduct(Product product){
		System.out.println("insert : " + product.getProductName() + " in oracle");

	};
	public void updateProduct(Product product){
		System.out.println("update : " + product.getProductName() + " in oracle");

	};
	public void deleteProduct(Product product){
		System.out.println("delete : " + product.getProductName() + " in oracle");
	};
}
