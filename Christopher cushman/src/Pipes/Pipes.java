package Pipes;

import javax.swing.*;

import java.awt.*;

/**
 * Created by 17cc0151 on 1/4/2016.
 */
public class Pipes {

        public static void main(String[] args)
        {
            JFrame frmMain = new JFrame();
            frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frmMain.setSize(400, 400);

            Canvas cnvs = new Canvas();
            cnvs.setSize(400, 400);

            frmMain.add(cnvs);
            frmMain.setVisible(true);

            Graphics g = cnvs.getGraphics();
            g.setColor(new Color(255, 0, 0));
            double y;
            double x;
            try {
                for (int ii = 0; ii < 5; ii++) {
                	g.drawLine(y, x, arg2, arg3);
                    Thread.sleep(100);
                }
            }catch(InterruptedException E){

            }
            JOptionPane.showMessageDialog(null, lineComponent);
          
        }

}

