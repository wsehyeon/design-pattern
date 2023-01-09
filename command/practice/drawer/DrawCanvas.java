package command.practice.drawer;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import command.practice.cmd.MacroCommand;

public class DrawCanvas implements Drawable{
  private Color color = Color.blue;
  private int radius = 6;
  private MacroCommand history;


  public DrawCanvas(int width, int height, MacroCommand history){
    setSize(width, height);
    setBackground(Color.white);
    this.histroy = history;
  }

  @Override
  public void draw(int x, int y){
    Graphics g = getGraphics();
    g.setColor(color);
    g.fillOval(x - radius, y - radius, radius *2, radius * 2);
  }

  public void paint(Graphics g){
    history.execute();
  }
}
