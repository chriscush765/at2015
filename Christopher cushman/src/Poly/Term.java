package Poly;

import java.security.InvalidParameterException;

public class Term implements Comparable {

	public double a;
	public double b;
	
	public Term(double aA, double aB) {
		a = aA;
		b = aB;
	}
	
	public Term add(Term t){
		if(t.b == b)
			return new Term(a + t.a, b);
		return null;
	}
	
	public Term multiply(Term t){
		return new Term(a*t.a, b+t.b);
	}
	
	public String toString() {
        if (a == 0) {
            return "";
        }
        if (b == 0) {
            if (a < 0) {
                return "- " + (- a);
            }
            return "+ " + a;
        }
        if (a < 0) {
            return "- " + (- a) + "x^" + b + " ";
        }
        return "+ " + a + "x^" + b + " ";
    }
	
	public int compareTo(Object arg) {
		Term t = null;
		try {
			t = (Term) arg;
		} catch (Exception e) {
			throw new InvalidParameterException();
		}
			if(b > t.b)
				return -1;
			if(b < t.b)
				return 1;
			return 0;
	}

	public Term derivative() {
		if((b-1) < 0)
			return null;
		return new Term(a * (b-1), b-1);
	}

}
