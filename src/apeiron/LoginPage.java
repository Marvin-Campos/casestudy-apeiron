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
        loginPageWindow.setIconImage(apeironIcon.getImage());
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
        
        JLabel otherSignInSubText = new JLabel("or sign in using the following:");
        otherSignInSubText.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        otherSignInSubText.setFont(smallFont);
        
        //////////////////// REFACTOR TO FUNCTIONS
        JPanel socialMediaLogoPanel = new JPanel();
        socialMediaLogoPanel.setLayout(new FlowLayout());
        socialMediaLogoPanel.setBackground(Color.WHITE);
        socialMediaLogoPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 50, 0, colorTest));
        
        ImageIcon fb_icon = new ImageIcon(resourcesFolder + "\\fb_icon.png");
        ImageIcon google_icon = new ImageIcon(resourcesFolder + "\\google_icon.png");
        ImageIcon twt_icon = new ImageIcon(resourcesFolder + "\\twt_icon.png");
        fb_icon = imageIconResize(fb_icon, 30, 30);
        google_icon = imageIconResize(google_icon, 30, 30);
        twt_icon = imageIconResize(twt_icon, 30, 30);
          
        JButton socialMedia1Button = new JButton(fb_icon);
        socialMedia1Button.setBorder(BorderFactory.createEmptyBorder());
        socialMedia1Button.setContentAreaFilled(false);
        socialMedia1Button.addActionListener((e) -> { System.out.println("clicked");
        });
        
        JButton socialMedia2Button = new JButton(google_icon);
        socialMedia2Button.setBorder(BorderFactory.createEmptyBorder());
        socialMedia2Button.setContentAreaFilled(false);
        socialMedia2Button.addActionListener((e) -> { System.out.println("clicked");
        });
        
        JButton socialMedia3Button = new JButton(twt_icon);
        socialMedia3Button.setBorder(BorderFactory.createEmptyBorder());
        socialMedia3Button.setContentAreaFilled(false);
        socialMedia3Button.addActionListener((e) -> { System.out.println("clicked");
        });
        
        
        socialMediaLogoPanel.add(socialMedia1Button);
        socialMediaLogoPanel.add(socialMedia2Button);
        socialMediaLogoPanel.add(socialMedia3Button);
        
       
        ////////////////

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
    
    private ImageIcon imageIconResize(ImageIcon imageIcon, int width, int height) {
        Image image = imageIcon.getImage();

        Image resizedImage = image.getScaledInstance(width, height,  java.awt.Image.SCALE_SMOOTH);

        return new ImageIcon(resizedImage);
    }
    
    private void infoPanelSetup() {
        JPanel infoPanel = new JPanel();
        
       //fix: change constant to variable
        infoPanel.setPreferredSize(new Dimension(300, 100));
        infoPanel.setBackground(Color.WHITE);
        loginPagePanel.add(infoPanel, BorderLayout.EAST);
    }
}
