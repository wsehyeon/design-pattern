package command;

import java.util.ArrayList;

class OnOff {
  Command on;
  Command off;

  public OnOff(Command on, Command off) {
    this.on = on;
    this.off = off;
  }
}

public class RemoteControl {

  ArrayList<OnOff> buttons = new ArrayList<OnOff>();

  public void setCommand(int number, Command on, Command off){
    buttons.add(number, new OnOff(on, off));
  }

  public void onButtonWasPushed(int number){
    if (number >= buttons.size()) {
      System.out.println("Out of bounds");
      return;
    }

    OnOff onfoff = buttons.get(number);
    if (onfoff == null) {
      System.out.println("No commands");
      return;
    }

    onfoff.on.execute();
  }

  public void offButtonWasPushed(int number){

    if (number >= buttons.size()) {
      System.out.println("Out of bounds");
      return;
    }

    OnOff onfoff = buttons.get(number);
    if (onfoff == null) {
      System.out.println("No commands");
      return;
    }

    onfoff.off.execute();
  }
}
