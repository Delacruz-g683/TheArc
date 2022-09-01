package DbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class dbGenerator {
    public static Connection  DBConnection() throws SQLException {
        String DB_URL = "jdbc:mysql://localhost:3306/triArch?useSSL=false";
        String USER = "root";
        String PASS = "NuYF3iQDLMpPDR";

        return DriverManager.getConnection(DB_URL, USER, PASS);
    }

}
