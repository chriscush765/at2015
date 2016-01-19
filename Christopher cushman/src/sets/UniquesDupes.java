package sets;
import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Collectors;

import static java.lang.System.*;

public class UniquesDupes
{
	public static Set<String> getUniques(String input)
	{
		return Arrays.stream(input.split(" ")).collect(Collectors.toCollection(TreeSet<String>::new));
	}

	public static Set<String> getDupes(String input)
	{
		Set<String> uniques = new TreeSet<String>();
		return Arrays.stream(input.split(" ")).filter(p -> !uniques.add(p)).collect(Collectors.toCollection(TreeSet<String>::new));
	}
}