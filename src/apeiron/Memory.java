
package apeiron;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

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
    
    @Override
    public JPanel getDesc() {
        
        super.description = ramSpeed + "MHz " + memoryCapacity + "GB " + dataRate + " RAM: Overclock Ready, " + isOverclockable + "; RGB," + hasRGB; 
        
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
        
        JLabel text1 = new JLabel("Capacity: " + memoryCapacity + "GB " + dataRate);
        JLabel text2 = new JLabel("RAM Speed: " + ramSpeed + "MHz");
        
        descPanel.add(text1);
        descPanel.add(text2);
        
        return descPanel;
    }
    
    
}
