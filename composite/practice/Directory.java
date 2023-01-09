package composite.practice;

import java.util.ArrayList;

public class Directory extends Entry{
  private String _name;
  private ArrayList<Entry> _list = new ArrayList<Entry>();

  public Directory(String name){
    _name = name;
  } 

  public String getName(){
    return _name;
  }

  public void add(Entry obj){
    _list.add(obj);
  }

  public int getSize(){
    int all = 0;
    for (Entry e : _list)
      all += e.getSize();
    return all;
  }

  public void printList(){
    System.out.println("- " + this.getName());
    for (Entry e : _list){
      System.out.print("  ");
      e.printList();
    }
  }

  public void printPwd(){
    for (Entry e : _list){
      System.out.print("/" + this.getName());
      e.printPwd();
    }
  }
}
