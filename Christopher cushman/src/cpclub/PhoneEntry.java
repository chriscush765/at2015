package cpclub;

public class PhoneEntry {

	public String name, number;
	
	public PhoneEntry(String aName, String aNumber) {
		name = aName;
		number = aNumber;
	}
	
	@Override
	public String toString() {
		return name + " " + number;
	}
}
