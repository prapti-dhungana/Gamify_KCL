import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StartUp extends JFrame {
    
    public StartUp() {
        // Set the title
        setTitle("Gamify KCL");
        
        // Set the size of the window
        setSize(300, 300);
        
        // Set the layout
        setLayout(new FlowLayout());
        
        //Create username label
        JLabel usernameLabel = new JLabel("Username");
        add(usernameLabel);
        // Create a username text field
        JTextField usernameTextField = new JTextField(20);
        add(usernameTextField);
        //Create password label
        JLabel passwordLabel = new JLabel("Password");
        add(passwordLabel);
        // Create a password text field
        JTextField passwordTextField = new JTextField(20);
        add(passwordTextField);
        
        // Create a signup button
        JButton buttonSignup = new JButton("Sign Up");
        add(buttonSignup);
        
        // Create a login button
        JButton buttonLogin = new JButton("Log In");
        add(buttonLogin);
        
        // Add an action listener to the signup button
        buttonSignup.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                GUI gui = new GUI();
            }
        });
        // Add an action listener to the login button
        buttonLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                GUI gui = new GUI();
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
}
