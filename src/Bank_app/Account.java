package Bank_app;

// public abstract class Account implements InterestBaseRate {
public abstract class Account extends InterestBaseRate{
	//List common properties for savings and checking account
	
	
		private String name;
		private String sSN;
		private double balance;
		protected String accountnumber;
		protected double rate;
		private static int index = 10000;
		
	//Constructor to set base properties and initialize the account
	public Account(String name,String sSN,double initDeposite)
	{ 
		this.name=name;
		this.sSN=sSN;
		balance = initDeposite;
		//System.out.println("Name :"+name+"\nsSN :"+sSN+"\nBlanace :"+balance);
		
		index++;
		this.accountnumber=setAccountNumber();
		setRate();
	}
	
	public abstract void setRate();
	
	public void compound() {
		double accuredInterest = balance + (rate/100);
		balance = balance+ accuredInterest;
		System.out.println("Accured Interest: $"+accuredInterest);
		printBalance();
	}
	
	private String setAccountNumber() {
		String lastTwoSN = sSN.substring(sSN.length()-2);
		int unqid=index;
		int random = (int) (Math.random()*Math.pow(10,3));
		return lastTwoSN+unqid+random;
	}
	//List common methods
	public void Deposit(double amount) {
		balance = balance + amount;
		System.out.println("Amount Deposited: "+amount);
		printBalance();
	}
	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Amount Withdrawn: "+amount);
		printBalance();
	}
	public void transfer(String acc,double amount){
		balance = balance- amount;
		System.out.println("Transfering "+amount + "to" + acc);
		printBalance();
	}
	public void printBalance() {
		System.out.println("Your Balance is: "+balance);
	}
	
	
	
	public void showinfo()
	{
		System.out.println(
				"NAME: "+name+
				"\nACCOUNT NUMBER: "+accountnumber+
				"\nBalance: "+balance+
				"\nRate "+rate +"%"
				
				
				);
	}
}