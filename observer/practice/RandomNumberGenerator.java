package observer.practice;

import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator{
  Random random = new Random();
  int _num;

  public int getNumber() {
    return _num;
  }

  public void execute(){
    for (int i = 0; i < 20; i++){
      _num = random.nextInt(50);
      notifyObserver();
    }
  }

}
