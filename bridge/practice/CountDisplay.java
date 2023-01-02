package bridge.practice;

public class CountDisplay extends Display{
  
  CountDisplay(DisplayImpl impl){
    super(impl);
  }
  
  void multiDisplay(){
    open();
    for(int i = 0; i < 5; i++)
      super.print();
    close();
  }
}
