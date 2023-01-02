package week2.state.subject;

public class Advance extends Level{
	private static Advance singlton = new Advance();

	public static Level getInstance() {
		return singlton;
	}
	
	// @Override
	// public void levelUp(Player p, int lev){
	// 	if (lev == 3)
	// 		p.changeLevel(Super.getInstance());
	// 	else
	// 		System.out.println("nothing happend");
	// };

	@Override
	public void jump(){
		System.out.println("높이 Jump 합니다.");
	}

	@Override
	public void run(){
		System.out.println("빨리 달립니다.");
	}

	@Override
	public void turn(){
		System.out.println("Turn 할 줄 모르지롱");
	}

	@Override
	public String showLevelMessage(){
		return "Advance";
	}
}
