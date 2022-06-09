/**
 * 
 * Allows user to enter a number to determine its factorial, whether or not it's a prime number,
 * and its corresponding Fibonacci number.
 * 
 * duedate      20220520
 * @filename    AlgorithmDesign.java
 * @author      Nicole Delos Reyes
 *
 **/

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AlgorithmDesign extends JFrame {

	private JPanel contentPane;
	private JTextField factorialInput;
	private JTextField primeNumberInput;
	private JTextField fibonacciInput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlgorithmDesign frame = new AlgorithmDesign();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AlgorithmDesign() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 624, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 610, 423);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("-- NUMBERS --");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(213, 55, 163, 31);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter a number and click the button to get the factorial:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(50, 111, 326, 31);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter a number and click the button to determine whether or not it's a prime number:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(50, 202, 502, 31);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Enter a number and click the button to see the corresponding Fibonacci number:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(50, 290, 502, 31);
		panel.add(lblNewLabel_1_1_1);
		
		factorialInput = new JTextField();
		factorialInput.setBounds(86, 158, 49, 20);
		panel.add(factorialInput);
		factorialInput.setColumns(10);
		
		primeNumberInput = new JTextField();
		primeNumberInput.setColumns(10);
		primeNumberInput.setBounds(86, 248, 49, 20);
		panel.add(primeNumberInput);
		
		fibonacciInput = new JTextField();
		fibonacciInput.setColumns(10);
		fibonacciInput.setBounds(86, 339, 49, 20);
		panel.add(fibonacciInput);
		
		JButton btnFactorial = new JButton("Factorial");
		btnFactorial.setBounds(223, 157, 89, 23);
		panel.add(btnFactorial);
		
		JButton btnPrime = new JButton("Prime");
		btnPrime.setBounds(223, 247, 89, 23);
		panel.add(btnPrime);
		
		JButton btnFibonacci = new JButton("Fibonacci");
		btnFibonacci.setBounds(223, 338, 89, 23);
		panel.add(btnFibonacci);
		
		JLabel factorialOutput = new JLabel("---");
		factorialOutput.setHorizontalAlignment(SwingConstants.CENTER);
		factorialOutput.setBounds(361, 161, 89, 14);
		panel.add(factorialOutput);
		
		JLabel primeOutput = new JLabel("---");
		primeOutput.setHorizontalAlignment(SwingConstants.CENTER);
		primeOutput.setBounds(361, 251, 89, 14);
		panel.add(primeOutput);
		
		JLabel fibonacciOutput = new JLabel("---");
		fibonacciOutput.setHorizontalAlignment(SwingConstants.CENTER);
		fibonacciOutput.setBounds(361, 342, 89, 14);
		panel.add(fibonacciOutput);
	}
}
