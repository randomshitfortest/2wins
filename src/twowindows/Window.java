package twowindows;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame{
    private JPanel panel;
    public JButton button;
    static int count = 0;
    private JFrame frame;

    Window() {
        panel = new JPanel();
        FlowLayout fl = new FlowLayout();
        panel.setLayout(fl);
        String num = String.valueOf(count);
        button = new JButton(num);
        button.setSize(400,50);
        panel.add(button);

        Controller controller = new Controller(this);
        button.addActionListener(controller);

        frame = new JFrame("FIRST WINDOW");
        frame.setSize(500,200);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocationRelativeTo(null);
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //frame.pack();
        frame.setVisible(true);

    }

    public void shutdown() {
        //count++;
        frame.dispose();
    }

}
