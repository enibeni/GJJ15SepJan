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

        Connection connection = null;
        Statement statement = null;
        ResultSet rs = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", connectionProps);
            try {
                statement = connection.createStatement();
                try {
                    rs = statement.executeQuery("select * from forumuser");
                    while (rs.next()) {
                        System.out.println(rs.getString("LOGIN") + " " + rs.getString("EMAIL") + " " + rs.getDate("REGISTRATION"));
                    }

                } finally {
                    if (rs != null) {
                        rs.close();
                    }

                }
            } finally {
                if (statement != null) {
                    statement.close();
                }
            }
        } finally {
            if (connection != null) {
                connection.close();
            }

        }


    }
}
