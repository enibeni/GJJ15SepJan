package lesson12jdbc;

import java.sql.*;
import java.util.Properties;

/**
 * @author Alex
 * @since 05.10.14
 */
public class SqlInjection {
    //user input
    private static final String USER_TO_SEARCH = "' or 1 or login = '";
//    private static final String USER_TO_SEARCH = "akiyko";
    private static final String SQL_USERS_BY_USERNAME = "select * from forumuser where login = ?";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // Prior JDBC 4.0
        //Class.forName("com.mysql.jdbc.Driver");
        final Properties connectionProps = new Properties();
        connectionProps.put("user", "user");
        connectionProps.put("password", "user");
        final Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", connectionProps);

        final PreparedStatement statement = connection.prepareStatement(SQL_USERS_BY_USERNAME);
        statement.setString(1, USER_TO_SEARCH);
        ResultSet rs = statement.executeQuery();

        while (rs.next()) {
            System.out.println(rs.getString("LOGIN") + " " + rs.getString("EMAIL") + " " + rs.getDate("REGISTRATION"));
        }

        //TODO: close propely
        rs.close();
        statement.close();
        connection.close();


    }
}
