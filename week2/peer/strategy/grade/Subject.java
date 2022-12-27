package strategy.grade;

public class Subject {
	GradleStrategy myStrategy;
    // GradleStrategy normalGradle = GradleStrategy.!!@();
    // GradleStrategy passGradle = GradleStrategy.pass();
	private String name;
	private int scorePoint;
	private boolean majorCode;
	public String getName() { return name;}
	public void setName(String name) {this.name = name; }
	public int getScorePoint() { return scorePoint;}
	public void setScorePoint(int scorePoint) { this.scorePoint = scorePoint; }
	public boolean isMajorCode() { return majorCode; }
	public void setMajorCode(boolean majorCode) {
		this.majorCode = majorCode;
		this.setStrategy();
	}
	
	public void setStrategy(){
		if(majorCode)
			myStrategy = new MajorStrategy();
		else
			myStrategy = new BasicStrategy();
	}

	public char gradle(){
		return myStrategy.gradle(scorePoint);
	}
}