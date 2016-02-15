package wrestler;

public class Wrestler

{

	/**
	 * 
	 * Constructor for objects of class Wrestler
	 */

	String name;
	int weight;

	public Wrestler(String theName, int theWeight)

	{

		name = theName;

		weight = theWeight;

	}

	public int getWeight()

	{

		return weight;

	}

	public String getName()

	{

		return name;

	}

	public String toString()

	{

		return name + "  " + weight;

	}

}
