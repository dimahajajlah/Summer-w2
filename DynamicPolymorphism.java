import java.util.Scanner;

public class DynamicPolymorphism {

	public static void main(String[] args) {
		  
		  //Dynamic Polymorphism
		  
		  Scanner scanner = new Scanner(System.in);
		  Animalll animal;
		  
		  System.out.println("What animal do you want?"); 
		  System.out.print("(1=dog) or (2=cat): ");
		  int choice = scanner.nextInt();
		  
		  if(choice==1) {
		   animal = new Doggg();
		   animal.speak();
		  }
		  else if(choice==2) {
		   animal = new Cat();
		   animal.speak();
		  }
		  else {
		   animal = new Animalll();
		   System.out.println("That choice was invalid");
		   animal.speak();
		  }
		 }
		}
		//***********************************************
		 class Animalll {

		 public void speak() {
		  System.out.println("animal goes *brrrr*");
		 }
		}
		//***********************************************
		 class Doggg extends Animalll{

		 @Override
		 public void speak() {
		  System.out.println("dog goes *bark*");
		 }
		}
		//***********************************************
		 class Cat extends Animalll{

		 @Override
		 public void speak() {
		  System.out.println("cat goes *meow*");

	}

}
