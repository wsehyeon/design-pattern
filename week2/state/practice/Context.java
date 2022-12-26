package week2.state.practice;

public interface Context {
	public abstract void setClock(int hour);
	public abstract void changeState(State change);
	public abstract void callSecurityCenter(String text);
	public abstract void recordLog(String text);
}
