package Poly;

public class PolynomialTester {

	public static void main(String[] args) {
		Polynomial p = new Polynomial();
	      p.addTerm(3,4);
	      p.addTerm (-2,4);
	      p.addTerm (1,3);
	      
	      Polynomial q = new Polynomial();
	      q.addTerm(2,4);
	      q.addTerm (-2,3);
	      q.addTerm (1,2);
	      q.addTerm(1,5);;


	System.out.println(p);
	System.out.println(q);
	System.out.println(p.add(q));

	}

}
