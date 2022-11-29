
package apeiron;

import javax.swing.ImageIcon;

public class OfficeMouse extends Mouse {
    private String sensorType;

    public OfficeMouse(String sensorType, int dpi, int numberOfButtons, String color, boolean isWireless, String name, int prize, String itemCode, int stocks, ImageIcon image) {
        super(dpi, numberOfButtons, color, isWireless, name, prize, itemCode, stocks, image);
        this.sensorType = sensorType;
    }
    
    
}
