package JunitTesting;

//functions created for setting up unit testing

public class TestClass {

	public int add (int a, int b) {
		return a + b;
	}
	
	public int sub (int a, int b) {
		return a - b;
	}

	public boolean compareString (String a, String b) {
		if(a.equalsIgnoreCase(b)) {
			return true;
		} 
		else return false;
	}
	
	public int [] addArray(int [] numbers) {
		int length = numbers.length;
		int output[] = new int[length];
		for (int i = 0; i < length; i++) {
			output[i] = numbers[i] + 1;
			}
		return output;
	}
	
	
}
