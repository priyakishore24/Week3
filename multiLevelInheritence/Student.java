package multiLevelInheritence;

public class Student extends Department{

	public void studentName(){
		System.out.println("Student Name: priya");
	}
	
	public void studentDept() {
		System.out.println("Student Dept : CS");
	}
	
	public void studentId() {
		System.out.println("Student Id: 4242");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student stInfo = new Student();
		stInfo.collegeCode();
		stInfo.collegeName();
		stInfo.collegeRank();
		stInfo.depName();
		stInfo.studentId();
		stInfo.studentDept();
		stInfo.studentName();
		
	}
	

}
