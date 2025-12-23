package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class admin extends JFrame implements ActionListener {

    JButton add_Employee, add_Room, add_Drivers, logout, back;

    admin() {

        add_Employee = new JButton("ADD EMPLOYEE");
        add_Employee.setBounds(250, 230, 200, 30);
        add_Employee.setBackground(Color.WHITE);
        add_Employee.setForeground(Color.BLACK);
        add_Employee.setFocusPainted(false);
        add_Employee.setBorderPainted(false);
        add_Employee.setContentAreaFilled(true);
        add_Employee.setOpaque(true);
        add_Employee.setFont(new Font("Tahoma", Font.BOLD, 15));
        add_Employee.addActionListener(this);
        add(add_Employee);

        add_Room = new JButton("ADD ROOM");
        add_Room.setBounds(250, 380, 200, 30);
        add_Room.setBackground(Color.WHITE);
        add_Room.setForeground(Color.BLACK);
        add_Room.setFocusPainted(false);
        add_Room.setBorderPainted(false);
        add_Room.setContentAreaFilled(true);
        add_Room.setOpaque(true);
        add_Room.setFocusPainted(false);
        add_Room.setFont(new Font("Tahoma", Font.BOLD, 15));
        add_Room.addActionListener(this);
        add(add_Room);

        add_Drivers = new JButton("ADD DRIVERS");
        add_Drivers.setBounds(250, 530, 200, 30);
        add_Drivers.setBackground(Color.WHITE);
        add_Drivers.setForeground(Color.BLACK);
        add_Drivers.setFocusPainted(false);
        add_Drivers.setBorderPainted(false);
        add_Drivers.setContentAreaFilled(true);
        add_Drivers.setOpaque(true);
        add_Drivers.setFocusPainted(false);
        add_Drivers.setFont(new Font("Tahoma", Font.BOLD, 15));
        add_Drivers.addActionListener(this);
        add(add_Drivers);

        JButton logout = new JButton("Logout");
        logout.setBounds(130, 740, 220, 45); // full-width, taller
        logout.setFont(new Font("Segoe UI", Font.BOLD, 16));
        logout.setForeground(Color.WHITE);
        logout.setBackground(new Color(211, 47, 47)); // Red for logout
        logout.setFocusPainted(false);
        logout.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(183, 28, 28), 2, true),
                BorderFactory.createEmptyBorder(10, 20, 10, 20)));
        logout.setCursor(new Cursor(Cursor.HAND_CURSOR));
        logout.setOpaque(true);

        // Hover and press color effects
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logout.setBackground(new Color(198, 40, 40)); // darker red
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logout.setBackground(new Color(211, 47, 47)); // normal red
            }

            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logout.setBackground(new Color(183, 28, 28)); // pressed red
            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                logout.setBackground(new Color(198, 40, 40));
            }
        });
        add(logout);

        // Action listener for exit
        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Dashboard();
                    setVisible(false); // 0 is conventional for normal exit
                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });

        ImageIcon l1 = new ImageIcon(ClassLoader.getSystemResource("icon/employees.png"));
        Image l11 = l1.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT);
        ImageIcon imageIcon = new ImageIcon(l11);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(70, 180, 120, 120);
        add(label);

        ImageIcon imageIcon1 = new ImageIcon(ClassLoader.getSystemResource("icon/room.png"));
        Image image = imageIcon1.getImage().getScaledInstance(120, 120,
                Image.SCALE_DEFAULT);
        ImageIcon imageIcon11 = new ImageIcon(image);
        JLabel label1 = new JLabel(imageIcon11);
        label1.setBounds(70, 340, 120, 120);
        add(label1);

        ImageIcon imageIcon2 = new ImageIcon(ClassLoader.getSystemResource("icon/driver.png"));
        Image image1 = imageIcon2.getImage().getScaledInstance(120, 120,
                Image.SCALE_DEFAULT);
        ImageIcon imageIcon12 = new ImageIcon(image1);
        JLabel label2 = new JLabel(imageIcon12);
        label2.setBounds(70, 500, 120, 120);
        add(label2);

        ImageIcon imageIcon3 = new ImageIcon(ClassLoader.getSystemResource("icon/LogoImg.png"));
        Image image2 = imageIcon3.getImage().getScaledInstance(400, 400,
                Image.SCALE_DEFAULT);
        ImageIcon imageIcon13 = new ImageIcon(image2);
        JLabel label3 = new JLabel(imageIcon13);
        label3.setBounds(1000, 250, 400, 400);
        add(label3);

        getContentPane().setBackground(new Color(3, 45, 48));
        setLayout(null);
        setSize(1950, 1090);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == add_Employee) {
            new AddEmployee();
        } else if (e.getSource() == add_Room) {
            new AddRoom();
        } else if (e.getSource() == add_Drivers) {
            new addDriver();
        } else if (e.getSource() == logout) {
            System.exit(102);
        } else if (e.getSource() == back) {
            new Dashboard();
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new admin();
    }
}
