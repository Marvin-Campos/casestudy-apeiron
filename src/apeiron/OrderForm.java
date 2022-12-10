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
        calculate();
        orderFormPanelSetup();

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

        String column[] = {"NAME", "ITEM CODE", "QUANTITY", "ITEM DESCRIPTION", "PRICE", "AMOUNT"};
        JTable table = new JTable(data, column);
        table.setEnabled(false);
        table.setFont(smallFontPlain);

        JScrollPane sp = new JScrollPane(table);
        return sp;
    }

    JLabel amountTenderedV = new JLabel("PHP " + this.amountTendered);
    JLabel changeV = new JLabel("PHP " + changeAmount);
    JButton b = new JButton("Return To Menu");
    JButton a = new JButton("Pay");

    private JPanel computationsPanelSetup() {
        JPanel computationsPanel = new JPanel();
        computationsPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

        BoxLayout boxLayout = new BoxLayout(computationsPanel, BoxLayout.Y_AXIS); // Box Layout
        computationsPanel.setLayout(boxLayout);

        computationsPanel.setLayout(new BoxLayout(computationsPanel, BoxLayout.Y_AXIS));
        computationsPanel.setPreferredSize(new Dimension(240, 200));

        JLabel totalAmount = new JLabel("Total Amount: ");
        JLabel vat = new JLabel("VAT: ");
        JLabel discount = new JLabel("Discount: ");
        JLabel grandTotalAmount = new JLabel("Grand Total Amount: ");
        JLabel amountTenderedText = new JLabel("Amount Tendered: ");
        JLabel changeText = new JLabel("Change: ");

        JLabel totalAmountV = new JLabel("PHP " + this.totalAmount);
        JLabel vatV = new JLabel("PHP " + VAT);
        JLabel discountV = new JLabel("PHP " + this.discount);
        JLabel grandTotalAmountV = new JLabel("PHP " + this.grandTotalAmount);

        b.addActionListener((e) -> {
            new MenuPage(this.items);
            orderFormWindow.dispose();
        });

        a.addActionListener((e) -> {
            pay();
        });

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
        gridArea.add(amountTenderedText);
        gridArea.add(amountTenderedV);
        gridArea.add(changeText);
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

    private void pay() {
        while (true) {
            try {
                String amountTenderedStr = JOptionPane.showInputDialog(null, "Please enter the amount", "Amount", JOptionPane.PLAIN_MESSAGE);
                amountTendered = Double.parseDouble(amountTenderedStr);
                if (amountTendered < grandTotalAmount) {
                    JOptionPane.showMessageDialog(null, "Payment amount must not be less than the grand total.", "Not enough payment", JOptionPane.ERROR_MESSAGE);
                    continue;
                } else {
                    amountTenderedV.setText(amountTenderedStr);
                    changeAmount = amountTendered - grandTotalAmount;
                    changeV.setText(String.valueOf(changeAmount));
                    
                    b.setEnabled(false);
                    a.setEnabled(false);
                    
                    JOptionPane.showMessageDialog(null, "Thank you " + name + " for shopping with us!", "THANK YOU", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }

            } catch (NumberFormatException nfe) {
                continue;
            } catch (NullPointerException npe) {
                break;
            }

        }
    }
}
