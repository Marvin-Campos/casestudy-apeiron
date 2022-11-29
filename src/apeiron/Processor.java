
package apeiron;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Processor extends Component {
    private int baseClockSpeed;
    private int maxClockSpeed;

    public Processor(int baseClockSpeed, int maxClockSpeed, boolean isOverclockable, boolean hasRGB, String name, int prize, String itemCode, int stocks, ImageIcon image) {
        super(isOverclockable, hasRGB, name, prize, itemCode, stocks, image);
        this.baseClockSpeed = baseClockSpeed;
        this.maxClockSpeed = maxClockSpeed;
    }

    
    @Override
    public JPanel getDesc() {
        JPanel descPanel = new JPanel();
        descPanel.setLayout(new BoxLayout(descPanel, BoxLayout.PAGE_AXIS));
        
        JLabel text1 = new JLabel("Base Clock Speed: " + baseClockSpeed);
        JLabel text2 = new JLabel("Max Clock Speed: " + maxClockSpeed);
        
        descPanel.add(text1);
        descPanel.add(text2);
        
        return descPanel;
    }
}
