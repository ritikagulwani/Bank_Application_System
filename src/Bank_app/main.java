package Bank_app;
import java.util.*;

public class main {
	

	public static void main(String[] args) {
		InterestBaseRate rate = new InterestBaseRate();
		List<Account> accounts = new LinkedList<Account>();
		String file = "D:\\code\\java\\java_project\\Bank_application\\src\\Bank_app\\NewBankAccounts.csv";

		// Object Utilities;
		List<String[]> newCustomer = Utilities.csv.read(file);
		System.out.println("new Customers");
		for (String[] nc : newCustomer) {

			String name = nc[0];
			String sSN = nc[1];
			String accountType = nc[2];
			double initDeposit = Double.parseDouble(nc[3]);
			// System.out.println(name+" "+ sSN+" " +accountType+" $"+ initDeposit);
			if (accountType.equals("Savings")) {
				accounts.add(new Savings(name, sSN, initDeposit));
			} else if (accountType.equals("Checking")) {
				accounts.add(new Checking(name, sSN, initDeposit));
			} else {
				System.out.println("Error read a account type");
			}

		}
		// accounts.get(5).showinfo();
		for (Account acc : accounts) {
			System.out.println("\n********************");
			acc.showinfo();
		}
	}
}
