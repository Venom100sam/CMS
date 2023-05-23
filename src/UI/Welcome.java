package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Panel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Color;

public class Welcome {

	private JFrame frame;
	private String value;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome window = new Welcome("");
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Welcome(String value) {
		this.value = value;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Panel panel = new Panel();
		panel.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("  Welcomel"+ "" +this.value);
		lblNewLabel.setBounds(150, 25, 179, 13);
		panel.add(lblNewLabel);
		
		JTextPane txtpnThankYouFor = new JTextPane();
		txtpnThankYouFor.setBackground(Color.GRAY);
		txtpnThankYouFor.setText("Thank you! For using this page.\r\n\r\nHow can I assist you today?\r\n\r\nI hope you like our page.\r\n \r\n\r\n\r\n");
		txtpnThankYouFor.setBounds(150, 48, 179, 107);
		panel.add(txtpnThankYouFor);
		frame.setVisible(true);
	}
}
