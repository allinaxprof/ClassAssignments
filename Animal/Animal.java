package inclass;

public abstract class Animal implements Lists {
	
	public static final String KINGDOM = "Animalia";
	protected String name;
	protected int age;
	
	public Animal () {
		//public abstract void pelt() {};
	}
	
	public Animal (int a) {
		this("animal", a);
	}
	
	public Animal (String n) {
		this(n, 1);
	}
	
	public Animal (String n, int age) {
		name = n;
		this.age = age;
	}
	
	public boolean equals(Object o){
        return this.compareTo((Animal) o) == 0;
	}

	@Override
	public int compareTo(Animal t){
		String thisName = this.getName();
		String theirName = t.getName();

		if(thisName.length() > theirName.length()) return 1;
		if(thisName.length() < theirName.length()) return -1;
		return 0;
	}
	
	public String getName () {
		return name;
	}
	
	public int getAge () {
		return age;
	}
	
	public void setAge (int a) {
		age = a;
	}

}
