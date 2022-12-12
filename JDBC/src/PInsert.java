import java.sql.*;
import java.sql.PreparedStatement;

public class PInsert {
	String sql="insert into student(sid,sname,saddr) values(?,?,?)";
	PreparedStatement prst=con.prepareStatement(sql);
	prst.setString(1,"1005");
	prst.setString(2,"Raju");
	prst.setString(3,"Secunderabad");
	prst.executeUpdate();
	System.out.println("Student one record is inserted");
	prst.close();
	con.close();
	

}
