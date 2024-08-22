package inclass;

public class Cat extends Animal {
	
	public String breed;
	
	public Cat () {
		
	}
	
	public Cat (String name, String breed) {
		super(name);
		this.breed = breed;
	}
	
	//public String getName () {
	//	return name;
	//}
	
//	public String hunt () {
//		return "hunts mice";
//	}
	
	public boolean isSame (Dog c) {
		if (c.name.equals(name)) {
			return true;
		}
		
		else {return false; }
	}
	
	public String getBreed () {
		return breed;
	}

}
