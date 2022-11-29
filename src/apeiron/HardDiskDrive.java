
package apeiron;

import javax.swing.ImageIcon;

public class HardDiskDrive extends Storage {
    private int revolutionPerMinute;

    public HardDiskDrive(int revolutionPerMinute, int storageCapacity, boolean isOverclockable, boolean hasRGB, String name, int prize, String itemCode, int stocks, ImageIcon image) {
        super(storageCapacity, isOverclockable, hasRGB, name, prize, itemCode, stocks, image);
        this.revolutionPerMinute = revolutionPerMinute;
    }
    
    
}
