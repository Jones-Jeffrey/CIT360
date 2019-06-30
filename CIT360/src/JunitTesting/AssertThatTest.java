package JunitTesting;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Before;
import org.junit.Test;

public class AssertThatTest {
	int numberOfUsers = 0;
	
	@Before
	public void setUsers( ) {
		this.numberOfUsers = 20;
	}
	
	/*produces a simple test using the is method from CoreMatchers, which results in
	a boolean comparison if the two number match*/
	
	@Test
	public void testAssertMatch() {
		assertThat(numberOfUsers,is(20));
	}

}
