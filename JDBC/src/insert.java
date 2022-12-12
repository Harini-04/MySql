import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class insert {

	public static void main(String[] args) throws Exception {
		String username="root";
		String password="mysql";
		String url="jdbc:mysql://localhost:3306/5F2";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,username,password);
		System.out.println("Connection is created");
		String sql="insert into Student1 values('1001','Manu','Hyd')";
		Statement st=con.createStatement();
		st.executeUpdate(sql);
		sql="insert into Student1 values('1002','Harika','Hyd')";
		st.executeUpdate(sql);
		System.out.println("Student two records are inserted");
		st.close();
		con.close();
		
  
	}

}
