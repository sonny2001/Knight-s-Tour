package codes;

public class LinkedGrid { //linked grid for knight's tour
	
	private Node bottomLeft = new Node(0);
	
	public LinkedGrid (int height, int length) {
		
		Node temp = bottomLeft;
			
		for (int y = 1; y < height; y++) { //only creates the first column
			temp.setUp(new Node(0));
			temp.getUp().setDown(temp);
			temp = temp.getUp();
		}
		
		temp = bottomLeft;
		
		for (int x = 1; x < length-1; x++) { //make the rest of the columns
			
			temp.setRight(new Node(0));
			temp.getRight().setLeft(temp);
			temp = temp.getUp();
			
			for (int y = 1; y < height-1; y++) { //builds up
				
				temp.setRight(new Node(0));
				temp.getRight().setLeft(temp);
				temp.getRight().setDown(temp.getDown().getRight());
				temp.getDown().getRight().setUp(temp.getRight());
				temp = temp.getUp();
				
			}
			
			for (int counter = 1; counter < height; counter++) //goes down to the bottom of the column
				temp = temp.getDown();
			temp.getRight();
			
		}
		
		System.out.println();
		
	}

}
