package Apr15Class;

public class Main {

	public static void main(String[] args) {
		Cat c = new Cat(); //letter c represent cat
		
		c.setBreed();
		c.setSkinColor();
		c.setWeight();
		c.setWalk();
		c.setRun();
		c.setClimb();
		c.setSleep();
		c.setEat();
		
		System.out.println("----Welcome to Pet Shop----");
		System.out.println("Pet : Cat");
		System.out.println("==============================");
		System.out.println("Breed\t\t : " + c.getBreed());
		System.out.println("Skin Color\t : " + c.getSkinColor());
		System.out.println("Weight\t\t : " + c.getWeight()+ "kg");
		//Behaviour of Cat
		System.out.println("Walk  : " + c.getWalk());
		System.out.println("Run   : " + c.getRun());
		System.out.println("Climb : " + c.getClimb());
		System.out.println("Sleep : " + c.getSleep());
		System.out.println("Eat : " + c.getEat());
		
		c.speed();

	}

}
