package bridge.practice;

public class Main {
  public static void main(String[] args) {
    Display d1 = new Display(new StringDisplayImpl("hello java"));
    Display d2 = new Display(new StringDisplayImpl("hello 2023"));

    CountDisplay d3 = new CountDisplay(new StringDisplayImpl("hello 42seoul"));

    d1.display();
    d2.display();
    d3.display();
    
    d3.multiDisplay();
  }
}
