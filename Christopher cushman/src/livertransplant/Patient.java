package livertransplant;

public class Patient implements Comparable {

	String name;
	int priority;
	
	public Patient(String name, int priority) {
		this.name = name;
		this.priority = priority;
	}

	public int compareTo(Object arg0) {
		Patient x = (Patient)arg0;
		 return priority - x.priority;
	}
	

	public String toString() {
		return name + ", " + priority;
	}
}
