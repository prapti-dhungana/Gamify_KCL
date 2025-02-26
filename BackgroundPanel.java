import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.io.File;
import javax.swing.JLabel;

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
            backgroundImage = ImageIO.read(new File("C:\\Users\\smgir\\OneDrive\\Desktop\\Uni\\Files\\FirstYearHack\\gamifyKCL\\background.png"));
            System.out.println("image loaded");
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
            System.out.println("image not loaded");
        }  // Replace with your image path
        
    }
    // Override paintComponent to draw the background image
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);  // Always call super.paintComponent(g) to ensure the panel is rendered properly

        if (backgroundImage != null) {
            // Draw the image to cover the entire panel
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        } else {
            // If the image is not loaded, fill with a default background color
            g.setColor(Color.GRAY);
            g.fillRect(0, 0, getWidth(), getHeight());
        }
    }
    
    public JLabel getImage()
    {
        JLabel label = new JLabel(new ImageIcon(backgroundImage));
        return label;
    }
}
