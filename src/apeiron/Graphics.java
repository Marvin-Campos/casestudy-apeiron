
package apeiron;

import javax.swing.ImageIcon;

public class Graphics extends Component{
    private int coreCount;
    private int coreClockSpeed;
    private int memorySize;

    public Graphics(int coreCount, int coreClockSpeed, int memorySize, boolean isOverclockable, boolean hasRGB, String name, int prize, String itemCode, int stocks, ImageIcon image) {
        super(isOverclockable, hasRGB, name, prize, itemCode, stocks, image);
        this.coreCount = coreCount;
        this.coreClockSpeed = coreClockSpeed;
        this.memorySize = memorySize;
    }
    
    
}
