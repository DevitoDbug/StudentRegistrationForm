package GUI;

import javax.swing.*;
import java.awt.*;

public class NavigationBar extends JPanel {
    JLabel navTitle;
    NavigationBar()
    {
        navTitle = new JLabel("Options");
        navTitle.setBounds(40, 30, 60, 40);
        navTitle.setFont(new Font("Arial", Font.BOLD, 16));
        navTitle.setOpaque(false);

        this.add(navTitle);

        this.setLayout(null);
        this.setBackground(new Color(102, 102, 153, 144));
        this.setBounds(0, 0, 210, 661);

    }
}
