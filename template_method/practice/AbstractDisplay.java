package template_method.practice;


public abstract class AbstractDisplay {
  
  // template method
  void display(){
    open(); // call abstract method
    for (int i = 0; i < 5; i++)
      print();
    close();
  }

  // abstract method
  abstract void open();
  abstract void print();
  abstract void close();
}
