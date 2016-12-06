package apackage;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {


    View parent; // a reference to the Calculator

    // Constructor stores the reference to the
    // View window in  the member variable parent
    Controller(View parent) {
        this.parent = parent;
    }

    public void actionPerformed(ActionEvent e) {




        // Get the source of this action
        JButton clickedButton = (JButton) e.getSource();

        if (clickedButton.getActionCommand().equals("+")) {
            parent.setDisplayValue("test");
        }

        // Get the existing text from the Calculator�s
        // display field. Reaching inside another object is bad.
        String dispFieldText = parent.getDisplayValue();

        // Get the button's label
        String clickedButtonLabel = clickedButton.getText();

        parent.setDisplayValue(dispFieldText +
                clickedButtonLabel);

        System.out.println(clickedButton.getActionCommand());

    }
}
