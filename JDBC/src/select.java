import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import javax.sql.*;

public class select {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) throws Exception {
			String username="root";
			String password="mysql";
			String url="jdbc:mysql://localhost:3306/5F2";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("Connection is created");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select *from Student1");
			System.out.println("Student Id:"+rs.getString(1));
			System.out.println("Student Name:"+rs.getString(2));
			System.out.println("Student Address:"+rs.getString(3));
		
		 st.close();
		 con.close();
		
			

	}

}
