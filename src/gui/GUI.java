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


        JButton btn = new JButton();
        btn.setText("Haden");
        btn.setSize(100, 100);
        btn.setVisible(true);
        panel.add(btn);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);
        frame.setSize(1440, 720);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
    }
}
