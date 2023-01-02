package template_method.practice;

public class Main {
  public static void main(String[] args) {
    AbstractDisplay dis = new CharDisplay('a');
    AbstractDisplay play = new StringDisplay("I love Java");
    
    dis.display();
    play.display();
  }
}
