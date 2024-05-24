package view;

/*import java.sql.*;

public class Conexion {

    private static Connection conn = null;

    public static Connection getInstance() {

        try {
            if (conn == null) {

                String url = "jdbc:mysql://localhost:3306/jardineria";
                conn = DriverManager.getConnection(url, "root", "123456");
                System.out.println("Conexion creada correctamente");
            }

        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return conn;
    }

}*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static Connection conn = null;

    public static Connection getConnection() {
        try {
            if (conn == null || conn.isClosed()) { // Verifica si la conexión está cerrada o nula
                String url = "jdbc:mysql://localhost:3306/jardineria";
                conn = DriverManager.getConnection(url, "root", "123456");
                System.out.println("Conexion creada correctamente");
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return conn;
    }

    public static void closeConnection() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
                System.out.println("Conexion cerrada correctamente");
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }
}

