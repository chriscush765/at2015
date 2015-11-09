package test;

import java.util.Vector;

public class BarkTester {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Vector<Bark> barks = new Vector<Bark>();
		barks.add(new Bark());
		Bark newBark = barks.get(0).getClass().newInstance();
		barks.get(0).bark();
		System.out.println(barks.get(0).barks);
		System.out.println(newBark.barks);

	}

}
