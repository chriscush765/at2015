package wrestler;

import java.util.HashMap;

public class TeamMap {

	HashMap<Wrestler,Integer> map = new HashMap<Wrestler,Integer>();
	
	public void add(Wrestler w) {
		int group = w.weight % 100 /10;
		map.put(w,group);
	}

	
	public void changeWeightGroup(Wrestler w, int i) {
		map.remove(w);
		map.put(w,i);
	}

	public int get(Wrestler juan) {
		// TODO Auto-generated method stub
		return map.get(juan);
	}
	
	@Override
	public String toString() {
		return map.toString();
	}
	
	

}
