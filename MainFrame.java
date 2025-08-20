import java.util.*;
import javax.swing.*;
import java.awt.*;
import panels.*;

public class MainFrame extends JFrame {
    public static String loggedInId = "";

    public static void main(String[] args) {
        CardLayout cardLayout074 = new CardLayout();

        JPanel cardPanel074 = new JPanel(cardLayout074);

        // create panel
        Dashboard dashboard074 = new Dashboard(cardLayout074, cardPanel074);
        LoginPanel loginPanel074 = new LoginPanel(cardLayout074, cardPanel074);
        RegisterPanel registerPanel074 = new RegisterPanel(cardLayout074, cardPanel074);
        // add panels
        JPanel loginPanelWrapper074 = createWrapper(loginPanel074, 600, 750);
        JPanel registerPanelWrapper074 = createWrapper(registerPanel074, 600, 750);

        // add panels to cardLayoutPanel
        cardPanel074.add(dashboard074, "dashboard");
        cardPanel074.add(loginPanelWrapper074, "login");
        cardPanel074.add(registerPanelWrapper074, "register");
        // main panel
        JPanel mainPanel074 = new JPanel();
        mainPanel074.setLayout(new BorderLayout());
        mainPanel074.setBackground(new Color(199, 196, 191));
        mainPanel074.add(cardPanel074, BorderLayout.CENTER);
        //
        MainFrame mainFrame074 = new MainFrame();
        mainFrame074.add(mainPanel074);
        mainFrame074.setVisible(true);
        mainFrame074.setSize(1200, 900);
        mainFrame074.setTitle("Shohoj Travels");
    }

    private static JPanel createWrapper(JPanel panel, int width, int height) {
        JPanel wrapper = new JPanel(new GridBagLayout());
        wrapper.setBackground(new Color(199, 196, 191));
        panel.setPreferredSize(new Dimension(width, height));
        wrapper.add(panel);
        return wrapper;
    }

}