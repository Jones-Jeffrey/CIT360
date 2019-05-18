/*basic structure for this program was 
taken from here: https://www.tutorialspoint.com/design_pattern/mvc_pattern.htm*/

package mvc;

/* the output program is what I'm using in place of an actual application for a user to 
 * interact with, it pulls user info from a fictional database, white there's actually a function
 * to set the values and pushes the information onto the model, then it initializes the view, 
 * update view is used to update what the user data would be 
 */

public class registrationOutput {
	
	public static void main (String[] args) {
		
		registerModel model = pullUserInfoFromDatabase();
		
		registerView view = new registerView();
		
		registerController controller = new registerController(model, view);
		
		controller.updateView();
		
		controller.setUserName("Zap Rowsdower");
		
		controller.updateView();
		
	}
	
	private static registerModel  pullUserInfoFromDatabase() {
		registerModel user = new registerModel();
		user.setName("Troy McGregor");
		user.setEmail("myemail@email.com");
		user.setRegNumber("20");
		return user;
		
	}

}
