package apeiron;

import java.awt.*;
import java.util.Arrays;
import java.util.Vector;
import javax.swing.*;

public class OrderForm extends Values {

    JFrame orderFormWindow = new JFrame("Order Form");
    JPanel orderFormPanel = new JPanel();

    PC_Parts[] items;
    public OrderForm() {
        run();
    }

    public OrderForm(PC_Parts[] items) {
        this.items = items;
        run();
    }
    
    private void tanunginAngCustomer() {
        
    }
    
    private void run() {
        orderFormWindow.setSize(windowSize);
        orderFormWindow.setIconImage(apeironIcon.getImage());
        orderFormWindow.setResizable(false);
        orderFormWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        orderFormPanel.setLayout(new BoxLayout(orderFormPanel, BoxLayout.PAGE_AXIS));
        orderFormPanel.setBorder(BorderFactory.createLineBorder(colorTest, 20));
        orderFormPanel.setBorder(BorderFactory.createMatteBorder(0, 20, 20, 20, colorTest));
        orderFormWindow.add(orderFormPanel);

        orderFormPanelSetup();

        orderFormWindow.setVisible(true);
    }

    private void orderFormPanelSetup() {
        JLabel orderFormText = textSetup("CART", mediumFontBold);
        JLabel orderFormSubtext = textSetup("CONFIRM YOUR BASKET", smallFontPlain);

        JLabel apeironTextPanel = textSetup("APEIRON", mediumFontPlain);
        apeironTextPanel.setBorder(BorderFactory.createLineBorder(Color.BLUE, 5));

        JScrollPane table = cartTableSetup();

        orderFormPanel.add(orderFormText);
        orderFormPanel.add(orderFormSubtext);
        orderFormPanel.add(apeironTextPanel);
        orderFormPanel.add(table);
    }
    
     private JScrollPane cartTableSetup() {
         System.out.println(items.length);
         String[][] data = new String[items.length][3];
         
         int i = 0;
         for (PC_Parts item : items) {
             data[i][0] = item.getName();
             data[i][1] = item.getItemCode();
             data[i][2] = String.valueOf(item.getPrize());
             
             i++;
         }
         
//         for (String[] d : data) {
//             System.out.print(d[0] + ", ");
//             System.out.print(d[1] + ", ");
//             System.out.print(d[2]);
//             System.out.println("");
//         }
        
        String column[] = {"NAME", "ITEM CODE", "PRICE"};
        JTable table = new JTable(data, column);
//        table.setBorder(BorderFactory.createLineBorder(Color.BLUE, 5));
        
        JScrollPane sp = new JScrollPane(table);
        return sp;
    }

}
