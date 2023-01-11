package withyeju.visitor;

import java.util.List;

public class ListVisitor extends Visitor {
  String _current = "";

  public void visit(File file){
    System.out.println( _current + file.getName());
  };
  public void visit(Directory directory){
    List<Entry> list = directory.getList();

    String _save = _current;
    _current += directory.getName() + "/";
    for(Entry o : list){
      o.accept(this);
    }
    _current = _save;
  };
}

