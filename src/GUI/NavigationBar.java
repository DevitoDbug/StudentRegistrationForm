package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class NavigationBar extends JPanel {
    private JLabel navTitle;
    private JLabel Register;
    private JLabel StudentList;
    private int cornerRadius = 30;
    Color backgroundColor = new Color(102, 102, 153, 144);
    NavigationBar()
    {
        navTitle = new JLabel("Options");
        navTitle.setBounds(40, 30, 100, 40);
        navTitle.setFont(new Font("Arial", Font.BOLD, 25));
        navTitle.setOpaque(false);

        //labels within the option
        Register = new JLabel("Register Student");
        Register.setLayout(null);
        Register.setFocusable(false);
        Register.setBounds(20, 80, 150, 40);
        Register.setFont(new Font("Arial", Font.BOLD, 12));
        Register.setBackground(new Color(102, 102, 153));
        Register.setOpaque(false);
        Register.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                Register.setForeground(new Color(96, 32, 96));
            }
            public void mouseExited(MouseEvent e) {
                Register.setForeground(Color.BLACK);
            }
        });


        StudentList = new JLabel("View Students");
        StudentList.setFocusable(false);
        StudentList.setOpaque(false);
        StudentList.setLayout(null);
        StudentList.setBounds(20, 125, 150, 40);
        StudentList.setFont(new Font("Arial", Font.BOLD, 12));
        StudentList.setBackground(new Color(102, 102, 153));
        StudentList.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                StudentList.setForeground(new Color(96, 32, 96));
            }
            public void mouseExited(MouseEvent e) {
                StudentList.setForeground(Color.BLACK);
            }
        });



        this.add(StudentList);
        this.add(Register);
        this.add(navTitle);

        this.setOpaque(false);
        this.setBounds(5, 10, 210, 600);
        this.setBackground(new Color(253, 253, 255));
        this.setLayout(null);

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
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
