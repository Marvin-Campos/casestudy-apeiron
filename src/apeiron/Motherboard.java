
package apeiron;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Motherboard extends Component {
    private String socketType;
    private String motherboardSize;
    private boolean hasWifiConnectivity;

    public Motherboard(String socketType, String motherboardSize, boolean hasWifiConnectivity, boolean isOverclockable, boolean hasRGB, String name, int prize, String itemCode, int stocks, ImageIcon image) {
        super(isOverclockable, hasRGB, name, prize, itemCode, stocks, image);
        this.socketType = socketType;
        this.motherboardSize = motherboardSize;
        this.hasWifiConnectivity = hasWifiConnectivity;
    }

    @Override
    public JPanel getDesc() {
        
        super.description = socketType + " " + motherboardSize + " Motherboard: WiFi, " + hasWifiConnectivity + "; RGB, " + hasRGB + "; Overclock Ready. " + isOverclockable;
        
        JPanel descPanel = new JPanel();
        descPanel.setLayout(new BoxLayout(descPanel, BoxLayout.PAGE_AXIS));
        JLabel price = new JLabel("Price: PHP " + prize);
        descPanel.add(price);
        if (isOverclockable==true) {
        JLabel oc = new JLabel("Can be overclocked.");
        descPanel.add(oc);
        }
        
        if (hasRGB==true) {
        JLabel oc = new JLabel("Has RGB Lighting.");
        descPanel.add(oc);
        }
        
        JLabel text1 = new JLabel("Socket Type:  " + socketType);
        JLabel text2 = new JLabel("MotherBoard Size: " + motherboardSize);
        if (hasWifiConnectivity == true) {
            JLabel text3 = new JLabel("Has In-built WiFi");
            descPanel.add(text3);
        }
        
        descPanel.add(text1);
        descPanel.add(text2);
        
        return descPanel;
    }
        
    
}
