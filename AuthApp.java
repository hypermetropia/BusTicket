import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class AuthApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AuthApp().createUI());
    }

    private void createUI() {
        JFrame frame = new JFrame("Auth Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 900);
        frame.setLocationRelativeTo(null);

        // Main panel with gray background
        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setBackground(Color.GRAY);

        // Center "card" panel (white background)
        JPanel cardPanel = new JPanel(new CardLayout());
        cardPanel.setPreferredSize(new Dimension(500, 700));
        cardPanel.setBackground(Color.WHITE);

        // --- Login Page ---
        JPanel loginPanel = new JPanel(new GridBagLayout());
        loginPanel.setBackground(Color.WHITE);
        loginPanel.setBorder(new EmptyBorder(20, 20, 20, 20));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Username
        gbc.gridx = 0; gbc.gridy = 0;
        loginPanel.add(new JLabel("Username:"), gbc);
        gbc.gridx = 1;
        JTextField loginUser = new JTextField(12);
        loginPanel.add(loginUser, gbc);

        // Password
        gbc.gridx = 0; gbc.gridy = 1;
        loginPanel.add(new JLabel("Password:"), gbc);
        gbc.gridx = 1;
        JPasswordField loginPass = new JPasswordField(12);
        loginPanel.add(loginPass, gbc);

        // Buttons
        gbc.gridx = 0; gbc.gridy = 2; gbc.gridwidth = 2;
        JPanel loginButtons = new JPanel();
        JButton loginBtn = new JButton("Login");
        JButton toRegisterBtn = new JButton("Register");
        loginButtons.add(loginBtn);
        loginButtons.add(toRegisterBtn);
        loginPanel.add(loginButtons, gbc);

        // --- Register Page ---
        JPanel registerPanel = new JPanel(new GridBagLayout());
        registerPanel.setBackground(Color.WHITE);
        registerPanel.setBorder(new EmptyBorder(20, 20, 20, 20));
        GridBagConstraints gbc2 = new GridBagConstraints();
        gbc2.insets = new Insets(10, 10, 10, 10);
        gbc2.fill = GridBagConstraints.HORIZONTAL;

        // Username
        gbc2.gridx = 0; gbc2.gridy = 0;
        registerPanel.add(new JLabel("Username:"), gbc2);
        gbc2.gridx = 1;
        JTextField regUser = new JTextField(12);
        registerPanel.add(regUser, gbc2);

        // Email
        gbc2.gridx = 0; gbc2.gridy = 1;
        registerPanel.add(new JLabel("Email:"), gbc2);
        gbc2.gridx = 1;
        JTextField regEmail = new JTextField(12);
        registerPanel.add(regEmail, gbc2);

        // Password
        gbc2.gridx = 0; gbc2.gridy = 2;
        registerPanel.add(new JLabel("Password:"), gbc2);
        gbc2.gridx = 1;
        JPasswordField regPass = new JPasswordField(12);
        registerPanel.add(regPass, gbc2);

        // Buttons
        gbc2.gridx = 0; gbc2.gridy = 3; gbc2.gridwidth = 2;
        JPanel regButtons = new JPanel();
        JButton registerBtn = new JButton("Register");
        JButton toLoginBtn = new JButton("Back to Login");
        regButtons.add(registerBtn);
        regButtons.add(toLoginBtn);
        registerPanel.add(regButtons, gbc2);

        // Add both panels to CardLayout
        cardPanel.add(loginPanel, "Login");
        cardPanel.add(registerPanel, "Register");

        // Add to main panel
        mainPanel.add(cardPanel, new GridBagConstraints());
        frame.add(mainPanel);

        // Switch actions
        CardLayout cl = (CardLayout) cardPanel.getLayout();
        toRegisterBtn.addActionListener(e -> cl.show(cardPanel, "Register"));
        toLoginBtn.addActionListener(e -> cl.show(cardPanel, "Login"));

        frame.setVisible(true);
    }
}
