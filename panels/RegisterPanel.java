package panels;
import java.util.*;
import javax.swing.*;
import java.awt.*;

public class RegisterPanel extends JPanel{
    JLabel registerLabel074 = new JLabel();
     JButton backButton074 = new JButton();
    public RegisterPanel(CardLayout card, JPanel maiPanel){
        registerLabel074.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 60));
        registerLabel074.setText("Register");
        registerLabel074.setBounds(200,200,100,100);
        add(registerLabel074);

        backButton074.setText("<- Back");
        backButton074.setBounds(200,400,100,100);
        backButton074.addActionListener(e-> card.show(maiPanel, "login"));
        add(backButton074);
    }
}
