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
        String sql = "SELECT * FROM Pedido WHERE codigo_pedido = ?";

        try (
                // Establecer la conexi�n a la base de datos
                Connection conexion = DriverManager.getConnection(url, usuario, contrase�a); // Preparar la sentencia SQL para la b�squeda
                 PreparedStatement preparedStatement = conexion.prepareStatement(sql);) {
            // Establecer el par�metro en la sentencia SQL
            preparedStatement.setInt(1, codigoPedido);

            // Ejecutar la consulta
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                // Verificar si se encontr� el pedido
                if (resultSet.next()) {
                    // Obtener los datos del pedido
                    int codigoPedidoEncontrado = resultSet.getInt("codigo_pedido");
                    // Obtener otros atributos del pedido seg�n sea necesario
                    // Luego puedes imprimir o manipular estos datos seg�n tus necesidades
                    System.out.println("Pedido encontrado:");
                    System.out.println("C�digo de Pedido: " + codigoPedidoEncontrado);
                    // Imprimir o manipular otros atributos del pedido seg�n sea necesario
                } else {
                    System.out.println("No se encontr� ning�n pedido con el c�digo especificado.");
                }
            }
        } catch (SQLException e) {
            // Manejar cualquier excepci�n de SQL
            e.printStackTrace();
        }
    }
}


