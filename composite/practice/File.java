package composite.practice;

public class File extends Entry{
  private String _name;
  private int _size;

  public File(String name, int size){
    _name = name;
    _size = size;
  }
  
  public String getName(){
    return _name;
  };

  public int getSize(){
    return _size;
  };

  public void printList(){
    System.out.println("ㄴ " + this.getName());
  };

  public void printPwd(){
    System.out.println("/" + this.getName());
  };
}
