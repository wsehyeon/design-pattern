package week2.strategy.subject1;

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

	// 생성자가 처리하도록 리팩토링?
	public void addSubject(String name, int score, boolean majorCode){
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		subject.setMajorCode(majorCode);
		subject.setStrategy();
		subjectList.add(subject);
	}

	public void showGradeInfo(){
		for (int i = 0; i < subjectList.size(); i++){
			System.out.println("학생 " + studentName + "의 " + subjectList.get(i).getName() + " 과목 성적은 " +subjectList.get(i).getScorePoint() + "점 이고, 학점은 " + subjectList.get(i).grade() + " 입니다.");
		}
	}


	// 성적 기준변경 테스트용. 성적 정책을 바로 반영할수있도록 리팩토링? (전공,교양 boolan 타입 구려)
	public void changeStrategy(){
		for (int i = 0; i < subjectList.size(); i++){
			subjectList.get(i).setPass();
		}
	}
}
