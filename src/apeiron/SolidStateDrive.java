
package apeiron;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SolidStateDrive extends Storage {
    private String formFactor;
    private String interface_;

    public SolidStateDrive(String formFactor, String interface_, int storageCapacity, boolean isOverclockable, boolean hasRGB, String name, int prize, String itemCode, int stocks, ImageIcon image) {
        super(storageCapacity, isOverclockable, hasRGB, name, prize, itemCode, stocks, image);
        this.formFactor = formFactor;
        this.interface_ = interface_;
    }
    
    @Override
    public JPanel getDesc() {
        JPanel descPanel = new JPanel();
        descPanel.setLayout(new BoxLayout(descPanel, BoxLayout.PAGE_AXIS));
        
        JLabel text3 = new JLabel ("Capacity: " + storageCapacity + "GB");
        JLabel text1 = new JLabel("Form Factor:  " + formFactor); // This is M.2, 2.5 inch or nVME
        JLabel text2 = new JLabel("Interface: " + interface_); // This is PCIE x16 or SATA
        
        descPanel.add(text3);
        descPanel.add(text1);
        descPanel.add(text2);
        
        return descPanel;
    }
    
    
}
