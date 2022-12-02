package apeiron;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Vector;

public class MenuPage extends Values {

    //Sample Items
    Processor processor1 = new Processor(2, 4, true, true, "Intel Core I9", 3000, "P1-091382", 1, new ImageIcon(resourcesFolder + "\\processor1.png"));
    IntegratedGraphicsProcessor processor2 = new IntegratedGraphicsProcessor(3, 3, 6, 2, 4, true, true, "HexaCore PRO", 3600, "P2-739817", 1, new ImageIcon(resourcesFolder + "\\processor2.jfif"));
    Processor processor3 = new Processor(999, 9999, true, true, "Superposition 301P", 301000, "P1-783191", 1, new ImageIcon(resourcesFolder + "\\processor3.jpg"));
    IntegratedGraphicsProcessor processor4 = new IntegratedGraphicsProcessor(2, 4, 8, 2, 4, true, true, "Ligma Processor", 3100, "P2-948291", 1, new ImageIcon(resourcesFolder + "\\processor4.jpg"));
    Processor processor5 = new Processor(2, 4, true, true, "Apeiron Premium", 5000, "P1-298121", 1, new ImageIcon(resourcesFolder + "\\processor5.jpg"));

    Graphics gpu1 = new Graphics(2, 3, 8, true, true, "STX 3060", 31000, "G1-306071", 1, new ImageIcon(resourcesFolder + "\\gpu1.jpg"));
    Graphics gpu2 = new Graphics(2, 3, 8, true, true, "LT 8931XT", 17000, "G1-472894", 1, new ImageIcon(resourcesFolder + "\\gpu2.jpg"));
    Graphics gpu3 = new Graphics(2, 3, 8, true, true, "ZTX 1992", 26000, "G1-938183", 1, new ImageIcon(resourcesFolder + "\\gpu3.jpg"));
    Graphics gpu4 = new Graphics(2, 3, 8, true, true, "PL 222ZT", 12000, "G1-534012", 1, new ImageIcon(resourcesFolder + "\\gpu4.jpg"));
    Graphics gpu5 = new Graphics(2, 3, 8, true, true, "MRV 3045AU", 22000, "G1-391831", 1, new ImageIcon(resourcesFolder + "\\gpu5.jpg"));

    Webcam wc1 = new Webcam("1920x1080", "16:9", "Black", false, "SP-Tech K301P", 1100, "W1-101400", 1, new ImageIcon(resourcesFolder + "\\webcam1.png"));
    Webcam wc2 = new Webcam("1920x1080", "16:9", "Black", false, "SP-Tech K301XT", 700, "W1-942424", 1, new ImageIcon(resourcesFolder + "\\webcam2.jpg"));
    Webcam wc3 = new Webcam("1920x1080", "16:9", "Black", false, "AP-RON CLEAR", 900, "W1-994124", 1, new ImageIcon(resourcesFolder + "\\webcam3.jpg"));
    Webcam wc4 = new Webcam("1920x1080", "16:9", "Black", false, "AP-RON BOXY", 800, "W1-993103", 1, new ImageIcon(resourcesFolder + "\\webcam4.jpg"));
    Webcam wc5 = new Webcam("1920x1080", "16:9", "Black", false, "SP-Tech KXXP", 750, "W1-993104", 1, new ImageIcon(resourcesFolder + "\\webcam5.jpg"));

    OfficeMouse m1 = new OfficeMouse("Ball", 1600, 3, "Black", false, "RT MX Quiet", 700, "M1-870000", 1, new ImageIcon(resourcesFolder + "\\officeMouse.jpg"));
    GamingMouse m2 = new GamingMouse(130, false, 800, 5, "White", true, "Apeiron MOU5", 2800, "M2-694200", 1, new ImageIcon(resourcesFolder + "\\gamingMouse.jpg"));
    OfficeMouse m3 = new OfficeMouse("Ball", 1600, 3, "Black", false, "RT MX OFFICE", 900, "M1-123456", 1, new ImageIcon(resourcesFolder + "\\officeMouse2.jpg"));
    GamingMouse m4 = new GamingMouse(130, false, 800, 5, "White", true, "APR MOU4 MINI", 2500, "M2-390123", 1, new ImageIcon(resourcesFolder + "\\gamingMouse2.jpg"));
    OfficeMouse m5 = new OfficeMouse("Ball", 1600, 3, "Black", false, "RT MINI ", 400, "M1-382932", 1, new ImageIcon(resourcesFolder + "\\officeMouse3.jpg"));

    MechanicalKeyboard kb1 = new MechanicalKeyboard("MX Cherry Reds", "Japanese", 70, "Pink", true, "Sakura 3P1C", 4700, "K1-209522", 1, new ImageIcon(resourcesFolder + "\\mechkb1.jfif"));
    MembraneKeyboard kb2 = new MembraneKeyboard(true, true, 100, "Black", false, "Generica MK1000", 800, "K2-193433", 1, new ImageIcon(resourcesFolder + "\\memkb1.jpg"));
    MechanicalKeyboard kb3 = new MechanicalKeyboard("MX Cherry Reds", "Japanese", 70, "Pink", true, "Taho P001x", 5700, "K1-275022", 1, new ImageIcon(resourcesFolder + "\\mechkb2.jpeg"));
    MembraneKeyboard kb4 = new MembraneKeyboard(true, true, 100, "Black", false, "Castom XP3103", 1200, "K2-193323", 1, new ImageIcon(resourcesFolder + "\\memkb2.jpg"));
    MechanicalKeyboard kb5 = new MechanicalKeyboard("MX Cherry Reds", "Japanese", 70, "Pink", true, "H3LLFIRE X", 6200, "K1-202542", 1, new ImageIcon(resourcesFolder + "\\mechkb3.jpg"));

    Monitor mon1 = new Monitor(24, "1920x1080", 144, "VA Panel", "Red", false, "APR K13981", 14000, "M3-831942", 1, new ImageIcon(resourcesFolder + "\\monitor1.jpg"));
    Monitor mon2 = new Monitor(24, "1920x1080", 144, "VA Panel", "Red", false, "SP1 POS-1", 15500, "M3-821367", 1, new ImageIcon(resourcesFolder + "\\monitor2.jpg"));
    Monitor mon3 = new Monitor(24, "1920x1080", 144, "VA Panel", "Red", false, "301X 918733", 17600, "M3-875167", 1, new ImageIcon(resourcesFolder + "\\monitor3.jpg"));
    Monitor mon4 = new Monitor(24, "1920x1080", 144, "VA Panel", "Red", false, "LOL LEGEND", 7000, "M3-831127", 1, new ImageIcon(resourcesFolder + "\\monitor4.jpg"));
    Monitor mon5 = new Monitor(24, "1920x1080", 144, "VA Panel", "Red", false, "APR MONIX", 13000, "M3-843167", 1, new ImageIcon(resourcesFolder + "\\monitor5.jpg"));

    Chassis ch1 = new Chassis("ATX", true, false, 7, "White", false, "ARCTIC 0N4", 6400, "C1-052538", 1, new ImageIcon(resourcesFolder + "\\chassis1.jpg"));
    Chassis ch2 = new Chassis("ATX", true, false, 7, "White", false, "BIG CHUNGUS", 1200, "C1-057650", 1, new ImageIcon(resourcesFolder + "\\chassis2.jpg"));
    Chassis ch3 = new Chassis("ATX", true, false, 7, "White", false, "SUS MACHINE", 3400, "C1-038520", 1, new ImageIcon(resourcesFolder + "\\chassis3.jpg"));
    Chassis ch4 = new Chassis("ATX", true, false, 7, "White", false, "FROZEN XP13", 2200, "C1-052024", 1, new ImageIcon(resourcesFolder + "\\chassis4.jpg"));
    Chassis ch5 = new Chassis("ATX", true, false, 7, "White", false, "POLAR ITYX", 7600, "C1-054520", 1, new ImageIcon(resourcesFolder + "\\chassis5.jpg"));

    Motherboard mobo1 = new Motherboard("AM4", "mATX", true, true, true, "AOSTEN Z560m", 12000, "M4-415000", 1, new ImageIcon(resourcesFolder + "\\mobo1.png"));
    Motherboard mobo2 = new Motherboard("AM4", "mATX", true, true, true, "MORBIU BG11x", 7000, "M4-031973", 1, new ImageIcon(resourcesFolder + "\\mobo2.jpg"));
    Motherboard mobo3 = new Motherboard("AM4", "mATX", true, true, true, "AOSTEN Y480m", 6900, "M4-058976", 1, new ImageIcon(resourcesFolder + "\\mobo3.jpg"));
    Motherboard mobo4 = new Motherboard("AM4", "mATX", true, true, true, "MORBIU BG12x", 5000, "M4-147924", 1, new ImageIcon(resourcesFolder + "\\mobo4.png"));
    Motherboard mobo5 = new Motherboard("AM4", "mATX", true, true, true, "AOSBIU 99XT", 8800, "M4-472740", 1, new ImageIcon(resourcesFolder + "\\mobo5.png"));

    Memory ram1 = new Memory(8, "DDR5", 3200, false, true, "MarvinX Fury", 2100, "R1-197753", 1, new ImageIcon(resourcesFolder + "\\ram1.jpg"));
    Memory ram2 = new Memory(8, "DDR5", 3200, false, true, "AustinY Ripper", 4400, "R1-152973", 1, new ImageIcon(resourcesFolder + "\\ram2.jpg"));
    Memory ram3 = new Memory(8, "DDR5", 3200, false, true, "Corvette Revenge", 1000, "R1-197352", 1, new ImageIcon(resourcesFolder + "\\ram3.jfif"));
    Memory ram4 = new Memory(8, "DDR5", 3200, false, true, "Lancer Spear", 3200, "R1-197843", 1, new ImageIcon(resourcesFolder + "\\ram4.jpg"));
    Memory ram5 = new Memory(8, "DDR5", 3200, false, true, "Picka Choo", 1100, "R1-194273", 1, new ImageIcon(resourcesFolder + "\\ram5.jpg"));

    SolidStateDrive storage1 = new SolidStateDrive("NVMe", "PCIE-16x", 1000, false, false, "Ausvin 03301P", 6200, "S1-0335301", 1, new ImageIcon(resourcesFolder + "\\ssd1.jpg"));
    HardDiskDrive storage2 = new HardDiskDrive(7200, 5000, false, false, "Ausvin 03301G", 1900, "S2-933961", 1, new ImageIcon(resourcesFolder + "\\hdd1.jpg"));
    SolidStateDrive storage3 = new SolidStateDrive("NVMe", "PCIE-16x", 1000, false, false, "Serra 41Large", 5800, "S1-0312301", 1, new ImageIcon(resourcesFolder + "\\ssd2.jpg"));
    HardDiskDrive storage4 = new HardDiskDrive(7200, 5000, false, false, "Ausvin 03301G", 2000, "S2-XX9141", 1, new ImageIcon(resourcesFolder + "\\hdd2.jpg"));
    SolidStateDrive storage5 = new SolidStateDrive("NVMe", "PCIE-16x", 1000, false, false, "Camps 1948xT", 7000, "S1-0330131", 1, new ImageIcon(resourcesFolder + "\\ssd3.jpg"));

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

    Vector<PC_Parts> filteredItems = new Vector<PC_Parts>();
    Vector<PC_Parts> selectedItems = new Vector<PC_Parts>();

    JFrame menuPageWindow = new JFrame("Menu");
    JPanel menuPagePanel = new JPanel();
    JPanel itemPanel = new JPanel();

    JLabel peripherals = new JLabel("PERIPHERALS");
    JLabel filterPeripherals = new JLabel(" FILTER BY PERiPHERALS");
    JCheckBox keyboard = new JCheckBox("KEYBOARD");
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
    JButton filter = new JButton("FILTER");
    JButton unfilter = new JButton("UNFILTER");
    // I'm sorry for using such a crude solution to center the buttons HAHAHAHAHAHAAHA  
    JButton checkOut = new JButton("CHECKOUT");
    JButton selectedItemsButton = new JButton("SELECTED ITEMS");

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

        JScrollPane itemGridPanel = itemGridPanelSetup_Real(items);

        itemPanel.add(titleText);
        itemPanel.add(itemGridPanel);

        itemPanel.revalidate();
        itemPanel.repaint();
    }

    //THIS FUNCTION IS SO SLOWWWWWWWWWWW
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

            JToggleButton itemImageButton = new JToggleButton(imageIconResize(item.getImage(), 100, 100));
            itemImageButton.addActionListener((e) -> {
                if (itemImageButton.isSelected()) {
                    selectedItems.add(item);
                } else {
                    selectedItems.remove(item);
                }
            });

            for (PC_Parts selectedItem : selectedItems) {
                if (item.getItemCode() == selectedItem.getItemCode()) {
                    itemImageButton.setSelected(true);
                }
            }

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

        BoxLayout boxLayout = new BoxLayout(filterPanel, BoxLayout.Y_AXIS); // Box Layout
        filterPanel.setLayout(boxLayout);

        filterPanel.setLayout(new BoxLayout(filterPanel, BoxLayout.Y_AXIS));
        filterPanel.setPreferredSize(new Dimension(280, 1));

        GridLayout gridLayout = new GridLayout(2, 2);
        JPanel middlePanel = new JPanel(gridLayout);
        middlePanel.setAlignmentX(JPanel.LEFT_ALIGNMENT);

        filterPanel.setBackground(Color.WHITE);

        menuPagePanel.add(filterPanel, BorderLayout.EAST);

        filter.addActionListener((e) -> {
            filterButton();
        });
        unfilter.addActionListener((e) -> {
            unfilterButton();
        });
        selectedItemsButton.addActionListener((e) -> {
            selectedItemButton();
        });

        filter.addActionListener((e) -> {
            filterButton();
        });
        unfilter.addActionListener((e) -> {
            unfilterButton();
        });
        selectedItemsButton.addActionListener((e) -> {
            selectedItemButton();
        });

        // SMALL DIVIDER
        ImageIcon dividerOneImg = new ImageIcon(resourcesFolder + "\\divider.png");
        dividerOneImg = imageIconResize(dividerOneImg, 2000, 10);
        JLabel dividerOne = new JLabel(dividerOneImg);

        ImageIcon dividerTwoImg = new ImageIcon(resourcesFolder + "\\divider.png");
        dividerTwoImg = imageIconResize(dividerTwoImg, 2000, 10);
        JLabel dividerTwo = new JLabel(dividerTwoImg);

        // PERIPHERALS (LARGE TEXT, BOLD)
        peripherals.setBounds(0, 0, 0, 0);
        peripherals.setAlignmentX(JLabel.LEFT_ALIGNMENT);
        peripherals.setFont(largeFontBold);

        // FILTER BY PERIPHERLAS (SMALL TEXT)
        filterPeripherals.setFont(smallFontBold);

        // KEYBOARD (MEDIUM, CHECKBOX)
        keyboard.setOpaque(false);
        keyboard.setBounds(0, 0, 0, 0);
        keyboard.setAlignmentX(JLabel.LEFT_ALIGNMENT);
        keyboard.setFont(smallFontPlain);

        // WEBCAM (MEDIUM, CHECKBOX)
        webcam.setOpaque(false);
        webcam.setBounds(0, 0, 0, 0);
        webcam.setAlignmentX(JLabel.LEFT_ALIGNMENT);
        webcam.setFont(smallFontPlain);

        // CHASSIS (MEDIUM, CHECKBOX)
        chassis.setOpaque(false);
        chassis.setBounds(0, 0, 0, 0);
        chassis.setAlignmentX(JLabel.LEFT_ALIGNMENT);
        chassis.setFont(smallFontPlain);

        // MONITOR (MEDIUM, CHECKBOX)
        monitor.setOpaque(false);
        monitor.setBounds(0, 0, 0, 0);
        monitor.setAlignmentX(JLabel.LEFT_ALIGNMENT);
        monitor.setFont(smallFontPlain);

        // MOUSE (MEDIUM, CHECKBOX)
        mouse.setOpaque(false);
        mouse.setBounds(0, 0, 0, 0);
        mouse.setAlignmentX(JLabel.LEFT_ALIGNMENT);
        mouse.setFont(smallFontPlain);

        // COMPONENTS (LARGE TEXT, BOLD)
        components.setBounds(0, 0, 0, 0);
        components.setAlignmentX(JLabel.LEFT_ALIGNMENT);
        components.setFont(largeFontBold);

        // FILTER BY COMPONENTS (SMALL TEXT)
        filterComponents.setFont(smallFontBold);

        // CPU (MEDIUM, CHECKBOX)
        cpu.setOpaque(false);
        cpu.setBounds(0, 0, 0, 0);
        cpu.setAlignmentX(JLabel.LEFT_ALIGNMENT);
        cpu.setFont(smallFontPlain);

        // GPU (MEDIUM, CHECKBOX)
        gpu.setOpaque(false);
        gpu.setBounds(0, 0, 0, 0);
        gpu.setAlignmentX(JLabel.LEFT_ALIGNMENT);
        gpu.setFont(smallFontPlain);

        // RAM (MEDIUM, CHECKBOX)
        ram.setOpaque(false);
        ram.setBounds(0, 0, 0, 0);
        ram.setAlignmentX(JLabel.LEFT_ALIGNMENT);
        ram.setFont(smallFontPlain);

        // STORAGE (MEDIUM, CHECKBOX)
        storage.setOpaque(false);
        storage.setBounds(0, 0, 0, 0);
        storage.setAlignmentX(JLabel.LEFT_ALIGNMENT);
        storage.setFont(smallFontPlain);

        // MOBO (MEDIUM, CHECKBOX)
        mobo.setOpaque(false);
        mobo.setBounds(0, 0, 0, 0);
        mobo.setAlignmentX(JLabel.LEFT_ALIGNMENT);
        mobo.setFont(smallFontPlain);

        // FILTER (JBUTTON) 
        filter.setOpaque(false);
        filter.setSize(50, 50);

        // UNFILTER (JBUTTON)
        unfilter.setOpaque(false);

        unfilter.setSize(50, 50);
        unfilter.setAlignmentX(JLabel.LEFT_ALIGNMENT);

        unfilter.setSize(50, 50);

        // CART (JBUTTON)
        checkOut.setOpaque(false);
        checkOut.setSize(50, 50);
        checkOut.addActionListener((e) -> {
            checkOutButton();
        });

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
        filterPanel.add(selectedItemsButton);
        filterPanel.add(checkOut);

        filterPanel.add(middlePanel);

        middlePanel.add(filter);
        middlePanel.add(unfilter);
        middlePanel.add(selectedItemsButton);
        middlePanel.add(checkOut);

    }

    //THIS FUNCTION IS SLOW. MORE ITEMS = MORE SLOWER
    private void filterButton() {
        filteredItems.clear();
        if (keyboard.isSelected()) {
            System.out.println("Keyboard Selected.\n");
            for (PC_Parts item : items) {
                if (item instanceof Keyboard) {
                    filteredItems.add(item);
                }
            }
        }
        if (webcam.isSelected()) {
            System.out.println("Webcam Selected.\n");
            for (PC_Parts item : items) {
                if (item instanceof Webcam) {
                    filteredItems.add(item);
                }
            }
        }
        if (chassis.isSelected()) {
            System.out.println("Chassis Selected.\n");
            for (PC_Parts item : items) {
                if (item instanceof Chassis) {
                    filteredItems.add(item);
                }
            }
        }
        if (monitor.isSelected()) {
            System.out.println("Monitor Selected.\n");
            for (PC_Parts item : items) {
                if (item instanceof Monitor) {
                    filteredItems.add(item);
                }
            }
        }
        if (mouse.isSelected()) {
            System.out.println("Mouse Selected.\n");
            for (PC_Parts item : items) {
                if (item instanceof Mouse) {
                    filteredItems.add(item);
                }
            }
        }
        if (cpu.isSelected()) {
            System.out.println("CPU Selected.\n");
            for (PC_Parts item : items) {
                if (item instanceof Processor) {
                    filteredItems.add(item);
                }
            }
        }
        if (gpu.isSelected()) {
            System.out.println("GPU Selected.\n");
            for (PC_Parts item : items) {
                if (item instanceof Graphics) {
                    filteredItems.add(item);
                }
            }
        }
        if (ram.isSelected()) {
            System.out.println("RAM Selected.\n");
            for (PC_Parts item : items) {
                if (item instanceof Memory) {
                    filteredItems.add(item);
                }
            }
        }
        if (storage.isSelected()) {
            System.out.println("Storage Selected.\n");
            for (PC_Parts item : items) {
                if (item instanceof Storage) {
                    filteredItems.add(item);
                }
            }
        }
        if (mobo.isSelected()) {
            System.out.println("Motherboard Selected.\n");
            for (PC_Parts item : items) {
                if (item instanceof Motherboard) {
                    filteredItems.add(item);
                }
            }
        }

        if (filteredItems.isEmpty()) {
            unfilterButton();
            return;
        }

        PC_Parts[] arrayFilteredItems = filteredItems.toArray(new PC_Parts[filteredItems.size()]);
        itemPanelSetup(arrayFilteredItems);
    }

    private void unfilterButton() {
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

    private void selectedItemButton() {
        PC_Parts[] arraySelectedItems = selectedItems.toArray(new PC_Parts[selectedItems.size()]);
        itemPanelSetup(arraySelectedItems);
    }

    private void checkOutButton() {
        if (selectedItems.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please select an item.", "Empty Cart", 1);
            return;
        }
        menuPageWindow.dispose();
        PC_Parts[] arraySelectedItems = selectedItems.toArray(new PC_Parts[selectedItems.size()]);
        new OrderForm(arraySelectedItems);
    }
}
