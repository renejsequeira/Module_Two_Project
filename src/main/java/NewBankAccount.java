
public class NewBankAccount {

	protected String firstName;
	protected String lastName;
	protected int accountID;
	protected Double balance;
	
	public NewBankAccount() {
		balance = 0.0;
	 }
	public void deposit(double d) {
		balance += d;
	 }
	
	public void withdrawal(double w) {
		balance -= w;
	 }
	 public void setFirstName(String n) {
		 firstName = n;
	 }
	 
	 public void setLastName(String l) {
		 lastName = l;
	 }
	 public void setaccountID(int a) {
		 accountID = a;
	 }
	 
	 public double getBalance() {
		 return balance;
	 }
	 
	 public void accountSummary() {
		 System.out.println("First name: "+ firstName);
		 System.out.println("Last name: "+ lastName);
		 System.out.println("Account ID: "+ accountID);
		 System.out.println("Balance: "+ balance); 
	 }

	/*public static void main(String[] args) {
		BankAccount newAccount = new BankAccount();
		newAccount.setFirstName("Rene");
		newAccount.setLastName("Sequeira");
		newAccount.setaccountID(146718);
		newAccount.deposit(2000);
		newAccount.withdrawal(500);
		//System.out.println(newAccount.getBalance());
		newAccount.accountSummary();
		
		CheckingAccount newCheckingAccount = new CheckingAccount();
		//newCheckingAccount.displayAccount();
		System.out.println(" ");
		newCheckingAccount.setFirstName("Patsy");
		newCheckingAccount.setLastName("Hernandez");
		newCheckingAccount.deposit(5000);
		newCheckingAccount.setaccountID(146789);
		newCheckingAccount.displayAccount();
	}*/
}
