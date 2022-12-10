
package apeiron;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MembraneKeyboard extends Keyboard {
    private boolean isComputerShopCompatible;
    private boolean isOfficeCompatible;

    public MembraneKeyboard(boolean isComputerShopCompatible, boolean isOfficeCompatible, int keyboardSize, String color, boolean isWireless, String name, int prize, String itemCode, int stocks, ImageIcon image) {
        super(keyboardSize, color, isWireless, name, prize, itemCode, stocks, image);
        this.isComputerShopCompatible = isComputerShopCompatible;
        this.isOfficeCompatible = isOfficeCompatible;
    }

            @Override
    public JPanel getDesc() {
        super.description = color + " " + keyboardSize + " % Membrane Keyboard Keyboard: For Comshop, " + isComputerShopCompatible + " For Office Work: " + isOfficeCompatible;
        
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
        descPanel.add(text1);
     
        if (isComputerShopCompatible == true) {
            JLabel text3 = new JLabel("ComShop Ready");
            descPanel.add(text3);
        }
        if (isOfficeCompatible == true) {
            JLabel text4 = new JLabel("Office Ready");
            descPanel.add(text4);
        }
        
        return descPanel;
    }
    
}
