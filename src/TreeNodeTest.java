import static org.junit.Assert.*;

import org.junit.Test;
import java.util.*;


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
	
	@Test
	public void permutationsTest() {
		String[] testCases = {"", "a", "ab", "abc", "abcd"};
		Set<String> actual = null;
		
		for (int i = 0; i< testCases.length; i++) {
			System.out.println("Test Case " + (i+1) + ":");
			actual = TreeNode.permutations(testCases[i]);
			for (String permutation: actual)
				System.out.print(permutation + '\t');
			System.out.println();
		}
	}

}
