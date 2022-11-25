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
        loginPageWindow.setResizable(false);
        
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
        JLabel welcomeText = new JLabel("Shop for PC Parts");
        JLabel welcomeSubText = new JLabel("Affordable, trusted, and all perfect");
        JLabel welcomeSubTextTwo = new JLabel("for your newest PC builds");
        JLabel foundersText = new JLabel("           FOUNDERS             "); // USING WHITEPACES AS BAND-AID SINCE IDK WHAT I'M DOING
        JLabel marvinCampos = new JLabel("  Marvin Campos              "); 
        JLabel seanSerrano = new JLabel("                     Sean Serrano");
        JLabel warningOne = new JLabel("APEIRON TECHNOLOGIES IS  A FICTIONAL COMPANY, ANY");
        JLabel warningTwo = new JLabel("RESEBLANCE TO REAL EVENTS ARE PURELY COINCIDENTAL");

        infoPanel.setPreferredSize(new Dimension(300, 100));
        infoPanel.setBackground(Color.WHITE);
        loginPagePanel.add(infoPanel, BorderLayout.EAST);
        
        welcomeText.setBounds(0,0,0,0);
        welcomeText.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        welcomeText.setFont(largeFontUnbold);
        
        welcomeSubText.setBounds(0,0,0,0);
        welcomeSubText.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        welcomeSubText.setFont(smallFontUnbold);
        
        welcomeSubTextTwo.setBounds(0,0,0,0);
        welcomeSubTextTwo.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        welcomeSubTextTwo.setFont(smallFontUnbold);
        
        // Bro idk how to add a space so this is my band-aid solutionj
        
        ImageIcon dividerOneImg = new ImageIcon(resourcesFolder + "\\divider.png");
        dividerOneImg = imageIconResize(dividerOneImg, 2000, 20);
        JLabel dividerOne = new JLabel(dividerOneImg);

        foundersText.setBounds(50, 650, 50, 50);
        
        ImageIcon dividerTwoImg = new ImageIcon(resourcesFolder + "\\divider.png");
        dividerTwoImg = imageIconResize(dividerTwoImg, 5, 20);
        JLabel dividerTwo = new JLabel(dividerTwoImg);
        
        // random band-aid ends here //
        
        ImageIcon marvImage = new ImageIcon(resourcesFolder + "\\marvs.png");
        marvImage = imageIconResize(marvImage, 50, 50);
        JLabel marvImageIcon = new JLabel(marvImage);
        
        ImageIcon austImage = new ImageIcon(resourcesFolder + "\\aust.png");
        austImage = imageIconResize(austImage, 50, 50);
        JLabel austImageIcon = new JLabel(austImage);
        
        marvinCampos.setBounds(50, 700, 50, 50);
        seanSerrano.setBounds(50, 750, 50, 50);
        
        ImageIcon dividerThreeImg = new ImageIcon(resourcesFolder + "\\divider.png");
        dividerThreeImg = imageIconResize(dividerThreeImg, 2000, 20);
        JLabel dividerThree = new JLabel(dividerThreeImg);
        
        warningOne.setBounds(50, 800, 50, 50);
        warningOne.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        warningOne.setFont(tinyFontUnbold);
        
        warningTwo.setBounds(50, 850, 50, 50);
        warningTwo.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        warningTwo.setFont(tinyFontUnbold);
   
        ImageIcon apeironLogo = new ImageIcon(resourcesFolder + "\\apeiron_logo.png");
        apeironLogo = imageIconResize(apeironLogo, 200, 200);
      
        JLabel apeironImage = new JLabel(apeironLogo);
        
        infoPanel.add(apeironImage);
        infoPanel.add(welcomeText);
        infoPanel.add(welcomeSubText);
        infoPanel.add(welcomeSubTextTwo);
        infoPanel.add(dividerOne);
        infoPanel.add(dividerTwo);
        infoPanel.add(marvImageIcon);
        infoPanel.add(foundersText);
        infoPanel.add(austImageIcon);
        infoPanel.add(marvinCampos);
        infoPanel.add(seanSerrano);
        infoPanel.add(dividerThree);
        infoPanel.add(warningOne);
        infoPanel.add(warningTwo);
        
    }
}