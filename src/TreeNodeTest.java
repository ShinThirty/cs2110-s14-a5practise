import static org.junit.Assert.*;

import org.junit.Test;
import java.util.*;


public class TreeNodeTest {
	
	@Test
	public void sizeleavesTest() {
		TreeNode tree1 = TreeNode.tree1();
		assertEquals(6, tree1.size());
		assertEquals(6, TreeNode.size(tree1));
		assertEquals(3, tree1.getNumOfLeaves());
		assertEquals(3, TreeNode.getNumOfLeaves(tree1));
	}
	
	@Test
	public void bPowercTest() {
		double[] bArray = {2, 3, 3.5, 4};
		int[] cArray = {2, 3, 4, 5};
		double[] expected = {4, 27, 150.0625, 1024};
		double actual;
		
		for (int i = 0; i < bArray.length; i++) {
			actual = TreeNode.bPowerc(bArray[i], cArray[i]);
			assert expected[i] == actual;
		}
	}

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
	
	@Test
	public void pickCoinTest() {
		int[] numOfCoinsCases = {1, 2, 3, 10, 25, 30};
		TreeNode.Player[][] PlayerCases = {{TreeNode.Player.Alice, TreeNode.Player.Bob}, 
				                           {TreeNode.Player.Bob, TreeNode.Player.Alice}, 
				                           {TreeNode.Player.Alice, TreeNode.Player.Bob}, 
				                           {TreeNode.Player.Alice, TreeNode.Player.Bob}, 
				                           {TreeNode.Player.Alice, TreeNode.Player.Bob}, 
				                           {TreeNode.Player.Alice, TreeNode.Player.Bob}};
		
		TreeNode.Player[] expectedWinner = {TreeNode.Player.Alice, 
				                            TreeNode.Player.Bob, 
				                            TreeNode.Player.Bob, 
				                            TreeNode.Player.Alice, 
				                            TreeNode.Player.Alice, 
				                            TreeNode.Player.Bob};
		
		int[] expectedNOS = {1, 1, 2, 22, 3344, 18272};
		
		TreeNode.PickCoinResult actualResult = null;
		
		for (int i = 0; i < numOfCoinsCases.length; i++) {
			actualResult = TreeNode.pickCoin(numOfCoinsCases[i], PlayerCases[i][0], PlayerCases[i][1]);
			assertEquals(expectedWinner[i], actualResult.getWinner());
			assertEquals(expectedNOS[i], actualResult.getNOS());
		}
	}

}
