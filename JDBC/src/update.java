import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class update {

	public static void main(String[] args) throws Exception {
		String username="root";
		String password="mysql";
		String url="jdbc:mysql://localhost:3306/5F2";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,username,password);
		System.out.println("Connection is created");
		Statement st=con.createStatement();
		String sql="update Student1 set saddr='Hyderabad' where sid=1001";
		st.executeUpdate(sql);
	    st.close();
	    con.close();
	}
}