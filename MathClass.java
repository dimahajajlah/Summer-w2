import java.util.*;

public class MathClass {

	public static void main(String[] args) {
		
		/*
		int x=16;
		int d=25;
		int z = (int) Math.max(d,x);
		System.out.println(z); */
		
		double a,b,c;
		Scanner dima = new Scanner(System.in);
		System.out.println("Enter sie a: ");
		a = dima.nextDouble();
		System.out.println("Enter sie b: ");
		b = dima.nextDouble();
		c = Math.sqrt((a*a)+(b*b));
		System.out.println("The Hypotenuse is: " + c);

	}

}
