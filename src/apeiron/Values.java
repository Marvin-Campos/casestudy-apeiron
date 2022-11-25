package apeiron;

import java.awt.*;
import java.io.File;
import javax.swing.ImageIcon;

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
   
    public Font largeFont = new Font(Font.SANS_SERIF, Font.BOLD, 30);
    public Font largeFontUnbold = new Font(Font.SANS_SERIF, Font.PLAIN, 30);
    public Font mediumFont = new Font(Font.SANS_SERIF, Font.BOLD, 18);
    public Font smallFont = new Font(Font.SANS_SERIF, Font.BOLD, 12);
    public Font smallFontUnbold = new Font(Font.SANS_SERIF, Font.PLAIN, 12);
    public Font tinyFontUnbold = new Font(Font.SANS_SERIF, Font.PLAIN, 8);
    
//    public void printTest() {
//         System.out.println(screenResolution.width / ((double) 2/3));
//    }
}
