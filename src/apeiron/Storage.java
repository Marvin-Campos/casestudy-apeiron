
package apeiron;

import javax.swing.ImageIcon;

public class Storage extends Component { 
    private int storageCapacity;

    public Storage(int storageCapacity, boolean isOverclockable, boolean hasRGB, String name, int prize, String itemCode, int stocks, ImageIcon image) {
        super(isOverclockable, hasRGB, name, prize, itemCode, stocks, image);
        this.storageCapacity = storageCapacity;
    }
    
    
}
