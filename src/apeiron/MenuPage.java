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
        menuPagePanel.setBackground(Color.white); // Austin added this because shit
        menuPageWindow.add(menuPagePanel);

        itemPanelSetup();
        filterPanelSetup();

        menuPageWindow.setVisible(true);
    }

    private void itemPanelSetup() {
        JPanel itemPanel = new JPanel();
        itemPanel.setLayout(new BoxLayout(itemPanel, BoxLayout.PAGE_AXIS));
        itemPanel.setPreferredSize(new Dimension(610, 100));
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
    Processor processor5 = new Processor(2, 4, true, true, "Apeiron Premium", 3000, "12345", 1, new ImageIcon(resourcesFolder + "\\processor1.png"));
    PC_Parts[] items = {processor1, processor2, processor3, processor4, processor5};

    private JScrollPane itemGridPanelSetup_Real() {

        JPanel itemGrid = new JPanel(new GridBagLayout());
        JScrollPane itemGridPanel = new JScrollPane(itemGrid, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

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
        BoxLayout boxLayout = new BoxLayout(filterPanel,BoxLayout.Y_AXIS); // Box Layout
        filterPanel.setLayout(boxLayout);
        filterPanel.setBackground(Color.WHITE);
        filterPanel.setPreferredSize(new Dimension(280, 1000));
        menuPagePanel.add(filterPanel, BorderLayout.EAST);
        
        JLabel peripherals = new JLabel("PERIPHERALS");
        JLabel filterPeripherals = new JLabel(" FILTER BY PERIPHERALS");
        JCheckBox keyboard = new JCheckBox ("KEYBOARD");
        JCheckBox webcam = new JCheckBox("WEBCAM");
        JCheckBox chassis = new JCheckBox("CHASSIS");
        JCheckBox monitor = new JCheckBox("MONITOR");
        JCheckBox mouse = new JCheckBox("MOUSE");
        JLabel components = new JLabel("COMPONENTS");
        JLabel filterComponents = new JLabel(" FILTER BY COMPONENTS");
        JCheckBox cpu = new JCheckBox("CPU");
        JCheckBox gpu = new JCheckBox("GPU");
        JCheckBox ram = new JCheckBox("RAM");
        JCheckBox storage = new JCheckBox("STORAGE");
        JCheckBox mobo = new JCheckBox("MOTHERBOARD");
        JButton filter = new JButton("                                     FILTER                                "); 
        JButton unfilter = new JButton("                                  UNFILTER                               "); 
        // I'm sorry for using such a crude solution to center the buttons HAHAHAHAHAHAAHA  
        JButton cart = new JButton("                                      CART                                   ");
       
        // SMALL DIVIDER
        ImageIcon dividerOneImg = new ImageIcon(resourcesFolder + "\\divider.png");
        dividerOneImg = imageIconResize(dividerOneImg, 2000, 10);
        JLabel dividerOne = new JLabel(dividerOneImg);
        
        ImageIcon dividerTwoImg = new ImageIcon(resourcesFolder + "\\divider.png");
        dividerTwoImg = imageIconResize(dividerTwoImg, 2000, 10);
        JLabel dividerTwo = new JLabel(dividerTwoImg);
        
        // PERIPHERALS (LARGE TEXT, BOLD)
        peripherals.setBounds(0,0,0,0);
        peripherals.setAlignmentX(JLabel.LEFT_ALIGNMENT);
        peripherals.setFont(largeFontBold);
        
        // FILTER BY PERIPHERLAS (SMALL TEXT)
        filterPeripherals.setFont(smallFontBold);
        
        // KEYBOARD (MEDIUM, CHECKBOX)
        keyboard.setOpaque(false);
        keyboard.setBounds(0,0,0,0);
        keyboard.setAlignmentX(JLabel.LEFT_ALIGNMENT);
        keyboard.setFont(smallFontPlain);
        
        // WEBCAM (MEDIUM, CHECKBOX)
        webcam.setOpaque(false);
        webcam.setBounds(0,0,0,0);
        webcam.setAlignmentX(JLabel.LEFT_ALIGNMENT);
        webcam.setFont(smallFontPlain);
        
        
        // CHASSIS (MEDIUM, CHECKBOX)
        chassis.setOpaque(false);
        chassis.setBounds(0,0,0,0);
        chassis.setAlignmentX(JLabel.LEFT_ALIGNMENT);
        chassis.setFont(smallFontPlain);
        
        // MONITOR (MEDIUM, CHECKBOX)
        monitor.setOpaque(false);
        monitor.setBounds(0,0,0,0);
        monitor.setAlignmentX(JLabel.LEFT_ALIGNMENT);
        monitor.setFont(smallFontPlain);
        
        // MOUSE (MEDIUM, CHECKBOX)
        mouse.setOpaque(false);
        mouse.setBounds(0,0,0,0);
        mouse.setAlignmentX(JLabel.LEFT_ALIGNMENT);
        mouse.setFont(smallFontPlain);
        
        // COMPONENTS (LARGE TEXT, BOLD)
        components.setBounds(0,0,0,0);
        components.setAlignmentX(JLabel.LEFT_ALIGNMENT);
        components.setFont(largeFontBold);
        
        
        // FILTER BY COMPONENTS (SMALL TEXT)
        filterComponents.setFont(smallFontBold);
        
        // CPU (MEDIUM, CHECKBOX)
        cpu.setOpaque(false);
        cpu.setBounds(0,0,0,0);
        cpu.setAlignmentX(JLabel.LEFT_ALIGNMENT);
        cpu.setFont(smallFontPlain);
        
        // GPU (MEDIUM, CHECKBOX)
        gpu.setOpaque(false);
        gpu.setBounds(0,0,0,0);
        gpu.setAlignmentX(JLabel.LEFT_ALIGNMENT);
        gpu.setFont(smallFontPlain);
        
        // RAM (MEDIUM, CHECKBOX)
        ram.setOpaque(false);
        ram.setBounds(0,0,0,0);
        ram.setAlignmentX(JLabel.LEFT_ALIGNMENT);
        ram.setFont(smallFontPlain);
        
        // STORAGE (MEDIUM, CHECKBOX)
        storage.setOpaque(false);
        storage.setBounds(0,0,0,0);
        storage.setAlignmentX(JLabel.LEFT_ALIGNMENT);
        storage.setFont(smallFontPlain);
        
        // MOBO (MEDIUM, CHECKBOX)
        mobo.setOpaque(false);
        mobo.setBounds(0,0,0,0);
        mobo.setAlignmentX(JLabel.LEFT_ALIGNMENT);
        mobo.setFont(smallFontPlain);
        
        // FILTER (JBUTTON) this isn't doing anything for some reason...
        filter.setOpaque(false);
        filter.setSize(50,50);
        
        // UNFILTER (JBUTTON) this one too....
        unfilter.setOpaque(false);
        unfilter.setSize(50,50);
        unfilter.setAlignmentX(JLabel.LEFT_ALIGNMENT);
        
        // CART (JBUTTON) and this one....
        cart.setOpaque(false);
        cart.setSize(50,50);

        // Implementation; sorry for long-ass code idk how to optimize this yet.
        
        filterPanel.add(peripherals);
        filterPanel.add(filterPeripherals);
        filterPanel.add(keyboard);
        filterPanel.add(webcam);
        filterPanel.add(chassis);
        filterPanel.add(monitor);
        filterPanel.add(mouse);
        filterPanel.add(dividerOne);
        filterPanel.add(components);
        filterPanel.add(filterComponents);
        filterPanel.add(cpu);
        filterPanel.add(gpu);
        filterPanel.add(ram);
        filterPanel.add(storage);
        filterPanel.add(mobo);
        filterPanel.add(dividerTwo);
        filterPanel.add(filter);
        filterPanel.add(unfilter);
        filterPanel.add(cart);
        
    }
}
