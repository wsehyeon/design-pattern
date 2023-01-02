package observer.practice;

public class GraphObserver implements Observer{
  public void update(NumberGenerator gernerator){
    int count = gernerator.getNumber();
    System.out.print(" Graph Obs : ");
    for (int i = 0; i <count; i++)
      System.out.print("*");
    System.out.println();
    try{
      Thread.sleep(100);
    } catch (InterruptedException e){}
  }
}
