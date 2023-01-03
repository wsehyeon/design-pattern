import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator {
  private Random random = new Random();
  private int number;

  public int getNumber() {
    return number;
  }

  public void execute() {
    number = random.nextInt(42);
    notifyObservers();
  }
}
