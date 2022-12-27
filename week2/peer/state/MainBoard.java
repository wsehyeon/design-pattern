package state;

public class MainBoard { 
//  public static void main(String[] args) { 
  
//   Player player = new Player(); 
//   PlayerLevel beginnerLevel = BeginnerLevel.getInstance();
//   PlayerLevel advancedLevel = AdvancedLevel.getInstance();
//   PlayerLevel superLevel = SuperLevel.getInstance();

//   player.play(1); 
//   player.upgradeLevel(beginnerLevel);    
//   player.play(2); 
//   player.upgradeLevel(advancedLevel);    
//   player.play(3); 
//   player.upgradeLevel(superLevel);    
//  } 
// public static void main(String[] args) { 
  
//   Player player = new Player(); 
//   player.play(1); 
//   player.upgradeLevel(player.getLevel().levelUp());    
//   player.play(1); 
//   player.upgradeLevel(player.getLevel().levelUp());    
//   player.play(1); 
//   player.upgradeLevel(player.getLevel().levelUp());    
//  } 
// }

public static void main(String[] args) { 
  
  Player player = new Player(); 
  player.play(1); 
	System.out.println("-------------");
  player.upgradeLevel(player.getLevel());    
  player.play(1); 
	System.out.println("-------------");
  player.upgradeLevel(player.getLevel());    
  player.play(1); 
	System.out.println("-------------");
  player.upgradeLevel(player.getLevel());    
 } 
}