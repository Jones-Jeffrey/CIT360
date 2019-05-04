import java.util.TreeSet;
//imports the TreeSet class prewritten in Java API

public class treeProgram {
	public static void main (String[] args) {
		TreeSet <String> alphabet = new TreeSet<String> ();
		
		//adding values to the TreeSet with add()
		
		alphabet.add("A");
		alphabet.add("B");
		alphabet.add("C");
		alphabet.add("D");
		alphabet.add("E");
		alphabet.add("F");
		
		//retrieves set values as presented 
		
		System.out.println("Original set " + alphabet);
		
		//retrieves values in the set before C
		
		System.out.println("Head Set "+ alphabet.headSet("D"));
		
		//removes the values before B
		
		System.out.println("TailSet "+ alphabet.tailSet("B"));
		
	}

}
