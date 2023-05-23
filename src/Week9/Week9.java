package Week9;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JTree;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JPasswordField;
import javax.swing.JToggleButton;

public class Week9 {

	private JFrame frmHeroMan;
	private JTextField txtFirstName;
	private JTextField txtMaharjan;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Week9 window = new Week9();
					window.frmHeroMan.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Week9() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHeroMan = new JFrame();
		frmHeroMan.setBackground(SystemColor.activeCaptionBorder);
		frmHeroMan.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		frmHeroMan.setTitle("Hero Man");
		frmHeroMan.setBounds(100, 100, 450, 300);
		frmHeroMan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHeroMan.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hello, Welcome to this website.");
		lblNewLabel.setBounds(0, 0, 436, 13);
		frmHeroMan.getContentPane().add(lblNewLabel);
		
		txtFirstName = new JTextField();
		txtFirstName.setBackground(new Color(51, 255, 255));
		txtFirstName.setText("Sameer");
		txtFirstName.setBounds(88, 69, 75, 19);
		frmHeroMan.getContentPane().add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtMaharjan = new JTextField();
		txtMaharjan.setBackground(new Color(0, 255, 255));
		txtMaharjan.setText("Maharjan ");
		txtMaharjan.setBounds(88, 95, 75, 19);
		frmHeroMan.getContentPane().add(txtMaharjan);
		txtMaharjan.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("First Name ");
		lblNewLabel_1.setBounds(36, 72, 45, 13);
		frmHeroMan.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBackground(new Color(255, 204, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(txtFirstName.getText() + " " + txtMaharjan.getText());
			}
		});
		btnNewButton.setBounds(88, 136, 85, 21);
		frmHeroMan.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Last Name");
		lblNewLabel_2.setBounds(36, 95, 45, 13);
		frmHeroMan.getContentPane().add(lblNewLabel_2);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("New toggle button");
		tglbtnNewToggleButton.setForeground(new Color(255, 255, 255));
		tglbtnNewToggleButton.setBackground(new Color(0, 0, 0));
		tglbtnNewToggleButton.setBounds(297, 210, 115, 21);
		frmHeroMan.getContentPane().add(tglbtnNewToggleButton);
		
		
	}
}
