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
		frmMain.setSize(800, 800);

		Canvas cnvs = new Canvas();
		cnvs.setSize(800, 800);

		frmMain.add(cnvs);
		frmMain.setVisible(true);

		Graphics g = cnvs.getGraphics();
		while(true) {
		g.setColor(new Color(255, 0, 0));
		int y = (int) (Math.random() * (801));
		int x = (int) (Math.random() * (801));
		Queue<Point> lines = new LinkedList<Point>();
		
		for (int ii = 0; ii <= 10; ii++) {
			g.setColor(getRandomColor());
			int a = (int) (Math.random() * (801));
			int b = (int) (Math.random() * (801));
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
	
	private static Color getRandomColor() {
		Random randomNumber = new Random();
	    return new Color(randomNumber.nextFloat(),
	            randomNumber.nextFloat(), randomNumber.nextFloat());
	}

}
