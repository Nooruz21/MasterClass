package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
        //1
        JFrame window = new JFrame();
        //2
        JPanel panel = new JPanel(new GridBagLayout());
        window.add(panel);

        JLabel logo = new JLabel("Google");
        panel.add(logo);

        JTextField textField = new JTextField(13);
        panel.add(textField);

        JButton button = new JButton("Ok");
        panel.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.google.com/search?q=" + textField.getText()
                    ));
                } catch (IOException ex) {
                    ex.printStackTrace();
                } catch (URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });


        window.setVisible(true);
        window.setSize(400, 400);
    }
}

