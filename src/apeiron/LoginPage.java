package apeiron;

import java.awt.*;
import javax.swing.*;

public class LoginPage extends Values {

    JFrame loginPageWindow = new JFrame("Login");
    JPanel loginPagePanel = new JPanel();

    public LoginPage() {
        run();
    }

    private void run() {
        //setup Login Page frame
        loginPageWindow.setSize(windowSize);
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
        loginPanel.setPreferredSize(new Dimension(600, 100));
        loginPanel.setBackground(colorTest);
        loginPagePanel.add(loginPanel, BorderLayout.WEST);

        JLabel loginText = textSetup("LOGIN", largeFont);

        JLabel loginSubText = textSetup("Log in using your credentials", mediumFont);

        JLabel usernameText = textSetup("Username", mediumFont, loginPanelTextTopMargin, loginPanelTextRightMargin);

        JPanel usernameTextFieldPanel = inputFieldSetup("Type your username", 0, 0);

        JLabel passwordText =  textSetup("Password", mediumFont, loginPanelTextTopMargin, loginPanelTextRightMargin);

        JPanel passwordTextFieldPanel = inputFieldSetup("Type your password", 0, 50);

        JButton loginButton = new JButton("L O G I N");
        loginButton.setAlignmentX(JButton.CENTER_ALIGNMENT);
        loginButton.addActionListener((e) -> { proceedToMenuPage();
        });

        JLabel otherSignInSubText = textSetup("or sign in using the following:", smallFont);

        JPanel socialMediaLogoPanel = socialMediaPanelSetup();

        loginPanel.add(loginText);
        loginPanel.add(loginSubText);
        loginPanel.add(usernameText);
        loginPanel.add(usernameTextFieldPanel);
        loginPanel.add(passwordText);
        loginPanel.add(passwordTextFieldPanel);
        loginPanel.add(loginButton);
        loginPanel.add(otherSignInSubText);
        loginPanel.add(socialMediaLogoPanel);
    }
    
    private JLabel textSetup(String text, Font fontSize) {
        JLabel textLabel = new JLabel(text);
        textLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        textLabel.setFont(fontSize);
        
        return textLabel;
    }

    private JLabel textSetup(String text, Font fontSize, int topMargin, int rightMargin) {
        JLabel textLabel = new JLabel(text);
        textLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        textLabel.setFont(fontSize);
        textLabel.setBorder(BorderFactory.createMatteBorder(topMargin, 0, 0, rightMargin, colorTest));
        
        return textLabel;
    }
    
    private JPanel inputFieldSetup(String placeholder, int topMargin, int bottomMargin) {
        JPanel textFieldPanel = new JPanel();
        textFieldPanel.setLayout(new BoxLayout(textFieldPanel, BoxLayout.PAGE_AXIS));
        textFieldPanel.setBorder(BorderFactory.createMatteBorder(topMargin, loginPanelMargin, bottomMargin, loginPanelMargin, colorTest));

        JTextField textField = new JTextField(placeholder);
        textField.setForeground(Color.GRAY);
        textField.setFont(smallFont);

        textFieldPanel.add(textField);

        return textFieldPanel;
    }

    private JPanel socialMediaPanelSetup() {
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

        JButton facebookbButton = new JButton(fb_icon);
        facebookbButton.setBorder(BorderFactory.createEmptyBorder());
        facebookbButton.setContentAreaFilled(false);
        facebookbButton.addActionListener((e) -> {
            System.out.println("clicked");
        });

        JButton twitterButton = new JButton(google_icon);
        twitterButton.setBorder(BorderFactory.createEmptyBorder());
        twitterButton.setContentAreaFilled(false);
        twitterButton.addActionListener((e) -> {
            System.out.println("clicked");
        });

        JButton googleButton = new JButton(twt_icon);
        googleButton.setBorder(BorderFactory.createEmptyBorder());
        googleButton.setContentAreaFilled(false);
        googleButton.addActionListener((e) -> {
            System.out.println("clicked");
        });

        socialMediaLogoPanel.add(facebookbButton);
        socialMediaLogoPanel.add(twitterButton);
        socialMediaLogoPanel.add(googleButton);

        return socialMediaLogoPanel;
    }

    private ImageIcon imageIconResize(ImageIcon imageIcon, int width, int height) {
        Image image = imageIcon.getImage();

        Image resizedImage = image.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);

        return new ImageIcon(resizedImage);
    }

    private void proceedToMenuPage() {
        loginPageWindow.dispose();
        MenuPage menuPage = new MenuPage();
    }
    
    private void infoPanelSetup() {
        JPanel infoPanel = new JPanel();

        infoPanel.setPreferredSize(new Dimension(300, 100));
        infoPanel.setBackground(Color.WHITE);
        loginPagePanel.add(infoPanel, BorderLayout.EAST);
    }
}
