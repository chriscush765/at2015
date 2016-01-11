package monsters;

class Monster implements Comparable<Monster>

{

	int ht, wt, age;

	public Monster() {
		this(0,0,0);
	}

	public Monster(int ht, int wt, int age) {
		this.ht = ht;
		this.wt = wt;
		this.age = age;
	}

	public void setWeight(int wt) {
		this.wt = wt;
	}

	public void setHeight(int ht) {
		this.ht = ht;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Object clone() {
		return new Monster(getWeight(), getHeight(), getAge());
	}

	public int getWeight() {
		return wt;
	}

	public int getHeight() {
		return ht;
	}

	public int getAge() {
		return age;
	}

	public boolean equals(Object o) {
		return this.equals(o);
	}

	public int compareTo(Monster rhs) {
		return getHeight() != rhs.getHeight() ? getHeight() - rhs.getHeight() : getWeight() != rhs.getWeight() ? getWeight() - rhs.getWeight() : getAge() - rhs.getAge();
			
	
	}

	public String toString() {
		return "Weight: "+getWeight()+ ", Height: "+getHeight()+ ", Age: "+getAge();
	}

}