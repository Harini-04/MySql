package Mysql;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Reservation {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reservation window = new Reservation();
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
	public Reservation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 477, 349);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Railway Reservation System");
		lblNewLabel.setFont(new Font("Segoe UI Historic", Font.PLAIN, 16));
		lblNewLabel.setBounds(108, 10, 211, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Segoe UI Historic", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 62, 45, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(126, 61, 96, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Segoe UI Historic", Font.PLAIN, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Miryalaguda", "Kodad", "Vijayawada"}));
		comboBox.setBounds(126, 101, 96, 21);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("From");
		lblNewLabel_2.setFont(new Font("Segoe UI Historic", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 105, 45, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("To");
		lblNewLabel_3.setFont(new Font("Segoe UI Historic", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(10, 147, 45, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Segoe UI Historic", Font.PLAIN, 14));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Miryalaguda", "Kodad", "Vijayawada"}));
		comboBox_1.setBounds(126, 145, 96, 21);
		frame.getContentPane().add(comboBox_1);
		
		JLabel lblNewLabel_4 = new JLabel("No.of Tickets");
		lblNewLabel_4.setFont(new Font("Segoe UI Historic", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(10, 195, 96, 13);
		frame.getContentPane().add(lblNewLabel_4);
	}
}
