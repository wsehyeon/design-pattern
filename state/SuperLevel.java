package state;

public class SuperLevel extends PlayerLevel{
	private SuperLevel(){}
	private static class SuperLevelHolder{
		private static final SuperLevel singleton = new SuperLevel();
	}
	public static PlayerLevel getInstance(){
		return SuperLevelHolder.singleton;
	}
	
	public void run(){
		System.out.println("엄청 빨리 달립니다.");
	};
	
	public void jump(){
		System.out.println("아주 높이 jump 합니다.");
	};
	
	public void turn(){
		System.out.println("한 바퀴 돕니다");
	};

	public void showlevelmessage(){
		System.out.println("Super Level");
	};

	public PlayerLevel levelUp(){
		System.out.println("이미 최고 레벨입니다.");
		return this;
	}
}