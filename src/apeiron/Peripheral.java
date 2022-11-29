
package apeiron;

import javax.swing.ImageIcon;

public class Peripheral extends PC_Parts {
    private String color;
    private boolean isWireless;

    public Peripheral(String color, boolean isWireless, String name, int prize, String itemCode, int stocks, ImageIcon image) {
        super(name, prize, itemCode, stocks, image);
        this.color = color;
        this.isWireless = isWireless;
    }
    
    
}
