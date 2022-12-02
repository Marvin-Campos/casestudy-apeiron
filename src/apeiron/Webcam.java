
package apeiron;

import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Webcam extends Peripheral {
    private String resolution; // I'm setting this to string for now since IDK how to use dimensions
    private String aspectRatio; // I'm setting this to string for now since IDK how to use dimensions

    public Webcam(String resolution, String aspectRatio, String color, boolean isWireless, String name, int prize, String itemCode, int stocks, ImageIcon image) {
        super(color, isWireless, name, prize, itemCode, stocks, image);
        this.resolution = resolution;
        this.aspectRatio = aspectRatio;
    }
    
    @Override
    public JPanel getDesc() {
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
        JLabel text2 = new JLabel("Aspect Ratio: " + aspectRatio);
        
        descPanel.add(text1);
        descPanel.add(text2);
        
        return descPanel;
    }
    
}
