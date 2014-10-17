package org.edu.gjj;

import javax.sql.DataSource;
import java.sql.DriverManager;

/**
 * @author Alex
 * @since 17.10.14
 */
public class DataSourceManager {
    private static DataSourceManager ourInstance = new DataSourceManager();
    private DataSource dataSource;

    public static DataSourceManager getInstance() {
        return ourInstance;
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    private DataSourceManager() {

        //
//        dataSource = ...?




    }
}
