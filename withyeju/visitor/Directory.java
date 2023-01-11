package withyeju.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// import withyeju.visitor.FileTreatmentException;

public class Directory extends Entry{
  String _name;
  List<Entry> _list = new ArrayList<>();

  public Directory(String str){
    _name =str;
  }

  public String getName(){
    return _name;
  };

  public int getSize(){
    int size = 0;
    for (Entry o : _list){
      size += o.getSize();
    }
    return size;
  };

  //temp
  public List<Entry> getList(){
    return _list;
  }

  @Override
  public Entry add(Entry entry) {
    _list.add(entry);
    return entry;
  }

  @Override
  public Iterator<Entry> iterator() {
    return _list.iterator();
  }

  @Override
  public void accept(Visitor v) {
    v.visit(this);
    //1.  v가 방문할건데 accept?
    //2.  v.(this);
    //3.  끝.
  }
}
