package Overloading;

public class Students {

	public void getStudentInfo(int id) {
		int I1 = id;
		System.out.println("Id:" + I1);
	}

	public void getStudentInfo(int id, String name) {
		String S1 = name;
		System.out.println("Name:" + S1);
	}

	public void getStudentInfo(String Email, String PhoneNo) {
		String S2 = Email;
		String S3 = PhoneNo;
		System.out.println("Email:" + S2);
		System.out.println("PhoneNo:" + S3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
