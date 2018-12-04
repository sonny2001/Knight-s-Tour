package codes;

public class Node {//for knight's tour
	
	private String position;
	private boolean visited;
	private Node right;
	private Node left;
	private Node up;
	private Node down;
	
	public Node () {
		position = null;
		visited = false;
		right = null;
		left = null;
		up = null;
		down = null;
	}

	public String getPosition() {
	    return position;
	}

	public void setPosition(String position) {
	    this.position = position;
	}

	public boolean isVisited() {
	    return visited;
	}

	public void setVisited(boolean visited) {
	    this.visited = visited;
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
