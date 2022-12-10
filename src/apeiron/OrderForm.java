package apeiron;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Vector;
import javax.swing.*;

public class OrderForm extends Values {

    JFrame orderFormWindow = new JFrame("Order Form");
    JPanel orderFormPanel = new JPanel();
    String name;
    boolean isSeniorOrPWD;
    double totalAmount, grandTotalAmount, VAT, taxRate = 0.12, discount, discountRate = 0.2; //rates are according to maam's
    double amountTendered, changeAmount;

    PC_Parts[] items;

    public OrderForm() {
        run();
    }

    public OrderForm(PC_Parts[] items) {
        this.items = items;
        run();
    }

    private void tanunginAngCustomer() {

        
        while (true) {
            if (name == null || name.isEmpty()) {
                name = JOptionPane.showInputDialog(null, "Please enter your customer name", "Customer Name", JOptionPane.QUESTION_MESSAGE);
            } else {
                break;
            }
        }

        int response = JOptionPane.showConfirmDialog(null, "Are you a senior citizen or PWD?", "Senior Citizen/PWD", JOptionPane.YES_NO_OPTION);

        if (response == JOptionPane.YES_OPTION) {
            isSeniorOrPWD = true;
        } else {
            isSeniorOrPWD = false;
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
        orderFormPanelSetup();
        calculate();

        orderFormWindow.setVisible(true);
    }

    private void orderFormPanelSetup() {

        JLabel orderFormText = textSetup("CART", mediumFontBold);
        JLabel orderFormSubtext = textSetup("CONFIRM YOUR BASKET", smallFontPlain);
        JPanel infoPanel = infoPanelSetup();
        JScrollPane table = cartTableSetup();
        JPanel computationsPanel = computationsPanelSetup();

        orderFormPanel.add(orderFormText);
        orderFormPanel.add(orderFormSubtext);
        orderFormPanel.add(infoPanel);
        orderFormPanel.add(table);
        orderFormPanel.add(computationsPanel);
    }

    private JPanel infoPanelSetup() {
        JPanel infoPanel = new JPanel();
        infoPanel.setLayout(new BoxLayout(infoPanel, BoxLayout.X_AXIS));
//        infoPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

        JLabel customerName = textSetup("Customer Name: " + name, mediumFontBold);

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        JLabel dateText = textSetup("Date: " + formatter.format(date), mediumFontBold);

        int max = 10000;
        int min = 1000;
        int randomNum = (int) (Math.random() * (max - min + 1) + min);
        JLabel transactionNumber = textSetup("Transaction Number: " + randomNum, mediumFontBold);

        infoPanel.add(customerName);
        infoPanel.add(Box.createHorizontalGlue());
        infoPanel.add(dateText);
        infoPanel.add(Box.createHorizontalGlue());
        infoPanel.add(transactionNumber);

        return infoPanel;
    }

    private JScrollPane cartTableSetup() {
        System.out.println("Number of items: " + items.length);
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

        JScrollPane sp = new JScrollPane(table);
        return sp;
    }

    //Austin pls work here. Eto yung naka blue border
    private JPanel computationsPanelSetup() {
        JPanel computationsPanel = new JPanel();
        computationsPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
       
        BoxLayout boxLayout = new BoxLayout(computationsPanel, BoxLayout.Y_AXIS); // Box Layout
        computationsPanel.setLayout(boxLayout);

        computationsPanel.setLayout(new BoxLayout(computationsPanel, BoxLayout.Y_AXIS));
        computationsPanel.setPreferredSize(new Dimension(240, 200));

        // Just Putting These Here as Tests. Remove if necessary
        int totalAmountPHP = 193481;
        int vatPHP = 12;
        int discountPHP = 20;
        int grandTotalAmountPHP = 28472894;
        int amountTenderedPHP = 198491448;
        int changePHP = -4;
      

        
        JLabel totalAmount = new JLabel("Total Amount: ");
        JLabel vat = new JLabel("VAT: ");
        JLabel discount = new JLabel("Discount: ");
        JLabel grandTotalAmount = new JLabel("Grand Total Amount: ");
        JLabel amountTendered = new JLabel("Amount Tendered: ");
        JLabel change = new JLabel("Change: ");
        
        JLabel totalAmountV = new JLabel("PHP " + totalAmountPHP);
        JLabel vatV = new JLabel("PHP " + vatPHP);
        JLabel discountV = new JLabel("PHP " + discountPHP);
        JLabel grandTotalAmountV = new JLabel("PHP " + grandTotalAmountPHP);
        JLabel amountTenderedV = new JLabel("PHP " + amountTenderedPHP);
        JLabel changeV = new JLabel("PHP " + changePHP);

        
        JButton b = new JButton("Return To Cart");
        JButton a = new JButton("Pay");
        
        GridLayout gridLayout = new GridLayout(7, 2);
        JPanel gridArea = new JPanel(gridLayout);
        

        computationsPanel.add(gridArea);
        gridArea.add(totalAmount);
        gridArea.add(totalAmountV);
        gridArea.add(vat);
        gridArea.add(vatV);
        gridArea.add(discount);
        gridArea.add(discountV);
        gridArea.add(grandTotalAmount);
        gridArea.add(grandTotalAmountV);
        gridArea.add(amountTendered);
        gridArea.add(amountTenderedV);
        gridArea.add(change);
        gridArea.add(changeV);
        gridArea.add(b);
        gridArea.add(a);
        
        
        
        
        
        return computationsPanel;
    }

    private void calculate() {
        for (PC_Parts item : items) {
            totalAmount += item.quantity * item.prize;
        }
        
        if (isSeniorOrPWD == true) {
            discount = totalAmount * discountRate;
        } else {
            discount = 0;
        }

        VAT = (totalAmount - discount) * taxRate;

        grandTotalAmount = totalAmount + VAT - discount;

        System.out.println("Total Amount: " + totalAmount);
        System.out.println("Discount: " + discount);
        System.out.println("VAT: " + VAT);
        System.out.println("Grand Total Amount: " + grandTotalAmount);
    }

}
