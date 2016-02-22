package autoparts;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Scanner;

import moremaps.Acronyms;
import static java.lang.System.*;

public class PartList {
	private TreeMap<Part, Integer> partsMap;

	public PartList() {
		partsMap = new TreeMap<Part, Integer>();
	}

	public PartList(String fileName) throws FileNotFoundException {
		this();
		try {
			Scanner s = new Scanner(new File("H:\\git\\at2015\\Christopher cushman\\bin\\autoparts\\"
					+ fileName));

			while (s.hasNext()) {
				String info = s.nextLine();
				String[] words = info.split(" ");
				String make, model, remaining;
				int year;
				if (words.length == 6) {
					make = words[3];
					model = words[4];
					year = Integer.parseInt(words[5]);
					remaining = words[0] + " " + words[1] + " " + words[2];
				} else {
					make = words[2];
					model = words[3];
					year = Integer.parseInt(words[4]);
					remaining = words[0] + " " + words[1];
				}

				Part newPart = new Part(make + " " + model + " " + year + " "
						+ remaining);

				if (!partsMap.containsKey(newPart)) 
					partsMap.put(newPart, 1);
				else {
					int quantity = partsMap.get(newPart);
					partsMap.put(newPart, quantity + 1);
				}
			}

			s.close();
		} catch (IOException e) // Most specific exceptions must be listed 1st
		{
			System.out.println(e);
		}

	}

	public String toString() {
		StringBuilder output = new StringBuilder();

		Set<Part> keys = partsMap.keySet();

		for(Part s : keys){
			output.append(s.toString() + " - ");
			output.append(partsMap.get(s) + "");
			output.append("\n");
		}

		return output.toString();
	}
}