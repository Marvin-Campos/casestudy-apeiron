
package apeiron;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Mouse extends Peripheral {
    protected int dpi;
    protected int numberOfButtons; // Set this to protected so child class has access

    public Mouse(int dpi, int numberOfButtons, String color, boolean isWireless, String name, int prize, String itemCode, int stocks, ImageIcon image) {
        super(color, isWireless, name, prize, itemCode, stocks, image);
        this.dpi = dpi;
        this.numberOfButtons = numberOfButtons;
    }
    
}
