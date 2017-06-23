package BinaryTree;

public class TreeNode implements Comparable {
	TreeNode[] nodes = new TreeNode[2];
	// 0 is Left and 1 is Right
	Object data;

	public void setNode(TreeNode node, int place) {
		nodes[place] = node;
	}

	public TreeNode getNode(int place) {
		return nodes[place];
	}

	public void setData(Object obj) {
		data = obj;
	}

	public Object getData() {
		return data;
	}

	public int compareTo(Object o) {
		Integer a = (Integer) o;
		return 0;
	}
}
