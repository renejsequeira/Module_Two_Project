
public class NewCheckingAccount extends NewBankAccount {
	final double INTERESTRATE = 1.00;
	double overdraftFee = 0.0;
	
	public void processWithdrawal() {
		if (balance < 0){
			overdraftFee += 30.0;
			balance -= overdraftFee;
			System.out.println(balance);
		}
	}
	
	public void displayAccount(){
		//super.accountSummary();
		System.out.println(super.firstName);
		System.out.println(super.lastName);
		System.out.println(super.accountID);
		System.out.println(super.balance);
		System.out.println("Interest Rate: " + INTERESTRATE);
		
		
	}

}
