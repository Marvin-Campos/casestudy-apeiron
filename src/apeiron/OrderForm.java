package apeiron;

import java.awt.*;
import java.util.Arrays;
import java.util.Vector;
import javax.swing.*;

public class OrderForm extends Values {

    JFrame orderFormWindow = new JFrame("Order Form");
    JPanel orderFormPanel = new JPanel();
    String name;

    PC_Parts[] items;

    public OrderForm() {
        run();
    }

    public OrderForm(PC_Parts[] items) {
        this.items = items;
        run();
    }

    private void tanunginAngCustomer() {
        name = JOptionPane.showInputDialog(null, "Please enter your customer name", "Customer Name", JOptionPane.QUESTION_MESSAGE);

        if (name == null || name.isEmpty()) {
            tanunginAngCustomer();
        }
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

        tanunginAngCustomer();
        System.out.println(name);
        orderFormPanelSetup();

        orderFormWindow.setVisible(true);
    }

    private void orderFormPanelSetup() {

        JLabel orderFormText = textSetup("CART", mediumFontBold);
        JLabel orderFormSubtext = textSetup("CONFIRM YOUR BASKET", smallFontPlain);
        JPanel infoPanel = infoPanelSetup();
//        JLabel apeironTextPanel = textSetup("APEIRON", mediumFontPlain);
//        apeironTextPanel.setBorder(BorderFactory.createLineBorder(Color.BLUE, 5));
        JScrollPane table = cartTableSetup();
        JPanel computationsPanel = computationsPanelSetup();

        orderFormPanel.add(orderFormText);
        orderFormPanel.add(orderFormSubtext);
        orderFormPanel.add(infoPanel);
//        orderFormPanel.add(apeironTextPanel);
        orderFormPanel.add(table);
        orderFormPanel.add(computationsPanel);
    }

    private JPanel infoPanelSetup() {
        JPanel infoPanel = new JPanel();

        JLabel customerName = textSetup("Customer Name: " + name, mediumFontBold);
        JLabel date = textSetup("Date: ", mediumFontBold);
        JLabel transactionNumber = textSetup("Transaction Number: ", mediumFontBold);

        infoPanel.add(customerName);
        infoPanel.add(date);
        infoPanel.add(transactionNumber);
        
        return infoPanel;
    }

    private JScrollPane cartTableSetup() {
        System.out.println(items.length);
        String[][] data = new String[items.length][6];

        int i = 0;
        for (PC_Parts item : items) {
            data[i][0] = item.getName();
            data[i][1] = item.getItemCode();
            data[i][2] = String.valueOf(item.quantity);
            data[i][3] = item.description;
            data[i][4] = "PHP " + item.getPrize();
            data[i][5] = "PHP " + item.quantity * item.getPrize();

            i++;
        }

//         for (String[] d : data) {
//             System.out.print(d[0] + ", ");
//             System.out.print(d[1] + ", ");
//             System.out.print(d[2]);
//             System.out.println("");
//         }
        String column[] = {"NAME", "ITEM CODE", "QUANTITY", "ITEM DESCRIPTION", "PRICE", "AMOUNT"};
        JTable table = new JTable(data, column);
        table.setEnabled(false);
        table.setFont(smallFontPlain);
//        table.setDefaultEditor(Object.class, null);
//        table.setEnabled(false);
//        table.setBorder(BorderFactory.createLineBorder(Color.BLUE, 5));

        JScrollPane sp = new JScrollPane(table);
        return sp;
    }

    private JPanel computationsPanelSetup() {
        JPanel computationsPanel = new JPanel();
        computationsPanel.setBorder(BorderFactory.createLineBorder(Color.BLUE, 5));
        JButton b = new JButton("ASD");
        computationsPanel.add(b);

        return computationsPanel;
    }

}
