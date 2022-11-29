
package apeiron;

import javax.swing.ImageIcon;

public class MechanicalKeyboard extends Keyboard {
    private String switchType;
    private String keyCapDesign;

    public MechanicalKeyboard(String switchType, String keyCapDesign, int keyboardSize, int numberOfKeys, String color, boolean isWireless, String name, int prize, String itemCode, int stocks, ImageIcon image) {
        super(keyboardSize, numberOfKeys, color, isWireless, name, prize, itemCode, stocks, image);
        this.switchType = switchType;
        this.keyCapDesign = keyCapDesign;
    }
    
    
}
