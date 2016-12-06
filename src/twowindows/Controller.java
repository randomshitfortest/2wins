package twowindows;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.sun.deploy.uitoolkit.ToolkitStore.dispose;

public class Controller implements ActionListener {

    Window parent;


    Controller(Window parent) {
        this.parent = parent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();

        if(!clicked.getActionCommand().equals(null)) {
            parent.count++;
            new Window();

            parent.shutdown();
        }
        if(clicked.getActionCommand().equals("HAHAHA")) {
            System.out.println(clicked.getActionCommand());
            parent.dispose();
            new Window();
            parent.dispose();
        }
}
}
