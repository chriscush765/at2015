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



	}

	//have to have compareTo if implements Comparable
	public int compareTo( Part rhs )
	{
		if(this.make.compareTo(rhs.make) != 0)
			return this.make.compareTo(rhs.make);
		if(this.mode.compareTo(rhs.mode) != 0)
			return this.mode.compareTo(rhs.mode);
		if(Math.abs(this.year - rhs.year) != 0)
			return this.year - rhs.year;
		return 0;
	}

	public String toString()
	{
		return make + " " + mode + " " + year;
	}
}