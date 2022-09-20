package Overridding;

public class MyBankAc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankInfo info = new BankInfo();
		info.savings();
		info.fixed();
		info.deposit();
		
		AxisBank ab = new AxisBank();
		ab.deposit();
	}

}
