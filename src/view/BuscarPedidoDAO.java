package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BuscarPedidoDAO {

    // Método para buscar un pedido en la base de datos por su código
    public void buscarPedidoPorCodigo(int codigoPedido) {
        // Definir la cadena de conexión a la base de datos
        String url = "jdbc:mysql://localhost:3306/jardineria";
        String usuario = "root";
        String contraseña = "123456";

        // Definir la consulta SQL para buscar el pedido por su código
        String sql = "SELECT * FROM pedido WHERE codigo_pedido = ?";

        try (
                
                Connection conexion = DriverManager.getConnection(url, usuario, contraseña); 
                 PreparedStatement preparedStatement = conexion.prepareStatement(sql);) {
            
            preparedStatement.setInt(1, codigoPedido);

           
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
               
                if (resultSet.next()) {
                    
                    int codigoPedidoEncontrado = resultSet.getInt("codigo_pedido");
                   
                    System.out.println("Pedido encontrado:");
                    System.out.println("Código de Pedido: " + codigoPedidoEncontrado);
                   
                } else {
                    System.out.println("No se encontró ningún pedido con el código especificado.");
                }
            }
        } catch (SQLException e) {
            
            e.printStackTrace();
        }
    }
}


