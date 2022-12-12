package Mysql;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class marks {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					marks window = new marks();
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
	public marks() {
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
		
		JLabel lblNewLabel = new JLabel("marks");
		lblNewLabel.setFont(new Font("Segoe UI Historic", Font.PLAIN, 16));
		lblNewLabel.setBounds(176, 10, 45, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Segoe UI Historic", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 59, 45, 13);
		frame.getContentPane().add(lblNewLabel_1);
		t1 = new JTextField();
		t1.setBounds(111, 58, 96, 19);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Marks");
		lblNewLabel_2.setFont(new Font("Segoe UI Historic", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 115, 45, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		
		
		t2 = new JTextField();
		t2.setBounds(111, 114, 96, 19);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton,"done");
				String name=t1.getText();
				String marks=t2.getText();
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/harini","root","mysql");
					String query= "inser into vinni values('"+name+"','"+marks+"')";
					Statement st=con.createStatement();
					st.executeUpdate(query);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Segoe UI Historic", Font.PLAIN, 16));
		btnNewButton.setBounds(166, 205, 85, 21);
		frame.getContentPane().add(btnNewButton);
	}

}
