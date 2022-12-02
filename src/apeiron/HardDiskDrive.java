
package apeiron;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HardDiskDrive extends Storage {
    private int revolutionPerMinute;

    public HardDiskDrive(int revolutionPerMinute, int storageCapacity, boolean isOverclockable, boolean hasRGB, String name, int prize, String itemCode, int stocks, ImageIcon image) {
        super(storageCapacity, isOverclockable, hasRGB, name, prize, itemCode, stocks, image);
        this.revolutionPerMinute = revolutionPerMinute;
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
        
        JLabel text1 = new JLabel ("Capacity: " + storageCapacity + "GB");
        JLabel text2 = new JLabel ("RPM: " + revolutionPerMinute + "RPM");
    
        descPanel.add(text1);
        descPanel.add(text2);
        
        return descPanel;
    }
        
    
}
