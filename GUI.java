import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class GUI extends JFrame {
    
    //Number of lectures attended
    private int lecturesAttended = 0;
            
    //Number of sgts attended
    private int sgtsAttended = 0;
    
    private Image backgroundImage;
    
    public GUI() {

        // Set the title
        setTitle("Gamify KCL");
        
        // Set the size of the window
        setSize(400, 600);
        
        try {
            backgroundImage = ImageIO.read(new File("C:\\Users\\smgir\\OneDrive\\Desktop\\Uni\\Files\\FirstYearHack\\gamifyKCL\\background.png")); // Replace with your image path
        } catch (IOException e) {
            e.printStackTrace();
        }
        
         // Create a custom JPanel to paint the image
        JPanel imagePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);  // Call the superclass method to ensure proper rendering

                if (backgroundImage != null) {
                    // Draw the image to cover the whole JPanel
                    g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
                }
            }
        };
        
        // Set the layout
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        
        // Set the custom panel as the content pane
        setContentPane(imagePanel);

        // Create a panel to hold the level text
        JPanel levelPanel = new JPanel();
        levelPanel.setLayout(new FlowLayout());
        
        // Create a level text label
        JLabel labelLevelText = new JLabel("Level:");
        levelPanel.add(labelLevelText);
        
        // Create a level label
        JLabel labelLevel = new JLabel("");
        levelPanel.add(labelLevel);
        
        add(levelPanel);
        
        // Create a panel to hold the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.setPreferredSize(new Dimension(400,60));
        
        // Create a lecture button
        JButton buttonLecture = new JButton("Attend Lecture");
        buttonLecture.setPreferredSize(new Dimension(120, 50));
        buttonPanel.add(buttonLecture);
        
        // Create an lecture output label
        JLabel outputLabelLecture = new JLabel("");
        buttonPanel.add(outputLabelLecture);
        
        // Create a sgt button
        JButton buttonSgt = new JButton("Attend SGT");
        buttonSgt.setPreferredSize(new Dimension(120, 50));
        buttonPanel.add(buttonSgt);
        
        // Create an sgt output label
        JLabel outputLabelSgt = new JLabel("");
        buttonPanel.add(outputLabelSgt);
        
        // Create a battle button
        JButton buttonBattle = new JButton("Battle");
        buttonBattle.setPreferredSize(new Dimension(120, 50));
        buttonPanel.add(buttonBattle);
        
        add(buttonPanel);
        
        JPanel transparentPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g); // Calls the parent class paintComponent to ensure proper rendering
                // You can add custom drawing here if needed
            }
        };
        
        // Set the background of the panel to transparent
        transparentPanel.setOpaque(false);
        
        transparentPanel.setPreferredSize(new Dimension(100, 20));

        // Add the transparent panel to the frame
        add(transparentPanel);
        
         // Create a leadboard scroll pane
        String[] users = {"Option 1", "Option 2", "Option 3", "Option 4"};
        JList<String> leaderboard = new JList<>(users);
        JScrollPane scrollPane = new JScrollPane(leaderboard);
        // Set the preferred size of the scroll pane
        scrollPane.setPreferredSize(new Dimension(300, 200));
        add(scrollPane);
        
        // Add an action listener to the lecture button
        buttonLecture.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AttendLecture lecture = new AttendLecture();
                incrementLecturesAttended();
                outputLabelLecture.setText(Integer.toString(lecturesAttended));
            }
        });
        
        // Add an action listener to the sgt button
        buttonSgt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sgtsAttended++;
                outputLabelSgt.setText(Integer.toString(sgtsAttended));
            }
        });
        
        // Set default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Center the window on the screen
        setLocationRelativeTo(null);
        
        // Make the window visible
        setVisible(true);
    }

    // Main method to run the GUI
    public static void main(String[] args) {
        new GUI();
    }
    
    public void incrementLecturesAttended()
    {
        lecturesAttended++;
    }
}
