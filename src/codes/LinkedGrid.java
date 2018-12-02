package codes;

public class LinkedGrid { //linked grid for knight's tour
	
	private Node topLeft = new Node();
	private String [] columnLetter = {"A","B","C","D","E","F","G","H'","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	private int length;
	private int height;
	
	public LinkedGrid (int length, int height) { //begin constructor
		
	    	this.length = length; //set dimensions of the grid
	    	this.height = height;
		Node temp = new Node(); //create a temporary node
		temp = topLeft;
			
		for (int x = 1; x < length; x++) { //only creates the first row
			temp.setData(columnLetter[0] + x);
		    	temp.setRight(new Node());
			temp.getRight().setLeft(temp);
			temp = temp.getRight();
		}
		temp.setData(columnLetter[0] + length);
		
		Node row = new Node() ; //place holder for each row
		row = topLeft;
		int x = 0;
		
		for (int y = 1; y < height; y++) { //make the rest of the columns
			
		    	temp = row;
			temp.setDown(new Node());
			temp.getDown().setUp(temp);
			temp = temp.getDown();
			
			for (x = 1; x < length; x++) { //make the rest of the rows
				
			    	temp.setData(columnLetter[y] + x);
				temp.setRight(new Node());
				temp.getRight().setLeft(temp);
				temp = temp.getRight();
				temp.setUp(temp.getLeft().getUp().getRight());
				temp.getUp().setDown(temp);
				
			}
			
			temp.setData(columnLetter[y] + x);
			row = row.getDown();
			
		} //finish the rest of the grid
		
	} //finish constructor

	public void display () { //check if the grid is build properly
	    
	    Node temp = new Node();
	    Node row = new Node();
	    temp = topLeft;
	    row = topLeft;
	    
	    for (int y = 0; y < height; y++) {
		temp = row;
		for (int x = 0; x < length; x++) { 
    			System.out.print(temp.getData() + " ");
    			temp = temp.getRight();
		}
		row = row.getDown();
		System.out.println();
	    }
	    
	}
	
	public Node getTopLeft() {
	    return topLeft;
	}

	public void setTopLeft(Node topLeft) {
	    this.topLeft = topLeft;
	}

	public int getLength() {
	    return length;
	}

	public void setLength(int length) {
	    this.length = length;
	}

	public int getHeight() {
	    return height;
	}

	public void setHeight(int height) {
	    this.height = height;
	}

}
