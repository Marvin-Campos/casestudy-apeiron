package apeiron;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;  
import java.util.Vector;

public class MenuPage extends Values{

    //Sample Items
    Processor processor1 = new Processor(2, 4, true, true, "Intel Core I9", 3000, "12345", 1, new ImageIcon(resourcesFolder + "\\processor1.png"));
    IntegratedGraphicsProcessor processor2 = new IntegratedGraphicsProcessor(3, 3, 6, 2, 4, true, true, "AMD", 3000, "12345", 1, new ImageIcon(resourcesFolder + "\\processor1.png"));
    Processor processor3 = new Processor(2, 4, true, true, "SP 03-301P", 3000, "12345", 1, new ImageIcon(resourcesFolder + "\\processor1.png"));
    IntegratedGraphicsProcessor processor4 = new IntegratedGraphicsProcessor(2, 4, 8, 2, 4, true, true, "Ligma Processor", 3000, "12345", 1, new ImageIcon(resourcesFolder + "\\processor1.png"));
    Processor processor5 = new Processor(2, 4, true, true, "Apeiron Premium", 3000, "12345", 1, new ImageIcon(resourcesFolder + "\\processor1.png"));
    
    Graphics gpu1 = new Graphics(2, 3, 8, true, true, "RTX 3060", 27000, "B1-2000", 1, new ImageIcon(resourcesFolder + "\\aust.png"));
    Graphics gpu2 = new Graphics(2, 3, 8, true, true, "Maangas na GPU", 27000, "B1-2000", 1, new ImageIcon(resourcesFolder + "\\marvs.png"));
    Graphics gpu3 = new Graphics(2, 3, 8, true, true, "RTX 3060", 27000, "B1-2000", 1, new ImageIcon(resourcesFolder + "\\aust.png"));
    Graphics gpu4 = new Graphics(2, 3, 8, true, true, "Maangas na GPU", 27000, "B1-2000", 1, new ImageIcon(resourcesFolder + "\\marvs.png"));
    Graphics gpu5 = new Graphics(2, 3, 8, true, true, "RTX 3060", 27000, "B1-2000", 1, new ImageIcon(resourcesFolder + "\\aust.png"));
    
    Webcam wc1 = new Webcam("1920x1080", "16:9", "Black", false, "SP-Tech K301P", 4700, "XM-1014", 1, new ImageIcon(resourcesFolder + "\\webcam1.png"));
    Webcam wc2 = new Webcam("1920x1080", "16:9", "Black", false, "SP-Tech K301P", 4700, "XM-1014", 1, new ImageIcon(resourcesFolder + "\\webcam1.png"));
    Webcam wc3 = new Webcam("1920x1080", "16:9", "Black", false, "SP-Tech K301P", 4700, "XM-1014", 1, new ImageIcon(resourcesFolder + "\\webcam1.png"));
    Webcam wc4 = new Webcam("1920x1080", "16:9", "Black", false, "SP-Tech K301P", 4700, "XM-1014", 1, new ImageIcon(resourcesFolder + "\\webcam1.png"));
    Webcam wc5 = new Webcam("1920x1080", "16:9", "Black", false, "SP-Tech K301P", 4700, "XM-1014", 1, new ImageIcon(resourcesFolder + "\\webcam1.png"));
    
    OfficeMouse m1 = new OfficeMouse("Ball", 1600, 3, "Black", false, "RT MX Quiet", 700, "JB-87000", 1, new ImageIcon(resourcesFolder + "\\officeMouse.jpg"));
    GamingMouse m2 = new GamingMouse(130, false, 800, 5, "White", true, "Apeiron MOU5", 2800, "EY-69420", 1, new ImageIcon(resourcesFolder + "\\gamingMouse.jpg"));
    OfficeMouse m3 = new OfficeMouse("Ball", 1600, 3, "Black", false, "RT MX Quiet", 700, "JB-87000", 1, new ImageIcon(resourcesFolder + "\\officeMouse.jpg"));
    GamingMouse m4 = new GamingMouse(130, false, 800, 5, "White", true, "Apeiron MOU5", 2800, "EY-69420", 1, new ImageIcon(resourcesFolder + "\\gamingMouse.jpg"));
    OfficeMouse m5 = new OfficeMouse("Ball", 1600, 3, "Black", false, "RT MX Quiet", 700, "JB-87000", 1, new ImageIcon(resourcesFolder + "\\officeMouse.jpg"));
    
    MechanicalKeyboard kb1 = new MechanicalKeyboard("MX Cherry Reds", "Japanese", 70, "Pink", true, "Sakura 3P1C", 4700, "JP-2022", 1, new ImageIcon(resourcesFolder + "\\mechkb1.jfif"));
    MembraneKeyboard kb2 = new MembraneKeyboard(true, true, 100, "Black", false, "Generica MK1000", 800, "KK-1933", 1, new ImageIcon(resourcesFolder + "\\memkb1.jpg"));
    MechanicalKeyboard kb3 = new MechanicalKeyboard("MX Cherry Reds", "Japanese", 70, "Pink", true, "Sakura 3P1C", 4700, "JP-2022", 1, new ImageIcon(resourcesFolder + "\\mechkb1.jfif"));
    MembraneKeyboard kb4 = new MembraneKeyboard(true, true, 100, "Black", false, "Generica MK1000", 800, "KK-1933", 1, new ImageIcon(resourcesFolder + "\\memkb1.jpg"));
    MechanicalKeyboard kb5 = new MechanicalKeyboard("MX Cherry Reds", "Japanese", 70, "Pink", true, "Sakura 3P1C", 4700, "JP-2022", 1, new ImageIcon(resourcesFolder + "\\mechkb1.jfif"));
    
    Monitor mon1 = new Monitor(24, "1920x1080", 144, "VA Panel", "Red", false, "APR K13981", 13000, "PR-83167", 1, new ImageIcon(resourcesFolder + "\\monitor1.jpg"));
    Monitor mon2 = new Monitor(24, "1920x1080", 144, "VA Panel", "Red", false, "APR K13981", 13000, "PR-83167", 1, new ImageIcon(resourcesFolder + "\\monitor1.jpg"));
    Monitor mon3 = new Monitor(24, "1920x1080", 144, "VA Panel", "Red", false, "APR K13981", 13000, "PR-83167", 1, new ImageIcon(resourcesFolder + "\\monitor1.jpg"));
    Monitor mon4 = new Monitor(24, "1920x1080", 144, "VA Panel", "Red", false, "APR K13981", 13000, "PR-83167", 1, new ImageIcon(resourcesFolder + "\\monitor1.jpg"));
    Monitor mon5 = new Monitor(24, "1920x1080", 144, "VA Panel", "Red", false, "APR K13981", 13000, "PR-83167", 1, new ImageIcon(resourcesFolder + "\\monitor1.jpg"));
    
    Chassis ch1 = new Chassis("ATX", true, false, 7, "White", false, "ARCTIC 0N4", 3400, "GE-0520", 1, new ImageIcon(resourcesFolder + "\\chassis1.jpg") );
    Chassis ch2 = new Chassis("ATX", true, false, 7, "White", false, "ARCTIC 0N4", 3400, "GE-0520", 1, new ImageIcon(resourcesFolder + "\\chassis1.jpg") );
    Chassis ch3 = new Chassis("ATX", true, false, 7, "White", false, "ARCTIC 0N4", 3400, "GE-0520", 1, new ImageIcon(resourcesFolder + "\\chassis1.jpg") );
    Chassis ch4 = new Chassis("ATX", true, false, 7, "White", false, "ARCTIC 0N4", 3400, "GE-0520", 1, new ImageIcon(resourcesFolder + "\\chassis1.jpg") );
    Chassis ch5 = new Chassis("ATX", true, false, 7, "White", false, "ARCTIC 0N4", 3400, "GE-0520", 1, new ImageIcon(resourcesFolder + "\\chassis1.jpg") );
    
    Motherboard mobo1 = new Motherboard("AM4", "mATX", true, true, true, "AOSTEN Z560m", 12000, "JL-092003", 1, new ImageIcon(resourcesFolder + "\\mobo1.png"));
    Motherboard mobo2 = new Motherboard("AM4", "mATX", true, true, true, "AOSTEN Z560m", 12000, "JL-092003", 1, new ImageIcon(resourcesFolder + "\\mobo1.png"));
    Motherboard mobo3 = new Motherboard("AM4", "mATX", true, true, true, "AOSTEN Z560m", 12000, "JL-092003", 1, new ImageIcon(resourcesFolder + "\\mobo1.png"));
    Motherboard mobo4 = new Motherboard("AM4", "mATX", true, true, true, "AOSTEN Z560m", 12000, "JL-092003", 1, new ImageIcon(resourcesFolder + "\\mobo1.png"));
    Motherboard mobo5 = new Motherboard("AM4", "mATX", true, true, true, "AOSTEN Z560m", 12000, "JL-092003", 1, new ImageIcon(resourcesFolder + "\\mobo1.png"));
    
    Memory ram1 = new Memory(8, "DDR5", 3200, false, true, "MarvinX Fury", 2100, "MV-1973", 1, new ImageIcon(resourcesFolder + "\\ram1.jfif") );
    Memory ram2 = new Memory(8, "DDR5", 3200, false, true, "MarvinX Fury", 2100, "MV-1973", 1, new ImageIcon(resourcesFolder + "\\ram1.jfif") );
    Memory ram3 = new Memory(8, "DDR5", 3200, false, true, "MarvinX Fury", 2100, "MV-1973", 1, new ImageIcon(resourcesFolder + "\\ram1.jfif") );
    Memory ram4 = new Memory(8, "DDR5", 3200, false, true, "MarvinX Fury", 2100, "MV-1973", 1, new ImageIcon(resourcesFolder + "\\ram1.jfif") );
    Memory ram5 = new Memory(8, "DDR5", 3200, false, true, "MarvinX Fury", 2100, "MV-1973", 1, new ImageIcon(resourcesFolder + "\\ram1.jfif") );
                    
    
    SolidStateDrive storage1 = new SolidStateDrive("NVMe", "PCIE-16x", 1000, false, false, "Ausvin 03301P", 6000, "AM-03301", 1,new ImageIcon(resourcesFolder + "\\ssd1.jpg"));
    HardDiskDrive storage2 = new HardDiskDrive(7200, 5000, false, false, "Ausvin 03301G", 2000, "BM-93391", 1, new ImageIcon(resourcesFolder + "\\ssd1.jpg"));
    SolidStateDrive storage3 = new SolidStateDrive("NVMe", "PCIE-16x", 1000, false, false, "Ausvin 03301P", 6000, "AM-03301", 1,new ImageIcon(resourcesFolder + "\\ssd1.jpg"));
    HardDiskDrive storage4 = new HardDiskDrive(7200, 5000, false, false, "Ausvin 03301G", 2000, "BM-93391", 1, new ImageIcon(resourcesFolder + "\\ssd1.jpg"));
    SolidStateDrive storage5 = new SolidStateDrive("NVMe", "PCIE-16x", 1000, false, false, "Ausvin 03301P", 6000, "AM-03301", 1,new ImageIcon(resourcesFolder + "\\ssd1.jpg"));
    
    PC_Parts[] items = {
        processor1, processor2, processor3, processor4, processor5, 
        gpu1, gpu2, gpu3, gpu4, gpu5,
        wc1, wc2, wc3, wc4, wc5, 
        m1, m2, m3, m4, m5,
        kb1, kb2, kb3, kb4, kb5,
        mon1, mon2, mon3, mon4, mon5, 
        ch1, ch2, ch3, ch4, ch5, 
        mobo1, mobo2, mobo3, mobo4, mobo5, 
        ram1, ram2, ram3, ram4, ram5, 
        storage1, storage2, storage3, storage4, storage5
    };
    
    // i feel like a real proggrammer would have a stroke reading this.
    
    JFrame menuPageWindow = new JFrame("Menu");
    JPanel menuPagePanel = new JPanel();
    JPanel itemPanel = new JPanel();
    
    // for sidePanel (Had to make them global variables so that filter and
    // unfilter methods could access these variables.
    
    JLabel peripherals = new JLabel("PERIPHERALS");
    JLabel filterPeripherals = new JLabel(" FILTER BY PERiPHERALS");
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

        itemPanelSetup(items);
        filterPanelSetup();

        menuPageWindow.setVisible(true);
    }

    private void itemPanelSetup(PC_Parts[] items) {
        itemPanel.removeAll();
        itemPanel.setLayout(new BoxLayout(itemPanel, BoxLayout.PAGE_AXIS));
        itemPanel.setPreferredSize(new Dimension(610, 100));
        itemPanel.setBackground(colorTest);
        menuPagePanel.add(itemPanel, BorderLayout.WEST);

        JLabel titleText = textSetup("APEIRON", mediumFontBold);

        JLabel itemFilterText = textSetup("ALL ITEMS BY CATEGORY", smallFontBold);

        JScrollPane itemGridPanel = itemGridPanelSetup_Real(items);

        itemPanel.add(titleText);
        itemPanel.add(itemFilterText);
        itemPanel.add(itemGridPanel);
        
        itemPanel.revalidate();
        itemPanel.repaint();
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

    

    private JScrollPane itemGridPanelSetup_Real(PC_Parts[] items) {

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
        
        filter.addActionListener((e) -> { filterButton();});
        unfilter.addActionListener((e) -> { unfilterButton();});
        
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

    Vector<PC_Parts> filteredItems = new Vector<PC_Parts>();
    
    //THIS FUNCTION IS SLOW. MORE ITEMS = MORE SLOWER
    private void filterButton(){
        filteredItems.clear();
        if (keyboard.isSelected()){
            System.out.println("Keyboard Selected.\n");
            for (PC_Parts item: items) {
                if(item instanceof Keyboard) { filteredItems.add(item); }
            }
        }
        if (webcam.isSelected()){
            System.out.println("Webcam Selected.\n");
            for (PC_Parts item: items) {
                if(item instanceof Webcam) { filteredItems.add(item); }
            }
        }
        if (chassis.isSelected()){
            System.out.println("Chassis Selected.\n");
            for (PC_Parts item: items) {
                if(item instanceof Chassis) { filteredItems.add(item); }
            }
        }
        if (monitor.isSelected()){
            System.out.println("Monitor Selected.\n");
            for (PC_Parts item: items) {
                if(item instanceof Monitor) { filteredItems.add(item); }
            }
        }
        if (mouse.isSelected()){
            System.out.println("Mouse Selected.\n");
            for (PC_Parts item: items) {
                if(item instanceof Mouse) { filteredItems.add(item); }
            }
        }
        if (cpu.isSelected()){
            System.out.println("CPU Selected.\n");
            for (PC_Parts item: items) {
                if(item instanceof Processor) { filteredItems.add(item); }
            }
        }
        if (gpu.isSelected()){
            System.out.println("GPU Selected.\n");
            for (PC_Parts item: items) {
                if(item instanceof Graphics) { filteredItems.add(item); }
            }
        }
        if (ram.isSelected()){
            System.out.println("RAM Selected.\n");
            for (PC_Parts item: items) {
                if(item instanceof Memory) { filteredItems.add(item); }
            }
        }
        if (storage.isSelected()){
            System.out.println("Storage Selected.\n");
            for (PC_Parts item: items) {
                if(item instanceof Storage) { filteredItems.add(item); }
            }
        }
        if (mobo.isSelected()){
            System.out.println("Motherboard Selected.\n");
            for (PC_Parts item: items) {
                if(item instanceof Motherboard) { filteredItems.add(item); }
            }
        }
        
        for(PC_Parts filteredItem : filteredItems) {
            System.out.println(filteredItem.getName());
        }
        
        if(filteredItems.isEmpty()) { unfilterButton();  return; }
        
        PC_Parts[] arrayFilteredItems = filteredItems.toArray(new PC_Parts[filteredItems.size()]);
        itemPanelSetup(arrayFilteredItems);
    }
    
    private void unfilterButton(){
        keyboard.setSelected(false);
        webcam.setSelected(false);
        chassis.setSelected(false);
        monitor.setSelected(false);
        mouse.setSelected(false);
        cpu.setSelected(false);
        gpu.setSelected(false);
        ram.setSelected(false);
        storage.setSelected(false);
        mobo.setSelected(false);
        
        itemPanelSetup(items);
    }
    
}
