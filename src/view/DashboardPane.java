package view;

import javax.swing.*;

public class DashboardPane extends JPanel {
    public DashboardPane() {
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        add(new JLabel("Dashboard"));
        add(new JButton("Importeer namen uit stek"));
    }
}
