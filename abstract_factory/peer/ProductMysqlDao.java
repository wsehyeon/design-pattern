public class ProductMysqlDao extends ProductDao {
   public void insertProduct(Product product){
    System.out.println("INSERT " + product.getProductName() + " to Mysql" );
  };

  public void updateProduct(Product product){
    System.out.println("UPDATE " + product.getProductName() + " to Mysql" );

  };

  public void deleteProduct(Product product){
    System.out.println("DELETE " + product.getProductName() + " to Mysql" );

  };
}