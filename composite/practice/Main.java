package composite.practice;

public class Main {
  public static void main(String[] args) {
    File f1 = new File("file1", 3);
    File f2 = new File("file2", 5);
    File f3 = new File("file3", 7);

    Directory d1 = new Directory("d1");
    Directory d2 = new Directory("d2");
    Directory d3 = new Directory("d3");

    Directory root = new Directory("root");
    
    d1.add(f1);
    d2.add(f2);
    d3.add(f3);

    root.add(d1);
    root.add(d2);
    root.add(d3);

    root.printList();
    root.printPwd();
    System.out.println(root.getSize());
  }
}
