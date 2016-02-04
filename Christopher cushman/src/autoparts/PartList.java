package autoparts;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

import moremaps.Acronyms;
import static java.lang.System.*;

public class PartList {
	private TreeMap<Part, Integer> partsMap;

	public PartList() {

	}

	public PartList(String fileName) throws FileNotFoundException {
		this();
		partsMap = new TreeMap<Part, Integer>();
		try {

			StringBuilder s = new StringBuilder();
			BufferedReader k = new BufferedReader(new FileReader(new File(
					"H:\\git\\at2015\\Christopher cushman\\bin\\autoparts\\"
							+ fileName)));

			while (k.ready()) {
				String words[] = k.readLine().split(" ");
				int i = 0;
				for (; i < words.length; i++) {
					if(words[i].matches("[-+]?\\d*\\.?\\d+")) {
						System.out.println(words[i]);
						break; //keep going until we find a number
				}
				}
				System.out.println(i);
				Part part = new Part((words[i + 1]) + (words[i + 2]) + (words[i + 3]));
				int code = Integer.parseInt(words[i]);
				partsMap.put(part,code);
				
			}
			System.out.println(partsMap.toString());
		} catch (IOException io) {
		}

	}

	public String toString() {
		String output = "";

		return output;
	}
}