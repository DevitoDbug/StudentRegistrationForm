package GUI;

import javax.swing.*;

public class PanelClass extends JPanel {
    RegistrationPanel registrationPanel;
    PanelClass()
    {
        registrationPanel = new RegistrationPanel();
        registrationPanel.setBounds(10 , 10 , 800 , 600);
        registrationPanel.setOpaque(false);

        this.add(registrationPanel);

        this.setBounds(220, 0, 820, 620);
        this.setFocusable(true);
        this.setOpaque(false);
        this.setLayout(null);
        this.setVisible(true);
    }
}
