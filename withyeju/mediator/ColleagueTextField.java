package withyeju.mediator;
import java.awt.*;
import java.awt.event.*;

public class ColleagueTextField extends TextField implements Colleague, TextListener {
  private Mediator mediator;

  public ColleagueTextField(String caption, int col) {
    super(caption, col);
  }

  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
  }
  
  public void setColleagueEnabled(boolean enabled) {
    setEnabled(enabled);
  }

  @Override
  public void textValueChanged(TextEvent e) {
    mediator.colleagueChanged(this);
  }
}