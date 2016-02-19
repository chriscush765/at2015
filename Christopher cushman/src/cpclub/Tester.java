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
		PhoneBook pb = new PhoneBook();
		try {
			pb.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pb.display();
	}
}
