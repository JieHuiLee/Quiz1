package Apr15Class;

import java.util.Scanner; 

public class Cat {
	
	Scanner read = new Scanner(System.in);
	
	String breed;
	String skinColor;
	double weight;
	String walk;
	String run;
	String climb;
	String sleep;
	String eat;

	 // Create Setter Method and Scanner
	  public void setBreed() {
	    System.out.println("Enter Breed: ");
	    this.breed = read.next();
	  }
	  
	  public void setSkinColor() {
		  System.out.println("Enter Color: ");
		    this.skinColor = read.next();
	  }
	  	  
	  public void setWeight() {
		  System.out.println("Enter Weight: ");
		    this.weight = read.nextDouble();
		  }
	  
	  public void setWalk() {
		  System.out.println("Enter Walk: ");
		    this.walk = read.next();
		  }
	  
	  public void setRun() {
		  System.out.println("Enter Run: ");
		    this.run =  read.next();
		  }
	  
	  public void setClimb() {
		  System.out.println("Enter Climb: ");
		    this.climb = read.next();
		  }
	  
	  public void setSleep() {
		  System.out.println("Enter Sleep: ");
		    this.sleep =  read.next();
		  }
	  
	  public void setEat() {
		  System.out.println("Enter Eat: ");
		    this.eat =  read.next();
		  }
	  
	  // Create Getter Method
	  public String getBreed() {
		  return this.breed;
	  }
	  
	  public String getSkinColor() {
	 	  return this.skinColor;
 	  }
	  
	  public double getWeight() {
		  return this.weight;
	  }
	
	  public String getWalk() {
		  return this.walk;
	  }
	  	  
	  public String getRun() {
		  return this.run;
	  }
	  
	  public String getClimb() {
	 	  return this.climb;
 	  }
	  
	  public String getSleep() {
		  return this.sleep;
	  }
	  
	  public String getEat() {
		  return this.eat;
	  }
	  
	
	// Create a speed() method
	public void speed() {
		System.out.println("\nThe speed of the cat is running as fast as it.");
}
}
