
package apeiron;

import javax.swing.ImageIcon;

public class Mouse extends Peripheral {
    private int dpi;
    private int numberOfButtons;

    public Mouse(int dpi, int numberOfButtons, String color, boolean isWireless, String name, int prize, String itemCode, int stocks, ImageIcon image) {
        super(color, isWireless, name, prize, itemCode, stocks, image);
        this.dpi = dpi;
        this.numberOfButtons = numberOfButtons;
    }

    
}
