package state;

public class Player {
	private PlayerLevel level;
    // PlayerLevel BeginnerLevel;
    
	public Player(){
	    this.level = BeginnerLevel.getInstance();
	}

	public PlayerLevel getLevel(){
		return level;
	}

	public void upgradeLevel(PlayerLevel currentLevel){
        this.level = currentLevel.levelUp();
	}

	public void play(int time){
		level.go(time);
	}
}