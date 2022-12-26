package week2.state.subject;

public abstract class Level {
	public abstract void jump();
	public abstract void run();
	public abstract void turn();

	// public abstract void levelUp(Player P, int lev);
	public abstract String showLevelMessage();

	public Level go(int level){
		if (level == 1)
			return Beginner.getInstance();
		else if (level == 2)
			return Advance.getInstance();
		else if (level == 3)
			return Super.getInstance();
		else{
			System.out.println("wrong level, you are beginner");
			return Beginner.getInstance();
		}
	}
}
