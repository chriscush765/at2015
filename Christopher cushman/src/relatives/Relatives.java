package relatives;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

import static java.lang.System.*;



public class Relatives
{
	public static final Predicate<Object> notNull = o -> o != null;
	
	private Map<String,Set<String>> map;

	public Relatives()
	{
		map = new HashMap<String,Set<String>>();


	}

	public void setPersonRelative(String line)
	{
		String[] things = line.split(" ");
		if(map.containsKey(things[0]))
			map.get(things[0]).add(things[1]);
		else {
			Set<String> temp = new HashSet<String>();
			temp.add(things[1]);
			map.put(things[0],temp);
		}
			
		
	}

	public String getRelatives(String person) {
		StringBuilder s = new StringBuilder();
		s.append(person + " is related to ");
		map.get(person).stream().filter(notNull).forEach(x -> s.append(x + " "));
		return s.toString();
	}

	public String toString()
	{
		StringBuilder s = new StringBuilder();
		for(String key : map.keySet())
			s.append(getRelatives(key) + "\n");
		return s.toString();
	}
}