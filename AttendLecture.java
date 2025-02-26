import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AttendLecture extends JFrame {
    
    //Number of questions asked
    private int questionCount = 1;
    
    public AttendLecture() {
        // Set the title
        setTitle("Gamify KCL");
        
        // Set the size of the window
        setSize(300, 300);
        
        // Set the layout
        setLayout(new BorderLayout());
        
        // Create a panel to hold the text
        JPanel textPanel = new JPanel();
        textPanel.setLayout(new FlowLayout());
        
        // Create a question label
        JLabel labelQuestion = new JLabel("Question " + questionCount + ":");
        textPanel.add(labelQuestion);
        
        // Create a question content label
        JLabel labelContent = new JLabel("<html>asdjbhed de duidwa wdiohfvui wqhudwabjcd fehuoscdkjs wdayduwabj?<html>");
        // Set the preferred size of the label so it wraps properly
        labelContent.setPreferredSize(new Dimension(100, 100));  // Adjust the width as needed
        textPanel.add(labelContent);
        
        //add text panel
        add(textPanel, BorderLayout.NORTH);
        
        // Create a panel to hold the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());  // Use FlowLayout to arrange buttons horizontally
        
        //Create answer A button
        JButton buttonA = new JButton("Answer1");
        buttonPanel.add(buttonA);
        //Create answer B button
        JButton buttonB = new JButton("Answer2");
        buttonPanel.add(buttonB);
        //Create answer C button
        JButton buttonC = new JButton("Answer3");
        buttonPanel.add(buttonC);
        
        //add button panel
        add(buttonPanel, BorderLayout.CENTER);
        
        // Create a close button
        JButton buttonClose = new JButton("Close");
        add(buttonClose, BorderLayout.SOUTH);
        
        // Add an action listener to the lecture button
        buttonClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
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
    
    //Method to determine whether the answer of the question is right
    private void isQuestionRight()
    {
        
    }
}
