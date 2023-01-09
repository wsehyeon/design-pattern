package command;

public class StereoOffCommand implements Command {
  Stereo radio;
public StereoOffCommand(Stereo radio) { this.radio = radio;
}
public void execute() { radio.off();
}
}
