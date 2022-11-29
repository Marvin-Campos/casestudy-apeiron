
package apeiron;

import javax.swing.ImageIcon;

public class MembraneKeyboard extends Keyboard {
    private boolean isComputerShopCompatible;
    private boolean isOfficeCompatible;

    public MembraneKeyboard(boolean isComputerShopCompatible, boolean isOfficeCompatible, int keyboardSize, int numberOfKeys, String color, boolean isWireless, String name, int prize, String itemCode, int stocks, ImageIcon image) {
        super(keyboardSize, numberOfKeys, color, isWireless, name, prize, itemCode, stocks, image);
        this.isComputerShopCompatible = isComputerShopCompatible;
        this.isOfficeCompatible = isOfficeCompatible;
    }

    
}
