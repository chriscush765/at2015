package autoparts;
public class Part implements Comparable<Part>
{
	public String make, mode, rest;
	private int year;

	public Part(String line) 
	{
		String[] list = line.split(" ");

		make = list[0];
		mode = list[1];
		year = Integer.parseInt(list[2]);
		
		rest = "";
		for(int x = 3; x<list.length; x++){
			rest+=list[x] + " ";
		}
	}

	//have to have compareTo if implements Comparable
	public int compareTo( Part rhs )
	{
		return toString().compareTo(rhs.toString());
	}

	public String toString()
	{
		return make+ " " + mode+ " " + year+ " " + rest;
	}
}