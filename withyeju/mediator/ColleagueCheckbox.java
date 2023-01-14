package withyeju.mediator;
import java.awt.*;
import java.awt.event.*;

public class ColleagueCheckbox extends Checkbox implements Colleague, ItemListener {
  private Mediator mediator;
  
  public ColleagueCheckbox(String caption, CheckboxGroup g, boolean b) {
    super(caption, b);
    this.setCheckboxGroup(g);
  }

  public void setMediator(Mediator mediator) {
     this.mediator = mediator;
  }
  public void setColleagueEnabled(boolean enabled) {
    setEnabled(enabled);
  }

  @Override
  public void itemStateChanged(ItemEvent e) {
    mediator.colleagueChanged(this);
  }
}