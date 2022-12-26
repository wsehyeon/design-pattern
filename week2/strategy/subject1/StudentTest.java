package week2.strategy.subject1;

public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student(1001, "Lee");
		studentLee.addSubject("국어", 100, false);
		studentLee.addSubject("수학", 100, true);
		Student studentKim = new Student(1002, "Kim");
		studentKim.addSubject("국어", 55, true);
		studentKim.addSubject("수학", 55, false);
		studentKim.addSubject("영어", 100, false);
		studentLee.showGradeInfo();
		System.out.println("======================================");
		studentKim.showGradeInfo();
		
		System.out.println("\n");
		System.out.println("======ChangeStrategy========");
		Student studentSwang = new Student(1002, "Kim");
		studentSwang.addSubject("java", 42, true);
		studentSwang.addSubject("C언어", 24, false);
		studentSwang.addSubject("html", 84, false);
		studentSwang.changeStrategy();
		studentSwang.showGradeInfo();
	}
}