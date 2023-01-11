package withyeju.visitor;

import java.util.Iterator;

public class File extends Entry{
  String _name;
  int _size;

  public File(String str, int size){
    _name =str;
    _size = size;
  }

  @Override
  public String getName(){
    return _name;
  };

  @Override
  public int getSize(){
    return _size;
  };

  @Override
  public Entry add(Entry entry) throws FileTreatmentException {
    throw new FileTreatmentException();
  }

  @Override
  public Iterator<Entry> iterator() throws FileTreatmentException {
    throw new FileTreatmentException();
  }

  @Override
  public void accept(Visitor v) {
    v.visit(this);    
  }

}
