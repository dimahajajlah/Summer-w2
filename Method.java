
public class Method {

	public static void main(String[] args) {

		String name = "Dom";
		int age = 18;
		int x=123;
		int y=321;
		
		hello(name, age);
		
		System.out.println(sum(x,y));

		int z= sum(123,543,652);
		System.out.println(z);

		double z2= sum(12.3,5.43,65.2);
		System.out.println(z2);

		//sum(x,y);
		
		/*final int i = 4;
		System.out.println(i);*/
		
		final int I = 4;
		System.out.println(I);

	}
	
	static void hello(String name, int age) {
		
		System.out.println("Hello " + name + ", You're " + age +" years old\n");
		
	}
	
	//******************INTEGER********************\\

	static int sum(int x, int y) {
		
		//int z=x+y;
		//return z;
		System.out.println("Method #1");

		return x+y;
		
	}
	
	static int sum(int a, int b, int c) {
		
		System.out.println("Method #2");

		return a+b+c;
		
	}
	
   static int sum(int a, int b, int c, int d) {
		
		System.out.println("Method #3");

		return a+b+c+d;
		
	}
   
	//******************DOUBLE********************\\
	static double sum(double x, double y) {
		
		System.out.println("Method #4");

		return x+y;
		
	}
	
	static double sum(double a, double b, double c) {
		
		System.out.println("Method #5");

		return a+b+c;
		
	}
	
    static double sum(double a, double b, double c, double d) {
		
		System.out.println("Method #6");

		return a+b+c+d;
		
	}

}
