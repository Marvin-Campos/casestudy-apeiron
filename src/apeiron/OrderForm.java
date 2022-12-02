package apeiron;

import java.awt.*;
import java.util.Arrays;
import java.util.Vector;
import javax.swing.*;

public class OrderForm extends Values {

    JFrame orderFormWindow = new JFrame("Cart");
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
//
//    Processor processor1 = new Processor(2, 4, true, true, "Intel Core I9", 3000, "12345", 1, new ImageIcon(resourcesFolder + "\\processor1.png"));
//    IntegratedGraphicsProcessor processor2 = new IntegratedGraphicsProcessor(3, 3, 6, 2, 4, true, true, "AMD", 3000, "12345", 1, new ImageIcon(resourcesFolder + "\\processor1.png"));
//    Processor processor3 = new Processor(2, 4, true, true, "SP 03-301P", 3000, "12345", 1, new ImageIcon(resourcesFolder + "\\processor1.png"));
//    IntegratedGraphicsProcessor processor4 = new IntegratedGraphicsProcessor(2, 4, 8, 2, 4, true, true, "Ligma Processor", 3000, "12345", 1, new ImageIcon(resourcesFolder + "\\processor1.png"));
//    Processor processor5 = new Processor(2, 4, true, true, "Apeiron Premium", 3000, "12345", 1, new ImageIcon(resourcesFolder + "\\processor1.png"));
//
//    Graphics gpu1 = new Graphics(2, 3, 8, true, true, "RTX 3060", 27000, "B1-2000", 1, new ImageIcon(resourcesFolder + "\\aust.png"));
//    Graphics gpu2 = new Graphics(2, 3, 8, true, true, "Maangas na GPU", 27000, "B1-2000", 1, new ImageIcon(resourcesFolder + "\\marvs.png"));
//    Graphics gpu3 = new Graphics(2, 3, 8, true, true, "RTX 3060", 27000, "B1-2000", 1, new ImageIcon(resourcesFolder + "\\aust.png"));
//    Graphics gpu4 = new Graphics(2, 3, 8, true, true, "Maangas na GPU", 27000, "B1-2000", 1, new ImageIcon(resourcesFolder + "\\marvs.png"));
//    Graphics gpu5 = new Graphics(2, 3, 8, true, true, "RTX 3060", 27000, "B1-2000", 1, new ImageIcon(resourcesFolder + "\\aust.png"));
//
//    Webcam wc1 = new Webcam("1920x1080", "16:9", "Black", false, "SP-Tech K301P", 4700, "XM-1014", 1, new ImageIcon(resourcesFolder + "\\webcam1.png"));
//    Webcam wc2 = new Webcam("1920x1080", "16:9", "Black", false, "SP-Tech K301P", 4700, "XM-1014", 1, new ImageIcon(resourcesFolder + "\\webcam1.png"));
//    Webcam wc3 = new Webcam("1920x1080", "16:9", "Black", false, "SP-Tech K301P", 4700, "XM-1014", 1, new ImageIcon(resourcesFolder + "\\webcam1.png"));
//    Webcam wc4 = new Webcam("1920x1080", "16:9", "Black", false, "SP-Tech K301P", 4700, "XM-1014", 1, new ImageIcon(resourcesFolder + "\\webcam1.png"));
//    Webcam wc5 = new Webcam("1920x1080", "16:9", "Black", false, "SP-Tech K301P", 4700, "XM-1014", 1, new ImageIcon(resourcesFolder + "\\webcam1.png"));
//
//    OfficeMouse m1 = new OfficeMouse("Ball", 1600, 3, "Black", false, "RT MX Quiet", 700, "JB-87000", 1, new ImageIcon(resourcesFolder + "\\officeMouse.jpg"));
//    GamingMouse m2 = new GamingMouse(130, false, 800, 5, "White", true, "Apeiron MOU5", 2800, "EY-69420", 1, new ImageIcon(resourcesFolder + "\\gamingMouse.jpg"));
//    OfficeMouse m3 = new OfficeMouse("Ball", 1600, 3, "Black", false, "RT MX Quiet", 700, "JB-87000", 1, new ImageIcon(resourcesFolder + "\\officeMouse.jpg"));
//    GamingMouse m4 = new GamingMouse(130, false, 800, 5, "White", true, "Apeiron MOU5", 2800, "EY-69420", 1, new ImageIcon(resourcesFolder + "\\gamingMouse.jpg"));
//    OfficeMouse m5 = new OfficeMouse("Ball", 1600, 3, "Black", false, "RT MX Quiet", 700, "JB-87000", 1, new ImageIcon(resourcesFolder + "\\officeMouse.jpg"));
//
//    MechanicalKeyboard kb1 = new MechanicalKeyboard("MX Cherry Reds", "Japanese", 70, "Pink", true, "Sakura 3P1C", 4700, "JP-2022", 1, new ImageIcon(resourcesFolder + "\\mechkb1.jfif"));
//    MembraneKeyboard kb2 = new MembraneKeyboard(true, true, 100, "Black", false, "Generica MK1000", 800, "KK-1933", 1, new ImageIcon(resourcesFolder + "\\memkb1.jpg"));
//    MechanicalKeyboard kb3 = new MechanicalKeyboard("MX Cherry Reds", "Japanese", 70, "Pink", true, "Sakura 3P1C", 4700, "JP-2022", 1, new ImageIcon(resourcesFolder + "\\mechkb1.jfif"));
//    MembraneKeyboard kb4 = new MembraneKeyboard(true, true, 100, "Black", false, "Generica MK1000", 800, "KK-1933", 1, new ImageIcon(resourcesFolder + "\\memkb1.jpg"));
//    MechanicalKeyboard kb5 = new MechanicalKeyboard("MX Cherry Reds", "Japanese", 70, "Pink", true, "Sakura 3P1C", 4700, "JP-2022", 1, new ImageIcon(resourcesFolder + "\\mechkb1.jfif"));
//
//    Monitor mon1 = new Monitor(24, "1920x1080", 144, "VA Panel", "Red", false, "APR K13981", 13000, "PR-83167", 1, new ImageIcon(resourcesFolder + "\\monitor1.jpg"));
//    Monitor mon2 = new Monitor(24, "1920x1080", 144, "VA Panel", "Red", false, "APR K13981", 13000, "PR-83167", 1, new ImageIcon(resourcesFolder + "\\monitor1.jpg"));
//    Monitor mon3 = new Monitor(24, "1920x1080", 144, "VA Panel", "Red", false, "APR K13981", 13000, "PR-83167", 1, new ImageIcon(resourcesFolder + "\\monitor1.jpg"));
//    Monitor mon4 = new Monitor(24, "1920x1080", 144, "VA Panel", "Red", false, "APR K13981", 13000, "PR-83167", 1, new ImageIcon(resourcesFolder + "\\monitor1.jpg"));
//    Monitor mon5 = new Monitor(24, "1920x1080", 144, "VA Panel", "Red", false, "APR K13981", 13000, "PR-83167", 1, new ImageIcon(resourcesFolder + "\\monitor1.jpg"));
//
//    Chassis ch1 = new Chassis("ATX", true, false, 7, "White", false, "ARCTIC 0N4", 3400, "GE-0520", 1, new ImageIcon(resourcesFolder + "\\chassis1.jpg"));
//    Chassis ch2 = new Chassis("ATX", true, false, 7, "White", false, "ARCTIC 0N4", 3400, "GE-0520", 1, new ImageIcon(resourcesFolder + "\\chassis1.jpg"));
//    Chassis ch3 = new Chassis("ATX", true, false, 7, "White", false, "ARCTIC 0N4", 3400, "GE-0520", 1, new ImageIcon(resourcesFolder + "\\chassis1.jpg"));
//    Chassis ch4 = new Chassis("ATX", true, false, 7, "White", false, "ARCTIC 0N4", 3400, "GE-0520", 1, new ImageIcon(resourcesFolder + "\\chassis1.jpg"));
//    Chassis ch5 = new Chassis("ATX", true, false, 7, "White", false, "ARCTIC 0N4", 3400, "GE-0520", 1, new ImageIcon(resourcesFolder + "\\chassis1.jpg"));
//
//    Motherboard mobo1 = new Motherboard("AM4", "mATX", true, true, true, "AOSTEN Z560m", 12000, "JL-092003", 1, new ImageIcon(resourcesFolder + "\\mobo1.png"));
//    Motherboard mobo2 = new Motherboard("AM4", "mATX", true, true, true, "AOSTEN Z560m", 12000, "JL-092003", 1, new ImageIcon(resourcesFolder + "\\mobo1.png"));
//    Motherboard mobo3 = new Motherboard("AM4", "mATX", true, true, true, "AOSTEN Z560m", 12000, "JL-092003", 1, new ImageIcon(resourcesFolder + "\\mobo1.png"));
//    Motherboard mobo4 = new Motherboard("AM4", "mATX", true, true, true, "AOSTEN Z560m", 12000, "JL-092003", 1, new ImageIcon(resourcesFolder + "\\mobo1.png"));
//    Motherboard mobo5 = new Motherboard("AM4", "mATX", true, true, true, "AOSTEN Z560m", 12000, "JL-092003", 1, new ImageIcon(resourcesFolder + "\\mobo1.png"));
//
//    Memory ram1 = new Memory(8, "DDR5", 3200, false, true, "MarvinX Fury", 2100, "MV-1973", 1, new ImageIcon(resourcesFolder + "\\ram1.jfif"));
//    Memory ram2 = new Memory(8, "DDR5", 3200, false, true, "MarvinX Fury", 2100, "MV-1973", 1, new ImageIcon(resourcesFolder + "\\ram1.jfif"));
//    Memory ram3 = new Memory(8, "DDR5", 3200, false, true, "MarvinX Fury", 2100, "MV-1973", 1, new ImageIcon(resourcesFolder + "\\ram1.jfif"));
//    Memory ram4 = new Memory(8, "DDR5", 3200, false, true, "MarvinX Fury", 2100, "MV-1973", 1, new ImageIcon(resourcesFolder + "\\ram1.jfif"));
//    Memory ram5 = new Memory(8, "DDR5", 3200, false, true, "MarvinX Fury", 2100, "MV-1973", 1, new ImageIcon(resourcesFolder + "\\ram1.jfif"));
//
//    SolidStateDrive storage1 = new SolidStateDrive("NVMe", "PCIE-16x", 1000, false, false, "Ausvin 03301P", 6000, "AM-03301", 1, new ImageIcon(resourcesFolder + "\\ssd1.jpg"));
//    HardDiskDrive storage2 = new HardDiskDrive(7200, 5000, false, false, "Ausvin 03301G", 2000, "BM-93391", 1, new ImageIcon(resourcesFolder + "\\ssd1.jpg"));
//    SolidStateDrive storage3 = new SolidStateDrive("NVMe", "PCIE-16x", 1000, false, false, "Ausvin 03301P", 6000, "AM-03301", 1, new ImageIcon(resourcesFolder + "\\ssd1.jpg"));
//    HardDiskDrive storage4 = new HardDiskDrive(7200, 5000, false, false, "Ausvin 03301G", 2000, "BM-93391", 1, new ImageIcon(resourcesFolder + "\\ssd1.jpg"));
//    SolidStateDrive storage5 = new SolidStateDrive("NVMe", "PCIE-16x", 1000, false, false, "Ausvin 03301P", 6000, "AM-03301", 1, new ImageIcon(resourcesFolder + "\\ssd1.jpg"));
//
//    PC_Parts[] items = {
//        processor1, processor2, processor3, processor4, processor5,
//        gpu1, gpu2, gpu3, gpu4, gpu5,
//        wc1, wc2, wc3, wc4, wc5,
//        m1, m2, m3, m4, m5,
//        kb1, kb2, kb3, kb4, kb5,
//        mon1, mon2, mon3, mon4, mon5,
//        ch1, ch2, ch3, ch4, ch5,
//        mobo1, mobo2, mobo3, mobo4, mobo5,
//        ram1, ram2, ram3, ram4, ram5,
//        storage1, storage2, storage3, storage4, storage5
//    };
}
