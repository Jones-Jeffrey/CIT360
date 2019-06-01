
public class threadTest implements Runnable {
	
/*application to demonstrate a basic application using multiple threads, the code in the 
threads will be identified using the Runnable method*/
	
	private int id;
	
	public threadTest (int id) {
		this.id = id;
	}
	
//each instance of threadTest created is identified by having an individual id assigned to it
	
	public void run() {
		System.out.println("Started " + id);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
		}
		
		
		System.out.println("Finished " + id);
		
	}

	
/*this is the code the threads will run, as designated by the run() method,  since there is no
  actual application at work here, the code that will be output is a simple string, with 
  Thread.sleep being implemented to simulate a process performing, each thread sleeps for 
  5 seconds*/
}


