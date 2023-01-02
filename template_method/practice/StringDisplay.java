package template_method.practice;


public class StringDisplay extends AbstractDisplay{
  String _str;
  int _len;

  public StringDisplay(String str){
    this._str = str;
    this._len = str.length();
  }

  void open(){
    borderline();
  };

  void print(){
    System.out.println("|" + _str + "|");
  };

  void close(){
    borderline();
  };

  void borderline(){
    System.out.print('+');
    for (int i = 0; i < this._len; i++)
      System.out.print('-');
    System.out.println('+');
  }
}
