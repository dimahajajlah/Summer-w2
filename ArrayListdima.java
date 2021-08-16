import java.util.*;
public class ArrayListdima {

	public static void main(String[] args) {
		
		ArrayList<String> array = new ArrayList<String>();
		//ArrayList<Integer> array2 = new ArrayList<Integer>();
		 
		//dima
		
		
		array.add("DiMa");
		array.add("fatoom");
		array.add("anoos");
		array.add("noor");
		
		array.set(0 , "Dom");
		
		//array.remove(0);
		//array.clear();
		
		for (int i=0; i<array.size(); i++) {
			System.out.println(array.get(i));
		}
		

	}

}
