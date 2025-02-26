import javax.swing.*;
import java.awt.*;

/**
 * Write a description of class test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class test extends JFrame
{
    /**
     * Constructor for objects of class test
     */
    public test()
    {
        JFrame frame = new JFrame("test");
        frame.setSize(400, 400);
        frame.setLayout(new FlowLayout());
        frame.getContentPane().setBackground(Color.CYAN);
        JLabel label = new JLabel("backgroudn color change");
        frame.add(label);
        frame.setVisible(true);
    }
}
