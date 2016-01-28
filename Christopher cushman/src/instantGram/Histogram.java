package instantGram;

import java.util.*;
import java.util.stream.Collectors;

public class Histogram
{
	private Map<String,Integer> histogram;

	public Histogram()
	{
		this("");
	}

	public Histogram(String sent)
	{
		setSentence(sent);
	}
	
	public void setSentence(String sent)
	{
		histogram = new HashMap<String,Integer>();
		Arrays.stream(sent.split(" ")).forEach((s) -> histogram.put(s, histogram.get(s) == null ? 1 : histogram.get(s) + 1));
	}

	public String toString()
	{
		StringBuilder output = new StringBuilder();
		histogram.entrySet().stream().map((s) -> s.getKey() +"   " + astrix(s.getValue()) + "\n").forEach((s)->output.append(s));
		
		return "    1---5----01---5\n" + output.toString();
	}
	
	private String astrix(int num) {
		StringBuilder build = new StringBuilder();
		while(num > 0) {
			build.append("*");
			num--;
		}
		return build.toString();
	}
}