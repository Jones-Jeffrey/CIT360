package applicationController;

//carries out a simple subtractions implementation of the appHandler 

public class subtract implements appHandler {
	
	public void execute(Integer n1, Integer n2) {
	
		Integer sum = n1 - n2;
		System.out.println(sum);
	
	}
	
}
