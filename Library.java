import java.util.*;

public class Library {

	public static void main(String[] args) {
		
		while (true) {
		    System.out.println ( "\t \t  ** Welcome **  \t \t ");
	        System.out.println ( "  \nWe have\n1.Book"
	                + " \n2.Pen"
	        		+ " \n3.Paper"
	        		+ " \n9.to exit");
	        
	        System.out.print ( "\nEnter Your Choice : ");
	        Scanner s = new Scanner(System.in);
		
		int ch = s.nextInt();
		switch (ch){
		case 1:
			
			while(true) {
				book b1 = new book();
				System.out.println ( "\t \t  ** Book  **  \t \t ");
		        System.out.println ( "  \nAll you need to know\n1.book name"
		                + " \n2.book pages"
		        		+ " \n3.book writer"
		        		+ " \n4.is book exist"
		        		+ " \n5.book price"
		        		+ " \n6.Order It"
		        		+ " \n7.Rent It"
		        		+ " \n8.Sell It"
		        		+ " \n9.to exit");
				
		        
				Scanner dd= new Scanner(System.in);
				int d = dd.nextInt();
				//int operation = dd.nextInt();
				//switch (operation){
				switch (d){
				case 1:
					System.out.println("\n\t || ***** ||");
					System.out.println("\t Name : " + b1.name);
					System.out.println("\t || ***** ||");

					break;
				case 2:
					System.out.println("\n\t || ***** ||");
					System.out.println("\t Pages : " + b1.pages);
					System.out.println("\t || ***** ||");
					break;
				case 3:
					System.out.println("\n\t || ***** ||");
					System.out.println("\t Writer : " + b1.writer);
					System.out.println("\t || ***** ||");
					break;
				case 4:
					System.out.println("\n\t || ***** ||");
					System.out.println("\t Exist : " + b1.exist);
					System.out.println("\t || ***** ||");
					break;
				case 5:
					System.out.println("\n\t || ***** ||");
					System.out.println("\t Price : " + b1.price + '$');
					System.out.println("\t || ***** ||");
					break;
			    case 6:
					System.out.println("\n\t || ***** ||");
					b1.OrderIt();
					System.out.println("\t || ***** ||");
					break;
				case 7:
					System.out.println("\n\t || ***** ||");
					b1.rent();
					System.out.println("\t || ***** ||");
					break;
				case 8:
					System.out.println("\n\t || ***** ||");
					b1.sell();
					System.out.println("\t || ***** ||");
					break;
				default:
	                System.out.println("Error this opertaion not found");
					
				}
				
				System.out.println("Enter 1 for contenue");
		        System.out.println("Enter 9 for close program");
		        int exit = dd.nextInt();
		        if (exit == 9) {
		            break;}
			
		}
			break;
			
        case 2:
			
			System.out.println("Pen");
			
			 break;
			
         case 3:
	
	        System.out.println("Paper");
	
	          break;
			
		}
		
		//book b1 = new book();
		
		
		

	}
		}

}

class book {
	
	int pages = 340;
	String name = "Java";
	String writer = "....";
	boolean exist = true;
	int price = 25;
	
	
	void OrderIt() {
		System.out.println("Price of this book is : " + price + '$' + "\nAre you sure you need to buy it?");
	}
	
	void rent() {
		System.out.println("You can rent this book with a half price : " + price/2);
	}
	
	void sell() {
		System.out.println("You can sell this book with a same original price : " + price);
	}
	
}

class pen {
	
	
	
}

class paper {
	
}

