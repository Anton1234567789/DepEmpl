package com.s3k3l3v.department.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {

    private static final String CONNECTION_URL = "jdbc:mysql://localhost:3306/Department" +
            "?user=root&password=root";

    private static DBManager instance;

    public static synchronized DBManager getInstance(){
        if (instance==null){
            instance = new DBManager();
        }
        return instance;
    }

    public DBManager() {
    }

    public Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(CONNECTION_URL);

        return connection;
    }

    private void close(AutoCloseable ac) {
        if (ac != null) {
            try {
                ac.close();
            } catch (Exception ex) {
                throw new IllegalStateException("Cannot close " + ac);
            }
        }
    }

}
