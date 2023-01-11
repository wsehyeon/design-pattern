package composite;

import java.util.ArrayList;

public class Category extends ProductCategory{
  ArrayList<ProductCategory> list = new ArrayList<ProductCategory>();

  public Category(int id, String name, int price){
    super(id, name, price);
  }

  
  public void addProduct(ProductCategory product) {
    list.add(product);
  }

  public void removeProduct(ProductCategory product) {
    if (list.contains(product)) {
      list.remove(product);
    } else {
      System.out.printf("there is no product %s\n", product.getName());
    }
  }

  public int getCount() {
    int count = 0;

    for (ProductCategory p : list){
      count += p.getCount();
    }
    return count;
  }

  public String getName() {
    return name;
  }

  public int getPrice() {
    int total = 0;

    for (ProductCategory p : list){
      total += p.getPrice();
    }
    return total;
  }

  public int getId() {
    return id;
  }
}
