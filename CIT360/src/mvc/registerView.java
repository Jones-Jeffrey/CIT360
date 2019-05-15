package mvc;

//the view just prints the data to the console 

public class registerView {
	public void printRegsitrationDetails (String userName, String userRegistrationNumber, 
			String userEmail) {
		System.out.println("Name " + userName);
		System.out.println("Registration Number " + userRegistrationNumber);
		System.out.println("Email: " + userEmail);
	}
}
