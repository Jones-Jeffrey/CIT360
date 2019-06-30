package JunitTesting;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestCase {

/*test used to determine that the add function in the TestClass is correctly adding 
the two ints together using assertEquals with 50 as the expected parameter*/
	
	@Test
	public void addtest() {
		TestClass addTest = new TestClass();
		int result = addTest.add(20, 30);
		assertEquals(50, result);
		}
	
/*tests the add function again, using assertNotSame, to determine that again the two
 *ints, wherein the result and the expected result do not actually refer to the 
 same object */
	
	@Test
	public void secondaddtest() {
		TestClass secondaddtest = new TestClass();
		int result = secondaddtest.add(20, 30);
		assertNotSame(70, result);
		}
	
/*tests the sub function in the TestClass, serves the same purpose as assertEquals
 * test if ints a & b subtract correctly with the expected parameter, uses 
 * assertSame to expected and result do refer to the same object */	
	
	@Test
	public void subtest() {
		TestClass subtest = new TestClass();
		int result = subtest.sub(100, 50);
		assertSame(50, result);
		}
	
/*tests the compareString function in the TestClass, returns a boolean that both
 * strings match using assertTrue*/	
	
	@Test
	public void stringTest() {
		TestClass stringTest = new TestClass();
		assertTrue(stringTest.compareString("hello", "hello"));
		}
	
/*bascially does the exact opposite as the last test, uses assertFalse to assert 
 * that the condition set forth with the given parameters is false*/
	
	@Test
	public void secondStringTest() {
		TestClass secondStringTest = new TestClass();
		assertFalse(secondStringTest.compareString("hello", "goodbye"));
		}
	
/*tests the int addArray created in the TestClass to assert that the new addArray 
 * adds 1 to the given ints*/
	
	@Test
	public void addArrayTest() {
		TestClass addArrayTest = new TestClass();
		int expected[] = new int[]{3, 5};
		assertArrayEquals(expected, addArrayTest.addArray(new int[]{2, 4}));
		}
	
/*simple test using assertNull to assert that string1, defined as null, is in 
 * fact null*/
	
	@Test
	public void nullTest() {
		String string1 = null;
		assertNull(string1);
	}
	
/*opposite of last test, uses assertNotNullasserts string1 is not null, since it 
 * actually has a string of text defined*/
	
	@Test
	public void secondNullTest() {
		String string1 = "Hi there";
		assertNotNull(string1);
	}
	
	

}
