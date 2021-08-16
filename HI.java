import java.util.*;

public class HI {
	
	public static void main (String [] args) {
		/* System.out.println("\"HI\"");
		long c=3;
		System.out.println(c); */
		
		System.out.println("What's your name?");
		Scanner dima = new Scanner(System.in);
		String name = dima.nextLine();
		
		System.out.println("How old are U?");
		Scanner agee = new Scanner(System.in);
		
		int age = agee.nextInt();
		
		System.out.println("************");
		System.out.println("Your name is: " + name + "\n" + "Your age is: " + age);
		
		
	}

}
