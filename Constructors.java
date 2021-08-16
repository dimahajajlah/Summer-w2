
public class Constructors {

	public static void main(String[] args) {
		
		Human h1 = new Human("Rick",65,70);
		Human h2 = new Human("Morty",16,50);
			
		h1.drink();
		h2.eat();
		
		System.out.println(h1.name);

	}

}


class Human {

	String name;
	int age;
	double weight;
	
	Human(String name,int age,double weight){
		
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	void eat() {
		System.out.println(this.name+" is eating");
	}
	void drink() {
		System.out.println(this.name+" is drinking *burp*");
	}
		
}