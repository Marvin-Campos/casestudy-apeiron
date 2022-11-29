
package apeiron;

import javax.swing.ImageIcon;

public class SolidStateDrive extends Storage {
    private String formFactor;
    private String interface_;

    public SolidStateDrive(String formFactor, String interface_, int storageCapacity, boolean isOverclockable, boolean hasRGB, String name, int prize, String itemCode, int stocks, ImageIcon image) {
        super(storageCapacity, isOverclockable, hasRGB, name, prize, itemCode, stocks, image);
        this.formFactor = formFactor;
        this.interface_ = interface_;
    }
    
    
}
