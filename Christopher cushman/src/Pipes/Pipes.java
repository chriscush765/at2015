package Pipes;

import javax.swing.*;

import java.awt.*;
import java.util.*;

/**
 * Created by 17cc0151 on 1/4/2016.
 */
public class Pipes {

	public static void main(String[] args) throws InterruptedException {
		JFrame frmMain = new JFrame();
		frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMain.setSize(400, 400);

		Canvas cnvs = new Canvas();
		cnvs.setSize(400, 400);

		frmMain.add(cnvs);
		frmMain.setVisible(true);

		Graphics g = cnvs.getGraphics();
		g.setColor(new Color(255, 0, 0));
		int y = (int) (Math.random() * (401));
		int x = (int) (Math.random() * (401));
		Queue<Point> lines = new LinkedList<Point>();
		
		for (int ii = 0; ii <= 5; ii++) {
			int a = (int) (Math.random() * (401));
			int b = (int) (Math.random() * (401));
			lines.offer(new Point(x, y));
			lines.offer(new Point(a, b));
			g.drawLine(x, y, a, b);
			x = a;
			y = b;
			Thread.sleep(250);
		}

		g.setColor(Color.WHITE);
		while (!lines.isEmpty()) {
			Point beg = lines.poll();
			Point end = lines.poll();
			g.drawLine(beg.x, beg.y, end.x, end.y);
			Thread.sleep(250);
		}

	}

}
