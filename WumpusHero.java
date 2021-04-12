/*
 * Author: Anirudh Prasad
 * 
 * Date: 6/5/2019
 * 
 * Description: This class is a subclass that extends the WumpusHunter class. Simulates and documents
 * exploration of a series of caves and areas with the objective of finding a set of golden scales.
 * This is done by parsing a tree node structure and searching each node for the desired data. 
 * This class utilizes a Breadth-First-Searching (BFS) methodology for parsing through the tree
 * structure
 */
public class WumpusHero extends WumpusHunter{
	private Stack store;
	private Queue search;
	/*
	 * Returns a customized name for the WumpusHero
	 */
	@Override
	public String getName() {
		return "Maximum Chungus";
	}//end getName
	
	/*
	 * This method overrides WumpusHunter's abstract startAt method to journey through the maintain,
	 * locate the scales, and record/report the path to the scales from the mountain top
	 */
	@Override
	public void startAt(MountainCave root) {
		
		MountainCave current = root;
		store = new Stack(); //stores the locations
		search = new Queue(); //parses through the mountain
		search.enqueue(current);
		
		while(search.size() > 0) { //parses through rooms
			current = (MountainCave)search.dequeue();
			actionLog += current.getCaveName() +"\n";
			for(int i = 0; i < current.getChildren().size(); i++) {
				search.enqueue(current.getChildren().get(i));	
			}
			if(current.hasScales()) {
				break;
			}
		}
		
		while(current.hasParent()) {
			store.push(current);
			current = current.getParent();
		}
		
		actionLog += "\n" +"The Path to the Treasure:" +"\n" +"\n";
		
		while(store.size() > 0) { //prints path to the treasure
			actionLog += current.getCaveName() + "\n";
			current = (MountainCave) store.pop();
		    
		}
		actionLog += current.getCaveName() + "\n";
		
		
	}//end startAt
}//end class
