
package apeiron;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

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

    @Override
    public JPanel getDesc() {
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
        
        JLabel text1 = new JLabel("Core Count: " + coreCount);
        JLabel text2 = new JLabel("Clock Speed: " + coreClockSpeed);
        JLabel text3 = new JLabel("VRAM: " + memorySize);
        
        descPanel.add(text1);
        descPanel.add(text2);
        descPanel.add(text3);
        
        return descPanel;
    }
    

    
}
