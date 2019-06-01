import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class executorTest {
	
	public static void main(String[] args) {
	
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		/*this implements the ExecutorService, specifically the Executors class to assign
		tasks to threads without having to manually create the threads, here two threads will
		be performing tasks at once*/
		
		for (int i=0; i<6; i++) {
			executor.submit(new threadTest(i));
		}
		
		executor.shutdown();
		
		System.out.println("All tests submitted.");
		
		try {
			executor.awaitTermination(1, TimeUnit.MINUTES);
		} catch (InterruptedException e) {
			
		}
		
		System.out.println("All tests finished.");
		}
}
