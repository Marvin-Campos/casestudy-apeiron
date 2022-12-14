
package apeiron;

import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Processor extends Component {
    protected int baseClockSpeed;
    protected int maxClockSpeed;

    public Processor(int baseClockSpeed, int maxClockSpeed, boolean isOverclockable, boolean hasRGB, String name, int prize, String itemCode, int stocks, ImageIcon image) {
        super(isOverclockable, hasRGB, name, prize, itemCode, stocks, image);
        this.baseClockSpeed = baseClockSpeed;
        this.maxClockSpeed = maxClockSpeed;
    }

    
    @Override
    public JPanel getDesc() {
        super.description = baseClockSpeed + "GHz, " + maxClockSpeed + "GHZ Turbo Speed CPU";
        
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
        
        JLabel text1 = new JLabel("Base Clock Speed: " + baseClockSpeed + "GHz" );
        JLabel text2 = new JLabel("Max Clock Speed: " + maxClockSpeed + "GHz" );
        
        descPanel.add(text1);
        descPanel.add(text2);
        
        return descPanel;
    }
}
