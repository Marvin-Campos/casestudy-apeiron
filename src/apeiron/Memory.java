
package apeiron;

import javax.swing.ImageIcon;

public class Memory extends Component {
    private int memoryCapacity;
    private String dataRate;
    private int ramSpeed;

    public Memory(int memoryCapacity, String dataRate, int ramSpeed, boolean isOverclockable, boolean hasRGB, String name, int prize, String itemCode, int stocks, ImageIcon image) {
        super(isOverclockable, hasRGB, name, prize, itemCode, stocks, image);
        this.memoryCapacity = memoryCapacity;
        this.dataRate = dataRate;
        this.ramSpeed = ramSpeed;
    }
    
    
}
