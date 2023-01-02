package bridge.practice;

public class StringDisplayImpl extends DisplayImpl{
  String string;
  int len;
  
  StringDisplayImpl(String str){
    string = str;
    len = str.length();
  }

  public void rawOpen(){
      printLine();
  };
  public void rawPrint(){
    System.out.println("|" + string + "|");
  };
  public void rawClose(){
    printLine();
  };

  void printLine(){
    System.out.print("+");
    for (int i = 0; i <len; i++)
      System.out.print('-');
    System.out.println("+");
  }
}
