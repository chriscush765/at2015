package wrestler;

import java.util.*;

public class TeamSet {
	Set<Wrestler> map = new HashSet<Wrestler>();
	
	public void add(Wrestler w) {
		map.add(w);
	}

	public void changeWeightGroup(Wrestler w, int i) {
		map.remove(w);
		w.weight = i;
		map.add(w);
	}

	public int get(Wrestler juan) {
		// TODO Auto-generated method stub
		Iterator<Wrestler> i = map.iterator();
		while(i.hasNext()) {
			 Wrestler w = i.next();
		if(w.equals(juan)) {
			return w.weight;
		}}
		return -1;
	}
	
	public int getAverage() {
		double x = 0;
		double y = 0;
		Iterator<Wrestler> i = map.iterator();
		while(i.hasNext()) {
		 x+=i.next().weight;
		 y++;
		}
		return (int)(x/y);
	}
	
	public Set lightPeople() {
		Iterator<Wrestler> i = map.iterator();
		Set<Wrestler> lightPeople = new HashSet<Wrestler>();
		while(i.hasNext()) {
		 Wrestler w = i.next();
		 if(w.weight<120)
			 lightPeople.add(w);
		
		}
		return lightPeople;
	}
	
	@Override
	public String toString() {
		return map.toString();
	}
	
}
