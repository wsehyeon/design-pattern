package bridge.practice;

public class Display {
  DisplayImpl _impl;

  Display(DisplayImpl impl){
    this._impl = impl;}

  void open(){ _impl.rawOpen();}
  void close(){ _impl.rawClose();}
  void print(){ _impl.rawPrint();}

  void display(){
    open();
    print();
    close();
  }
}
