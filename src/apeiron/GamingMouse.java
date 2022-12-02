
package apeiron;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GamingMouse extends Mouse {
    private int weight;
    private boolean hasDPISwitch;

    public GamingMouse(int weight, boolean hasDPISwitch, int dpi, int numberOfButtons, String color, boolean isWireless, String name, int prize, String itemCode, int stocks, ImageIcon image) {
        super(dpi, numberOfButtons, color, isWireless, name, prize, itemCode, stocks, image);
        this.weight = weight;
        this.hasDPISwitch = hasDPISwitch;
    }
    
    @Override
    public JPanel getDesc() {
        JPanel descPanel = new JPanel();
        descPanel.setLayout(new BoxLayout(descPanel, BoxLayout.PAGE_AXIS));
        JLabel price = new JLabel("Price: PHP " + prize);
        descPanel.add(price);
        JLabel text1 = new JLabel("Weight: " + weight + "g");
        JLabel text2 = new JLabel("DPI Switch: " + hasDPISwitch);
        JLabel text3 = new JLabel("DPI: " + dpi);
        JLabel text4 = new JLabel("No. of Buttons: " + numberOfButtons);
        
        
        descPanel.add(text1);
        descPanel.add(text2);
        descPanel.add(text3);
        descPanel.add(text4);
        
        
        return descPanel;
    }
    
}
