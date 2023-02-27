package GUI;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class RegistrationPanel extends JPanel {
    Color backgroundColor = new Color(102, 102, 153);
    JTextField fNametxtBox;
    JTextField SNametxtBox;
//    JDateChooser dateChooser;
    JTextField regFee;
    JButton registerButton;
    RegistrationPanel() {
        //first name
        fNametxtBox = new JTextField();
        fNametxtBox.setForeground(Color.BLACK);
        fNametxtBox.setColumns(10);
        fNametxtBox.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "First Name", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(204, 204, 204)));
        fNametxtBox.setBackground(new Color(102, 102, 153));
        fNametxtBox.setBounds(56, 20, 262, 40);

        //second name
        SNametxtBox = new JTextField();
        SNametxtBox.setForeground(Color.BLACK);
        SNametxtBox.setColumns(10);
        SNametxtBox.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Second Name", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(204, 204, 204)));
        SNametxtBox.setBackground(new Color(102, 102, 153));
        SNametxtBox.setBounds(56, 70, 262, 40);

//        //Date of birth
//        dateChooser = new JDateChooser( "dd/MM/yy" , "##/##/##" , '_' );
//        dateChooser.getCalendarButton().setBounds(240, 1, 21, 32);
//        dateChooser.setBounds(58, 120, 262, 30);
//        dateChooser.setBackground(Color.BLUE);


        //this is the registration fee
        //second name
        regFee = new JTextField();
        regFee.setForeground(Color.BLACK);
        regFee.setColumns(10);
        regFee.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Registraion Fee", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(204, 204, 204)));
        regFee.setBackground(new Color(102, 102, 153));
        regFee.setBounds(58, 160, 262, 40);
        regFee.setText("1000");


        registerButton = new JButton("Register");
        registerButton.setFont(new Font("Tahoma", Font.BOLD, 13));
        registerButton.setFocusable(false);
        registerButton.setBounds(56, 218, 89, 23);

        this.add(registerButton);
        this.add(fNametxtBox);
        this.add(SNametxtBox);
        this.add(regFee);

        this.setLayout(null);
        this.setVisible(true);
        this.setBackground(new Color(254, 254, 254));
        //this.setBackground(new Color(255, 204, 153));
        this.setBounds(0, 0, 300, 270);
        this.setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        final int cornerRadius = 30;
        Dimension arcs = new Dimension(cornerRadius, cornerRadius);
        int width = getWidth();
        int height = getHeight();
        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        //Draws the rounded panel with borders
        if (backgroundColor != null) {
            graphics.setColor(backgroundColor);
        } else {
            graphics.setColor(getBackground());
        }

        graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint background
        graphics.setColor(getBackground());
        graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint border
    }
}
