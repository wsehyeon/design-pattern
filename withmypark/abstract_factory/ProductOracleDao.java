public class ProductOracleDao extends ProductDao {
   public void insertProduct(Product product){
    System.out.println("INSERT " + product.getProductName() + " to Oracle" );
  };

  public void updateProduct(Product product){
    System.out.println("UPDATE " + product.getProductName() + " to Oracle" );

  };

  public void deleteProduct(Product product){
    System.out.println("DELETE " + product.getProductName() + " to Oracle" );

  };
}