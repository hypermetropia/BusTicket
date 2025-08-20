package panels;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;

import javax.swing.border.EmptyBorder;
import others.CustomButton;
import others.Globals;

public class Dashboard extends JPanel implements ActionListener {
    CardLayout card;
    JPanel cardPanel;
    GridBagConstraints gbc074 = new GridBagConstraints();
    CustomButton[] buttons074 = new CustomButton[24];
    JButton logoutButton074 = new JButton("Log out");

    JComboBox src074 = new JComboBox<>(Globals.roots074);
    JLabel srcLabel074 = new JLabel("Source: ");
    JComboBox dest074 = new JComboBox<>(Globals.roots074);
    JLabel destLabel074 = new JLabel("Destination: ");
    JSpinner dateSpinner074 = new JSpinner(new SpinnerDateModel(new Date(), null, null, Calendar.DAY_OF_MONTH));
    JLabel dateLabel074 = new JLabel("Date: ");
    JComboBox shift074 = new JComboBox<>(Globals.shifts074);
    JLabel shiftLabel074 = new JLabel("Shift: ");

    public Dashboard(CardLayout card, JPanel cardPanel) {
        this.card = card;
        this.cardPanel = cardPanel;
        setLayout(new BorderLayout());
        // top panel
        JPanel topPanel074 = new JPanel();
        topPanel074.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 60));
        topPanel074.setBackground(Color.WHITE);
        topPanel074.setPreferredSize(new Dimension(0, 150));
        // topPanel074.setBorder(new EmptyBorder(60,0,0,0));
        // src
        JPanel srcPanel074 = new JPanel(new FlowLayout(FlowLayout.LEADING, 10, 0));
        srcLabel074.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));
        srcPanel074.add(srcLabel074);
        src074.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));
        srcPanel074.add(src074);
        srcPanel074.setBackground(Color.WHITE);
        topPanel074.add(srcPanel074);
        // dest
        JPanel destPanel074 = new JPanel(new FlowLayout(FlowLayout.LEADING, 10, 0));
        destLabel074.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));
        destPanel074.add(destLabel074);
        dest074.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));
        destPanel074.add(dest074);
        destPanel074.setBackground(Color.WHITE);

        topPanel074.add(destPanel074);

        // date
        JPanel datePanel074 = new JPanel(new FlowLayout(FlowLayout.LEADING, 10, 0));
        dateLabel074.setFont(new Font(Font.SANS_SERIF,Font.BOLD,18));
        datePanel074.add(dateLabel074);
        dateSpinner074.setFont(new Font(Font.SANS_SERIF,Font.BOLD,18));
        dateSpinner074.setEditor(new JSpinner.DateEditor(dateSpinner074,"dd/MM/yyyy"));
        datePanel074.add(dateSpinner074);
        datePanel074.setBackground(Color.WHITE);
        topPanel074.add(datePanel074);
        // shift
        JPanel shiftPanel074 = new JPanel(new FlowLayout(FlowLayout.LEADING, 10, 0));
         shiftLabel074.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));
        shiftPanel074.add(shiftLabel074);
        shift074.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));
        shiftPanel074.add(shift074);
        shiftPanel074.setBackground(Color.WHITE);
        topPanel074.add(shiftPanel074);

        // left panel
        JPanel leftPanel074 = new JPanel(new GridBagLayout());
        leftPanel074.setPreferredSize(new Dimension(400, 0));
        // init
        int btnIt074 = 0;
        for (int i = 0; i < 4; i++) {
            if (i == 1)
                continue;
            for (int j = 0; j < 8; j++) {
                char seat074 = (char) ('A' + (j % 8));
                String number074 = Integer.toString((i < 1) ? (i + 1) : i);
                String txt074 = "";
                txt074 += seat074;
                txt074 += number074;
                CustomButton btn074 = new CustomButton(txt074, Color.WHITE);
                btn074.addActionListener(this);
                buttons074[btnIt074] = btn074;
                btnIt074++;
            }
        }
        // show grid
        gbc074.fill = GridBagConstraints.BOTH;
        gbc074.weightx = 1.0;
        gbc074.weighty = 1.0;
        gbc074.insets = new Insets(4, 4, 4, 4);
        btnIt074 = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                gbc074.gridx = i;
                gbc074.gridy = j + 1;
                gbc074.fill = GridBagConstraints.BOTH;
                gbc074.weightx = 1.0;
                gbc074.weighty = 1.0;
                gbc074.insets = new Insets(4, 4, 4, 4);

                if (i == 1) {
                    JPanel emptyPanel3 = new JPanel();
                    leftPanel074.add(emptyPanel3, gbc074);
                    continue;
                }

                leftPanel074.add(buttons074[btnIt074], gbc074);
                btnIt074++;
            }
        }

        // south panel and logout button
        logoutButton074.setBackground(Color.decode("#03002e"));
        logoutButton074.setForeground(Color.WHITE);
        logoutButton074.setBorderPainted(false);
        logoutButton074.setFocusPainted(false);
        logoutButton074.setContentAreaFilled(false);
        logoutButton074.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        logoutButton074.setCursor(new Cursor(Cursor.HAND_CURSOR));
        logoutButton074.addActionListener(this);

        JPanel southPanel074 = new JPanel();
        southPanel074.setLayout(new BoxLayout(southPanel074, BoxLayout.LINE_AXIS));
        southPanel074.setPreferredSize(new Dimension(0, 100));
        southPanel074.add(Box.createHorizontalGlue());
        southPanel074.add(logoutButton074);
        southPanel074.setBackground(Color.decode("#03002e"));

        // add panels
        add(topPanel074, BorderLayout.NORTH);
        add(leftPanel074, BorderLayout.WEST);
        add(southPanel074, BorderLayout.SOUTH);
        // setBackground(Color.WHITE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == logoutButton074) {
            Globals.loggedInId = "";
            card.show(cardPanel, "login");
            return;
        }

        for (int i = 0; i < buttons074.length; i++) {
            if (e.getSource() == buttons074[i]) {
                if (buttons074[i].color074 == Color.WHITE)
                    buttons074[i].setBackgroundColor(Color.GREEN);
                else if (buttons074[i].color074 == Color.GREEN)
                    buttons074[i].setBackgroundColor(Color.WHITE);
                return;
            }
        }
    }
}
