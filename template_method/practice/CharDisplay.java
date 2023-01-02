package template_method.practice;


public class CharDisplay extends AbstractDisplay{
  char _c;

  public CharDisplay(char c){
    this._c = c;
  }

  void open(){
    System.out.print("<<");
  };

  void print(){
    System.out.print(_c);
  };

  void close(){
    System.out.println(">>");
  };
}
