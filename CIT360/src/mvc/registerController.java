package mvc;

//the controller calls the data from the model, and then updates the view with said data

public class registerController {
	private registerModel model;
	private registerView view;
	
	
	public registerController(registerModel model, registerView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setUserName(String name) {
		model.setName(name);
	}
	
	public String getUserName() {
		return model.getName();
	}
	
	
	public void setUserRegistrationNumber(String regNumber){
		model.setRegNumber(regNumber);
	}
	
	public String getUserRegistrationNumber() {
		return model.getRegNumber();
	}
	
	public void setUserEmail(String email) {
		model.setName(email);
	}
	
	public String getUserEmail() {
		return model.getEmail();
	}
	
	public void updateView(){				
	      view.printRegsitrationDetails(model.getName(), model.getRegNumber(), model.getEmail());
	   }	

}
