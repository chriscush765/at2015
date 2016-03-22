package bianaryPhone;

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
		pb.load();
		pb.display();
		System.out.println();
		System.out.println(" ---- getting Henson ----");
		System.out.println(pb.lookup("Henson"));
		System.out.println(" ---- changing num for Henson ----\n");
		pb.changeNumber("Henson", "123123123123");
		System.out.println(pb.lookup("Henson"));
		System.out.println(pb.nameLookup(name));
	}
}
