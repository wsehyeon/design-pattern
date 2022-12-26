package week2.strategy.subject1;

public class Subject {
	private String name;
	private int scorePoint;
	private boolean majorCode;
	private Strategy strategy;

	public void setStrategy(){
		if (majorCode == true)
			strategy = MajorStrategy.getInstance();
		else if (majorCode == false)
			strategy = BasicStrategy.getInstance();
	}

	// 정책이 변경되는지 테스트 코드
	public void setPass(){
		strategy = PassStrategy.getInstance();
	}

	public char grade(){
		return strategy.myGrade(scorePoint);
	}

	public String getName() { return name; }
	public void setName(String name) {this.name = name; }
	public int getScorePoint() { return scorePoint;	}
	public void setScorePoint(int scorePoint) {	this.scorePoint = scorePoint; }
	public boolean isMajorCode() { return majorCode;	}
	public void setMajorCode(boolean majorCode) {	this.majorCode = majorCode; }
	}