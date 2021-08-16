
public class coffeeCupMain {

	public static void main(String[] args) {
		
		cup dcup = new cup();
		System.out.println(dcup.color);
		System.out.println(dcup.empty);
		System.out.println(dcup.remp);
		
		dcup.spill();
		dcup.drink();

	}

}

class cup {
	
	String color = "White";
	int remp = 20;
	boolean empty = true;
	
	void drink(){
		System.out.println("You drink the coffee");
	}
	
	void spill(){
		System.out.println("You spill the coffee");
	}
	
}


