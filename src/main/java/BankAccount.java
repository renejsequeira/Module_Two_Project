import javax.swing.*;
import java.awt.event.*;


public class BankAccount extends JFrame{
	
	private JPanel panel;
	private JButton balance;
	private JLabel label;
	
	public BankAccount() {
		setTitle("Bank Account");
		
		setSize(250,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		buildPanel();
		
		add(panel);
		
		setVisible(true);
	}
	
	private void buildPanel() {
		label = new JLabel("Enter bank account balance: ");
		balance = new JButton("Get Balance");
		
		
		balance.addActionListener(new CalcButtonListener());
		
		panel = new JPanel();
		
		panel.add(label);
		panel.add(balance);
	}
	
	private class CalcButtonListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JOptionPane.showMessageDialog(null, "Hey Buddy!");
			NewBankAccount newAccount = new NewBankAccount();
			newAccount.setFirstName("Rene");
			newAccount.setLastName("Sequeira");
			newAccount.setaccountID(146718);
			newAccount.deposit(2000);
			newAccount.withdrawal(500);
			//System.out.println(newAccount.getBalance());
			newAccount.accountSummary();
			
			NewCheckingAccount newCheckingAccount = new NewCheckingAccount();
			//newCheckingAccount.displayAccount();
			System.out.println(" ");
			newCheckingAccount.setFirstName("Patsy");
			newCheckingAccount.setLastName("Hernandez");
			newCheckingAccount.deposit(5000);
			newCheckingAccount.setaccountID(146789);
			newCheckingAccount.displayAccount();
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BankAccount();
		

	}

}
