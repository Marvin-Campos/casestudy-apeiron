package apeiron;

import java.awt.*;
import javax.swing.*;

public class MenuPage extends Values {

    JFrame menuPageWindow = new JFrame("Menu");

    public MenuPage() {
        run();
    }
    
    private void run() {
         menuPageWindow.setSize(windowSize);
//        menuPageWindow.setIconImage(apeironIcon.getImage());
        menuPageWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        
        
        
        menuPageWindow.setVisible(true);
    }
}
