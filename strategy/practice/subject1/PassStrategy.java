package week2.strategy.subject1;

public class PassStrategy implements Strategy {
	private static Strategy strategy = new PassStrategy();

	public static Strategy getInstance(){
		return strategy;
	}

	public char myGrade(int score){
		if (42 <= score)
			return 'P';
		else
			return 'F';
	}
}
