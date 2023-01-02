package observer.practice;

public class DigitObserver implements Observer{
  public void update(NumberGenerator gernerator){ //update 된 정보로 갱신(갱신==출력)
    int digit = gernerator.getNumber();
    System.out.println("Digit Obs : " + digit);
    try{
      Thread.sleep(100);
    } catch (InterruptedException e){}
  }
}
