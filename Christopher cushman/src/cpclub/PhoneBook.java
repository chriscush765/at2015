package cpclub;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class PhoneBook extends Object{

	private Hashtable<Integer, LinkedList<PhoneEntry>> data;
	private int num = 0;
	public PhoneBook() {
		this(100);
	}
	
	public PhoneBook(int numSlots) {
		data = new Hashtable<Integer, LinkedList<PhoneEntry>>();
		num = numSlots;
	}

	public void load() throws IOException {
		BufferedReader k = new BufferedReader(new FileReader(new File("H:\\git\\at2015\\Christopher cushman\\bin\\cpclub\\phone.txt")));

		while(k.ready()) {
			Scanner s = new Scanner(k.readLine());
			add(new PhoneEntry(s.next(), s.next()));

		}
	}
	
	public void add(PhoneEntry obj) {
		int bucket = obj.hashCode() % num;
		if(data.containsKey(bucket)) {
			data.get(bucket).add(obj);
			data.get(bucket).sort((x,y)->x.name.compareTo(y.name));
		} else {
			LinkedList<PhoneEntry> ll = new LinkedList<PhoneEntry>();
			ll.add(obj);
			ll.sort((x,y)->x.name.compareTo(y.name));
			data.put(bucket, ll);
		}
	}
	
	public void changeNumber(String name, String number) {
		for(Integer ll : data.keySet()) 
			for(PhoneEntry p : data.get(ll))
				if(p.name.equals(name))
					p.number = number;
		
	}
	public void display() {
		for(int s : data.keySet()) {
			System.out.println("Bucket: "+ s);
			System.out.println(data.get(s).toString());
			
		}

	}
	
	public int getCapacity() {
		return data.size();
	}
	
	public int getSize() {
		int size = 0;
		for(int s : data.keySet())
			size += data.get(s).size();
		return size;
	}
	
	public int getNullBuckets() {
		return num - data.values().size();
	}
	
	public LinkedList<PhoneEntry> getLongestList() {
		LinkedList<PhoneEntry> yo = new LinkedList<PhoneEntry>();
		for(LinkedList<PhoneEntry> ll : data.values())
			yo = ll.size() > yo.size() ? ll : yo;
		return yo;
	}
	
	public String lookup(String name) {
		for(Integer ll : data.keySet()) {
		for(PhoneEntry p : data.get(ll))
			if(p.name.equals(name))
				return p.number;
		}
		return null;
		
	}
	
	
}

