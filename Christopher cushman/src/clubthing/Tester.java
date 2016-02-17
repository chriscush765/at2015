package clubthing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import spanish.SpanishToEnglish;

public class Tester {
	public static void main(String args[]) throws IOException {
		ClubMap cm = new ClubMap();
		BufferedReader k = new BufferedReader(
				new FileReader(
						new File(
								"H:\\git\\at2015\\Christopher cushman\\bin\\clubthing\\student.txt")));
		
		while(k.ready()) {
			String line = k.readLine();
			Scanner s = new Scanner(line);
			String first = s.next();
			String last = s.next();
			String id = s.next();
			String club = s.next();
			cm.add(club, new Student(first, last, id));
		}
		
		System.out.println(cm.toString());
		
	}
}
