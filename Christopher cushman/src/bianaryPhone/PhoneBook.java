package bianaryPhone;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class PhoneBook{
	
	public BinarySearchTree data = new BinarySearchTree();
	
	int cap;
	public PhoneBook(int entries) {
		cap = entries;
	}

	public void add(PhoneEntry arg) {
		data.add(arg);
	}
	
	public void display() {
		data.preOrder();
	}
	
	public String lookup(String name) {
		String x = data.lookupNumber(name);
		return name + ": "+x;
	}
	
	public String nameLookup(String name) {
		return data.lookup(name);
	}
	
	public void changeNumber(String name, String number) {
		data.changeNumber(name,number);
	}
	
	public String delete(String name) {
		return data.remove(name).toString();
	}
	
	
	
	public void load() {
		BufferedReader k;
		try {
			k = new BufferedReader(
					new FileReader(
							new File(
									"H:\\git\\at2015\\Christopher cushman\\bin\\bianaryPhone\\phone.txt")));
		} catch (FileNotFoundException e) {
			k = null; // this will never happen
			e.printStackTrace();
		}
		try {
			while (k.ready()) {
				Scanner s = new Scanner(k.readLine());
				add(new PhoneEntry(s.next(),s.next()));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int getCapacity() {
		// TODO Auto-generated method stub
		return cap;
	}

	public int getSize() {
		return data.getSize();
	}
	
	public int getNullBuckets() {
		return 0;
	}
	
	
}

