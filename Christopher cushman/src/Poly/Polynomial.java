package Poly;
import Poly.*;

import java.util.LinkedList;
import java.util.ListIterator;

public class Polynomial {
	private LinkedList<Term> li = new LinkedList();

	public void addTerm(Term t) {
		this.addTerm(t.a, t.b);
	}

	public void addTerm(final double coefficient, final double power) {
        final Term term = new Term(coefficient, power);
        final ListIterator<Term> iter = this.li.listIterator();
        if (iter.hasNext() && iter.next().b == power) {
            final Term term2 = iter.previous().add(term);
            iter.set(term2);
            return;
        }
        if (iter.hasPrevious() && iter.previous().b < power) {
            this.li.addFirst(term);
            return;
        }
        while (iter.hasNext()) {
            if (iter.next().b == power) {
                final Term term2 = iter.previous().add(term);
                iter.set(term2);
                return;
            }
            iter.previous();
            if (iter.hasNext() && iter.next().b < power) {
                iter.previous();
                iter.add(term);
                return;
            }
        }
        this.li.addLast(term);
    }

	public Polynomial add(Polynomial other) {
		ListIterator<Term> iter = this.li.listIterator();
		ListIterator<Term> oIter = other.getIterator();
		Polynomial newP = new Polynomial();
		while (iter.hasNext()) {
			newP.addTerm(iter.next());
		}
		while (oIter.hasNext()) {
			newP.addTerm(oIter.next());
		}
		return newP;
	}

	public Polynomial derivative() {
		ListIterator<Term> iter = this.li.listIterator();
		Polynomial newP = new Polynomial();
		while (iter.hasNext()) {
			Term term = iter.next();
			newP.addTerm(term.b * term.a, term.b - 1.0);
		}
		return newP;
	}

	public Polynomial multiply(Polynomial other) {
		ListIterator<Term> iter = this.li.listIterator();
		ListIterator<Term> oIter = other.getIterator();
		Polynomial newP = new Polynomial();
		while (iter.hasNext()) {
			Term term = iter.next();
			while (oIter.hasNext()) {
				newP.addTerm(term.multiply(oIter.next()));
			}
			oIter = other.getIterator();
		}
		return newP;
	}

	public ListIterator<Term> getIterator() {
		return this.li.listIterator();
	}

	 public String toString() {
	        String ret = "";
	        final ListIterator<Term> iter = this.li.listIterator();
	        while (iter.hasNext()) {
	            ret = String.valueOf(ret) + iter.next();
	        }
	        return ret;
	    }
}