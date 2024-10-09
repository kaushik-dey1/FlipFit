package com.flipfit.utils;

import java.sql.Connection;
import java.sql.SQLException;

public class FlipFitDbConnector {
    private static Connection connection = null;
    public static Connection getConnection(){
        return connection;
    }
    public static boolean isValid() throws SQLException {
        return connection != null && !connection.isClosed();
    }
}
