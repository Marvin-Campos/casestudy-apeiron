package apeiron;

import java.awt.*;
import javax.swing.*;

public class Cart extends Values {

    JFrame cartWindow = new JFrame("Cart");
    JPanel cartPanel = new JPanel();
    
    PC_Parts[] items;

    public Cart() {
        run();
    }
    
    public Cart(PC_Parts[] items) {
        this.items = items;
        run();
    }

    private void run() {
        cartWindow.setSize(windowSize);
        cartWindow.setIconImage(apeironIcon.getImage());
        cartWindow.setResizable(false);
        cartWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cartPanel.setLayout(new BoxLayout(cartPanel, BoxLayout.PAGE_AXIS));
        cartPanel.setBorder(BorderFactory.createLineBorder(colorTest, 20));
        cartPanel.setBorder(BorderFactory.createMatteBorder(0, 20, 20, 20, colorTest));
        cartWindow.add(cartPanel);

        cartPanelSetup();

        cartWindow.setVisible(true);
    }

    private void cartPanelSetup() {
        JLabel orderFormText = textSetup("CART", mediumFontBold);
        JLabel orderFormSubtext = textSetup("CONFIRM YOUR BASKET", smallFontPlain);

        JPanel apeironTextPanel = textSetupWithPanel("APEIRON", mediumFontPlain);
        apeironTextPanel.setMaximumSize(new Dimension(1920, 10));
        apeironTextPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        
        JPanel itemAttributeGrid = itemAttributeGrid();
        
//        JScrollPane cartItemsPanel = cartItemsPanelSetup();

        cartPanel.add(orderFormText);
        cartPanel.add(orderFormSubtext);
        cartPanel.add(apeironTextPanel);
        cartPanel.add(itemAttributeGrid);
    }
    
    private JPanel itemAttributeGrid() {
        JPanel itemAttributeGridPanel = new JPanel();
        itemAttributeGridPanel.setLayout(new GridLayout(1, 5));
//        itemAttributeGridPanel.setMaximumSize(new Dimension(200, 200));
        itemAttributeGridPanel.setBorder(BorderFactory.createMatteBorder(0,5,5,5, Color.BLACK));
        
        JPanel itemCodeText = textSetupWithPanel("ITEM CODE", mediumFontPlain);
        
        JPanel quantityText = textSetupWithPanel("QUANTITY", mediumFontPlain);
        JPanel itemDescText = textSetupWithPanel("ITEM DESCRIPTION", mediumFontPlain);
        JPanel priceText = textSetupWithPanel("PRICE", mediumFontPlain);
        JPanel amountText = textSetupWithPanel("AMOUNT", mediumFontPlain);
        
        itemAttributeGridPanel.add(itemCodeText);
        itemAttributeGridPanel.add(quantityText);
        itemAttributeGridPanel.add(itemDescText);
        itemAttributeGridPanel.add(priceText);
        itemAttributeGridPanel.add(amountText);
        
        return itemAttributeGridPanel;
    }
    
    private JScrollPane cartItemsPanelSetup() {
        JPanel itemGrid = new JPanel(new GridBagLayout());
        JScrollPane itemGridPanel = new JScrollPane(itemGrid, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(20, 20, 20, 20);

        int itemCounter = 1;
        for (int i = 1; i <= 30; i++) { //i = number of rows       
            for (int j = 1; j <= 3; j++) { //j = number of columns

                JPanel item = new JPanel();
                item.setLayout(new BoxLayout(item, BoxLayout.PAGE_AXIS));

                JButton itemImageButton = new JButton(imageIconResize(apeironIcon, 100, 100));
                
                JLabel itemCounterLabel = new JLabel("Item " + itemCounter);

                item.add(itemImageButton);
                item.add(itemCounterLabel);
                itemCounter++;

                gbc.gridx = j;
                gbc.gridy = i;
                itemGrid.add(item, gbc);
            }
        }
        return itemGridPanel;
    }
}
