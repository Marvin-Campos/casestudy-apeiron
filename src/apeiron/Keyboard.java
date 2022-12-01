
package apeiron;

import javax.swing.ImageIcon;

public class Keyboard extends Peripheral {
    protected int keyboardSize; // me set protection for subclass baby 

    public Keyboard(int keyboardSize, String color, boolean isWireless, String name, int prize, String itemCode, int stocks, ImageIcon image) {
        super(color, isWireless, name, prize, itemCode, stocks, image);
        this.keyboardSize = keyboardSize;
        
    }
    
    
}
