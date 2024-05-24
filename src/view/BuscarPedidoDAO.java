package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BuscarPedidoDAO {

    // M�todo para buscar un pedido en la base de datos por su c�digo
    public void buscarPedidoPorCodigo(int codigoPedido) {
        // Definir la cadena de conexi�n a la base de datos
        String url = "jdbc:mysql://localhost:3306/jardineria";
        String usuario = "root";
        String contrase�a = "123456";

        // Definir la consulta SQL para buscar el pedido por su c�digo
        String sql = "SELECT * FROM pedido WHERE codigo_pedido = ?";

        try (
                
                Connection conexion = DriverManager.getConnection(url, usuario, contrase�a); 
                 PreparedStatement preparedStatement = conexion.prepareStatement(sql);) {
            
            preparedStatement.setInt(1, codigoPedido);

           
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
               
                if (resultSet.next()) {
                    
                    int codigoPedidoEncontrado = resultSet.getInt("codigo_pedido");
                   
                    System.out.println("Pedido encontrado:");
                    System.out.println("C�digo de Pedido: " + codigoPedidoEncontrado);
                   
                } else {
                    System.out.println("No se encontr� ning�n pedido con el c�digo especificado.");
                }
            }
        } catch (SQLException e) {
            
            e.printStackTrace();
        }
    }
}


