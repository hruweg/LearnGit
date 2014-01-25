/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.age;
import java.awt.Frame;
import java.awt.*;
import javax.swing.JFrame;
/**
 *
 * @author Admin
 */
public class Screen extends JFrame
{
    JFrame frame;
    public Screen()
    {
        frame = new JFrame();
        frame.setEnabled(true);
    }
    
    public static void main(String[] args)
    {
        Screen screen = new Screen();
    }
}
