
package app;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Head {

    public static void main(String[] args) {
        
        JFrame obj = new JFrame();
        Gameplay gamePlay = new Gameplay();
        obj.setBounds(10, 10, 700, 600);
        obj.setTitle("Brick Breaker");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamePlay); 
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        obj.setLocation(dim.width/2-obj.getSize().width/2, dim.height/2-obj.getSize().height/2);
    }
}