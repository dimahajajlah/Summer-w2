
public class copyObjects {

	public static void main(String[] args) {
		
		
		Caarr Caarr1 = new Caarr("Chevrolet","Camaro",2021);
		Caarr Caarr2 = new Caarr("Ford","Mustang",2022);
		
		
		// Caarr2 = Caarr1; // the same now 7ata al address
		
		
		Caarr2.copy(Caarr1); // hay la nsخ nfs ba3d bs msh nfs address
		//Caarr Caarr2 = new Caarr(Caarr1); // hay bdal ma n3rf ashea2 zay bl awal "Ford","Mustang",2022
		
		System.out.println("ADDRESS c1 : " + Caarr1);
		System.out.println("ADDRESS c2 : " + Caarr2);
		System.out.println();
		System.out.println(Caarr1.getMake());
		System.out.println(Caarr1.getModel());
		System.out.println(Caarr1.getYear());
		System.out.println();
		System.out.println(Caarr2.getMake());
		System.out.println(Caarr2.getModel());
		System.out.println(Caarr2.getYear());		
	
	}
}
//*********************************************
//class Caarr {
class Caarr {
	
	private String make;
	private String model;
	private int year;
	
	Caarr(String make,String model,int year){
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
	}
	
	Caarr(Caarr x){
		this.copy(x);
	}
	
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void copy(Caarr x) {
		this.setMake(x.getMake());
		this.setModel(x.getModel());
		this.setYear(x.getYear());
	}
	

}
