import java.io.File;
import java.util.*;

public class FileClass {

	public static void main(String[] args) {


		  // file = An abstract representation of file and directory pathnames
		  
		  //File file = new File("secret_message.txt");

		  //File file = new File("C:/Users/microworks/Desktop/CS2.S1/secret_message.txt");
		  File file = new File("C:/Users/DiMa HajajLaH/Desktop/CS2.S1/secret_message.txt");

		  
		  
		  if(file.exists()) {
		   System.out.println("That file exists! :O!");
		   System.out.println(file.getPath());
		   System.out.println(file.getAbsolutePath());
		   System.out.println(file.isFile());
		   file.delete();
		  }
		  else {
		   System.out.println("That file doesn't exist :(");
		  }  


	}

}


/*

import java.io.FileWriter;
import java.io.IOException;

public class Main {

 public static void main(String[] args) {
  
  try {
   FileWriter writer = new FileWriter("poem.txt");
   writer.write("Roses are red \nViolets are blue \nBooty booty booty booty \nRockin' everywhere!");
   writer.append("\n(A poem by Bro)");
   writer.close();
  } 
  catch (IOException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
 }
}
*/

/*

public class Main {

 public static void main(String[] args) {
  
  // FileReader = read the contents of a file as a stream of characters. 
  //read() returns an int value which contains the byte value
  //when read() returns -1, there is no more data to be read
  
  try {
   FileReader reader = new FileReader("art.txt");
   int data = reader.read();
   while(data != -1) {
    System.out.print((char)data);
    data = reader.read();
   }
   reader.close();
   
  } catch (FileNotFoundException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  } catch (IOException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
 }
}
*/

