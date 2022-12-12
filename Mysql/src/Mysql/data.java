package Mysql;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.TableModel;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class data {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					data window = new data();
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
	public data() {
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
		
		JButton btnNewButton = new JButton("Load");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/5f2","root","mysql");
					String query="select * from Student1";
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery(query);
					ResultSetMetaData read=rs.getMetaData();
					TableModel DefaultTableModel=table.getModel();
					int col=read.getColumnCount();
					String[] colName=new String[cols];
					for(int i=0;i<=cols;i++) 
						colName[i]=read.getColumnName(i+1);
					n.setColumnIdentifiers(colName);
					String 
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setFont(new Font("Segoe UI Historic", Font.PLAIN, 16));
		btnNewButton.setBounds(33, 33, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		table = new JTable();
		table.setBounds(117, 93, 167, 140);
		frame.getContentPane().add(table);
	}
}
