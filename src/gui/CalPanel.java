package gui;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class CalPanel extends JPanel {
    public static final int PANEL_WIDTH = 1280;
    public static final int PANEL_HEIGHT = 768;

    public static class images {
        public static BufferedImage guher;
    }
    public static class keys {
        public static boolean w = false;
        public static boolean a = false;
        public static boolean s = false;
        public static boolean d = false;
    }
    public static class mouse {
        public static int x, y;
        public static boolean pressed = false;
    }

    public CalPanel() {
        setPanelSize();

        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_W:
                        keys.w = true;
                        break;
                    case KeyEvent.VK_A:
                        keys.a = true;
                        break;
                    case KeyEvent.VK_S:
                        keys.s = true;
                        break;
                    case KeyEvent.VK_D:
                        keys.d = true;
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_W:
                        keys.w = false;
                        break;
                    case KeyEvent.VK_A:
                        keys.a = false;
                        break;
                    case KeyEvent.VK_S:
                        keys.s = false;
                        break;
                    case KeyEvent.VK_D:
                        keys.d = false;
                        break;
                }
            }
        });
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent m) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                mouse.pressed = true;
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                mouse.pressed = false;
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                mouse.x = e.getX();
                mouse.y = e.getY();
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                //sm.mouseMoved(e.getX(), e.getY());
                mouse.x = e.getX();
                mouse.y = e.getY();
            }
        });
        loadImages();
    }

    private BufferedImage importImg(String path) {
        InputStream is = getClass().getResourceAsStream(path);
        try {
            return ImageIO.read(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private void loadImages() {
//        images.clog = importImg("/clog.png");
        images.guher = importImg("/guher.png");
    }

    private void setPanelSize() {
        Dimension size = new Dimension(PANEL_WIDTH, PANEL_HEIGHT);
        setMinimumSize(size);
        setPreferredSize(size);
        setMaximumSize(size);
    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        g.setColor(new Color(0, 0, 0));
        g.fillRect(100, 100, 50, 50);
        g.drawImage(images.guher, 50, 50, 100, 100, null);

        repaint();
    }
}
