package composite;

public class Product extends ProductCategory{

  public Product(int id, String name, int price){
    super(id, name, price);
  }
  
  public void addProduct(ProductCategory product) {
    System.out.printf("Product can't add product\n");
  }

  public void removeProduct(ProductCategory product) {
    System.out.printf("Product can't remove product\n");
  }

  public int getCount() {
    return 1;
  }


  public String getName() {
    return name;
  }

  public int getPrice() {
    return price;
  }

  public int getId() {
    return id;
  }
}
