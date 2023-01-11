package command;

public class StereoOnCommand implements Command {
  Stereo radio;
public StereoOnCommand(Stereo radio) { this.radio = radio;
}
public void execute() { radio.on();
}
}
