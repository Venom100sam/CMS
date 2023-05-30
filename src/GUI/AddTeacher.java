package GUI;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import com.mysql.cj.jdbc.PreparedStatement;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.Map;
import java.awt.event.ActionEvent;
 

public class AddTeacher extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField nameField;
	private JTextField efield;
	private JTextField passwordField;
	private JTextField MT1;
	private JTextField MT2;
	private JTextField MT3;
	private JTextField MT4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddTeacher frame = new AddTeacher();
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
	public AddTeacher() {
		Map obj=new HashMap();    
		setVisible(true);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 707, 292);
		getContentPane().setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 669, 398);
		getContentPane().add(layeredPane);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 906, 527);
		layeredPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblAddTeacher = new JLabel("Add Teacher");
		lblAddTeacher.setBackground(Color.GRAY);
		lblAddTeacher.setForeground(Color.BLACK);
		lblAddTeacher.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 15));
		lblAddTeacher.setBounds(78, 33, 106, 24);
		panel.add(lblAddTeacher);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(98, 83, 45, 13);
		panel.add(lblNewLabel_1);
		
		JLabel emailField = new JLabel("email");
		emailField.setBounds(98, 118, 45, 13);
		panel.add(emailField);
		
		JLabel lblNewLabel_1_2 = new JLabel("Password");
		lblNewLabel_1_2.setBounds(78, 153, 65, 13);
		panel.add(lblNewLabel_1_2);
		
		nameField = new JTextField();
		nameField.setColumns(10);
		nameField.setBounds(153, 80, 96, 19);
		panel.add(nameField);
		
		efield = new JTextField();
		efield.setColumns(10);
		efield.setBounds(153, 115, 96, 19);
		panel.add(efield);
		
		passwordField = new JTextField();
		passwordField.setColumns(10);
		passwordField.setBounds(153, 150, 96, 19);
		panel.add(passwordField);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				String query="INSERT INTO `auth` ( `email`, `password`, `role`, `name`,`modules`) VALUES (?,?, ?, ?);";
				try {
					obj.put("m1",MT1.getText());
					obj.put("m2",MT2.getText());
					obj.put("m3",MT3.getText());
					obj.put("m4",MT4.getText());
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/course_management_system", "root", "");
					java.sql.PreparedStatement pst=(PreparedStatement) con.prepareStatement(query);
					pst.setString(1,efield.getText());
					pst.setString(2,passwordField.getText());
					pst.setString(3,"teacher");
					pst.setString(4,nameField.getText());
					pst.setString(5,obj.toString());
					
					pst.execute();
					JOptionPane.showMessageDialog(null, "Sucessfully added");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, e1.getMessage());
				}
			
			}});
		btnNewButton.setBounds(63, 206, 621, 21);
		panel.add(btnNewButton);
		
		MT1 = new JTextField();
		MT1.setColumns(10);
		MT1.setBounds(322, 101, 166, 19);
		panel.add(MT1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Module1");
		lblNewLabel_1_1.setBounds(322, 81, 106, 13);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Module2");
		lblNewLabel_1_1_1.setBounds(518, 81, 106, 13);
		panel.add(lblNewLabel_1_1_1);
		
		MT2 = new JTextField();
		MT2.setColumns(10);
		MT2.setBounds(518, 101, 166, 19);
		panel.add(MT2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Module3");
		lblNewLabel_1_1_1_1.setBounds(322, 132, 106, 13);
		panel.add(lblNewLabel_1_1_1_1);
		
		MT3 = new JTextField();
		MT3.setColumns(10);
		MT3.setBounds(322, 152, 166, 19);
		panel.add(MT3);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Module3");
		lblNewLabel_1_1_1_2.setBounds(518, 127, 106, 13);
		panel.add(lblNewLabel_1_1_1_2);
		
		MT4 = new JTextField();
		MT4.setColumns(10);
		MT4.setBounds(518, 147, 166, 19);
		panel.add(MT4);
	}
}


