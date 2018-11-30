package codes;

public class Node {//for knight's tour
	
	private int data;
	private Node right;
	private Node left;
	private Node up;
	private Node down;
	
	public Node (int input) {
		data = input;
		right = null;
		left = null;
		up = null;
		down = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getUp() {
		return up;
	}

	public void setUp(Node up) {
		this.up = up;
	}

	public Node getDown() {
		return down;
	}

	public void setDown(Node down) {
		this.down = down;
	}

}
