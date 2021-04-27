// Example from Thinking in Java, by Bruce Eckel
// Minor tweaks by MM.

// c14:Counter1.java
// A non-responsive user interface.
// <applet code=Counter1 width=300 height=100>
// </applet>
package sandbox;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Counter1 extends JApplet 
{
  private JButton start = new JButton("Start");
  private JButton pause = new JButton("Pause");
  private JTextField txt = new JTextField(10);

  private int count = 0;
  private boolean runFlag = true;  // Pause button sets this to false

  public void init() {
    Container cp = getContentPane();
    cp.setLayout(new FlowLayout());
    cp.add(txt);
    start.addActionListener(new StartL());
    cp.add(start);
    pause.addActionListener(new PauseL());
    cp.add(pause);
  }
  
  private class PauseL implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      runFlag = !runFlag;
    }
  }

  private class StartL implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      go();
    }
  }
		  
  public void go() {
    while (true) {
      if (runFlag)
        txt.setText(Integer.toString(count++));
      
      try {
        Thread.sleep(100);
      } 
	  catch(InterruptedException e) {
        System.err.println("Interrupted");
      }
    }
  }
} 