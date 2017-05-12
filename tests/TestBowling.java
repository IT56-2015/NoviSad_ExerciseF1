import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	@Test
	public void testScore(){
		Frame frame = new Frame(5,4);
		assertEquals(9, frame.score());
	}
	@Test
	public void testIsStrike(){
		Frame frame = new Frame(10,1);
		assertTrue(frame.isStrike());
	}

}
