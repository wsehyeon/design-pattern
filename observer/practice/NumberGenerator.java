package observer.practice;

import java.util.ArrayList;
import java.util.List;

public abstract class NumberGenerator {
  List<Observer> _observers = new ArrayList<>();
  
  void addObserver(Observer ob){
    _observers.add(ob);
  };

  void deleteObserver(Observer ob){
    _observers.remove(ob);
  };

  void notifyObserver(){
    for (Observer o: _observers)
      o.update(this);
  }

  abstract int getNumber();
  abstract void execute();
}
