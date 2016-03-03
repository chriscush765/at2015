package bianaryPhone;

public class PhoneEntry implements Comparable {

	public String name, number;
	
	public PhoneEntry(String aName, String aNumber) {
		name = aName;
		number = aNumber;
	}
	
	@Override
	public String toString() {
		return name + " " + number;
	}

	@Override
	public int compareTo(Object arg0) {
		return toString().compareTo(arg0.toString());
	}
}
