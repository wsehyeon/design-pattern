package observer.practice;

public class Main {
  public static void main(String[] args) {
    NumberGenerator gen = new RandomNumberGenerator();
    Observer o1 = new DigitObserver();
    Observer o2 = new GraphObserver();
    gen.addObserver(o1);
    gen.addObserver(o2);
    gen.execute();
  }
}
