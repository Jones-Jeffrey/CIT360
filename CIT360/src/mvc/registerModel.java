package mvc;

//the model just sets up the data with get & set methods for potential user info (name, email, id)

public class registerModel {
	private String regNumber;
	private String name;
	private String email;
	
	
	public String getRegNumber() {
		return regNumber;
	}
	
	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}
	
	public String getName()  
    { 
        return name; 
    } 
     
    public void setName(String name)  
    { 
        this.name = name; 
    } 
    
    public String getEmail()  
    { 
        return email; 
    } 
     
    public void setEmail(String email)  
    { 
        this.email = email; 
    } 
}
