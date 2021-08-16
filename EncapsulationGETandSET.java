
public class EncapsulationGETandSET {

	public static void main(String[] args) {


		Dima d1 = new Dima("Dom" , 18);
		
		System.out.println("Hi " + d1.getName() + " You're " + d1.getAge() + " years old, right?");
		System.out.println("sorry you're not?! ok then see this ..!");
		d1.setAge(19);
		System.out.println("Hi " + d1.getName() + " You're " + d1.getAge() + " years old");


	}

}

class Dima {
	// lazem al name of class : car ;; bass fe car so chter
	
	private String name;
	private int age;
	
	Dima(String name, int age){
		//this.name = name;
		//this.age = age;
		// lma n7ot set had bser haed
		
		this.setName(name);
		this.setAge(age);
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
}
