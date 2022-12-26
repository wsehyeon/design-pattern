package week2.state.subject;

public class Advance implements Level{
	private static Advance singlton = new Advance();

	public static Level getInstance() {
		return singlton;
	}
	
	@Override
	public void levelUp(Player p, int lev){
		if (lev == 3)
			p.changeLevel(Super.getInstance());
		else
			System.out.println("nothing happend");
	};

	@Override
	public void jump(){
		System.out.println("높이 Jump 합니다.");
	}

	@Override
	public String toString(){
		return "Advance";
	}
}
