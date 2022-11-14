package bankBalance;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


/*
 * Application that keeps track of a Bank Balance and
 * allows the user to deposit or withdraw money.
 * Utilizes Java Swing GUI.
 */
public class BankBalance extends JPanel implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//Balance
	double balance = 0;
	
	//Buttons
	JButton initialize = new JButton("Initialize Balance");
	JButton balanceButton = new JButton("Balance");
	JButton deposit = new JButton("Deposit");
	JButton withdraw = new JButton("Withdraw");
							
	//Text Fields
	TextField initializeInput = new TextField(15);
	TextField balanceField = new TextField(15);
	TextField input = new TextField(15);
	
	public BankBalance() {
		balance = 0;
		//Frame
		JFrame frame = new JFrame("Bank Balance");
		frame.setVisible(true);
		frame.setSize(400,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		//Main Panel
		JPanel panel = new JPanel();
		panel.setBounds(0,0,400,300);
		panel.setBackground(Color.gray);
		panel.setVisible(true);
						
		//Top Panel
		JPanel panel1 = new JPanel();
		panel1.setBounds(0,0,400,100);
		panel1.setBackground(Color.gray);
		panel1.setVisible(true);
						
		//Middle Panel
		JPanel panel2 = new JPanel();
		panel2.setBounds(0,0,400,100);
		panel2.setBackground(Color.gray);
		panel2.setVisible(true);
						
		//bottom Panel
		JPanel panel3 = new JPanel();
		panel3.setBounds(0,0,400,100);
		panel3.setBackground(Color.gray);
		panel3.setVisible(true);
						
		//Layout
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		//Action Listeners
		
				
		//Initialize balance.
		panel1.add(initializeInput);
		panel1.add(initialize);
		
		//Displays Balance
		panel2.add(balanceButton);
		panel2.add(balanceField);
		balanceButton.setVisible(false);
		balanceField.setVisible(false);
		balanceField.setEditable(false);
		
		//Deposit and Withdraw
		panel3.add(input);
		panel3.add(deposit);
		panel3.add(withdraw);
		input.setVisible(false);
		deposit.setVisible(false);
		withdraw.setVisible(false);
						
		panel.add(panel1);
		panel.add(panel2);
		panel.add(panel3);
		frame.add(panel);
		
		//Action Listeners
		initialize.addActionListener(this);
		deposit.addActionListener(this);
		withdraw.addActionListener(this);
	}
	
	// Main method runs application.
	public static void main(String[] args) {
		BankBalance application = new BankBalance();
	}
	
	/*
	 * Action Listener for the GUI.
	 * Allows the user to initialize balance,
	 * deposit, and withdraw.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == initialize) {
			String temp = initializeInput.getText();
			balance = Double.parseDouble(temp);
			balanceField.setText("$" + balance);
			initialize.setVisible(false);
			initializeInput.setVisible(false);
			balanceButton.setVisible(true);
			balanceField.setVisible(true);
			input.setVisible(true);
			deposit.setVisible(true);
			withdraw.setVisible(true);
		} else if (e.getSource() == deposit) {
			String temp = input.getText();
			balance += Double.parseDouble(temp);
			balanceField.setText("$" + balance);
			input.setText("");
		} else if (e.getSource() == withdraw) {
			String temp = input.getText();
			balance -= Double.parseDouble(temp);
			balanceField.setText("$" + balance);
			input.setText("");
		}
	}
	
}
