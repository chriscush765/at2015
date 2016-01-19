package oddAndEven;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.*;

public class OddEvenSets
{
	private Set<Integer> odds;
	private Set<Integer> evens;

	public OddEvenSets()
	{
		this("");
	}

	public OddEvenSets(String line)
	{
		evens = Arrays.stream(line.split(" ")).map(Integer::parseInt).filter(x->x%2==0).collect(Collectors.toSet());
		odds = Arrays.stream(line.split(" ")).map(Integer::parseInt).filter(x->x%2!=0).collect(Collectors.toSet());
	}

	public String toString()
	{
		return "ODDS : " + odds + "\nEVENS : " + evens + "\n\n";
	}
}