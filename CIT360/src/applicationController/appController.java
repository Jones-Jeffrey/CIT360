package applicationController;

import java.util.HashMap;

public class appController {
	
	//creates a HashMap that links to the appHandler interface
	
	public static HashMap <String, appHandler> appHashMap = new HashMap <String, appHandler>();
	
	public void appController() {
		
	}
	
	public static void hashCommand(String command, Integer n1, Integer n2 ) {
		
		/*creates the key-value pairs between the commands the user will enter, and the classes
		used for each choice*/
		
		appHashMap.put ("+", new add());
		appHashMap.put ("-", new subtract());
		
		//creates an instance of appHandler based on whichever command is selected
		
		appHandler handler = appHashMap.get(command);
		
		//executes the code for the simple math operation 
		
		handler.execute(n1, n2); 
		
		}
	}
