package week2.state.subject;

public interface Level {
	public abstract void jump();
	public abstract void levelUp(Player P, int lev);
	public abstract String toString();
}
