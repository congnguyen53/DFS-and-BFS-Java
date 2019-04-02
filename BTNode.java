package students;


public class BtNode {

	BtNode left, right, parent;
	int data;

	/* Constructor */
	public BtNode() {
		left = null;
		right = null;
		data = 0;
	}

	/* Constructor */
	public BtNode(int n) {
		left = null;
		right = null;
		data = n;
	}

	/* Function to set left node */
	public void setLeft(BtNode n) {
		left = n;
	}

	/* Function to set right node */
	public void setRight(BtNode n) {
		right = n;
	}

	/* Function to get left node */
	public BtNode getLeft() {
		return left;
	}

	/* Function to get right node */
	public BtNode getRight() {
		return right;
	}

	/* Function to set data to node */
	public void setData(int d) {
		data = d;
	}

	/* Function to get data from node */
	public int getData() {
		return data;
	}

}
