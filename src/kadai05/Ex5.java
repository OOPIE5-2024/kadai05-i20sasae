package kadai05;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Ex5 {

  private JFrame frame;
  private JPanel panel_1;
  private JButton btnNewButton1;
  private JButton btnNewButton2;
  private JButton btnNewButton3;
  private SuperCurrentColor color = new SuperCurrentColor();
  
//  private CurrentColor crrntBckColor = new CurrentColor();
  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Ex5 window = new Ex5();
          window.frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the application.
   */
  public Ex5() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 450, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JPanel panel = new JPanel();
    frame.getContentPane().add(panel, BorderLayout.NORTH);
    
    
   
    btnNewButton1 = new JButton("Red");
    btnNewButton1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        color.changeRed();
      }
    });
    panel.add(btnNewButton1);
    
    
    btnNewButton2 = new JButton("Blue");
    btnNewButton2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        color.changeBlue();
      }
    });
    
    panel.add(btnNewButton2);
    
    btnNewButton3 = new JButton("Green");
    btnNewButton3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        color.changeGreen();
      }
    });
    panel.add(btnNewButton3);
    
    panel_1 = new JPanel();
    color.setPanel(panel_1);
    frame.getContentPane().add(panel_1, BorderLayout.CENTER);
  }

}