import java.util.*;
import javax.swing.*;
import java.awt.*;
import panels.*;
public class LoginFrame extends JFrame{
    public static void main(String[] args) {
        
        CardLayout cardLayout074 = new CardLayout();
        JPanel mainPanel074 = new JPanel(cardLayout074);

        //add panels
        mainPanel074.add(new LoginPanel(cardLayout074, mainPanel074),"login");
        mainPanel074.add(new RegisterPanel(cardLayout074, mainPanel074),"register");
        
        //
        LoginFrame loginFrame074 = new LoginFrame();
        loginFrame074.add(mainPanel074);
        loginFrame074.setVisible(true);
        loginFrame074.setBounds(500, 200, 900, 700);
        loginFrame074.setTitle("Shohoj Travels");
    }
    
}