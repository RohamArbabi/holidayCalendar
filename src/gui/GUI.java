package gui;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Component;
import java.awt.Frame;
import java.awt.TextArea;
import main.Main;
public class GUI {

    public static void main(String[] args) {
        Frame frame = new Frame("Holiday Calendar");
        Component textArea = new TextArea("E");
        Component button = new Button("Click this");
        frame.add(textArea, BorderLayout.NORTH);
        frame.add(button, BorderLayout.SOUTH);
        int width = 300;
        int height = 300;
        frame.setSize(width, height);

        frame.setVisible(true);

    }
}
