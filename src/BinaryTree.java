package DS;

public class BinaryTree {

	private Tree root;

	public void insert(int nodeVal) {

		if (null == root) {
			root = new Tree(nodeVal);
		} else {
			Tree tmp = new Tree(nodeVal);
			insertTree(tmp, root);
		}

	}

	private void insertTree(Tree node, Tree root) {

		if (node.getData() < root.getData()) {
			if (root.getleftNode() != null) {
				insertTree(node, root.getleftNode());
			} else {
				root.setleftNode(node);
			}
		} else if (node.getData() >= root.getData()) {
			if (root.getrightNode() != null) {
				insertTree(node, root.getrightNode());
			} else {
				root.setrightNode(node);
			}
		}

	}

	public static void printTreeInorder(BinaryTree tree) {
		printTreeInORdr(tree.root);
	}

	private static void printTreeInORdr(Tree tree) {

		if(tree == null) return;
		System.out.println(tree.getData());

			printTreeInORdr(tree.getleftNode());
			printTreeInORdr(tree.getrightNode());
		

	}

	public static void main(String[] args) {
		
		BinaryTree bTree = new BinaryTree();
		
		bTree.insert(10);
		bTree.insert(2);
		bTree.insert(5);
		bTree.insert(9);
		bTree.insert(15);
		bTree.insert(13);
		bTree.insert(6);
		bTree.insert(1);
		
		printTreeInorder(bTree);

	}

}

class Tree {
	private int data;
	private Tree leftNode;
	private Tree rightNode;

	public Tree() {

	}

	public Tree(int val) {
		data = val;

	}

	public Tree(int val, Tree left, Tree right) {
		data = val;
		leftNode = left;
		rightNode = right;

	}

	public Tree getleftNode() {
		return leftNode;
	}

	public void setleftNode(Tree leftNode) {
		this.leftNode = leftNode;
	}

	public Tree getrightNode() {
		return rightNode;
	}

	public void setrightNode(Tree rightNode) {
		this.rightNode = rightNode;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

}
