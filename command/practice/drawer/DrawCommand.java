package command.practice.drawer;

import command.practice.cmd.Command;
import java.awt.Point;

public class DrawCommand implements Command{
  protected Drawable drawable;
  private Point position;

  public DrawCommand(Drawable drawable, Point position){
    this.drawable = drawable;
    this.position = position;
  }


  @Override
  public void excute(){
    drawable.draw(position.x, position.y);
  }
}
