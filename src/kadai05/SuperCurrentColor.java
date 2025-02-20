package kadai05;



import java.awt.Color;

import javax.swing.JPanel;

public class SuperCurrentColor {
   private int red = 0;
   private int blue = 0;
   private int green = 0;
   private int[] vals = {0, 128, 255};
   private JPanel colorPanel = new JPanel();
   
   public void changeRed() {
     red = nextBright(red);
     colorPanel.setBackground(new Color(vals[red], vals[blue], vals[green]));
   }
   public void changeBlue() {
     blue = nextBright(blue);
     colorPanel.setBackground(new Color(vals[red], vals[blue], vals[green]));
   }
   public void changeGreen() {
     green = nextBright(green);
     colorPanel.setBackground(new Color(vals[red], vals[blue], vals[green]));
   }
   public int nextBright(int b) {
     int resolution = -1;
     if (b == 0) resolution = 1;
     if (b == 1) resolution = 2;
     if (b == 2) resolution = 0;
     
     return resolution;   
   }
   public void setPanel(JPanel p) {
     colorPanel = p;
   }
}