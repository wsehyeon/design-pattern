package command;

// import java.util.ArrayList;

public interface Command {
  public void execute();
}


/*
 public class SimpleCommand {
   // 하나의 단일 커맨드 실행
  }
  
  public class ComplicatedCommand {
    ArrayList<Command> list = new ArrayList<Command>();
    
    public void excute() {
      // 반복문통해서 excute 실행   
    }
  }
*/