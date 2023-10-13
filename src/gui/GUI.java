package gui;
//import java.awt.BorderLayout;
//import java.awt.Button;
//import java.awt.Component;
//import java.awt.Frame;
//import java.awt.TextArea;

import main.Main;

import javax.swing.*;
import java.awt.*;

public class GUI {

    public GUI() {
        JFrame frame = new JFrame("fromug");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());


        JTextPane textPane = new JTextPane();
        textPane.setSize(1000, 1000);
        textPane.setVisible(true);
        panel.add(textPane);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);
        frame.setSize(1440, 720);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
    }
}
