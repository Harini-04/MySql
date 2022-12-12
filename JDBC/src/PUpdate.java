import java.sql.PreparedStatement;

public class PUpdate {
	String sql="update student set saddr=? where sid=?";
	PreparedStatement prst=con.prepareStatement(sql);
	prst.setString(1,"1005");
	prst.setString(2,"Raju");
	prst.setString(3,"Secunderabad");
	prst.executeUpdate();

}
