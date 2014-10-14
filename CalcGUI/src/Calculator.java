import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;


public class Calculator {

	private JFrame Investment_Calculator;
	private JTextField txtAbc;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.Investment_Calculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Investment_Calculator = new JFrame();
		Investment_Calculator.setBounds(100, 100, 450, 300);
		Investment_Calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Investment_Calculator.getContentPane().setLayout(null);
		
		txtAbc = new JTextField();
		txtAbc.setBounds(227, 36, 180, 32);
		Investment_Calculator.getContentPane().add(txtAbc);
		txtAbc.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(227, 73, 180, 30);
		Investment_Calculator.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(227, 113, 180, 30);
		Investment_Calculator.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(227, 154, 180, 30);
		Investment_Calculator.getContentPane().add(textField_3);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(234, 208, 173, 32);
		Investment_Calculator.getContentPane().add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(234, 40, 4, 22);
		Investment_Calculator.getContentPane().add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(312, 40, 4, 22);
		Investment_Calculator.getContentPane().add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(234, 40, 4, 22);
		Investment_Calculator.getContentPane().add(textArea_2);
		
		JLabel lblNewLabel = new JLabel("Investment Amount");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 36, 207, 32);
		Investment_Calculator.getContentPane().add(lblNewLabel);
		
		JLabel lblYears = new JLabel("Years");
		lblYears.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblYears.setBounds(10, 72, 207, 32);
		Investment_Calculator.getContentPane().add(lblYears);
		
		JLabel lblAmmualInterestRate = new JLabel("Ammual Interest Rate");
		lblAmmualInterestRate.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAmmualInterestRate.setBounds(10, 113, 207, 32);
		Investment_Calculator.getContentPane().add(lblAmmualInterestRate);
		
		JLabel lblFutureValue = new JLabel("Future Value");
		lblFutureValue.setFont(new Font("STXinwei", Font.BOLD, 14));
		lblFutureValue.setBounds(10, 152, 207, 32);
		Investment_Calculator.getContentPane().add(lblFutureValue);
	}
}
