package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class SignUP {

	private JFrame frame;
	private JTextField txtHomePage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUP window = new SignUP();
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
	public SignUP() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 10, 416, 243);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		txtHomePage = new JTextField();
		txtHomePage.setBackground(Color.ORANGE);
		txtHomePage.setText("   HOME PAGE ");
		txtHomePage.setBounds(153, 26, 75, 19);
		panel.add(txtHomePage);
		txtHomePage.setColumns(10);
		
		JButton btnNewButton = new JButton("Sign In ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SignIn();
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(43, 111, 85, 21);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sign Up");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SignUpp();
				frame.setVisible(false);
				
			}
		});
		btnNewButton_1.setBounds(246, 111, 85, 21);
		panel.add(btnNewButton_1);
		frame.setVisible(true);
	}
}
