package relatives;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import spanish.SpanishToEnglish;
import static java.lang.System.*;

public class RelativesRunner
{
	public static void main( String args[] ) throws IOException
	{
		BufferedReader k = new BufferedReader(
				new FileReader(
						new File(
								"H:\\git\\at2015\\Christopher cushman\\bin\\relatives\\relatives.dat")));

		int count = Integer.parseInt(k.readLine());
		Relatives r = new Relatives();
		while (count > 0) {
			r.setPersonRelative(k.readLine());
			count--;
		}
		System.out.println(r.toString());
		while (k.ready())
			System.out.println(r.getRelatives(k.readLine()));
	}	
	
}