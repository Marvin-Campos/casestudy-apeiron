package apeiron;

import java.awt.*;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Values {
    File resourcesFolder = new File(System.getProperty("user.dir") + "\\src\\resources");
    ImageIcon apeironIcon = new ImageIcon(resourcesFolder + "\\apeiron_logo.png");
    
    //hard coded resolution
    public Dimension windowSize = new Dimension (1920 / 2, 1080 / 2);
    
//    public Dimension twoByThree = new Dimension(screenResolution.width / ((double) 2/3), screenResolution.height / ((double) 2/3));
//    public Dimension oneByThree = screenResolution.width - width_2by3;
    
    public Dimension minSize = new Dimension(100, 100);
    public Dimension preferredSize = new Dimension(200, 100);
    public Dimension maxSize = new Dimension(350, 100);
    
    public Color transparent = new Color(0, 0, 0, 0);
    public Color colorTest = Color.WHITE;
    
    public int loginPanelTextTopMargin = 30;
    public int loginPanelTextRightMargin = 300;
    public int loginPanelMargin = 100;
   
    public Font largeFontBold = new Font(Font.SANS_SERIF, Font.BOLD, 30);
    public Font largeFontPlain = new Font(Font.SANS_SERIF, Font.PLAIN, 30);
    public Font mediumFontBold = new Font(Font.SANS_SERIF, Font.BOLD, 18);
    public Font mediumFontPlain = new Font(Font.SANS_SERIF, Font.PLAIN, 18);
    public Font smallFontBold = new Font(Font.SANS_SERIF, Font.BOLD, 12);
    public Font smallFontPlain = new Font(Font.SANS_SERIF, Font.PLAIN, 12);
    public Font tinyFontPlain = new Font(Font.SANS_SERIF, Font.PLAIN, 8);
    
     public JLabel textSetup(String text, Font fontSize) {
        JLabel textLabel = new JLabel(text);
        textLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        textLabel.setFont(fontSize);
        
        return textLabel;
    }

    public JLabel textSetup(String text, Font fontSize, int topMargin, int rightMargin) {
        JLabel textLabel = new JLabel(text);
        textLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        textLabel.setFont(fontSize);
        textLabel.setBorder(BorderFactory.createMatteBorder(topMargin, 0, 0, rightMargin, colorTest));
        
        return textLabel;
    }
    
    public ImageIcon imageIconResize(ImageIcon imageIcon, int width, int height) {
        Image image = imageIcon.getImage();

        Image resizedImage = image.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);

        return new ImageIcon(resizedImage);
    }
    
//    public void printTest() {
//         System.out.println(screenResolution.width / ((double) 2/3));
//    }
}
