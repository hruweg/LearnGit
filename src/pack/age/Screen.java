/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.age;
import java.awt.Frame;
import java.awt.*;
/**
 *
 * @author Admin
 */
public class Screen extends Frame
{
    Frame frame = new Frame();
    public Screen()
    {
        frame.setEnabled(true);
    }
    
    public static void main(String[] args)
    {
        Screen screen = new Screen();
    }
}
