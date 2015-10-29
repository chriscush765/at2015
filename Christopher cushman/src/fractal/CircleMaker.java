package fractal;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.awt.geom.GeneralPath;

public class CircleMaker

{

   public void draw(Graphics2D g2, int iteration, double x, double y, double size, Color color)

   {
	   try{
		   Thread.currentThread().sleep(10);
	   }
	   catch(Exception e){
		   
	   }
      if (iteration == 1){
         g2.drawOval((int)x,(int)y,(int)size,(int)size);
      }

      else {
    	  double distance = (size / 2) + (size / 4);   
    	  iteration--;
          double x1 = x + (size / 4);
          double y1 = y + (size / 4);
          int R = (int)(Math.random()*256);
     	  int G = (int)(Math.random()*256);
     	  int B= (int)(Math.random()*256);
     	  Color newColor = new Color(R, G, B);
    	  draw(g2, iteration, x1 + distance, y1, (size/2), newColor);
          draw(g2, iteration, x1 - distance, y1, (size/2), newColor);
          draw(g2, iteration, x1, y1 + distance, (size/2), newColor);
          draw(g2, iteration, x1, y1 - distance, (size/2), newColor);
          draw(g2, iteration, x1 + distance, y1 + distance, (size/2), newColor);
          draw(g2, iteration, x1 - distance, y1 - distance, (size/2), newColor);
          draw(g2, iteration, x1 - distance, y1 + distance, (size/2), newColor);
          draw(g2, iteration, x1 + distance, y1 - distance, (size/2), newColor);
          
    	  g2.setStroke(new BasicStroke((float)(iteration / 1.5)));
    	  g2.setColor(color);
         g2.drawOval((int)x,(int)y,(int)size,(int)size);
      }
   }
}