package command.practice.cmd;

import java.util.ArrayDeque;
import java.util.Deque;

public class MacroCommand implements Command{
  private Deque<Command> commands = new ArrayDeque<>();
  
  @Override
  public void excute(){
    for (Command cmd: commands)
      cmd.excute();
  }
  
  public void append(Command cmd){
    if (cmd == this)
      throw new IllegalArgumentException("infinite loop caused by append");
    commands.push(cmd);
  }

  public void undo(){
    if (!commands.isEmpty())
      commands.pop();
  }

  public void clear(){
    commands.clear();
  }
}
