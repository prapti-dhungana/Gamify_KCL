import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.io.File;

/**
 * Write a description of class BackgroundPanel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BackgroundPanel extends JPanel
{
    private Image backgroundImage;

    /**
     * Constructor for objects of class BackgroundPanel
     */
    public BackgroundPanel()
    {
        try
        {
            backgroundImage = ImageIO.read(new File(""));
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }  // Replace with your image path
    }
    // Override paintComponent to draw the background image
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (backgroundImage != null) {
            // Draw the image to fill the entire panel
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
