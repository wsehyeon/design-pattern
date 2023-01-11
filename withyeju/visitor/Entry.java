package withyeju.visitor;

import java.util.Iterator;

public abstract class Entry implements Acceptor, Iterable<Entry>{
  // 이름을 얻는다. 
  public abstract String getName();
  // 사이즈를 얻는다. 
  public abstract int getSize();

  // 엔트리를 추가
  public Entry add(Entry entry) throws FileTreatmentException {
    throw new FileTreatmentException();
  }
  
  // Iterator의 생성 
  public Iterator<Entry> iterator() throws FileTreatmentException {
    throw new FileTreatmentException();
  };
    
    // 문자열 표현
  public String toString() {
    return getName() + " (" + getSize() + ")"; 
  }

}