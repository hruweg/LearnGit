/*
 * To change this template, choose Tools | Templates
 * and do the dance. open the template in the editor.
 */
package pack.age;
import java.awt.Frame;
import java.awt.*;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class Pong
{
    JFrame frame;
    public Pong()
    {
        frame = new JFrame();
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        
        JButton button = new JButton("TotallyNotAButton");
        frame.add(panel);
        panel.add(button);
    }

    public static void main(String[] args)
    {
        new Pong();
    }
}
