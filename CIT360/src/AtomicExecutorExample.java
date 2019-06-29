import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

	/*creates executor class and simultaneously creates the threads with the 
	 *FixedThreadPool*/ 

	public class AtomicExecutorExample {
	
		public static void main(String[] args) throws InterruptedException {
			ExecutorService executorService = Executors.newFixedThreadPool(2);
		
			
		//implements the AtomicCounter class
			
			AtomicCounter atomicCounter = new AtomicCounter();
			
	/*sets up the number of tasks to be done within the threadpool, passes the 
	 *incrementAndGet runnable into the threadpools, and get the count of the 
	 *tasks atomically */
			
			for(int i = 0; i < 1000; i++) {
	            executorService.submit(() -> atomicCounter.incrementAndGet());
	        }

	//stops the executorService from accepting new tasks and stops it
			
	        executorService.shutdown();
		
		System.out.println("All tasks submitted.");
		
		try {
			executorService.awaitTermination(1, TimeUnit.MINUTES);
		} catch (InterruptedException e) {
			
		}
		
		System.out.println("Task count is : " + atomicCounter.getId());
    }
  	
}
