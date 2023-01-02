package week2.state.practice;

public class NightState implements State{
	private static NightState singleton = new NightState();

	private NightState(){}

	public static State getInstance() {
		return singleton;
	}

	@Override
	public void doClock(Context context, int hour){
		if (hour >= 9 && 17 > hour)
			context.changeState(DayState.getInstance());
	};

	@Override
	public void doUse(Context context){
		context.callSecurityCenter("비상상황, 금고 사용");
	};

	@Override
	public void doAlarm(Context context){
		context.callSecurityCenter("비상벨");
	};

	@Override
	public void doPhone(Context context){
		context.callSecurityCenter("자동응답기 : 용건을 남겨주세요");
	};

	@Override
	public String toString(){ return "[야간]"; };
	
}
