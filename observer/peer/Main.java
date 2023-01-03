public class Main {
  public static void main(String[] args) {
    NumberGenerator generator = new RandomNumberGenerator();
    Observer observer1 = new DigitObserver();
    Observer observer2 = new GraphObserver();

    generator.addObserver(observer1);
    generator.addObserver(observer2);
    for (int i = 0; i < 5; i++)
      generator.execute();
  }
}