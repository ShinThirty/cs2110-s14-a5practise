import java.util.*;

/** An instance is a node in a binary tree; it may be viewed also as the root of a tree */
public class TreeNode {
    private int val;  // The value in the node
    private TreeNode left; // The left subtree (null if empty)
    private TreeNode right; // The right subtree (null if empty)
    
    
    // Recursion problem 1. Write the bodies of the following two methods size
    
    /** Return the size of the tree with this as the root. */
    public int size() {
        // complete this method
        return 0;
    }
    
    /** Return the size of the tree whose root is r. */
    public static int size(TreeNode r) {
        // complete this method
        return 0;
    }
    
    
    // Recursion problem 2. Problem 1 illustrates how one could have a static and a
    // non-static method do essentially the same thing. Below, write
    // static and non-static functions that return the number of leaves of a tree.
    // Write the specifications of the methods as javadoc comments before writing
    // the method bodies.
    
    
    
    
    
    
    
    
    
    // Recursion problem 3. Write a recursive function to calculate  b to the power c,
    // as described in the A5 handout. Be sure to specify it first.
    
    
    
    
    
    
    // Recursion problem 4. write functions isXish and isElfish as described in the
    // hA5 handout. Be sure to specify them first.
    
    
    
    
    // Problem 5. Write the following function permutations. See the A5 handout
    // for hints.
    
    /** Return a set of all permutations of s.
     *  Precondition: s contains no duplicates --all chars are different*/
    public static Set<String> permutations(String s) {
        
        
        return null;
    }
    
    
    
    // Write your coin-game stuff here (it is optional)
    
    
    
    

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
