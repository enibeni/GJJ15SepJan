package lesson12jdbc;

import java.sql.*;
import java.util.Properties;

/**
 * @author Alex
 * @since 05.10.14
 */
public class SampleJdbc {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // Prior JDBC 4.0
        //Class.forName("com.mysql.jdbc.Driver");
        final Properties connectionProps = new Properties();
        connectionProps.put("user", "user");
        connectionProps.put("password", "user");
        final Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", connectionProps);

        final Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from forumuser");
        while (rs.next()) {
            System.out.println(rs.getString("LOGIN") + " " + rs.getString("EMAIL") + " " + rs.getDate("REGISTRATION"));
        }

        //TODO: close propely
        rs.close();
        statement.close();
        connection.close();


    }
}
