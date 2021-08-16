
public class printF {

	public static void main(String[] args) {
		
		//System.out.printf(" Dom %d",48);
		//System.out.printf(" Dom %b",48);
		//System.out.printf(" Dom %c",48);

		System.out.printf(" \nDom %s",48);
		System.out.println(" \n ****** //\\ ******\n");
		//*******************************\\
		
		//integer
		System.out.print(" ****** integer ******");
		int d=48;
		System.out.printf(" \nDom %d",d);
		System.out.printf(" \nDom %10d",d);
		System.out.printf(" \nDom %020d",d);
		System.out.println(" \n ****** //\\ ******\n");
		//*******************************\\
		
		
		//double
				System.out.print(" ****** double ******");
				double f=48.2002;
				System.out.printf(" \nDom %f",f);
				System.out.printf(" \nDom %.4f",f); //select 0000
				System.out.printf(" \nDom %020f",f);
				System.out.printf(" \nDom %,f",f);
				System.out.println(" \n ****** //\\ ******\n");
				//*******************************\\

		
		//string
		System.out.print(" ****** string ******");
		String s="ali";
		System.out.printf(" \nDom %s","ali");
		System.out.printf(" \nDom %s",s);
		System.out.printf(" \nDom %10s","Hajajlah");
		System.out.printf(" \nDom %10s","Hajajlah");
		System.out.printf(" \nDom %-10s","Hajajlah");
		System.out.printf(" \n %-17sDom","Hajajlah");
        System.out.println(" \n ****** //\\ ******\n");
		//*******************************\\

		
		//character
		System.out.print(" ****** character ******");
		System.out.printf(" \nDom %c",'H');
		char h='H';
		System.out.printf(" \nDom %c",h);
		System.out.println(" \n ****** //\\ ******\n");
		//*******************************\\
		
		
		//boolean
		System.out.print(" ****** boolean ******");
		System.out.printf(" \nDom %b",4);
		boolean b=false;
		System.out.printf(" \nDom %b",b);
		System.out.println(" \n ****** //\\ ******\n");
		//*******************************\\





	}

}
