package Bank_app;

public class Savings extends Account {

	private int safetyDepositeBoxID;
	private int safetyDepositeBoxKey;

	// constructor to initialize settings for the account
	public Savings(String name, String sSN, double initdeposite) {
		super(name, sSN, initdeposite);
		accountnumber = "1" + accountnumber;
		setSafetyDepositeBox();
	}

	@Override
	public void setRate() {

		// System.out.println("Implement rate for Savings");
		rate = getBaseRate() - 0.25;
	}

	private void setSafetyDepositeBox() {
		safetyDepositeBoxID = (int) (Math.random() * Math.pow(10, 3));
		safetyDepositeBoxKey = (int) (Math.random() * Math.pow(10, 4));
	}

	// list any methods specific to the savings account

	public void showinfo() {
		super.showinfo();
		System.out.println(
				"Your Saavings Account Feature" +
						"\nSafety Deposite Box ID: " + safetyDepositeBoxID +
						"\nSafety Deposite Box Key:" + safetyDepositeBoxKey

		);

	}

}
