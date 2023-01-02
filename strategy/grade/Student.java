package strategy.grade;

import java.util.ArrayList;

public class Student {
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList;
	public static final int BASIC = 0;
	public static final int MAJOR = 1;


	public Student(int studentID, String studentName){
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();
	}

	public void addSubject(String name, int score, boolean majorCode){
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		subject.setMajorCode(majorCode);
		subjectList.add(subject);
	}
//	Duplicate modifier for the method showGradeInfo in type StudentJava(67109221)

	public void showGradeInfo(){
		for (int i = 0; i < subjectList.size(); i++){
			System.out.println("학생 " + studentName + "의 " + subjectList.get(i).getName() + " 과목 성적은 " +subjectList.get(i).getScorePoint() + "점 이고, 학점은 " + subjectList.get(i).gradle() + " 입니다.");
		}
	}
}