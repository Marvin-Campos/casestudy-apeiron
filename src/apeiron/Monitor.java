
package apeiron;

import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Monitor extends Peripheral {
    private int sizeInInches;
    private String resolution;
    private int refreshRate;
    private String displayType;

    public Monitor(int sizeInInches, String resolution, int refreshRate, String displayType, String color, boolean isWireless, String name, int prize, String itemCode, int stocks, ImageIcon image) {
        super(color, isWireless, name, prize, itemCode, stocks, image);
        this.sizeInInches = sizeInInches;
        this.resolution = resolution;
        this.refreshRate = refreshRate;
        this.displayType = displayType;
    }
    
    @Override
    public JPanel getDesc() {
        
        super.description = color + " " + sizeInInches + " inch " + resolution + "@" + refreshRate + " " + displayType + " Monitor: Wireless, " + isWireless; 
        
        JPanel descPanel = new JPanel();
        descPanel.setLayout(new BoxLayout(descPanel, BoxLayout.PAGE_AXIS));
        JLabel price = new JLabel("Price: PHP " + prize);
        descPanel.add(price);        
        JLabel colored = new JLabel("Color: " + color);
        descPanel.add(colored);
        
        if (isWireless==true) {
            JLabel wireless = new JLabel("Is a Wireless Device.");
            descPanel.add(wireless);
        }
        JLabel text1 = new JLabel("Resolution:  " + resolution);
        JLabel text2 = new JLabel("Size: " + sizeInInches + " inches");
        JLabel text3 = new JLabel("Refresh Rate:  " + refreshRate + "hz");
        JLabel text4 = new JLabel("Diaplay Tpe: " + displayType);
        
        
        descPanel.add(text1);
        descPanel.add(text2);
        descPanel.add(text3);
        descPanel.add(text4);
        
        return descPanel;
    }
    
}
