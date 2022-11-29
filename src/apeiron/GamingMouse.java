
package apeiron;

import javax.swing.ImageIcon;

public class GamingMouse extends Mouse {
    private int weight;
    private boolean hasDPISwitch;

    public GamingMouse(int weight, boolean hasDPISwitch, int dpi, int numberOfButtons, String color, boolean isWireless, String name, int prize, String itemCode, int stocks, ImageIcon image) {
        super(dpi, numberOfButtons, color, isWireless, name, prize, itemCode, stocks, image);
        this.weight = weight;
        this.hasDPISwitch = hasDPISwitch;
    }
    
    
}
