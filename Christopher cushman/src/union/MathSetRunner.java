package union;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.BufferedReader;
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
		BufferedReader k = new BufferedReader(new FileReader(new File("H:\\git\\at2015\\Christopher cushman\\bin\\union\\mathsetdata.dat")));       

	
			while(k.ready()) {
			MathSet m = new MathSet(k.readLine(),k.readLine());
			System.out.println(m);
			System.out.println(m.union());
			System.out.println(m.intersection());
			System.out.println(m.differenceAMinusB());
			System.out.println(m.differenceBMinusA());
			System.out.println(m.symmetricDifference());
		}
			
				
	

	}
}
