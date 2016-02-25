package cpclub;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import moremaps.Acronyms;

public class Tester {
	public static void main(String[] args)  {
		PhoneBook pb = new PhoneBook(500000);
		try {
			pb.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pb.display();
		System.out.println(" ---- capacity ----\n");
		System.out.println(pb.getCapacity());
		System.out.println(" ---- size ----\n");
		System.out.println(pb.getSize());
		System.out.println(" ---- null buckets ----\n");
		System.out.println(pb.getNullBuckets());
		System.out.println(" ---- longest list ----\n");
		System.out.println(pb.getLongestList());
		System.out.println(" ---- getting Henson ----\n");
		System.out.println(pb.lookup("Henson"));
		System.out.println(" ---- changing num for Henson ----\n");
		pb.changeNumber("Henson", "123123123123");
		System.out.println(pb.lookup("Henson"));
	}
}
