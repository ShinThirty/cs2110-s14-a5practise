import static org.junit.Assert.*;

import org.junit.Test;


public class ETester {

	@Test
	public void numberTest() {
		int numOfChar = E.number('a', "apple");
		assertEquals(1, numOfChar);
		numOfChar = E.number('p', "applepie");
		assertEquals(3, numOfChar);
		numOfChar = E.number('p', "ppppppp");
		assertEquals(7, numOfChar);
		numOfChar = E.number('q', "ppppppp");
		assertEquals(0, numOfChar);
	}
	
	@Test
	public void dupSTest() {
		String dupS = null;
		dupS = E.dupD("adopted");
		assertEquals("addoptedd", dupS);
		dupS = E.dupD("ddddddd");
		assertEquals("dddddddddddddd", dupS);
		dupS = E.dupD("0000000");
		assertEquals("0000000", dupS);
		dupS = E.dupD("dd00000");
		assertEquals("dddd00000", dupS);
	}

}
