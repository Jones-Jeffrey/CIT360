import java.util.HashSet;
//imports the prewritten Set class from the util package

public class setProgram {
	public static void main (String[] args) {
		
		//used HashSet, as it is the default implementation of the Set interface
		
		HashSet<String> justiceLeague = new HashSet<String> (); 
		
		//add() adds values to the set
		
		justiceLeague.add("Superman");
		justiceLeague.add("Batman");
		justiceLeague.add("Martian Manhunter");
		justiceLeague.add("Aquaman");
		justiceLeague.add("Wonder Woman");
		
		//duplicate values will not be added to the set
		
		justiceLeague.add("Batman");
		justiceLeague.add("Aquaman");
		
		//the values of the set are retrieved in any random order as the set isn't indexed 
		
		System.out.println(justiceLeague);
	}
	
}
