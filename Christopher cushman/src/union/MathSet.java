package union;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -  
//Lab  -  

import java.util.HashSet;
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
		this.one=Arrays.stream(o.split(" ")).map(x->Integer.parseInt(x)).collect(Collectors.toSet());
		this.two=Arrays.stream(t.split(" ")).map(x->Integer.parseInt(x)).collect(Collectors.toSet());
	}

	public Set<Integer> union()
	{
		Stream<Integer> stream1 = one.stream();
		Stream<Integer> stream2 = two.stream();
		return Stream.concat(one.stream(), stream2).sorted().collect(Collectors.toSet());
	}

	public Set<Integer> intersection()
	{
		HashSet<Integer> temp = new HashSet<Integer>(one);
		temp.retainAll(two);
		return temp;
	}

	public Set<Integer> differenceAMinusB()
	{
		HashSet<Integer> temp = new HashSet<Integer>(one);
		temp.removeAll(two);
		return temp;
	}

	public Set<Integer> differenceBMinusA()
	{
		HashSet<Integer> temp = new HashSet<Integer>(two);
		temp.removeAll(one);
		return temp;
	}
	
	public Set<Integer> symmetricDifference()
	{		
		Set<Integer> temp = union();
		temp.removeAll(intersection());
		return temp;
	}	
	
	public String toString()
	{
		return "Set one " + one + "\n" +	"Set two " + two +  "\n";
	}
}