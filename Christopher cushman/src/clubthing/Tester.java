package clubthing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import spanish.SpanishToEnglish;

public class Tester {
	public static void main(String args[]) throws IOException {
		BufferedReader k = new BufferedReader(
				new FileReader(
						new File(
								"H:\\git\\at2015\\Christopher cushman\\bin\\clubthing\\student.txt")));

		while(k.ready());
		
	}
}
