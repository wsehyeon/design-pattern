package state;

public class BeginnerLevel extends PlayerLevel{
	private BeginnerLevel(){}
	private static class BeginnerLevelHolder{
		private static final BeginnerLevel singleton = new BeginnerLevel();
	}
	public static PlayerLevel getInstance(){
		return BeginnerLevelHolder.singleton;
	}
	
	public void run(){
		System.out.println("천천히 달립니다.");
	};
	
	public void jump(){
		System.out.println("Jump 할 줄 모르지롱.");
	};
	
	public void turn(){
		System.out.println("Turn 할 줄 모르지롱.");
	};

	public void showlevelmessage(){
		System.out.println("Begginer Level");
	};

	public PlayerLevel levelUp(){
		return AdvancedLevel.getInstance();
	}

}