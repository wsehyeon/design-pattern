package strategy.grade;

public class BasicStrategy implements GradleStrategy{
	public char gradle(int score){
		if (90<= score && score <= 100 )
			return 'A';
		else if (80 <= score && score < 90 )
			return 'B';
		else if (70 <= score && score < 80)
			return 'C';
		else if (55 <= score && score < 70)	
			return 'D';
		else if (55 < score)
			return 'F';
		else
			return '\0';
	};
}