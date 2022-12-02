
package apeiron;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OfficeMouse extends Mouse {
    private String sensorType;

    public OfficeMouse(String sensorType, int dpi, int numberOfButtons, String color, boolean isWireless, String name, int prize, String itemCode, int stocks, ImageIcon image) {
        super(dpi, numberOfButtons, color, isWireless, name, prize, itemCode, stocks, image);
        this.sensorType = sensorType;
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
        JLabel text1 = new JLabel("Sensor Type: " + sensorType);
        JLabel text2 = new JLabel("DPI: " + dpi);
        JLabel text3 = new JLabel("No. of Buttons: " + numberOfButtons);
        
        descPanel.add(text1);
        descPanel.add(text2);
        descPanel.add(text3);
        
        return descPanel;
    }
    
}
