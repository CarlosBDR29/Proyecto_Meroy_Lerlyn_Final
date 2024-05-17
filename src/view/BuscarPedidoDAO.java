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
        String sql = "SELECT * FROM Pedido WHERE codigo_pedido = ?";

        try (
                // Establecer la conexión a la base de datos
                Connection conexion = DriverManager.getConnection(url, usuario, contraseña); // Preparar la sentencia SQL para la búsqueda
                 PreparedStatement preparedStatement = conexion.prepareStatement(sql);) {
            // Establecer el parámetro en la sentencia SQL
            preparedStatement.setInt(1, codigoPedido);

            // Ejecutar la consulta
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                // Verificar si se encontró el pedido
                if (resultSet.next()) {
                    // Obtener los datos del pedido
                    int codigoPedidoEncontrado = resultSet.getInt("codigo_pedido");
                    // Obtener otros atributos del pedido según sea necesario
                    // Luego puedes imprimir o manipular estos datos según tus necesidades
                    System.out.println("Pedido encontrado:");
                    System.out.println("Código de Pedido: " + codigoPedidoEncontrado);
                    // Imprimir o manipular otros atributos del pedido según sea necesario
                } else {
                    System.out.println("No se encontró ningún pedido con el código especificado.");
                }
            }
        } catch (SQLException e) {
            // Manejar cualquier excepción de SQL
            e.printStackTrace();
        }
    }
}


