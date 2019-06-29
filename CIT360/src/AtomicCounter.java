import java.util.concurrent.atomic.AtomicInteger;

class AtomicCounter {
	
/*creates an atomic integer and sets up runnable with incrementAndGet and sets up 
 * the final count of incrementAndGet with getId*/
	
	private AtomicInteger id = new AtomicInteger(0);
	
	public int incrementAndGet() {
        return id.incrementAndGet();
    }
	
	public int getId() {
        return id.get();
    }
	
}


