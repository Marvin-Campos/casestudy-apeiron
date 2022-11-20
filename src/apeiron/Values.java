package apeiron;

import java.awt.*;

public class Values {
    private Dimension screenResolution = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
    public Dimension loginPageWindowSize = new Dimension (screenResolution.width / 2, screenResolution.height / 2);
    
//    public Dimension twoByThree = new Dimension(screenResolution.width / ((double) 2/3), screenResolution.height / ((double) 2/3));
//    public Dimension oneByThree = screenResolution.width - width_2by3;
    
    public Dimension minSize = new Dimension(100, 100);
    public Dimension preferredSize = new Dimension(200, 100);
    public Dimension maxSize = new Dimension(350, 100);
    
    public Color transparent = new Color(0, 0, 0, 0);
    public Color colorTest = Color.WHITE;
    
    public int textTopMargin = 30;
    public int textLeftMargin = 300;
    public int loginPanelMargin = 100;
   
    public Font largeFont = new Font(Font.SANS_SERIF, Font.BOLD, 30);
    public Font mediumFont = new Font(Font.SANS_SERIF, Font.BOLD, 18);
    public Font smallFont = new Font(Font.SANS_SERIF, Font.BOLD, 12);
    
//    public void printTest() {
//         System.out.println(screenResolution.width / ((double) 2/3));
//    }
}
