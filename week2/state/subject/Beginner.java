package week2.state.subject;

public class Beginner implements Level{
	private static Beginner singlton = new Beginner();

	public static Level getInstance() {
		return singlton;
	}

	public void levelUp(Player p, int lev){
		if (lev == 3)
			p.changeLevel(Super.getInstance());
		if (lev == 2)
			p.changeLevel(Advance.getInstance());
		else
			System.out.println("nothing happend");
	};

	@Override
	public void jump(){
		System.out.println("Jump 할 줄 모르지롱");
	}

	@Override
	public String toString(){
		return "Beginner";
	}
}
