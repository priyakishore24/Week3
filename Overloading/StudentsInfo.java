package Overloading;

public class StudentsInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Students stInfo = new Students();
		
		stInfo.getStudentInfo(1001);
		stInfo.getStudentInfo(1001,"Priya");
		stInfo.getStudentInfo("priyakishore@gmail.com", "1234567890");
		
		
		
	}

}
