import java.util.ArrayList; 
//this imports the ArrayList class, which is a prewritten class that comes in Java API 

public class listProgram {
	public static void main (String[] args) {
		
		//Used ArrayList as it is the default implementation of the list interface
		
		ArrayList <String> avengers = new ArrayList <String> ();
		
		//add() is used to add values to an ArrayList
		
		avengers.add("Captain America");
		avengers.add("Iron Man");
		avengers.add("Thor");
		avengers.add("Hulk");
		avengers.add("Scarlet Witch");
		avengers.add("Black Widow");
		
		/*the get() method accesses single elements of the ArrayList, 
		retrieves them by the index number*/
		
		System.out.println(avengers.get(0));
		System.out.println(avengers.get(3));
		System.out.println(avengers.get(5));
	}
	

}
