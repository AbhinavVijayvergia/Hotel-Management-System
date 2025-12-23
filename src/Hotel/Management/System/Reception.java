package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame {
    Reception() {
        // ======= Main Content Panel =======
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Gradient background for depth
                Graphics2D g2d = (Graphics2D) g;
                GradientPaint gp = new GradientPaint(0, 0, new Color(2, 62, 125), 0, getHeight(), new Color(3, 45, 48));
                g2d.setPaint(gp);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        panel.setLayout(null);
        panel.setBounds(280, 5, 1238, 820);
        panel.setBorder(BorderFactory.createLineBorder(new Color(0, 80, 160), 2, true));
        add(panel);

        // ======= Sidebar Panel =======
        JPanel panel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Subtle dark gradient for contrast
                Graphics2D g2d = (Graphics2D) g;
                GradientPaint gp = new GradientPaint(0, 0, new Color(10, 30, 35), 0, getHeight(), new Color(3, 45, 48));
                g2d.setPaint(gp);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        panel1.setLayout(null);
        panel1.setBounds(5, 5, 270, 820);
        panel1.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 2, new Color(15, 90, 110)));
        add(panel1);

        // ======= Sidebar Header Image or Logo =======
        try {
            ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icon/sidebar_banner.png"));
            Image img = icon.getImage().getScaledInstance(270, 120, Image.SCALE_SMOOTH);
            JLabel sidebarBanner = new JLabel(new ImageIcon(img));
            sidebarBanner.setBounds(0, 0, 270, 120);
            panel1.add(sidebarBanner);
        } catch (Exception e) {
            // fallback if image not found
            JLabel fallback = new JLabel("Dashboard", SwingConstants.CENTER);
            fallback.setFont(new Font("Segoe UI", Font.BOLD, 22));
            fallback.setForeground(Color.WHITE);
            fallback.setBounds(0, 20, 270, 40);
            panel1.add(fallback);
        }

        // ImageIcon i111 = new
        // ImageIcon(ClassLoader.getSystemResource("icon/cccc.gif"));
        // Image i22 = i111.getImage().getScaledInstance(800, 800, Image.SCALE_DEFAULT);
        // ImageIcon imageIcon111 = new ImageIcon(i22);
        // JLabel label11 = new JLabel(imageIcon111);
        // label11.setBounds(300, 20, 800, 800);
        // panel.add(label11);

        // ImageIcon i11 = new
        // ImageIcon(ClassLoader.getSystemResource("icon/LogoImg.png"));
        // Image i2 = i11.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        // ImageIcon imageIcon11 = new ImageIcon(i2);
        // JLabel label1 = new JLabel(imageIcon11);
        // label1.setBounds(5, 530, 250, 250);
        // panel1.add(label1);

        JButton btnNCF = new JButton("New Customer Form");
        btnNCF.setBounds(30, 80, 220, 45);
        btnNCF.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btnNCF.setForeground(Color.WHITE);
        btnNCF.setBackground(new Color(25, 118, 210)); // Modern blue
        btnNCF.setFocusPainted(false);
        btnNCF.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(21, 101, 192), 2, true),
                BorderFactory.createEmptyBorder(8, 20, 8, 20)));
        btnNCF.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnNCF.setOpaque(true);

        // Hover + Press animation
        btnNCF.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNCF.setBackground(new Color(21, 101, 192)); // darker
                btnNCF.setBorder(BorderFactory.createCompoundBorder(
                        BorderFactory.createLineBorder(new Color(13, 71, 161), 2, true),
                        BorderFactory.createEmptyBorder(8, 20, 8, 20)));
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNCF.setBackground(new Color(25, 118, 210));
                btnNCF.setBorder(BorderFactory.createCompoundBorder(
                        BorderFactory.createLineBorder(new Color(21, 101, 192), 2, true),
                        BorderFactory.createEmptyBorder(8, 20, 8, 20)));
            }

            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnNCF.setBackground(new Color(13, 71, 161)); // pressed color
            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnNCF.setBackground(new Color(21, 101, 192));
            }
        });
        panel1.add(btnNCF);
        btnNCF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new NewCustomer();
                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });
        JButton btnRoom = new JButton("Room");
        btnRoom.setBounds(30, 140, 220, 45);
        btnRoom.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btnRoom.setForeground(Color.WHITE);
        btnRoom.setBackground(new Color(25, 118, 210)); // Modern blue
        btnRoom.setFocusPainted(false);
        btnRoom.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(21, 101, 192), 2, true),
                BorderFactory.createEmptyBorder(8, 20, 8, 20)));
        btnRoom.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnRoom.setOpaque(true);

        btnRoom.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRoom.setBackground(new Color(21, 101, 192)); // darker
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRoom.setBackground(new Color(25, 118, 210));
            }

            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRoom.setBackground(new Color(13, 71, 161)); // pressed color
            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnRoom.setBackground(new Color(21, 101, 192));
            }
        });
        panel1.add(btnRoom);
        btnRoom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Room();
                // setVisible(false); // optional: hide Reception window
            }
        });

        JButton btnDepartment = new JButton("Department");
        btnDepartment.setBounds(30, 200, 220, 45);
        btnDepartment.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btnDepartment.setForeground(Color.WHITE);
        btnDepartment.setBackground(new Color(25, 118, 210));
        btnDepartment.setFocusPainted(false);
        btnDepartment.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(21, 101, 192), 2, true),
                BorderFactory.createEmptyBorder(8, 20, 8, 20)));
        btnDepartment.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnDepartment.setOpaque(true);

        btnDepartment.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDepartment.setBackground(new Color(21, 101, 192));
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDepartment.setBackground(new Color(25, 118, 210));
            }

            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDepartment.setBackground(new Color(13, 71, 161));
            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnDepartment.setBackground(new Color(21, 101, 192));
            }
        });
        panel1.add(btnDepartment);
        btnDepartment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Department();
                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });

        JButton btnAEI = new JButton("All Employee Info");
        btnAEI.setBounds(30, 260, 220, 45);
        btnAEI.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btnAEI.setForeground(Color.WHITE);
        btnAEI.setBackground(new Color(25, 118, 210));
        btnAEI.setFocusPainted(false);
        btnAEI.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(21, 101, 192), 2, true),
                BorderFactory.createEmptyBorder(8, 20, 8, 20)));
        btnAEI.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnAEI.setOpaque(true);

        btnAEI.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAEI.setBackground(new Color(21, 101, 192));
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAEI.setBackground(new Color(25, 118, 210));
            }

            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAEI.setBackground(new Color(13, 71, 161));
            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAEI.setBackground(new Color(21, 101, 192));
            }
        });
        panel1.add(btnAEI);
        btnAEI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Employee();
                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });

        JButton btnCI = new JButton("Customer Info");
        btnCI.setBounds(30, 320, 220, 45);
        btnCI.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btnCI.setForeground(Color.WHITE);
        btnCI.setBackground(new Color(25, 118, 210));
        btnCI.setFocusPainted(false);
        btnCI.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(21, 101, 192), 2, true),
                BorderFactory.createEmptyBorder(8, 20, 8, 20)));
        btnCI.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnCI.setOpaque(true);

        btnCI.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCI.setBackground(new Color(21, 101, 192));
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCI.setBackground(new Color(25, 118, 210));
            }

            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCI.setBackground(new Color(13, 71, 161));
            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCI.setBackground(new Color(21, 101, 192));
            }
        });
        panel1.add(btnCI);
        btnCI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new CustomerInfo();
                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });

        JButton btnMI = new JButton("Manager Info");
        btnMI.setBounds(30, 380, 220, 45);
        btnMI.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btnMI.setForeground(Color.WHITE);
        btnMI.setBackground(new Color(25, 118, 210));
        btnMI.setFocusPainted(false);
        btnMI.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(21, 101, 192), 2, true),
                BorderFactory.createEmptyBorder(8, 20, 8, 20)));
        btnMI.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnMI.setOpaque(true);

        btnMI.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMI.setBackground(new Color(21, 101, 192));
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMI.setBackground(new Color(25, 118, 210));
            }

            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMI.setBackground(new Color(13, 71, 161));
            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnMI.setBackground(new Color(21, 101, 192));
            }
        });
        panel1.add(btnMI);
        btnMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new ManagerInfo();
                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });

        JButton btnCO = new JButton("Checkout");
        btnCO.setBounds(30, 440, 220, 45);
        btnCO.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btnCO.setForeground(Color.WHITE);
        btnCO.setBackground(new Color(25, 118, 210));
        btnCO.setFocusPainted(false);
        btnCO.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(21, 101, 192), 2, true),
                BorderFactory.createEmptyBorder(8, 20, 8, 20)));
        btnCO.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnCO.setOpaque(true);

        btnCO.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCO.setBackground(new Color(21, 101, 192));
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCO.setBackground(new Color(25, 118, 210));
            }

            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCO.setBackground(new Color(13, 71, 161));
            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCO.setBackground(new Color(21, 101, 192));
            }
        });
        panel1.add(btnCO);
        btnCO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // new NewCustomer();
                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });

        JButton btnUC = new JButton("Update Check-in Details");
        btnUC.setBounds(30, 500, 220, 45);
        btnUC.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btnUC.setForeground(Color.WHITE);
        btnUC.setBackground(new Color(25, 118, 210));
        btnUC.setFocusPainted(false);
        btnUC.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(21, 101, 192), 2, true),
                BorderFactory.createEmptyBorder(8, 20, 8, 20)));
        btnUC.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnUC.setOpaque(true);

        btnUC.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUC.setBackground(new Color(21, 101, 192));
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUC.setBackground(new Color(25, 118, 210));
            }

            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnUC.setBackground(new Color(13, 71, 161));
            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnUC.setBackground(new Color(21, 101, 192));
            }
        });
        panel1.add(btnUC);
        btnUC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new UpdateCheck();
                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });

        JButton btnURS = new JButton("Update Room Status");
        btnURS.setBounds(30, 560, 220, 45);
        btnURS.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btnURS.setForeground(Color.WHITE);
        btnURS.setBackground(new Color(25, 118, 210));
        btnURS.setFocusPainted(false);
        btnURS.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(21, 101, 192), 2, true),
                BorderFactory.createEmptyBorder(8, 20, 8, 20)));
        btnURS.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnURS.setOpaque(true);

        btnURS.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnURS.setBackground(new Color(21, 101, 192));
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnURS.setBackground(new Color(25, 118, 210));
            }

            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnURS.setBackground(new Color(13, 71, 161));
            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnURS.setBackground(new Color(21, 101, 192));
            }
        });
        panel1.add(btnURS);
        btnURS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // new NewCustomer();
                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });

        JButton btnPUS = new JButton("Pick up Service");
        btnPUS.setBounds(30, 620, 220, 45);
        btnPUS.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btnPUS.setForeground(Color.WHITE);
        btnPUS.setBackground(new Color(25, 118, 210));
        btnPUS.setFocusPainted(false);
        btnPUS.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(21, 101, 192), 2, true),
                BorderFactory.createEmptyBorder(8, 20, 8, 20)));
        btnPUS.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnPUS.setOpaque(true);

        btnPUS.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPUS.setBackground(new Color(21, 101, 192));
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMI.setBackground(new Color(25, 118, 210));
            }

            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMI.setBackground(new Color(13, 71, 161));
            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnMI.setBackground(new Color(21, 101, 192));
            }
        });
        panel1.add(btnPUS);
        btnPUS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new PickUp();
                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });

        JButton btnSR = new JButton("Search Room");
        btnSR.setBounds(30, 680, 220, 45);
        btnSR.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btnSR.setForeground(Color.WHITE);
        btnSR.setBackground(new Color(25, 118, 210));
        btnMI.setFocusPainted(false);
        btnMI.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(21, 101, 192), 2, true),
                BorderFactory.createEmptyBorder(8, 20, 8, 20)));
        btnSR.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnSR.setOpaque(true);

        btnSR.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSR.setBackground(new Color(21, 101, 192));
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSR.setBackground(new Color(25, 118, 210));
            }

            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSR.setBackground(new Color(13, 71, 161));
            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnSR.setBackground(new Color(21, 101, 192));
            }
        });
        panel1.add(btnSR);
        btnSR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new SearchRoom();
                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });

        JButton logout = new JButton("Logout");
        logout.setBounds(30, 740, 220, 45); // full-width, taller
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
        panel1.add(logout);

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

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setSize(1950, 1090);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Reception();
    }
}
