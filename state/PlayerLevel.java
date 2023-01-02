package state;

public abstract class PlayerLevel{
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showlevelmessage();
	public void go(int time){
		run();
		for (int i = 0; i < time; i++){
			jump();
		}
		turn();
	}
	public abstract PlayerLevel levelUp();
}