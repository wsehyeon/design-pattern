package week2.strategy.subject1;

public class BasicStrategy implements Strategy {
	private static Strategy strategy = new BasicStrategy();

	public static Strategy getInstance(){
		return strategy;
	}

	public char myGrade(int score){
		if (90 <= score && score <= 100)
			return 'A';
		else if ( 80 <= score && score <= 89)
			return 'B';
		else if ( 70 <= score && score <= 79)
			return 'C';
		else if ( 55 <= score && score <= 69)
			return 'D';
		else if ( 55 > score)
			return 'F';
		else
			return '\0';
	}
}
