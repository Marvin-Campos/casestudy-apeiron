package apeiron;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LoginPage extends Values{
    JFrame loginPageWindow = new JFrame("Login");
    JPanel loginPagePanel = new JPanel();

    
    
    
    JButton button1 = new JButton("Button 1");
    JButton button2 = new JButton("Button 2");
    
    public LoginPage() {
        run();
    }
    
    private void run() {
        //setup Login Page frame
        loginPageWindow.setSize(loginPageWindowSize);
        loginPageWindow.setVisible(true);
        loginPageWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //setup Login Page panel
        loginPagePanel.setLayout(new BorderLayout());
        loginPagePanel.setBorder(BorderFactory.createLineBorder(Color.GRAY, 20));
        loginPageWindow.add(loginPagePanel);
        
       loginPanelSetup();
       infoPanelSetup();
       
    }
    
    
    private void loginPanelSetup() {
        JPanel loginPanel = new JPanel();
        JLabel loginText = new JLabel("LOGIN");
        JLabel loginSubText = new JLabel("Log in using your credentials");
        
        //CHANGE CONSTANT VALUE TO VARIABLES
        loginPanel.setLayout(new BoxLayout(loginPanel, BoxLayout.Y_AXIS));
        loginPanel.setPreferredSize(new Dimension(600, 100));
        loginPanel.setBackground(Color.GREEN);
        loginPagePanel.add(loginPanel, BorderLayout.WEST);
        
        loginPanel.add(loginText);
        loginPanel.add(loginSubText);
    }
    
    private void infoPanelSetup() {
        JPanel infoPanel = new JPanel();
        
        //CHANGE CONSTANT VALUE TO VARIABLES
        infoPanel.setPreferredSize(new Dimension(300, 100));
        infoPanel.setBackground(Color.BLUE);
        loginPagePanel.add(infoPanel, BorderLayout.EAST);
    }
}
