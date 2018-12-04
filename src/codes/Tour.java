package codes;

public class Tour {

    	public static String [] solution = new String [64];
    	public static int counter = 0;
    
	public static void main(String[] args) {
	    	
		LinkedGrid grid = new LinkedGrid(8,8);
		
		//grid.display();
		
		tour(grid.getTopLeft());
		
	}
	
	public static void tour (Node start) { //start the tour
	    
	    	start.setVisited(true);
	    	solution [counter] = start.getPosition();
	    	counter++;
	    
	    	//create nodes that represent paths
	    	Node step1 = null, step2 = null, step3 = null, step4 = null, step5 = null, step6 = null, step7 = null, step8 = null;
	    
	    	//trying to set the path nodes
	    	try {
	    	    	step1 = start.getUp().getUp().getRight();
	    	} catch (Exception a) {}
	    
	    	try {
	    	    	step2 = start.getRight().getRight().getUp();
	    	} catch (Exception b) {}
	    
	    	try {
	    	    	step3 = start.getRight().getRight().getDown();
	    	} catch (Exception c) {}
	    
	    	try {
	    	    	step4 = start.getDown().getDown().getRight();
	    	} catch (Exception d) {}
	    
	    	try {
	    	    	step5 = start.getDown().getDown().getLeft();
	    	} catch (Exception e) {}
	    
	    	try {
	    	    	step6 = start.getLeft().getLeft().getDown();
	    	} catch (Exception f) {}
	    
	    	try {
	    	    	step7 = start.getLeft().getLeft().getUp();
	    	} catch (Exception g) {}
	    
	    	try {
	    	    	step8 = start.getUp().getUp().getLeft();
	    	} catch (Exception h) {}
	    
	    	//start recursion to visit the steps
	    	if (step1 != null && !step1.isVisited())
	    	    	tour(step1);
	    
	    	if (step2 != null && !step2.isVisited())
	    	    	tour(step2);
	    
	    	if (step3 != null && !step3.isVisited())
	    	    	tour(step3);
	    
	    	if (step4 != null && !step4.isVisited())
	    	    	tour(step4);
	    
	    	if (step5 != null && !step5.isVisited())
	    	    	tour(step5);
	    
	    	if (step6 != null && !step6.isVisited())
	    	    	tour(step6);
	    
	    	if (step7 != null && !step7.isVisited())
	    	    	tour(step7);
	    
	    	if (step8 != null && !step8.isVisited())
	    	    	tour(step8);
	    	
	    	//if complete and found a solution
	    	if (solution [63] != null) {
	    	    	print();
	    	    	counter = 0;
	    	    	solution = new String [64];
	    	}
	    	
	    	else { //can't go further/stuck
	    	    	start.setVisited(false);
	    	    	solution [counter] = null;
	    	}
	    
	} //end the tour
	
	public static void print () { //print the solution if there is one
	   
	    	for (int x = 0; x < 64; x++) {
	    	    System.out.println(solution[x] + " ");
	    	}
	
	} //end print

}
