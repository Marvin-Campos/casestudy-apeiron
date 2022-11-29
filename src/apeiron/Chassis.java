
package apeiron;

import javax.swing.ImageIcon;

public class Chassis extends Peripheral {
    private int chassisSize;
    private boolean hasGlassSidePane;
    private boolean hasFrontPanelMesh;
    private int fanCapacity;

    public Chassis(int chassisSize, boolean hasGlassSidePane, boolean hasFrontPanelMesh, int fanCapacity, String color, boolean isWireless, String name, int prize, String itemCode, int stocks, ImageIcon image) {
        super(color, isWireless, name, prize, itemCode, stocks, image);
        this.chassisSize = chassisSize;
        this.hasGlassSidePane = hasGlassSidePane;
        this.hasFrontPanelMesh = hasFrontPanelMesh;
        this.fanCapacity = fanCapacity;
    }
    
    
}
