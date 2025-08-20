package others;

import javax.swing.*;

import org.w3c.dom.events.MouseEvent;

import java.awt.*;
import java.awt.event.MouseAdapter;

public class CustomButton extends JButton {
    public Color color074=Color.WHITE;
    public String text;
    public CustomButton(String text, Color bg) {
        super(text);
        this.text = text;
        color074=bg;
        setBackground(color074);
        setFocusPainted(false);
        setBorderPainted(false);
        setOpaque(true);
        addActionListener(null);
        setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
        //hover Effect
        addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                setBackground(color074.darker());
            }

            public void mouseExited(MouseEvent evt) {
                setBackground(color074);
            }
        });
    }
    public void setBackgroundColor(Color bg){
        color074 = bg;
        setBackground(color074);
    }

}
