package week2.state.practice;
public class SafeFrame implements Context{
	private State state = DayState.getInstance();

	public SafeFrame(String title){
		System.out.println(title);
	}
	public void setClock(int hour){
		String clockstring = String.format("현재 시간은 %02d:00", hour);
		System.out.println(clockstring);
		state.doClock(this, hour);
	};
	public void changeState(State change){
		System.out.println(this.state + "에서" + change + "으로 상태를 전환합니다.");
		this.state = change;
	};
	public void callSecurityCenter(String text){
		System.out.println("경비센터 호출!" + text);
	};
	public void recordLog(String text){
		System.out.println("기록사항" + text);
	};
}
