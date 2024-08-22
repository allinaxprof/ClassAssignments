package inclass;

public class Dog extends Animal {
	
	public String breed;
	
	public Dog (String name, String breed) {
		super(name);
		this.breed = breed;
	}
	
	//public String getName () {
	//	return name;
	//}
	
//	public String hunt () {
//		return "hunts animals";
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
