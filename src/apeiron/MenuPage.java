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
        
        JLabel sampleText = new JLabel("asdadsadsad");
        itemPanel.add(sampleText);
        
        JScrollPane itemGridPanel = itemGridPanelSetup();
        itemPanel.add(itemGridPanel);
    }
    
    //WIP
    private JScrollPane itemGridPanelSetup() {
        
        JPanel itemGrid = new JPanel(new GridLayout(3, 3, 20 ,20));
//        JPanel itemGrid = new JPanel();
//        itemGrid.setLayout(new BoxLayout(itemGrid, BoxLayout.PAGE_AXIS));
        JScrollPane itemGridPanel = new JScrollPane(itemGrid);
         
        for (int i = 1; i <= 9; i++) {
            JButton button = new JButton("" + i);
            itemGrid.add(button);
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
