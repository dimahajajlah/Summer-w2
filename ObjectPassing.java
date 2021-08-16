
public class ObjectPassing {

	public static void main(String[] args) {
		
		
		Garage garage = new Garage();
		/*
		Car car1 = new Car("BMW");
		Car car2 = new Car("ford");
		
		garage.park(car1);
		garage.park(car2);*/
		
		carr car1 = new carr("BMW");
		carr car2 = new carr("ford");
		
		garage.park(car1);
		garage.park(car2);
		
		/*for (int i=1; i<carr; i++) {
			garage.park(car);
		}*/

	}

}

/*class Car {
	
	String name;
	
	Car(String name){
		this.name = name;
	}
	
	/*Car car1 = new Car("BMW");
	Car car2 = new Car("ford");
	
	garage.park(car1);
	garage.park(car2);*/
	
//}

class Garage{
	
	void park( carr car1){
		
		System.out.println("The "+ car1.name + " is parked in the garage");
		
	}
	
}

class carr{
	
String name;
	
carr(String name){
		this.name = name;
	}
	
}
