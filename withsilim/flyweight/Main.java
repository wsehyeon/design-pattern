package withsilim.flyweight;

public class Main { 
  public static void main(String[] args) { 
      BigString bs = new BigString("123abc"); 
      bs.print(); 

      System.out.println("-----");
      
      BigString bs2 = new BigString("123abc"); 
      bs2.print(); 
  } 
}