import static org.junit.Assert.*;

import org.junit.Test;


public class TreeNodeTest {

	@Test
	public void isXishTest() {
		String[][] testCases = {{"ab", "abc"}, {"ba", "abc"}, {"ab", ""}};
		boolean[] expected = {true, false, false};
		boolean actual = false;
		
		for (int i = 0; i < testCases.length; i++) {
			actual = TreeNode.isXish(testCases[i][0], testCases[i][1]);
			assertEquals(expected[i], actual);
		}
	}

}
