package lesson13;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.io.IOException;

/**
 * @author Alex
 * @since 07.10.14
 */
public class DataSourceProvider {
    private static DataSourceProvider instance = new DataSourceProvider();

    public static DataSourceProvider getInstance() {
        return instance;
    }

    private DataSource dataSource;

    private DataSourceProvider() {
        dataSource = getMySQLDataSource();
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    private DataSource getMySQLDataSource() {
        MysqlDataSource mysqlDataSource = new MysqlDataSource();
        mysqlDataSource.setURL("jdbc:mysql://localhost:3306/sample");
        mysqlDataSource.setUser("user");
        mysqlDataSource.setPassword("user");
        return mysqlDataSource;
    }
}
