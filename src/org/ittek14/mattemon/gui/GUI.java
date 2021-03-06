package org.ittek14.mattemon.gui;

import java.util.ArrayList;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class GUI {
  public ArrayList<Widget> widgets;
  
  public GUI() {
    widgets = new ArrayList<Widget>();
  }
  
  public void update(GameContainer gc, int delta) {
    for(Widget widget : widgets) {
      widget.update(gc, delta);
    }
  }
  
  public void render(GameContainer gc, Graphics g) {
    for(Widget widget : widgets) {
      widget.render(gc, g);
    }
  }

  public void addWidget(Widget widget) {
    widgets.add(widget);
  }
}
