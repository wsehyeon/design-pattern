package command.practice;

import command.practice.cmd.*;
import command.practice.drawer.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Main extends JFrame implements MouseMotionListener, WindowListener {
  private MacroCommand history = new MacroCommand();
  private DrawCanvas canvas = new DrawCanvas(400, 400, history);
  private JButton clearButton = new JButton("clear");
}
