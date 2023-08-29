package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private  final String URL = "jdbc:mysql://localhost:3306/mypreproject";
    private  final String USERNAME = "root";
    private  final String PASSWORD = "root";
    private Connection connection = null;
    public  Connection getConnection() {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
