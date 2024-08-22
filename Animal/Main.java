package inclass;

public class Main {
	
	public static void main (String []args) {
		
		Animal[] pets = {
			new Dog("jeno", "samoyed"),
			new Cat("yeji", "tortoiseshell"),
			new Dog("mingyu", "lab"),
			new Cat("jun", "tabby")
		};
		
		//for (Animal pet : pets) {
		//	System.out.println(pet.getName());
		//}
		
		java.util.Arrays.sort(pets);
		
		System.out.println();
		
		for (Animal pet : pets) {
			System.out.println(pet.getName());
		}
		
		//Dog dog = new Dog ("Gus", "Samoyed");
		//Dog puppy = new Dog ("Shona", "Pug");
		
		//dog.setAge(4);
		//puppy.setAge(2);
		
		//System.out.println (dog.getName() + " is a(n) " + dog.getBreed());
		//System.out.println (dog.getName() + " is of age " + dog.getAge());
		//System.out.println (dog instanceof hunts);
		//System.out.println (dog.isSame(puppy));
		
		//System.out.println (puppy.getName() + " is a(n) " + puppy.getBreed());
		//System.out.println (puppy.getName() + " is of age " + puppy.getAge());
		
		//Cat mycat = new Cat ("Gus", "Tabby");
		//mycat.setAge(12);
		//
		//System.out.println (mycat.getName() + " is a(n) " + mycat.getBreed());
		//System.out.println (mycat.getName() + " is of age " + mycat.getAge());
		//System.out.println (mycat.isSame(dog));
		
		
	}

}
