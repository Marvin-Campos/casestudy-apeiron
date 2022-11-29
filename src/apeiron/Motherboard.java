
package apeiron;

import javax.swing.ImageIcon;

public class Motherboard extends Component {
    private String socketType;
    private String motherboardSize;
    private boolean hasWifiConnectivity;

    public Motherboard(String socketType, String motherboardSize, boolean hasWifiConnectivity, boolean isOverclockable, boolean hasRGB, String name, int prize, String itemCode, int stocks, ImageIcon image) {
        super(isOverclockable, hasRGB, name, prize, itemCode, stocks, image);
        this.socketType = socketType;
        this.motherboardSize = motherboardSize;
        this.hasWifiConnectivity = hasWifiConnectivity;
    }
    
    
}
