package view;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        setSize(1200, 800);
        setTitle("OogstAdmin");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        DashboardPane dashboard = new DashboardPane();
        add(dashboard, BorderLayout.WEST);
        SheetPane sheet = new SheetPane();
        add(sheet, BorderLayout.CENTER);
        setVisible(true);
    }
}
