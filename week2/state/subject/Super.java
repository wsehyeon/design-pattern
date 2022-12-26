package week2.state.subject;

public class Super extends Level{
	private static Super singlton = new Super();

	public static Level getInstance() {
		return singlton;
	}

	// public void levelUp(Player p, int lev){
	// 	System.out.println("nothing happend");
	// };

	@Override
	public void jump(){
		System.out.println("아주 높이 Jump 합니다.");
	}

	@Override
	public void run(){
		System.out.println("엄청 빨리 달립니다.");
	}

	@Override
	public void turn(){
		System.out.println("한 바퀴 돕니다.");
	}


	@Override
	public String showLevelMessage(){
		return "Super";
	}
}
