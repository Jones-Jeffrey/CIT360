import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonProgram {

	//the following creates a Java object and converts it into a JSON String
	
	public static void main(String[] args) { 
		JSONObject userObject = new JSONObject();
			userObject.put("userName", "Zap Rowsdower");
			userObject.put("userId", "7");
			userObject.put("userAge", "45");
			
		System.out.println(userObject.toJSONString());
			
			
	}
	
		
	//this then takes the JSON String and converts it back into a Java object
	
		String jsonString = "{\"userName\":\"Zap Rowsdower\",\"userId\":\"7\",\"userAge\":\"45\"}";
		JSONParser parser = new JSONParser();
        JSONObject userObject;{
        
        try {
        	userObject = (JSONObject) parser.parse(jsonString);
 
            System.out.println(userObject.get("userName"));
            System.out.println(userObject.get("userId"));
            System.out.println(userObject.get("userAge"));
 
        } catch (ParseException e) {
      
            e.printStackTrace();
        }
	}

}
