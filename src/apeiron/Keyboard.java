
package apeiron;

import javax.swing.ImageIcon;

public class Keyboard extends Peripheral {
    private int keyboardSize;
    private int numberOfKeys;

    public Keyboard(int keyboardSize, int numberOfKeys, String color, boolean isWireless, String name, int prize, String itemCode, int stocks, ImageIcon image) {
        super(color, isWireless, name, prize, itemCode, stocks, image);
        this.keyboardSize = keyboardSize;
        this.numberOfKeys = numberOfKeys;
    }
    
    
}
