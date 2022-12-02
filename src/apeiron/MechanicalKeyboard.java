
package apeiron;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MechanicalKeyboard extends Keyboard {
    private String switchType;
    private String keyCapDesign;

    public MechanicalKeyboard(String switchType, String keyCapDesign, int keyboardSize, String color, boolean isWireless, String name, int prize, String itemCode, int stocks, ImageIcon image) {
        super(keyboardSize, color, isWireless, name, prize, itemCode, stocks, image);
        this.switchType = switchType;
        this.keyCapDesign = keyCapDesign;
    }
    
        @Override
    public JPanel getDesc() {
        JPanel descPanel = new JPanel();
        descPanel.setLayout(new BoxLayout(descPanel, BoxLayout.PAGE_AXIS));
        JLabel price = new JLabel("Price: PHP " + prize);
        descPanel.add(price);        
        JLabel colored = new JLabel("Color: " + color);
        descPanel.add(colored);
        
        if (isWireless==true) {
            JLabel wireless = new JLabel("Is a Wireless Device.");
            descPanel.add(wireless);
        }
        JLabel text1 = new JLabel("Keyboard Size: " + keyboardSize + "%");
        JLabel text3 = new JLabel("Switch: " + switchType);
        JLabel text4 = new JLabel("Keycap Design: " + keyCapDesign);
        
        
        descPanel.add(text1);
        descPanel.add(text3);
        descPanel.add(text4);
        
        
        return descPanel;
    }
    
    
}
