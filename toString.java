
public class toString {

	public static void main(String[] args) {

		  
		  // toString() = special method that all objects inherit, 
		  //    that returns a string that "textually represents" an object.
		  //    can be used both implicitly and explicitly
		  
		  Cardd car = new Cardd();
		  
		  
		  System.out.println(car.toString());
		  
		  // or
		  
		  System.out.println(car);

		    
		 }
		}
		//***************************************
		class Cardd {


		 String make = "Ford";
		 String model = "Mustang";
		 String color = "red";
		 int year = 2021;
		 
		 public String toString() {
		  
		  return make +"\n"+model+"\n"+color+"\n"+year;

	}

}
