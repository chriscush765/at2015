package moremaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.*;

public class Acronyms
{
	private Map<String,String> acronymTable;

	public Acronyms()
	{
		acronymTable = new HashMap<String,String>();


	}

	public void putEntry(String entry)
	{
		acronymTable.put(entry.split(" - ")[0], entry.split(" - ")[1]);
	}

	public String convert(String sent)
	{
		StringBuilder s = new StringBuilder();
		
		Consumer<String> acronym = x ->{
			boolean hasPeriod = x.contains(".");
			x = x.replaceAll("\\.", "");
			if(acronymTable.containsKey(x))
				x = acronymTable.get(x);
			s.append(x + (hasPeriod?".":"") + " ");
		};
		
		Arrays.stream(sent.split(" ")).forEach(acronym);

		return s.toString();
	}

	public String toString()
	{
		return acronymTable.toString();
	}
}