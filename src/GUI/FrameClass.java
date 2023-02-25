package GUI;

import javax.swing.*;
import java.awt.*;

public class FrameClass extends JFrame {
    NavigationBar navBar;
    PanelClass panel;

    FrameClass()
    {
        navBar = new NavigationBar();

        panel = new PanelClass();

        this.add(panel);
        this.add(navBar);

        this.setLayout(null);
        this.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 11));
        this.setResizable(false);
        this.setBounds(100, 0, 1100, 700);
        this.setTitle("Student Registration");
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
