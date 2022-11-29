
package apeiron;

import java.awt.Dimension;
import javax.swing.ImageIcon;

public class Webcam extends Peripheral {
    private Dimension resolution;
    private Dimension aspectRatio;

    public Webcam(Dimension resolution, Dimension aspectRatio, String color, boolean isWireless, String name, int prize, String itemCode, int stocks, ImageIcon image) {
        super(color, isWireless, name, prize, itemCode, stocks, image);
        this.resolution = resolution;
        this.aspectRatio = aspectRatio;
    }
    
    
}
