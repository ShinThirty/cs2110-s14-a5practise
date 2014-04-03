import java.util.*;

/** This class contains the exercising methods about recursion. */
public class TreeNode<T> {
	private T datum; // The data stored in tree node of type T
	private TreeNode<T> left, right; // The left and right child node of this node
	
	/** Constructor: one node tree with datum x. */
	public TreeNode(T x) {
		datum = x;
	}
	
	/** Constructor: Tree node with root value x, left tree lft and right tree rgt. */
	public TreeNode(T x, TreeNode<T> lft, TreeNode<T> rgt) {
		datum = x;
		left = lft;
		right = rgt;
	}
	
	/** Return the datum of this node. */
	public T getDatum() {
		return datum;
	}
	
	/** Set the datum of this node. */
	public void setDatum(T x) {
		datum = x;
	}
	
	/** Return the left child node. */
	public TreeNode<T> getLeft() {
		return left;
	}
	
	/** Set the left child node of this node. */
	public void setLeft(TreeNode<T> lft) {
		left = lft;
	}
	
	/** Return the right child node. */
	public TreeNode<T> getRight() {
		return right;
	}
	
	/** Set the right child node of this node. */
	public void setRight(TreeNode<T> rgt) {
		right = rgt;
	}
	
	/** Return the number of nodes of this binary tree with 
	 * its root to be this node. */
	public int getNumOfNodes() {
		return ((left == null) ? 0 : left.getNumOfNodes()) + 
			   ((right == null)? 0 : right.getNumOfNodes()) +
			   1;
	}
	
	/** Return the number of leaves of this binary tree with
	 * its root to be this node. */
	public int getNumOfLeaves() {
		return (left == null && right == null) ? 1 :
			   (left == null) ? right.getNumOfLeaves() :
			   (right == null)? left.getNumOfLeaves() :
			   left.getNumOfLeaves() + right.getNumOfLeaves();
	}
	
	/** Return the result of b**c in O(c) time. 
	 * Precondition: c >= 0. */
	public static double bPowerc(double b, int c) {
		assert c >= 0;
		
		return (c == 0) ? 1 :
			   (c % 2 == 1) ? b * bPowerc(b, c-1) :
				              bPowerc(b*b, c/2);
	}
	
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
	
	/** Return a Set<String> that contains all permutations of s of 
	 * all-different characters. */
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
			for (String permutationLesser: permutationSetLesser) {
				
			}
			
		}
	}
}
