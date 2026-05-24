
public class NewBankAccount {

	protected String firstName;
	protected String lastName;
	protected int accountID;
	protected static Double balance;
	
	public NewBankAccount() {
		balance = 0.0;
	 }
	public static void deposit(double d) {
		balance += d;
	 }
	
	public static void withdrawal(double w) {
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
	 
	 public static double getBalance() {
		 return balance;
	 }
	 
	 public void accountSummary() {
		 System.out.println("First name: "+ firstName);
		 System.out.println("Last name: "+ lastName);
		 System.out.println("Account ID: "+ accountID);
		 System.out.println("Balance: "+ balance); 
	 }


}
