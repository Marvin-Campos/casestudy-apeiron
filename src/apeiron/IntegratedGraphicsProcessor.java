
package apeiron;

import javax.swing.ImageIcon;

public class IntegratedGraphicsProcessor extends Processor {
    private int integratedCoreCount;
    private int integratedCoreClockSpeed;
    private int integratedMemorySize;

    public IntegratedGraphicsProcessor(int integratedCoreCount, int integratedCoreClockSpeed, int integratedMemorySize, int baseClockSpeed, int maxClockSpeed, boolean isOverclockable, boolean hasRGB, String name, int prize, String itemCode, int stocks, ImageIcon image) {
        super(baseClockSpeed, maxClockSpeed, isOverclockable, hasRGB, name, prize, itemCode, stocks, image);
        this.integratedCoreCount = integratedCoreCount;
        this.integratedCoreClockSpeed = integratedCoreClockSpeed;
        this.integratedMemorySize = integratedMemorySize;
    }
    
    
    
}
