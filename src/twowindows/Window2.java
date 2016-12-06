package twowindows;

import javax.swing.*;
import java.awt.*;

public class Window2 extends Window {
    private JPanel panel;
    public JButton button;

    Window2() {
        panel = new JPanel();
        BorderLayout bl = new BorderLayout();
        panel.setLayout(bl);
        button = new JButton("HAHAHA");
        panel.add("Center", button);

        Controller controller = new Controller(this);
        button.addActionListener(controller);

        JFrame frame = new JFrame("SECOND WINDOW");
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        //just testing shit
        System.out.println();

    }
}
