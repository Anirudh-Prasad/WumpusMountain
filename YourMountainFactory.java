/*
 * Author: Anirudh Prasad
 * 
 * Date: 6/6/2019
 * 
 * Description: Creates a quaternary tree with 0-4 children per node. Further tests the functionality
 * of the WumpusHero class solution constructed as part of the assignment. Extends the MountainFactory
 * Class and overrides the abstract getMountTop() method
 */
public class YourMountainFactory extends MountainFactory{
	
	/*
	 * Overrides the abstract method from MountainFactory to create a quaternary tree with 0-4 children
	 * per Node
	 */
	@Override
	public MountainCave getMountainTop() {
		MountainCave root = new MountainCave("Mountain Top","The air density here seems to indicate you're not far from the base of the mountain");
		
		MountainCave r4 = new MountainCave(root, "Tilted Towers", "Where boys become men");//leaf
		MountainCave r3 = new MountainCave(root, "Fox Den", "This cave has huge rocks covered in multi-leaf clovers");//leaf
		MountainCave r2 = new MountainCave(root,"Dragon's Alley", "This cave has huge rocks covered in multi-leaf clovers");//leaf
		MountainCave r1 = new MountainCave(root, "Craggy Cliff", "This small passage makes it difficult to see ahead");		
		
		MountainCave r11 = new MountainCave(r1,"Sword Room", "This cave has huge rocks covered in multi-leaf clovers");//leaf
		MountainCave r12 = new MountainCave(r1,"Shield Room", "This cave has huge rocks covered in multi-leaf clovers");//leaf
		MountainCave r13 = new MountainCave(r1,"Helm Room", "This cave has huge rocks covered in multi-leaf clovers");//leaf
		MountainCave r14 = new MountainCave(r1,"Armor Room", "Big plates and armors litter the room"); //leaf
		
		MountainCave r21 = new MountainCave(r2,"Thief's Pass", "This cave has huge rocks covered in multi-leaf clovers");//leaf
		MountainCave r22 = new MountainCave(r2,"Warrior's Way", "This cave has huge rocks covered in multi-leaf clovers");//leaf
		MountainCave r23 = new MountainCave(r2,"Priest's Path", "This cave has huge rocks covered in multi-leaf clovers");//leaf
		MountainCave r24 = new MountainCave(r2,"Struggler's Journey", "A single skeleton clad in black sits at the end of the hall");//leaf
		
		MountainCave r31 = new MountainCave(r3,"Gem Mine", "This cave has huge rocks covered in multi-leaf clovers");//leaf
		MountainCave r32 = new MountainCave(r3,"Alabaster Room", "This cave has huge rocks covered in multi-leaf clovers");//leaf
		MountainCave r33 = new MountainCave(r3,"Underground River", "This cave has huge rocks covered in multi-leaf clovers");//leaf
		
		MountainCave r41 = new MountainCave(r4, "Killer Queen's Lair", "Gunpowder and ash litters the room");//leaf
		MountainCave r42 = new MountainCave(r4, "Mickey's House of Horror", "A place beyond human comprehension"); //leaf
		MountainCave r43 = new MountainCave(r4, "The Closet", "You could probably enter Narnia through here.");//leaf
		MountainCave r44 = new MountainCave(r4, "The Sink", "You either get clean in the sink, or you get in the sink clean"); //leaf
		
		MountainCave r421 = new MountainCave(r42,"Treasure Room", "The golden scales are here!");//leaf
		
		r42.setAdjacentToScales(true);
		r421.setHasScales(true);
		
		return root;
	}
}
