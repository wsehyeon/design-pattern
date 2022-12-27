package strategy.grade;

public class MajorStrategy implements GradleStrategy{
	public char gradle(int score){
		if (95<= score && score <= 100 )
			return 'S';
		else if (90 <= score && score < 95 )
			return 'A';
		else if (80 <= score && score < 90)
			return 'B';
		else if (70 <= score && score < 80)
			return 'C';
		else if (60 <= score && score < 70)
			return 'D';
		else
			return 'F';
	};
}