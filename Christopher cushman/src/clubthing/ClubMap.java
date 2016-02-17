package clubthing;

import java.util.*;

public class ClubMap {

	public HashMap<String, ArrayList<Student>> map = new HashMap<String, ArrayList<Student>>();	
	
	public void add(String club, Student student) {
		if(map.get(club) == null) 
			map.put(club, new ArrayList<Student>());
		map.get(club).add(student);
		map.get(club).sort((x,y) -> x.compareTo(y));
	}
	
	public void printClubs() {
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println("Club: "+key);
			ArrayList<Student> students = map.get(key);
			for(Student student : students) {
				System.out.println("Student "+student.toString());
			}
		}
	}
	@Override
	public String toString() {
		for(String key : map.keySet()) {
			System.out.println("-------   "+key+"   -------");
			for(Student s : map.get(key)) {
				System.out.println(s.toString());
			}
		}
		return "";
	}
}
