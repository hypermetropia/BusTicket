import java.util.*;
import javax.swing.*;
import java.awt.*;
import panels.*;

public class MainFrame extends JFrame {
    public static void main(String[] args) {
        CardLayout cardLayout074 = new CardLayout();

        JPanel cardPanel074 = new JPanel(cardLayout074);

        // add panels
        cardPanel074.add(new LoginPanel(cardLayout074, cardPanel074), "login");
        cardPanel074.add(new RegisterPanel(cardLayout074, cardPanel074), "register");
        cardPanel074.setPreferredSize(new Dimension(600,750));
        // main panel
        JPanel mainPanel074 = new JPanel();
        mainPanel074.setLayout(new GridBagLayout());
        mainPanel074.setBackground(new Color(199, 196, 191));
        mainPanel074.add(cardPanel074);
        //
        MainFrame mainFrame074 = new MainFrame();
        mainFrame074.add(mainPanel074);
        mainFrame074.setVisible(true);
        mainFrame074.setSize(1200, 900);
        mainFrame074.setTitle("Shohoj Travels");
    }

}