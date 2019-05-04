import java.util.HashMap;
import java.util.Map;
//imports the prewritten HashMap & Map classes from the util package

public class mapProgram {
	public static void main (String[] args) {
		HashMap<Integer, String> myMap = new HashMap<Integer, String> ();
		
		//used HashMap because it's the default implementation of the map interface
		
		//adds key-value pairs to the map using put()
		
		myMap.put(2, "Two");
		myMap.put(4, "Four");
		myMap.put(6, "Six");
		myMap.put(8, "Eight");
		
		//will display entire contents of the map
		
		System.out.println(myMap);
		
		//Accesses a value from the map based on it's key pair using get()
		
		String text = myMap.get(8);
		
		System.out.println(text);
		
		//duplicate keys override the previously declared keys
		
		myMap.put(4, "Bananas");
		
		System.out.println(myMap);
		
		//iterating over all the key-value pairs in the map done with a for-each loop
		
		for (Map.Entry<Integer, String> e: myMap.entrySet ()) {
			int key = e.getKey();
			String value = e.getValue();
		System.out.println(key + ": " + value);
		}
	}
}
