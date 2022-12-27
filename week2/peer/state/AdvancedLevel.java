package state;

public class AdvancedLevel extends PlayerLevel{
	private AdvancedLevel(){}
	private static class AdvancedLevelHolder{
		private static final AdvancedLevel singleton = new AdvancedLevel();
	}
	public static PlayerLevel getInstance(){
		return AdvancedLevelHolder.singleton;
	}
	
	public void run(){
		System.out.println("빨리 달립니다.");
	};
	
	public void jump(){
		System.out.println("높이 jump 합니다.");
	};
	
	public void turn(){
		System.out.println("Turn 할 줄 모르지롱.");
	};

	public void showlevelmessage(){
		System.out.println("Advanced Level");
	};

	public PlayerLevel levelUp(){
		return SuperLevel.getInstance();
	}

}