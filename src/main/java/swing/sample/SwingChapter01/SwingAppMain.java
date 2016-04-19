package swing.sample;

import javax.swing.JFrame;

public class SwingAppMain {
  public static void main(String[] args) {
    JFrame mainFrame = new JFrame("サンプル"); 
    mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mainFrame.setSize(320, 160);
    mainFrame.setLocationRelativeTo(null);
    mainFrame.setVisible(true);
  }
}
