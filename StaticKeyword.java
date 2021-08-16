
public class StaticKeyword {
	
	public static void main(String []args) {
		
		
		Friend f1 = new Friend("Tayam");
		Friend f2 = new Friend("Walid");
		
		//System.out.println(Friend.NumOfFriend);
		//System.out.println(f1.NumOfFriend2);

		
		System.out.print("You have " + Friend.NumOfFriend + " Friends : " + "\t");
		System.out.println(f1.name + " and " + f2.name);
		
		System.out.println("You have " + f1.NumOfFriend2 + " in object f1 ");

		System.out.println("\ndisplay method ****");
		Friend.displayFriends();
		
	}
	
	
}

	class Friend {
		
		String name;
		static int NumOfFriend;
	    int NumOfFriend2;

		
		Friend(String name){
			this.name = name;
			NumOfFriend++;
			NumOfFriend2++;
		}
		
		static void displayFriends(){
			System.out.println("You have " + Friend.NumOfFriend + " Friends.");
		}
		
	}

