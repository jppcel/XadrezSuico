package xadrezSuico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;

public class DBConnection {
	protected static Connection openConnection() throws SQLException {
		
		SoftwareProperties p = new SoftwareProperties();
		Map<String, String> DBsettings = p.getPropr();

		// Open the connection
		String url = "jdbc:h2:" + DBsettings.get("ip").toString() + "/" + DBsettings.get("nomeBanco").toString();
		String user = DBsettings.get("usuario").toString();
		String pass = DBsettings.get("password").toString();
		Connection c = DriverManager.getConnection(url, user, pass);
		return c;
	
	}
}
