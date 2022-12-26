package week2.state.subject;

public class Player {
	private Level level = Beginner.getInstance();
	private String name;

	public Level getLevel(){
		return level;
	}

	public Player(String name){
		this.name = name;		
	}

	// setLevel 에서 결국 레벨 설정을 Level 객체에 넘기는 것은
	// 플레이어는 자신의 레벨 설정에 전혀 관여하지 않기 위함인가?
	// 레벨업 하는 작업은 Level 객체에서 처리할 것? -> 독립적인 행동?
	// 새로운 레벨단계 extream이 나왔다고 하자, 조건문을 플레이어에서 작업할 필요 없이
	// 레벨 객체 단에서 처리하면 됨. 플레이어는 새로운 레벨 객체들에게 영향을 받지 않음.
		// public void setLevel(int lev){
		// 	level.levelUp(this, lev);
		// }

		// public void changeLevel(Level up){
		// 	System.out.println(name + ":" + this.level + "에서" + up + "으로 변경");
		// 	this.level = up;
		// }

	public void upgradeLevel(Level up){
		System.out.println(name + " : Level Up! " + this.level.showLevelMessage() + "->" + up.showLevelMessage());
		this.level = up;
	}

	public void play(){
		System.out.print(name + " : ");
		level.run();
		System.out.print(name + " : ");
		level.jump();
		System.out.print(name + " : ");
		level.turn();
	}
}
