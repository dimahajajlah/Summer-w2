
public class inheritance {

	public static void main(String[] args) {


		caard car11 = new caard();
		
		bicycle bick = new bicycle();
		
		car11.go();
		bick.stop();
		System.out.println("The speed of this car is " + car11.speed);
		System.out.println("This bick has " + bick.wheels + " wheels");
		
	}

}

class vehicleddd {
	
	int speed;
	
	void go() {
		System.out.println("This vehicleddd is moving");
	}
	
	void stop() {
		System.out.println("This vehicleddd is stopped");
	}
	
}

class caard extends vehicleddd{
 // 7ata lu 3mlna run ll code bdon m nktb 2she f class caard r7 e3ml run ll 3mleat zy go wi stop	

	int speed = 300;
	int wheels = 4;
	int doors = 4;
}

class bicycle extends vehicleddd{
	 // 7ata lu 3mlna run ll code bdon m nktb 2she f class bicycle r7 e3ml run ll 3mleat zy go wi stop	

	int speed = 30;
	int wheels = 2;
	int doors = 0;
	int pedals = 2;


}

