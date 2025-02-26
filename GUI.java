import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame {
    
    //Number of lectures attended
    private int lecturesAttended = 0;
            
    //Number of sgts attended
    private int sgtsAttended = 0;
    
    public GUI() {
        JFrame frame = new JFrame("Gamify KCL");
        
        // Set the size of the window
        frame.setSize(400, 600);
        
        // Set the layout
        frame.setLayout(new BorderLayout());
        
        frame.getContentPane().setBackground(Color.CYAN);
        /*
        //create a custom panel with background image
        BackgroundPanel backgroundPanel = new BackgroundPanel();
        backgroundPanel.setLayout(new BorderLayout()); 
        
        add(backgroundPanel.getImage());

        // Set the custom panel as the content pane
        setContentPane(backgroundPanel);
        */
        // Create a panel to hold the level text
        JPanel levelPanel = new JPanel();
        levelPanel.setLayout(new FlowLayout());
        
        // Create a level text label
        JLabel labelLevelText = new JLabel("Level:");
        levelPanel.add(labelLevelText);
        
        // Create a level label
        JLabel labelLevel = new JLabel("");
        levelPanel.add(labelLevel);
        
        frame.add(levelPanel, BorderLayout.NORTH);
        
        // Create a panel to hold the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        
        // Create a lecture button
        JButton buttonLecture = new JButton("Attend Lecture");
        buttonLecture.setPreferredSize(new Dimension(200, 50));
        buttonPanel.add(buttonLecture);
        
        // Create an lecture output label
        JLabel outputLabelLecture = new JLabel("");
        buttonPanel.add(outputLabelLecture);
        
        // Create a sgt button
        JButton buttonSgt = new JButton("Attend SGT");
        buttonSgt.setPreferredSize(new Dimension(200, 50));
        buttonPanel.add(buttonSgt);
        
        // Create an sgt output label
        JLabel outputLabelSgt = new JLabel("");
        buttonPanel.add(outputLabelSgt);
        
        // Create a battle button
        JButton buttonBattle = new JButton("Battle");
        buttonBattle.setPreferredSize(new Dimension(200, 50));
        buttonPanel.add(buttonBattle);
        
        frame.add(buttonPanel, BorderLayout.CENTER);
        
         // Create a leadboard scroll pane
        String[] users = {"Option 1", "Option 2", "Option 3", "Option 4"};
        JList<String> leaderboard = new JList<>(users);
        JScrollPane scrollPane = new JScrollPane(leaderboard);
        // Set the preferred size of the scroll pane
        scrollPane.setPreferredSize(new Dimension(300, 200));
        frame.add(scrollPane, BorderLayout.SOUTH);
        
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
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Center the window on the screen
        frame.setLocationRelativeTo(null);
        
        // Make the window visible
        frame.setVisible(true);
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
