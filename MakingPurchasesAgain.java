import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MakingPurchasesAgain extends JFrame {

	private JPanel contentPane;
	private JTextField txtBouncyBall;
	private JTextField txtJustBallNoBounce;
	private JTextField txtNoBallNoBounce;
	private JTextField txtBubbleGum;
	private JTextField txtRubberDuck;
	private JTextField txtHighFive;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MakingPurchasesAgain frame = new MakingPurchasesAgain();
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
	public MakingPurchasesAgain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 677, 549);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 663, 501);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblTitle = new JLabel("NIC'S CONVENIENCE");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblTitle.setBounds(178, 11, 293, 70);
		panel.add(lblTitle);
		
		JLabel lblInstructions = new JLabel("Please insert the quantity of items that you would like to purchase");
		lblInstructions.setHorizontalAlignment(SwingConstants.CENTER);
		lblInstructions.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblInstructions.setBounds(10, 58, 621, 42);
		panel.add(lblInstructions);
		
		JLabel lblInstructions_2 = new JLabel("and then hit calculate!");
		lblInstructions_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblInstructions_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblInstructions_2.setBounds(10, 92, 621, 42);
		panel.add(lblInstructions_2);
		
		JLabel lblBouncyBall = new JLabel("Bouncy Ball ($1.99): ");
		lblBouncyBall.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBouncyBall.setBounds(48, 163, 179, 27);
		panel.add(lblBouncyBall);
		
		JLabel lblJustBallNoBounce = new JLabel("Just Ball, No Bounce ($1.99): ");
		lblJustBallNoBounce.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblJustBallNoBounce.setBounds(48, 201, 243, 27);
		panel.add(lblJustBallNoBounce);
		
		JLabel lblNoBallNoBounce = new JLabel("No Ball, No Bounce ($0.00):");
		lblNoBallNoBounce.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNoBallNoBounce.setBounds(48, 239, 234, 27);
		panel.add(lblNoBallNoBounce);
		
		JLabel lblBubbleGum = new JLabel("Bubble Gum ($1.99):");
		lblBubbleGum.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBubbleGum.setBounds(48, 277, 179, 27);
		panel.add(lblBubbleGum);
		
		JLabel lblRubberDuck = new JLabel("Rubber Duck ($2.50):");
		lblRubberDuck.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblRubberDuck.setBounds(48, 315, 179, 27);
		panel.add(lblRubberDuck);
		
		JLabel lblHighFive = new JLabel("High Five ($7.99):");
		lblHighFive.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblHighFive.setBounds(48, 353, 179, 27);
		panel.add(lblHighFive);
		
		txtBouncyBall = new JTextField();
		txtBouncyBall.setText("0");
		txtBouncyBall.setBounds(224, 169, 37, 20);
		panel.add(txtBouncyBall);
		txtBouncyBall.setColumns(10);
		
		txtJustBallNoBounce = new JTextField();
		txtJustBallNoBounce.setText("0");
		txtJustBallNoBounce.setColumns(10);
		txtJustBallNoBounce.setBounds(288, 207, 37, 20);
		panel.add(txtJustBallNoBounce);
		
		txtNoBallNoBounce = new JTextField();
		txtNoBallNoBounce.setText("0");
		txtNoBallNoBounce.setColumns(10);
		txtNoBallNoBounce.setBounds(277, 245, 37, 20);
		panel.add(txtNoBallNoBounce);
		
		txtBubbleGum = new JTextField();
		txtBubbleGum.setText("0");
		txtBubbleGum.setColumns(10);
		txtBubbleGum.setBounds(224, 283, 37, 20);
		panel.add(txtBubbleGum);
		
		txtRubberDuck = new JTextField();
		txtRubberDuck.setText("0");
		txtRubberDuck.setColumns(10);
		txtRubberDuck.setBounds(224, 321, 37, 20);
		panel.add(txtRubberDuck);
		
		txtHighFive = new JTextField();
		txtHighFive.setText("0");
		txtHighFive.setColumns(10);
		txtHighFive.setBounds(201, 359, 37, 20);
		panel.add(txtHighFive);
		
		
		JLabel lblTax = new JLabel("Taxes (13%): ");
		lblTax.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTax.setBounds(406, 223, 141, 27);
		panel.add(lblTax);
		
		JLabel lblSubtotal = new JLabel("Subtotal:");
		lblSubtotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSubtotal.setBounds(406, 262, 101, 27);
		panel.add(lblSubtotal);
		
		JLabel lblGrandTotal = new JLabel("Grand Total:");
		lblGrandTotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGrandTotal.setBounds(406, 352, 118, 27);
		panel.add(lblGrandTotal);
		
		JLabel lblTaxFinal = new JLabel("$0.00");
		lblTaxFinal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTaxFinal.setBounds(543, 223, 70, 27);
		panel.add(lblTaxFinal);
		
		JLabel lblSubtotalFinal = new JLabel("$0.00");
		lblSubtotalFinal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSubtotalFinal.setBounds(493, 261, 70, 27);
		panel.add(lblSubtotalFinal);
		
		JLabel lblGrandTotalFinal = new JLabel("$0.00");
		lblGrandTotalFinal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGrandTotalFinal.setBounds(523, 353, 70, 27);
		panel.add(lblGrandTotalFinal);
		
		JButton btnCalculate = new JButton("Calculate!");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int totalBouncyBall, totalNoBounce, totalNoBalls, totalBubbleGum, totalRubberDuck, totalHighFive;
				double subtotal, tax, grandTotal;
				String roundedSubtotal, roundedGrandTotal, roundedTax;
				
				totalBouncyBall = Integer.parseInt(txtBouncyBall.getText());
				totalNoBounce = Integer.parseInt(txtJustBallNoBounce.getText());
				totalNoBalls = Integer.parseInt(txtNoBallNoBounce.getText());
				totalBubbleGum = Integer.parseInt(txtBubbleGum.getText());
				totalRubberDuck = Integer.parseInt(txtRubberDuck.getText());
				totalHighFive = Integer.parseInt(txtHighFive.getText());
				
				
				subtotal = (totalBouncyBall*1.99) + (totalNoBounce*1.50) + (totalNoBalls*0) + (totalBubbleGum*1.99) + (totalRubberDuck*2.50) + (totalHighFive*7.99);
				tax = subtotal * 0.13;
				grandTotal = subtotal + tax;
				
				roundedSubtotal = String.format("%.2f", subtotal);
				roundedTax = String.format("%.2f", tax);
				roundedGrandTotal = String.format("%.2f", grandTotal);
		
				lblSubtotalFinal.setText(String.valueOf("$" + roundedSubtotal));
				lblTaxFinal.setText(String.valueOf("$" + roundedTax));
				lblGrandTotalFinal.setText(String.valueOf("$" + roundedGrandTotal));	
				
			}
		});
		btnCalculate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCalculate.setBounds(431, 153, 141, 46);
		panel.add(btnCalculate);

	}
}
