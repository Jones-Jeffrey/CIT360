import java.util.LinkedList;
import java.util.Queue;

/*imports both the Queue interface type as well as an implementation of the Queue, 
which here in this program is the LinkedList*/

public class queueProgram {
	public static void main (String[] args) {
		Queue<Integer> numberQueue = new LinkedList<> ();
		
		/*creates a new implementation of the Queue interface in the form a LinkedList,
		 the wrapper class Integer is used here to create Collection objects in place of the int
		 primitive data type, lists can only hold objects
		 */
		
		//for loop populates the values (0,1,2,3,4) to the queue
		
		for (int i=0; i<5; i++)
			numberQueue.add(i);
		
		//Displays the vaules of the queue
		
		System.out.println("Values of the queue " + numberQueue);
		
		//removes the head of the queue using remove()
		
		int removedVal = numberQueue.remove();
		System.out.println("Removed head of the queue " + removedVal);
	}

}
