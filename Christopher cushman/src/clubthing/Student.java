package clubthing;

public class Student {
	public String first, last, id;
	
	public Student(String aFirst,String aLast,String aId) {
		first = aFirst;
		last = aLast;
		id = aId;
	}
	
	public String toString() {
		return first + " " + last + " " + id;
	}

	public int compareTo( Student rhs )
	{
		return toString().compareTo(rhs.toString());
	}
}
