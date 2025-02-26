import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.io.File;

public class BackgroundPanel extends JPanel {
    private Image backgroundImage;

    public BackgroundPanel() {
        try {
            // Load the image from the project folder (update path accordingly)
            backgroundImage = ImageIO.read(new File("C:\\Documents\\BlueJ projects\\Gamify_KCL-gui\\background.jpg"));
        } catch (IOException ioe) {
            System.out.println("Error loading background image.");
            ioe.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }
}

