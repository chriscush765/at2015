package fractal;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.awt.geom.GeneralPath;
import java.awt.Polygon;

public class CircleComponent extends JComponent

{

	private int numIterations;

	private int width;

	public CircleComponent(int iters, int width)

	{

		numIterations = iters;
		
		this.width = width;

	}

	public void paintComponent(Graphics g)

	{

		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		CircleMaker koch = new CircleMaker();

		double size = width / 3;
		
		double x1 = (width / 2 ) - (size / 2);
		JLabel label1 = new JLabel("Test");
		
		int R = (int)(Math.random()*256);
	 	  int G = (int)(Math.random()*256);
	 	  int B= (int)(Math.random()*256);
	 	 Color color = new Color(R, G, B);
	 	  
		koch.draw(g2, numIterations, x1, x1, size, color);


	}

	public static void main(String[] args)

	{

		JFrame frame = new JFrame();

		final int FRAME_WIDTH = 1000;

		final int FRAME_HEIGHT = 1000;

		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);

		frame.setTitle("Circle Amaze");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		String input = JOptionPane
				.showInputDialog(null, "Number of iterations");

		if (input == null)

			System.exit(0);

		int iterations = Integer.parseInt(input);
		
		frame.setVisible(true);

		CircleComponent component = new CircleComponent(iterations, FRAME_WIDTH);

		frame.add(component);

		

	}

}