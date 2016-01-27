package spanish;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import union.MathSet;
import static java.lang.System.*;

public class SpanRunner {
	public static void main(String args[]) throws IOException {
		BufferedReader k = new BufferedReader(
				new FileReader(
						new File(
								"H:\\git\\at2015\\Christopher cushman\\bin\\spanish\\spantoeng.dat")));

		int count = Integer.parseInt(k.readLine());
		SpanishToEnglish t = new SpanishToEnglish();
		while (count > 0) {
			t.putEntry(k.readLine());
			count--;
		}
		while (k.ready())
			System.out.println(t.translate(k.readLine()));
	}
}