
package apeiron;

import java.awt.Dimension;
import javax.swing.ImageIcon;

public class Monitor extends Peripheral {
    private int sizeInInches;
    private Dimension resolution;
    private int refreshRate;
    private String displayType;

    public Monitor(int sizeInInches, Dimension resolution, int refreshRate, String displayType, String color, boolean isWireless, String name, int prize, String itemCode, int stocks, ImageIcon image) {
        super(color, isWireless, name, prize, itemCode, stocks, image);
        this.sizeInInches = sizeInInches;
        this.resolution = resolution;
        this.refreshRate = refreshRate;
        this.displayType = displayType;
    }
    
    
}
