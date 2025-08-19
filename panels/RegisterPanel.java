package panels;

import java.util.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterPanel extends JPanel {
    JLabel registerLabel074 = new JLabel();
    JLabel usernameLabel074 = new JLabel();
    JLabel passLabel074 = new JLabel();
    JLabel nameLabel074 = new JLabel();
    JLabel emailLabel074 = new JLabel();
    JLabel phoneLabel074 = new JLabel();

    JPasswordField passField = new JPasswordField();

    JTextField loginField = new JTextField();
    JTextField nameField = new JTextField();
    JTextField emailField074 = new JTextField();
    JTextField usernameField074 = new JTextField();
    JTextField phoneField074 = new JTextField();

    JButton toregisterButton074 = new JButton();
    JButton registerButton074 = new JButton();

    public RegisterPanel(CardLayout card, JPanel mainPanel) {
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        setBorder(new EmptyBorder(80, 50, 20, 50));
        setBackground(Color.WHITE);

        // Login title
        registerLabel074.setText("Register");
        registerLabel074.setForeground(new Color(65, 119, 135));
        registerLabel074.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
        registerLabel074.setAlignmentX(CENTER_ALIGNMENT);
        add(registerLabel074);

        add(Box.createRigidArea(new Dimension(0, 80)));

        // Fullname panel with BoxLayout
        JPanel fullnamePanel = new JPanel();
        fullnamePanel.setLayout(new BoxLayout(fullnamePanel, BoxLayout.X_AXIS));
        fullnamePanel.setBackground(Color.WHITE);
        // Label
        nameLabel074.setText("Name:");
        nameLabel074.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 26));
        fullnamePanel.add(nameLabel074);

        // Small spacing between label and text field
        fullnamePanel.add(Box.createRigidArea(new Dimension(60, 0)));
        // TextField
        nameField.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 23));
        nameField.setMaximumSize(new Dimension(500, 35));
        fullnamePanel.add(nameField);
        // Add to main panel
        add(fullnamePanel);
        add(Box.createRigidArea(new Dimension(0, 20)));

        // Email panel with BoxLayout
        JPanel emailPanel = new JPanel();
        emailPanel.setLayout(new BoxLayout(emailPanel, BoxLayout.X_AXIS));
        emailPanel.setBackground(Color.WHITE);
        // Label
        emailLabel074.setText("Email:");
        emailLabel074.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 26));
        emailPanel.add(emailLabel074);

        // Small spacing between label and text field
        emailPanel.add(Box.createRigidArea(new Dimension(63, 0)));
        // TextField
        emailField074.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 23));
        emailField074.setMaximumSize(new Dimension(500, 35));
        emailPanel.add(emailField074);
        // Add to main panel
        add(emailPanel);
        add(Box.createRigidArea(new Dimension(0, 20)));

        // Phone panel with BoxLayout
        JPanel phonePanel = new JPanel();
        phonePanel.setLayout(new BoxLayout(phonePanel, BoxLayout.X_AXIS));
        phonePanel.setBackground(Color.WHITE);
        // Label
        phoneLabel074.setText("Phone:");
        phoneLabel074.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 26));
        phonePanel.add(phoneLabel074);

        // Small spacing between label and text field
        phonePanel.add(Box.createRigidArea(new Dimension(56, 0)));
        // TextField
        phoneField074.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 23));
        phoneField074.setMaximumSize(new Dimension(500, 35));
        phonePanel.add(phoneField074);
        // Add to main panel
        add(phonePanel);
        add(Box.createRigidArea(new Dimension(0, 20)));

        // username panel with BoxLayout
        JPanel usernamePanel = new JPanel();
        usernamePanel.setLayout(new BoxLayout(usernamePanel, BoxLayout.X_AXIS));
        usernamePanel.setBackground(Color.WHITE);
        // Label
        usernameLabel074.setText("Username:");
        usernameLabel074.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 26));
        usernamePanel.add(usernameLabel074);

        // Small spacing between label and text field
        usernamePanel.add(Box.createRigidArea(new Dimension(10, 0)));
        // TextField
        loginField.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 23));
        loginField.setMaximumSize(new Dimension(500, 35));
        usernamePanel.add(loginField);
        // Add to main panel
        add(usernamePanel);
        // Pass
        // pass panel with BoxLayout
        add(Box.createRigidArea(new Dimension(0, 20)));
        JPanel passPanel074 = new JPanel();
        passPanel074.setLayout(new BoxLayout(passPanel074, BoxLayout.X_AXIS));
        passPanel074.setBackground(Color.WHITE);

        // Label
        passLabel074.setText("Password:");
        passLabel074.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 26));
        passPanel074.add(passLabel074);

        // Small spacing between label and text field
        passPanel074.add(Box.createRigidArea(new Dimension(13, 0)));
        // PassField
        passField.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 23));
        passField.setMaximumSize(new Dimension(500, 35));
        passPanel074.add(passField);
        add(passPanel074);

        // login Button
        add(Box.createRigidArea(new Dimension(0, 40)));
        registerButton074.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 25));
        registerButton074.setText("Register");
        registerButton074.setForeground(Color.WHITE);
        registerButton074.setBackground(Color.decode("#6200EE"));
        registerButton074.setMaximumSize(new Dimension(Integer.MAX_VALUE, 50));
        registerButton074.setAlignmentX(CENTER_ALIGNMENT);
        registerButton074.setFocusPainted(false);
        add(registerButton074);
        // register Button
        add(Box.createRigidArea(new Dimension(0, 5)));
        JLabel dontHaveAccount074 = new JLabel("Or");
        dontHaveAccount074.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
        add(dontHaveAccount074);
        add(Box.createRigidArea(new Dimension(0, 5)));
        toregisterButton074.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 25));
        toregisterButton074.setText("Back to Login");
        toregisterButton074.setForeground(Color.WHITE);
        toregisterButton074.setBackground(Color.decode("#2a9d8f"));
        toregisterButton074.setMaximumSize(new Dimension(Integer.MAX_VALUE, 50));
        toregisterButton074.setAlignmentX(CENTER_ALIGNMENT);
        toregisterButton074.setFocusPainted(false);
        toregisterButton074.addActionListener(e -> card.show(mainPanel, "login"));
        add(toregisterButton074);

    }
}
