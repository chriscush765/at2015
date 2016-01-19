//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import oddAndEven.OddEvenSets;
import static java.lang.System.*;

public class MathSetRunner
{
	public static void main(String args[]) throws IOException
	{
		Scanner s = new Scanner(new FileReader("H:\\git\\at2015\\Christopher cushman\\src\\oddAndEven\\oddevendata.dat"));
		ArrayList<String> a = new ArrayList<String>();
		
		while(s.hasNext())
			a.add(s.nextLine());
	
		for(String x : a)
			System.out.println(new OddEvenSets(x));
				
	

	}
}
