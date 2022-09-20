package abstraction;

public class Automation extends MultipleLanguage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Automation objauto = new Automation();
		objauto.java();
		objauto.selenium();
		objauto.Ruby();
		objauto.python();

	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("Java is an object oriented programming Language");
	}

	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("Java supports selenium");
	}

	@Override
	public void Ruby() {
		// TODO Auto-generated method stub
		System.out.println("Java supports Ruby");
	}

}
