import java.util.*;

/** An instance is a node in a binary tree; it may be viewed also as the root of a tree */
public class TreeNode {
    private int val;  // The value in the node
    private TreeNode left; // The left subtree (null if empty)
    private TreeNode right; // The right subtree (null if empty)
    
    
    // Recursion problem 1. Write the bodies of the following two methods size
    
    /** Return the size of the tree with this as the root. */
    public int size() {
    	return ((left == null) ? 0 : left.size()) + 
 			   ((right == null)? 0 : right.size()) +
 			   1;
    }
    
    /** Return the size of the tree whose root is r. */
    public static int size(TreeNode r) {
    	return ((r.left == null) ? 0 : size(r.left)) + 
  			   ((r.right == null)? 0 : size(r.right)) +
  			   1;
    }
    
    // Recursion problem 2. Problem 1 illustrates how one could have a static and a
    // non-static method do essentially the same thing. Below, write
    // static and non-static functions that return the number of leaves of a tree.
    // Write the specifications of the methods as javadoc comments before writing
    // the method bodies.
    /** Return the number of leaves of this binary tree with
	 * its root to be this node. */
	public int getNumOfLeaves() {
		return (left == null && right == null) ? 1 :
			   (left == null) ? right.getNumOfLeaves() :
			   (right == null)? left.getNumOfLeaves() :
			   left.getNumOfLeaves() + right.getNumOfLeaves();
	}
	
	/** Return the number of leaves of this binary tree with
	 * its root to be r. */
    public static int getNumOfLeaves(TreeNode r) {
    	return (r.left == null && r.right == null) ? 1 :
			   (r.left == null) ? getNumOfLeaves(r.right) :
			   (r.right == null)? getNumOfLeaves(r.left) :
			   getNumOfLeaves(r.left) + getNumOfLeaves(r.right);
    }
    
    // Recursion problem 3. Write a recursive function to calculate  b to the power c,
    // as described in the A5 handout. Be sure to specify it first.
    /** Return the result of b**c in O(c) time. 
	 * Precondition: c >= 0. */
	public static double bPowerc(double b, int c) {
		assert c >= 0;
		
		return (c == 0) ? 1 :
			   (c % 2 == 1) ? b * bPowerc(b, c-1) :
				              bPowerc(b*b, c/2);
	}
    
    // Recursion problem 4. write functions isXish and isElfish as described in the
    // hA5 handout. Be sure to specify them first.
	/** Return true if all the letters in String x are included in 
	 * String s and in the same order. */
	public static boolean isXish(String x, String s) {
		return x.equals("") ? true :
			s.indexOf(x.charAt(0)) >= 0 &&
			isXish(x.substring(1), s.substring(s.indexOf(x.charAt(0))+1));
	}
	
	/** Return true if the given word String s contains the letters e, 
	 * l and f without considering the order. */
	public static boolean isElfish(String s) {
		return s.contains("e") && s.contains("l") && s.contains("f");
	}
    
    // Problem 5. Write the following function permutations. See the A5 handout
    // for hints.
    
    /** Return a set of all permutations of s.
     *  Precondition: s contains no duplicates --all chars are different*/
    public static Set<String> permutations(String s) {
    	if (s.length() == 0)
			return new HashSet<String>();
		else if (s.length() == 1) {
			Set<String> permutationSet = new HashSet<String>();
			permutationSet.add(s);
			return permutationSet;
		}
		else {
			Set<String> permutationSetLesser = permutations(s.substring(1));
			Set<String> permutationSet = new HashSet<String>();
			for (String permutationLesser: permutationSetLesser)
				for (int offset = 0; offset <= permutationLesser.length(); offset++)
					permutationSet.add(new StringBuilder(permutationLesser).insert(offset, s.charAt(0)).toString());
			return permutationSet;
		}
    }
    
    // Write your coin-game stuff here (it is optional)
    public enum Player {
		Alice, Bob;
		
		/** Return the opponent of this player. */
		public Player opponent() {
			return this == Alice ? Bob : Alice;
		}
		
		/** Return the player as a String. */
		public String toString() {
			return this == Alice ? "Alice" : "Bob";
		}
	}
	
	public static class PickCoinResult {
		private Player winner;
		private int NumOfStrategies;
		
		/** Constructor. */
		public PickCoinResult(Player win, int NOS) {
			winner = win;
			NumOfStrategies = NOS;
		}
		
		/** Get the value of fields. */
		public Player getWinner() {
			return winner;
		}
		
		public int getNOS() {
			return NumOfStrategies;
		}
	}
	
	/** Return the winner of the pick coin game and the number of strategies. */
	public static PickCoinResult pickCoin(int NumOfCoins, Player first, Player second) {
		assert NumOfCoins > 0;
		
		if (NumOfCoins == 1 || NumOfCoins == 2)
			return new PickCoinResult(first, 1);
		else if (NumOfCoins == 3)
			return new PickCoinResult(second, 2);
		else if (NumOfCoins == 4)
			return new PickCoinResult(first, 3);
		else {
			// NumOfCoins > 4
			if (NumOfCoins % 3 == 0) {
				int NumOfStrategies = pickCoin(NumOfCoins - 1, second, first).getNOS() + 
									  pickCoin(NumOfCoins - 2, second, first).getNOS() + 
									  pickCoin(NumOfCoins - 4, second, first).getNOS();
				return new PickCoinResult(second, NumOfStrategies);
			}
			else {
				int NumOfStrategies = ((NumOfCoins - 1) % 3 == 0) ? 
					   (pickCoin(NumOfCoins - 1, second, first).getNOS() + 
						pickCoin(NumOfCoins - 4, second, first).getNOS()) : 
						pickCoin(NumOfCoins - 2, second, first).getNOS();
				return new PickCoinResult(first, NumOfStrategies);
			}
		}
	}

    /** Constructor: a one-node tree with value v */
    public TreeNode(int v) {
        val= v;
    }

    /**Constructor: a treee with value v, left subtree left, and right subtee right */
    public TreeNode(int v, TreeNode left, TreeNode right) {
        val= v;
        this.left= left;
        this.right= right;
    }


    /** a representation of this tree. The root appears on one line.
        then its left subtree indented 2 spaces in the same representation (null if none)
        then its right subtree similarly.
        If the tree is a leaf, its subtrees do not appear. */
    public @Override String toString() {
        return toString("");
    }

    /** Like toString() except that everything is indented by sp (assumed to be 
     * a string with blanks in it) */
    public String toString(String sp) {
        if (left == null  && right == null) {
            return sp + val;
        }
        return sp + val +
               "\n" + (left == null ? sp + "  " + null : left.toString(sp + "  ")) +
               "\n" + (right == null ? sp + "  " + null : right.toString(sp + "  "));
    }
    
    /** = a tree  (1 2 (3 (4 5 6) null)) */
    public static TreeNode tree1() {
        TreeNode t1= new TreeNode(1);
        TreeNode t2= new TreeNode(2);
        TreeNode t3= new TreeNode(3);
        TreeNode t4= new TreeNode(4);
        TreeNode t5= new TreeNode(5);
        TreeNode t6= new TreeNode(6);
        return new TreeNode(1, t2, new TreeNode(3, new TreeNode(4, t5, t6), null));
    }

}
