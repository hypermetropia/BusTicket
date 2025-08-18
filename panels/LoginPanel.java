package panels;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class LoginPanel extends JPanel{
    JLabel login074 = new JLabel();
    JButton registerButton074 = new JButton();
    public LoginPanel(CardLayout card, JPanel mainPanel){
        login074.setText("Login");
        login074.setBounds(10, 10, 10, 30);
        login074.setFont( new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        add(login074);
        
        registerButton074.setBounds(100,100,100,100);
        registerButton074.setText("Register");
        registerButton074.addActionListener(e -> card.show(mainPanel, "register"));
        add(registerButton074);
        
    }
}
