/*
package DbConnection;

import java.sql.*;

public class MyJDBC {

        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/triArch?useSSL=false", "root", "NuYF3iQDLMpPDR");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from user");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("user_id"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
