package apeiron;

import java.lang.reflect.Field;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PC_Parts {

    private String name;
    protected int prize;
    private String description = "";
    private String itemCode;
    private int stocks; //attribute might not be use
    private ImageIcon image;

    public PC_Parts(String name, int prize, String itemCode, int stocks, ImageIcon image) {
        this.name = name;
        this.prize = prize;
        this.itemCode = itemCode;
        this.stocks = stocks;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public int getPrize() {
        return prize;
    }
    

    public ImageIcon getImage() {
        return image;
    }

    public JPanel getDesc() {
        return new JPanel();
    }

    public String getItemCode() {
        return itemCode;
    }
    
    
}
