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
}
