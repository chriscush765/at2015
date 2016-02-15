package wrestler;

public class Tester {
	public static void main(String[] args) {

		// TODO Auto-generated method stub


		
		TeamSet a=new TeamSet();
		a.add(new Wrestler("Bob",157));
		a.add(new Wrestler("Fred",129));
		a.add(new Wrestler("Jake",100));
		a.add(new Wrestler("Arnold",199));
		a.add(new Wrestler("Stan",120));

		Wrestler juan = new Wrestler("Juan",180);
		a.add(juan);
		System.out.println(a);
		a.changeWeightGroup(juan,10);
		System.out.println("Juan is in Weight Group " +a.get(juan));
		System.out.println();
		System.out.println(a);
		System.out.println(a.getAverage());
		System.out.println(a.lightPeople());
		
		

		}
	
	private static void mapTester() {
		TeamMap a=new TeamMap();
		a.add(new Wrestler("Bob",157));
		a.add(new Wrestler("Fred",129));
		a.add(new Wrestler("Jake",100));
		a.add(new Wrestler("Arnold",199));
		a.add(new Wrestler("Stan",120));

		Wrestler juan = new Wrestler("Juan",180);
		a.add(juan);
		System.out.println(a);
		a.changeWeightGroup(juan,10);
		System.out.println("Juan is in Weight Group " +a.get(juan));
		System.out.println();
		System.out.println(a);

	}
}
