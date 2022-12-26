package week2.state.subject;

public class Super implements Level{
	private static Super singlton = new Super();

	public static Level getInstance() {
		return singlton;
	}

	public void levelUp(Player p, int lev){
		System.out.println("nothing happend");
	};

	@Override
	public void jump(){
		System.out.println("아주 높이 Jump 합니다.");
	}

	@Override
	public String toString(){
		return "Super";
	}
}
