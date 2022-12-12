import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class table {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String username="root";
		String password="mysql";
		String url="jdbc:mysql://localhost:3306/5F2";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,username,password);
		System.out.println("Connection is created");
		String sql="create table Student1"+"(sid varchar(20),"+"sname varchar(20),"+"saddr varchar(20))";
		Statement st=con.createStatement();
		st.executeUpdate(sql);
		System.out.println("Student table is created");
		st.close();
		con.close();
		

    }

}
