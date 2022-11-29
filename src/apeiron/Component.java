
package apeiron;

import javax.swing.ImageIcon;

public class Component extends PC_Parts {
    private boolean isOverclockable;
    private boolean hasRGB;

    public Component(boolean isOverclockable, boolean hasRGB, String name, int prize, String itemCode, int stocks, ImageIcon image) {
        super(name, prize, itemCode, stocks, image);
        this.isOverclockable = isOverclockable;
        this.hasRGB = hasRGB;
    }
    
    
}
