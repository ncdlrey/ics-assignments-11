/**
 * 
 * Returns a number's factorial, whether or not it's a prime number, and/or its corresponding Fibonacci number.
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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AlgorithmDesign extends JFrame {

	private JPanel contentPane;
	private JTextField factorialInput;
	private JTextField primeNumberInput;
	private JTextField fibonacciInput;	
	
	public static int getFactorial(int num) {
		

		for(int i = num - 1; i >= 1; i--) {
			
			num = num*i;	
		}
		return num;
	}
	
	public static String isPrime(int num) {
		String primeOrNot = "";
		
		boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) {
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag) {
	    	 primeOrNot = "Number is prime";
	    }	  
	    
	    else {
	    	 primeOrNot = "Number is not prime";
	   }
		
		return primeOrNot;
	}
	
	public static int correspondingFibonacci(int num) {
		if(num==0 || num==1) {
	        return num;
		} 
		
		if(num==-1) {
		    return 1;
		}
		
		if(num<0) {
	        int sign = num % 2 == 0 ? -1 : 1;
	        return sign * correspondingFibonacci(-num);
	    } else {
	        return correspondingFibonacci(num-1) + correspondingFibonacci(num-2);
	    }      
	}
	
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
		
		JLabel factorialOutput = new JLabel("---");
		factorialOutput.setHorizontalAlignment(SwingConstants.CENTER);
		factorialOutput.setBounds(322, 161, 250, 20);
		panel.add(factorialOutput);
		
		JLabel primeOutput = new JLabel("---");
		primeOutput.setHorizontalAlignment(SwingConstants.CENTER);
		primeOutput.setBounds(322, 251, 250, 20);
		panel.add(primeOutput);
		
		JLabel fibonacciOutput = new JLabel("---");
		fibonacciOutput.setHorizontalAlignment(SwingConstants.CENTER);
		fibonacciOutput.setBounds(361, 342, 177, 14);
		panel.add(fibonacciOutput);
		
		JButton btnFactorial = new JButton("Factorial");
		btnFactorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					int factorialN = Integer.parseInt(factorialInput.getText());
					
					if (factorialN < 0) {
						factorialOutput.setText("Please only enter positive integers.");
					}
					
					else {
					int factorialResult = getFactorial(factorialN);
					factorialOutput.setText(Integer.toString(factorialResult));
					}

				} 
				
				catch (NumberFormatException ex) {
					
					try {
						double factorialD = Double.parseDouble(factorialInput.getText());
						factorialOutput.setText("Please only enter integers.");				
					}
					
					catch (NumberFormatException exp) {	
						factorialOutput.setText("Not a number :-(");
					}
				}
			}
		});
		btnFactorial.setBounds(223, 157, 89, 23);
		panel.add(btnFactorial);
		
		JButton btnPrime = new JButton("Prime");
		btnPrime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					int primeNum = Integer.parseInt(primeNumberInput.getText());
					
					if (primeNum < 0) {
						primeOutput.setText("Negative numbers cannot be prime.");
					}
										
					else {
					String primeResult = isPrime(primeNum);
					primeOutput.setText(primeResult);
					}
				}
				
				catch (NumberFormatException ex) {		
					try {
						double primeNumD = Double.parseDouble(primeNumberInput.getText());
						primeOutput.setText("Prime numbers are WHOLE numbers.");
					}
					
					catch (NumberFormatException exp) {	
						primeOutput.setText("Not a number :-(");
					}
					
			    }	
			}
		});
		btnPrime.setBounds(223, 247, 89, 23);
		panel.add(btnPrime);
		
		JButton btnFibonacci = new JButton("Fibonacci");
		btnFibonacci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					int fibonacciNum = Integer.parseInt(fibonacciInput.getText());
					int fibonacciResult = correspondingFibonacci(fibonacciNum);
					fibonacciOutput.setText(Integer.toString(fibonacciResult));
				}
				
				catch (NumberFormatException ex) {
					try {
						double fibonacciNumD = Double.parseDouble(fibonacciInput.getText());
						fibonacciOutput.setText("Please only enter integers.");				
					}
					
					catch (NumberFormatException exp) {	
						fibonacciOutput.setText("Not a number :-(");
					}
				}
			}
		});
		btnFibonacci.setBounds(223, 338, 89, 23);
		panel.add(btnFibonacci);
	}
}
