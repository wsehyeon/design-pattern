public class Product {
  private String id;
  private String name;

  public Product(){}

  public void setProductId(String string){
    id = string;
  }

  public void setProductName(String string){
    name = string;
  }

  public String getProductName(){
    return this.name;
  }

  public String getProductId(){
    return this.id;
  }
} 
