package gui;

import javax.swing.JFrame;

public class CalWindow extends JFrame {

    private JFrame jframe;
    public CalWindow(CalPanel calPanel) {
        jframe = new JFrame();

        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.add(calPanel);
        jframe.setResizable(false);
        jframe.pack();
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);
    }
}
