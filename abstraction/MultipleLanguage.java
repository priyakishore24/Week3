package abstraction;

public abstract class MultipleLanguage implements Language,TestTool {

	public void python() {
		System.out.println("Java Supports Python");
	}
	
	public abstract void Ruby();
	
	
}
