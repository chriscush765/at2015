import java.awt.*;
import java.awt.geom.Line2D;

import javax.swing.JOptionPane;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Pipes {


    public static void main(String[] args) {


        Runnable r = new Runnable() {
            public void run() {
                LineComponent lineComponent = new LineComponent(400, 400);
                lineComponent.addFirstLine();

                try {
                    for (int ii = 0; ii < 5; ii++) {
                        lineComponent.addLine();
                        Thread.sleep(100);
                    }
                }catch(InterruptedException E){

                }
                JOptionPane.showMessageDialog(null, lineComponent);

            }
        };
        SwingUtilities.invokeLater(r);
    }
}


class LineComponent extends JComponent {

    Queue <Line2D.Double> lines;
    double x;
    double y;
    Random random;

    LineComponent(int width, int height) {
        super();
        setPreferredSize(new Dimension(width, height));
        lines = new LinkedList<>();
        random = new Random();
    }

    public void addLine() {
        int width = (int) getPreferredSize().getWidth();
        int height = (int) getPreferredSize().getHeight();
        System.out.println(lines.peek().x2);
        Line2D.Double line = new Line2D.Double(
                x,
                y,
                random.nextInt(width),
                random.nextInt(height)
        );
        lines.offer(line);
        x = line.x2;
        y = line.y2;
        repaint();
    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(0, 0, getWidth(), getHeight());
        Dimension d = getPreferredSize();
        g.setColor(Color.black);
        for (Line2D.Double line : lines) {
            g.drawLine(
                    (int) line.getX1(),
                    (int) line.getY1(),
                    (int) line.getX2(),
                    (int) line.getY2()
            );
        }
    }

    public void addFirstLine() {
        int width = (int) getPreferredSize().getWidth();
        int height = (int) getPreferredSize().getHeight();
        Line2D.Double line = new Line2D.Double(
                random.nextInt(width),
                random.nextInt(height),
                random.nextInt(width),
                random.nextInt(height)
        );
        x = line.x2;
        y = line.y2;
        lines.add(line);
    }
}

