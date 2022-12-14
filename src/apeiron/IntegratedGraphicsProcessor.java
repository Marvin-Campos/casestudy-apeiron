
package apeiron;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

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
    @Override
    public JPanel getDesc() {
        
        super.description = integratedCoreCount + " Cores " + integratedCoreClockSpeed + "GHz "
                + integratedMemorySize + "GB VRAM with " + baseClockSpeed + "GHz, " + maxClockSpeed + "GHZ Turbo Speed CPU";
        
        JPanel descPanel = new JPanel();
        descPanel.setLayout(new BoxLayout(descPanel, BoxLayout.PAGE_AXIS));
        JLabel price = new JLabel("Price: PHP " + prize);
        descPanel.add(price);
        if (isOverclockable==true) {
        JLabel oc = new JLabel("Can be overclocked.");
        descPanel.add(oc);
        }
        
        if (hasRGB==true) {
        JLabel oc = new JLabel("Has RGB Lighting.");
        descPanel.add(oc);
        }
        
        JLabel text1 = new JLabel("Base Clock Speed: " + baseClockSpeed + "GHz");
        JLabel text2 = new JLabel("Max Clock Speed: " + maxClockSpeed + "GHz");
        JLabel text3 = new JLabel("Int. Core Count: " + integratedCoreCount + "GHz");
        JLabel text4 = new JLabel("Max Clock Speed: " + integratedCoreClockSpeed + "GHz");
        JLabel text5 = new JLabel("VRAM: " + integratedMemorySize + "GB");
     
        descPanel.add(text1);
        descPanel.add(text2);
        descPanel.add(text3);
        descPanel.add(text4);
        descPanel.add(text5);
        
        return descPanel;
    }
    
}
