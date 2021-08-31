package util;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtilities {
    // Database name
    private static final String DATABASE_PATH = "delivery.db";

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:sqlite:" + DATABASE_PATH;        
        return DriverManager.getConnection(url);
    }

    public static boolean isEmpty(){
        File file = new File(JDBCUtilities.DATABASE_PATH);
        return file.length() == 0;
    }
}
