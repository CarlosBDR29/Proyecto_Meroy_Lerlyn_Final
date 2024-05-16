package view;

import java.sql.*;

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

}
