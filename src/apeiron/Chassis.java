
package apeiron;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Chassis extends Peripheral {
    private String chassisSize;
    private boolean hasGlassSidePane;
    private boolean hasFrontPanelMesh;
    private int fanCapacity;

    public Chassis(String chassisSize, boolean hasGlassSidePane, boolean hasFrontPanelMesh, int fanCapacity, String color, boolean isWireless, String name, int prize, String itemCode, int stocks, ImageIcon image) {
        super(color, isWireless, name, prize, itemCode, stocks, image);
        this.chassisSize = chassisSize;
        this.hasGlassSidePane = hasGlassSidePane;
        this.hasFrontPanelMesh = hasFrontPanelMesh;
        this.fanCapacity = fanCapacity;
    }
   @Override
    public JPanel getDesc() {
        JPanel descPanel = new JPanel();
        descPanel.setLayout(new BoxLayout(descPanel, BoxLayout.PAGE_AXIS));
        
        
        JLabel price = new JLabel("Price: PHP " + prize);
        descPanel.add(price);
        
        
        JLabel text1 = new JLabel("Size Factor: " + chassisSize);
        if (hasGlassSidePane == true) {
            JLabel text2 = new JLabel("Glass Side ");
            descPanel.add(text2);
        }
        
        if (hasFrontPanelMesh == true) {
            JLabel text3 = new JLabel("Front Panel Mesh ");
            descPanel.add(text3);
        }
        
        JLabel text4 = new JLabel("Fan Capacity: " + fanCapacity);
        
        descPanel.add(text1);
        descPanel.add(text4);
        
        return descPanel;
    }
    
    
}
