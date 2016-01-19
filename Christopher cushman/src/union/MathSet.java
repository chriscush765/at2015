//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -  
//Lab  -  

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Stream.concat;
import static java.lang.System.*;

public class MathSet
{
	private Set<Integer> one;
	private Set<Integer> two;

	public MathSet()
	{
	}

	public MathSet(String o, String t)
	{
	}

	public Set<Integer> union()
	{
		Stream stream1 = one.stream();
		Stream stream2 = one.stream();
		return Stream.concat(stream1, stream2).sorted().collect(Collectors.toSet());
	}

	public Set<Integer> intersection()
	{
		return null;
	}

	public Set<Integer> differenceAMinusB()
	{
		return null;
	}

	public Set<Integer> differenceBMinusA()
	{
		return null;
	}
	
	public Set<Integer> symmetricDifference()
	{		
		return null;
	}	
	
	public String toString()
	{
		return "Set one " + one + "\n" +	"Set two " + two +  "\n";
	}
}