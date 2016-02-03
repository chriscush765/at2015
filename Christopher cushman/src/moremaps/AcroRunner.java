package moremaps;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import spanish.SpanishToEnglish;
import static java.lang.System.*;

public class AcroRunner
{
	public static void main( String args[] ) throws IOException
	{
		BufferedReader k = new BufferedReader(
				new FileReader(
						new File(
								"H:\\git\\at2015\\Christopher cushman\\bin\\moremaps\\acro.dat")));

		int count = Integer.parseInt(k.readLine());
		Acronyms a = new Acronyms();
		while (count > 0) {
			a.putEntry(k.readLine());
			count--;
		}
		System.out.println("====    MAP CONTENTS     ====");
		System.out.println(a.toString());
		System.out.println("====    READ LINES      ====");
		while (k.ready())
			System.out.println(a.convert(k.readLine()));
	}
}