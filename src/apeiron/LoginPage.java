package apeiron;

import java.awt.*;
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
        loginPageWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //setup Login Page panel
        loginPagePanel.setLayout(new BorderLayout());
        loginPagePanel.setBorder(BorderFactory.createLineBorder(colorTest, 20));
        loginPageWindow.add(loginPagePanel);
        
       loginPanelSetup();
       infoPanelSetup();
       
       
       
       loginPageWindow.setVisible(true);
    }
    
    
    private void loginPanelSetup() {
        JPanel loginPanel = new JPanel();  
        loginPanel.setLayout(new BoxLayout(loginPanel, BoxLayout.PAGE_AXIS));
        //fix: change constant to variable
        loginPanel.setPreferredSize(new Dimension(600, 100));
        loginPanel.setBackground(colorTest);
        loginPagePanel.add(loginPanel, BorderLayout.WEST);
        
        JLabel loginText = new JLabel("LOGIN");
        loginText.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        loginText.setFont(largeFont);
        
        JLabel loginSubText = new JLabel("Log in using your credentials");
        loginSubText.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        loginSubText.setFont(mediumFont);
         
        JLabel usernameText = new JLabel("Username", JLabel.LEFT);
        usernameText.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        usernameText.setFont(mediumFont);
        usernameText.setBorder(BorderFactory.createMatteBorder(textTopMargin, 0, 0, textLeftMargin, colorTest));
        
        
        //inside its own panel
        JPanel usernameTFPanel = new JPanel();
        usernameTFPanel.setLayout(new BoxLayout(usernameTFPanel, BoxLayout.PAGE_AXIS));
        usernameTFPanel.setBorder(BorderFactory.createMatteBorder(0, loginPanelMargin, 0, loginPanelMargin, colorTest));
        
        JTextField usernameTF = new JTextField("Type your username");
        usernameTF.setFont(smallFont);
        
        usernameTFPanel.add(usernameTF);
        ///
        
        JLabel passwordText = new JLabel("Password");
        passwordText.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        passwordText.setBorder(BorderFactory.createMatteBorder(textTopMargin, 0, 0, textLeftMargin, colorTest));
        passwordText.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));
        
        
        //inside its own panel
        JPanel passwordTFPanel = new JPanel();
        passwordTFPanel.setLayout(new BoxLayout(passwordTFPanel, BoxLayout.PAGE_AXIS));
        passwordTFPanel.setBorder(BorderFactory.createMatteBorder(0, loginPanelMargin, 50, loginPanelMargin, colorTest));
        
        JPasswordField passwordTF = new JPasswordField("Type your password");
        passwordTF.setFont(smallFont);
        passwordTF.setEchoChar((char) 0);
        passwordTFPanel.add(passwordTF);
        ///
        
        JButton loginButton = new JButton("L O G I N");
        loginButton.setAlignmentX(JButton.CENTER_ALIGNMENT);
        
        JLabel otherSignInSubText = new JLabel("or sign in using the following");
        otherSignInSubText.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        otherSignInSubText.setFont(smallFont);
        
        JPanel socialMediaLogoPanel = new JPanel();
        socialMediaLogoPanel.setLayout(new FlowLayout());
        socialMediaLogoPanel.setBackground(Color.MAGENTA);
        socialMediaLogoPanel.setBorder(BorderFactory.createMatteBorder(50, 0, 0, 0, colorTest));
        socialMediaLogoPanel.add(new JLabel("Image"));
        socialMediaLogoPanel.add(new JLabel("Image"));
        socialMediaLogoPanel.add(new JLabel("Image"));

        loginPanel.add(loginText);
        loginPanel.add(loginSubText);
        loginPanel.add(usernameText);
        loginPanel.add(usernameTFPanel);
        loginPanel.add(passwordText);
        loginPanel.add(passwordTFPanel);
        loginPanel.add(loginButton);
        loginPanel.add(otherSignInSubText);
        loginPanel.add(socialMediaLogoPanel);
    }
    
    private void infoPanelSetup() {
        JPanel infoPanel = new JPanel();
        
       //fix: change constant to variable
        infoPanel.setPreferredSize(new Dimension(300, 100));
        infoPanel.setBackground(Color.WHITE);
        loginPagePanel.add(infoPanel, BorderLayout.EAST);
    }
}
