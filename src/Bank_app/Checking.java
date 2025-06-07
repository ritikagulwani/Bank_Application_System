package Bank_app;

public class Checking extends Account{
//List properties specific to checking account
	private long debitCardnumber;
	private int digitalPin;
	//constructor to initialize settings for the checking account
	public Checking(String name, String sSN, double initDeposite) {
		super(name, sSN, initDeposite);
		accountnumber = "2"+ accountnumber;
		setDebitCard();
		
	}
	
	@Override
	public void setRate() {
		
		//System.out.println("Implement rate for Checking");
		rate = getBaseRate()*0.15;
	}
	
	private void setDebitCard() {
		debitCardnumber = (long) (Math.random()*Math.pow(10, 12));
		digitalPin = (int) (Math.random()*Math.pow(10, 4));
	}
	
	//list any methods specific to the checking account
	public void showinfo() {
		super.showinfo();
		System.out.println("Your Chechking Account Features"+
				"\nDebit Card Number: "+debitCardnumber+
				"\nDebit Card Pin: "+digitalPin);
		
	}

}