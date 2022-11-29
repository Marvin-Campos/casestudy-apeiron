package apeiron;

import java.awt.*;
import java.lang.reflect.Field;
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
        itemPanel.setBackground(colorTest);
        menuPagePanel.add(itemPanel, BorderLayout.WEST);

        JLabel titleText = textSetup("APEIRON", mediumFontBold);

        JLabel itemFilterText = textSetup("ALL ITEMS BY CATEGORY", smallFontBold);

        JScrollPane itemGridPanel = itemGridPanelSetup_Real();

        itemPanel.add(titleText);
        itemPanel.add(itemFilterText);
        itemPanel.add(itemGridPanel);
    }

    //Populate itemgridpanel with items
    private JScrollPane itemGridPanelSetup_Populate() {
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

    //Sample Items
    Processor processor1 = new Processor(2, 4, true, true, "Intel Core I9", 3000, "12345", 1, new ImageIcon(resourcesFolder + "\\processor1.png"));
    Processor processor2 = new Processor(2, 4, true, true, "AMD", 3000, "12345", 1, new ImageIcon(resourcesFolder + "\\processor1.png"));
    Processor processor3 = new Processor(2, 4, true, true, "Superposition 03-301P", 3000, "12345", 1, new ImageIcon(resourcesFolder + "\\processor1.png"));
    Processor processor4 = new Processor(2, 4, true, true, "Ligma Processor", 3000, "12345", 1, new ImageIcon(resourcesFolder + "\\processor1.png"));
    PC_Parts[] items = {processor1, processor2, processor3, processor4};

    private JScrollPane itemGridPanelSetup_Real() {

        JPanel itemGrid = new JPanel(new GridBagLayout());
        JScrollPane itemGridPanel = new JScrollPane(itemGrid, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(20, 20, 20, 20);

        int columnCounter = 1;
        int rowCounter = 1;
        for (PC_Parts item : items) {
            JPanel itemPanel = new JPanel();
            itemPanel.setLayout(new BoxLayout(itemPanel, BoxLayout.PAGE_AXIS));

            JButton itemImageButton = new JButton(imageIconResize(item.getImage(), 100, 100));

            JLabel itemName = new JLabel(item.getName());
            itemName.setFont(mediumFontBold);

            JPanel itemDesc = item.getDesc();

            itemPanel.add(itemImageButton);
            itemPanel.add(itemName);
            itemPanel.add(itemDesc);

            gbc.gridx = columnCounter; //number of column
            gbc.gridy = rowCounter; //number of rows

            if (columnCounter < 3) {
                columnCounter++;
            } else { //reset column to 1 and go to next row
                columnCounter = 1;
                rowCounter++;
            }
            itemGrid.add(itemPanel, gbc);

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
