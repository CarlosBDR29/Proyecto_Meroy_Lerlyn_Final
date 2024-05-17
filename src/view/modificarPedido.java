package view;


 import java.sql.Connection ;
    import java.sql.DriverManager ;
    import java.sql.PreparedStatement ;
    import java.sql.SQLException ;
    import java.util.Date ;
public class modificarPedido {

  

        // Método para modificar un pedido en la base de datos
        public void modificarPedidoEnBD(int codigoPedido, Date nuevaFechaEsperada, String nuevoEstado, String nuevosComentarios) {
            
            String url = "jdbc:mysql://localhost:3306/jardineria";
            String usuario = "root";
            String contraseña = "123456";

            // Definir la consulta SQL para actualizar el pedido
            String sql = "UPDATE Pedido SET fecha_esperada = ?, estado = ?, comentarios = ? WHERE codigo_pedido = ?";

            try (
                    // Establecer la conexión a la base de datos
                    Connection conexion = DriverManager.getConnection(url, usuario, contraseña); // Preparar la sentencia SQL para la actualización
                     PreparedStatement preparedStatement = conexion.prepareStatement(sql);) {
                // Establecer los parámetros en la sentencia SQL
                preparedStatement.setDate(1, new java.sql.Date(nuevaFechaEsperada.getTime()));
                preparedStatement.setString(2, nuevoEstado);
                preparedStatement.setString(3, nuevosComentarios);
                preparedStatement.setInt(4, codigoPedido);

                // Ejecutar la consulta para actualizar el pedido
                int filasAfectadas = preparedStatement.executeUpdate();

                // Verificar si la actualización fue exitosa
                if (filasAfectadas > 0) {
                    System.out.println("Pedido modificado exitosamente.");
                } else {
                    System.out.println("No se pudo modificar el pedido.");
                }
            } catch (SQLException sqle) {
                // Manejar cualquier excepción de SQL
                sqle.printStackTrace();
            }
        }
    }

