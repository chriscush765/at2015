package spanish;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

import static java.lang.System.*;

public class SpanishToEnglish {
	private Map<String, String> pairs;

	public SpanishToEnglish() {
		pairs = new HashMap<String, String>();

	}

	public void putEntry(String entry) {
		String[] list = entry.split(" ");
		pairs.put(list[0], list[1]);
	}

	public String translate(String sent) {
		Scanner in = new Scanner(sent);
		StringBuilder out = new StringBuilder();

		while (in.hasNext()) {
			String key = in.next();
			if (pairs.containsKey(key))
				out.append(pairs.get(key)+ " ");
			else
				out.append("["+key+"] ");
		}
		return out.toString();
	}

	public String toString() {
		return pairs.toString().replaceAll("\\,", "\n");
	}
}