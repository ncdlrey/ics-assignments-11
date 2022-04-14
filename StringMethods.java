/**
 * Performs different string methods
 * 
 * date         20220213
 * @filename    StringMethods.java
 * @author      Nicole D.
 */

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StringMethods extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StringMethods frame = new StringMethods();
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
	public StringMethods() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 869, 603);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 845, 555);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel title = new JLabel("SUPER STRING SOFTWARE");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("Tahoma", Font.BOLD, 22));
		title.setBounds(155, 39, 575, 53);
		panel.add(title);
		
		JLabel length = new JLabel("Enter a string. The program will output the number of characters in it:");
		length.setBounds(70, 103, 479, 27);
		panel.add(length);
		
		JLabel lowerCase = new JLabel("Enter a string in lower case letters. The program will output the string in all caps:");
		lowerCase.setBounds(70, 159, 479, 27);
		panel.add(lowerCase);
		
		JLabel fourthChar = new JLabel("Enter a string. The program will output the 4th character:");
		fourthChar.setBounds(70, 222, 442, 14);
		panel.add(fourthChar);
		
		JLabel identical = new JLabel("Enter two strings. The program will output whether or not they're identical:");
		identical.setBounds(70, 281, 502, 14);
		panel.add(identical);
		
		JLabel stringAndLetter = new JLabel("Enter a string and a letter. The program will output whether or not the letter is found in the string:");
		stringAndLetter.setBounds(70, 337, 594, 27);
		panel.add(stringAndLetter);
		
		JLabel eightChar = new JLabel("Enter a string that is at least 8 characters long. The program will output characters 4-6:");
		eightChar.setBounds(70, 399, 547, 27);
		panel.add(eightChar);
		
		JLabel replaceAwithX = new JLabel("Enter a string that contains at least one \"a\". The program will replace all occurences of the letter \"a\" with \"x\":");
		replaceAwithX.setHorizontalAlignment(SwingConstants.LEFT);
		replaceAwithX.setBounds(70, 472, 695, 14);
		panel.add(replaceAwithX);
		
		JTextArea inputForLength = new JTextArea();
		inputForLength.setBounds(114, 136, 98, 22);
		panel.add(inputForLength);
		
		JTextArea inputForAllCaps = new JTextArea();
		inputForAllCaps.setBounds(114, 189, 98, 22);
		panel.add(inputForAllCaps);
		
		JTextArea inputForFourthChar = new JTextArea();
		inputForFourthChar.setBounds(114, 248, 98, 22);
		panel.add(inputForFourthChar);
		
		JTextArea inputForIdentical_1 = new JTextArea();
		inputForIdentical_1.setBounds(114, 304, 98, 22);
		panel.add(inputForIdentical_1);
		
		JTextArea inputForIdentical_2 = new JTextArea();
		inputForIdentical_2.setBounds(229, 304, 98, 22);
		panel.add(inputForIdentical_2);
		
		JTextArea inputForStringFind = new JTextArea();
		inputForStringFind.setBounds(114, 366, 98, 22);
		panel.add(inputForStringFind);
		
		JTextArea inputForLetterFind = new JTextArea();
		inputForLetterFind.setBounds(229, 366, 39, 22);
		panel.add(inputForLetterFind);
		
		JTextArea inputForEightChar = new JTextArea();
		inputForEightChar.setBounds(114, 439, 143, 22);
		panel.add(inputForEightChar);
		
		JTextArea inputForReplaceA = new JTextArea();
		inputForReplaceA.setBounds(114, 500, 143, 22);
		panel.add(inputForReplaceA);
		
		JLabel outputLength = new JLabel("--");
		outputLength.setHorizontalAlignment(SwingConstants.CENTER);
		outputLength.setBounds(655, 141, 110, 14);
		panel.add(outputLength);
		
		JLabel outputIdentical = new JLabel("--");
		outputIdentical.setHorizontalAlignment(SwingConstants.CENTER);
		outputIdentical.setBounds(655, 309, 110, 14);
		panel.add(outputIdentical);
		
		JLabel outputAllCaps = new JLabel("--");
		outputAllCaps.setHorizontalAlignment(SwingConstants.CENTER);
		outputAllCaps.setBounds(655, 194, 110, 14);
		panel.add(outputAllCaps);
		
		JLabel outputFourthChar = new JLabel("--");
		outputFourthChar.setHorizontalAlignment(SwingConstants.CENTER);
		outputFourthChar.setBounds(655, 248, 110, 14);
		panel.add(outputFourthChar);
		
		JLabel outputLetterFound = new JLabel("--");
		outputLetterFound.setHorizontalAlignment(SwingConstants.CENTER);
		outputLetterFound.setBounds(655, 371, 110, 14);
		panel.add(outputLetterFound);
		
		JLabel outputCharFourToSix = new JLabel("--");
		outputCharFourToSix.setHorizontalAlignment(SwingConstants.CENTER);
		outputCharFourToSix.setBounds(655, 447, 110, 14);
		panel.add(outputCharFourToSix);
		
		JLabel outputReplaceA = new JLabel("--");
		outputReplaceA.setHorizontalAlignment(SwingConstants.CENTER);
		outputReplaceA.setBounds(655, 505, 110, 19);
		panel.add(outputReplaceA);
		
		JButton findLength = new JButton("Length"); 
		findLength.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String inputLength = inputForLength.getText();
				outputLength.setText(String.valueOf(inputLength.length()));
			}
		});
		
		findLength.setBounds(238, 137, 89, 23);
		panel.add(findLength);
		
		JButton getAllCaps = new JButton("All Caps");
		getAllCaps.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String inputUpperCase = inputForAllCaps.getText();
				outputAllCaps.setText(inputUpperCase.toUpperCase());
			}
		});
		
		getAllCaps.setBounds(238, 190, 89, 23);
		panel.add(getAllCaps);
		
		JButton getFourthChar = new JButton("4th Character");
		getFourthChar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String inputFourthChar = inputForFourthChar.getText();
				outputFourthChar.setText(String.valueOf(inputFourthChar.charAt(3)));
				
			}
		});
		getFourthChar.setBounds(238, 247, 128, 23);
		panel.add(getFourthChar);
		
		JButton getIdentical = new JButton("Identical?");
		getIdentical.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String identical_1 = inputForIdentical_1.getText();
				String identical_2 = inputForIdentical_2.getText();
				
				if (identical_1.equals(identical_2)) {
					outputIdentical.setText("Yes!");
				}
				
				else {
					outputIdentical.setText("No!");
				}
			}
		});
		getIdentical.setBounds(349, 305, 99, 23);
		panel.add(getIdentical);
		
		JButton getLetterFound = new JButton("Letter found?");
		getLetterFound.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String findLetterWord = inputForStringFind.getText();
				String findLetterLetter = inputForLetterFind.getText();
				
				if (findLetterWord.contains(findLetterLetter)) {
					outputLetterFound.setText("The letter was found!");	
				}
				
				else {
					outputLetterFound.setText("The letter was not found.");
				}
				
			}
		});
		
		getLetterFound.setBounds(311, 367, 127, 23);
		panel.add(getLetterFound);
		
		JButton getCharFourToSix = new JButton("Charcters 4-6");
		getCharFourToSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		getCharFourToSix.setBounds(311, 438, 137, 23);
		panel.add(getCharFourToSix);
		
		JButton getAReplacement = new JButton("Replace \"a\"");
		getAReplacement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String wordToReplaceA = inputForReplaceA.getText();
				outputReplaceA.setText(wordToReplaceA.replace("a", "x"));
			}
		});
		getAReplacement.setBounds(311, 501, 127, 23);
		panel.add(getAReplacement);
		
		
	}
}
