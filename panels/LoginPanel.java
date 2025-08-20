package panels;

import java.util.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import others.Globals;
import others.User;
import others.UserManagement;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPanel extends JPanel implements ActionListener {
    JLabel loginLabel074 = new JLabel();
    JLabel usernameLabel074 = new JLabel();
    JLabel passLabel074 = new JLabel();
    JPasswordField passField = new JPasswordField();

    JTextField loginField = new JTextField();
    JButton toRegisterButton074 = new JButton();
    JButton loginButton074 = new JButton();

    CardLayout cardLayout074;
    JPanel mainPanel074;
    public LoginPanel(CardLayout card, JPanel mainPanel) {
        this.cardLayout074 = card;
        this.mainPanel074 = mainPanel;
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        setBorder(new EmptyBorder(80, 50, 20, 50));
        setBackground(Color.WHITE);

        // Login title
        loginLabel074.setText("Login");
        loginLabel074.setForeground(new Color(65, 119, 135));
        loginLabel074.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
        loginLabel074.setAlignmentX(CENTER_ALIGNMENT);
        add(loginLabel074);

        add(Box.createRigidArea(new Dimension(0, 80)));

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
        loginButton074.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 25));
        loginButton074.setText("Login");
        loginButton074.setForeground(Color.WHITE);
        loginButton074.setBackground(Color.decode("#6200EE"));
        loginButton074.setMaximumSize(new Dimension(Integer.MAX_VALUE, 50));
        loginButton074.setAlignmentX(CENTER_ALIGNMENT);
        loginButton074.setFocusPainted(false);
        loginButton074.addActionListener(this);
        add(loginButton074);
        // register Button
        add(Box.createRigidArea(new Dimension(0, 5)));
        JLabel dontHaveAccount074 = new JLabel("Or");
        dontHaveAccount074.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
        add(dontHaveAccount074);
        add(Box.createRigidArea(new Dimension(0, 5)));
        toRegisterButton074.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 25));
        toRegisterButton074.setText("Register");
        toRegisterButton074.setForeground(Color.WHITE);
        toRegisterButton074.setBackground(Color.decode("#2a9d8f"));
        toRegisterButton074.setMaximumSize(new Dimension(Integer.MAX_VALUE, 50));
        toRegisterButton074.setAlignmentX(CENTER_ALIGNMENT);
        toRegisterButton074.setFocusPainted(false);
        toRegisterButton074.addActionListener(e -> card.show(mainPanel, "register"));
        add(toRegisterButton074);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==loginButton074){
            String username074 = loginField.getText();
            String password074 = new String(passField.getPassword());
            UserManagement.loadUser();
            boolean flag =false;
            for(User user: UserManagement.users){
                String response = user.isMatch(username074, password074);
                if(response!=""){
                    JOptionPane.showMessageDialog(null,"Logged In Successfully");
                    Globals.loggedInId = response;
                    cardLayout074.show(mainPanel074, "dashboard");
                    flag = true;
                }
            }
            if(!flag){
                JOptionPane.showMessageDialog(null, "Invalid Username or Password");
            }
        }
    }
}
