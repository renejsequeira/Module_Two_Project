import javax.swing.*;
import java.awt.event.*;


@SuppressWarnings("serial")
public class BankAccount extends JFrame{
	
	private JPanel panel;
	private JButton balance;
	
	private JLabel label;
	private JButton getBalance;
	private JButton deposit;
	private JButton withdrawal;
	public BankAccount() {
		setTitle("Bank Account");
		
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		buildPanel();
		
		
		add(panel);
		
		setVisible(true);
	}
	
	private void buildPanel() {
		label = new JLabel("Bank Account ");
		balance = new JButton("Enter Balance");
		getBalance = new JButton("Get Balance ");
		deposit = new JButton("Deposit");
		withdrawal = new JButton("Withdrawal");
		
		
		balance.addActionListener(new CalcButtonListener());
		getBalance.addActionListener(new CalcButtonListener1());
		deposit.addActionListener(new CalcButtonListener2());
		withdrawal.addActionListener(new CalcButtonListener3());
		
		panel = new JPanel();
		
		panel.add(label);
		panel.add(balance);
		panel.add(getBalance);
		panel.add(deposit);
		panel.add(withdrawal);

		
	}
	
	
	private class CalcButtonListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String input = JOptionPane.showInputDialog(null, "Enter Starting Balance: ");
			double balance = Double.parseDouble(input);
			NewCheckingAccount newCheckingAccount = new NewCheckingAccount();
			
			newCheckingAccount.deposit(balance);
			
		}
		
	}
	
	
	private class CalcButtonListener1 implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null,NewCheckingAccount.getBalance());
			
		}
		
	}
	
	
	private class CalcButtonListener2 implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			String input = JOptionPane.showInputDialog(null, "Enter deposit amount: ");
			double deposit = Double.parseDouble(input);
			NewCheckingAccount.deposit(deposit);
			
		}
		
	}
	
	
	private class CalcButtonListener3 implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			String input = JOptionPane.showInputDialog(null, "Enter withdrawal amount: ");
			double withdrawal = Double.parseDouble(input);
			NewCheckingAccount.withdrawal(withdrawal);
			
		}
		
	}

	public static void main(String[] args) {
		new BankAccount();
		
	}

}
