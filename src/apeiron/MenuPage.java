package apeiron;

import java.awt.*;
import javax.swing.*;

public class MenuPage extends Values {

    JFrame menuPageWindow = new JFrame("Menu");
    JPanel menuPagePanel = new JPanel();

    public MenuPage() {
        run();
    }

    private void run() {
        menuPageWindow.setSize(windowSize);
        menuPageWindow.setIconImage(apeironIcon.getImage());
        menuPageWindow.setResizable(false);
        menuPageWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        menuPagePanel.setLayout(new BorderLayout());
        menuPagePanel.setBorder(BorderFactory.createLineBorder(colorTest, 20));
        menuPageWindow.add(menuPagePanel);

        itemPanelSetup();
        filterPanelSetup();

        menuPageWindow.setVisible(true);
    }

    private void itemPanelSetup() {
        JPanel itemPanel = new JPanel();
        itemPanel.setLayout(new BoxLayout(itemPanel, BoxLayout.PAGE_AXIS));
        itemPanel.setPreferredSize(new Dimension(600, 100));
        itemPanel.setBackground(Color.ORANGE);
        menuPagePanel.add(itemPanel, BorderLayout.WEST);

        JLabel titleText = textSetup("APEIRON", mediumFontBold);
        
        JLabel itemFilterText = textSetup("ALL ITEMS BY CATEGORY", smallFontBold);
        
        JScrollPane itemGridPanel = itemGridPanelSetup();
        
        itemPanel.add(titleText);
        itemPanel.add(itemFilterText);
        itemPanel.add(itemGridPanel);
    }

    //WIP
    private JScrollPane itemGridPanelSetup() {

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

    private void filterPanelSetup() {
        JPanel filterPanel = new JPanel();

        filterPanel.setPreferredSize(new Dimension(300, 100));
        filterPanel.setBackground(Color.GREEN);
        menuPagePanel.add(filterPanel, BorderLayout.EAST);
    }
}
