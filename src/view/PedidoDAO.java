

package view;


import java.sql.*;

public class PedidoDAO {

    public boolean borrarPedido(int pedidoId) {
        String sql = "DELETE FROM pedido WHERE id = ?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, pedidoId);

            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public Pedido buscarPedido(int pedidoId) {
        Pedido pedido = null;
        String sql = "SELECT * FROM pedido WHERE codigo_pedido = ?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, pedidoId);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                  
                    pedido = new Pedido(
                            rs.getInt("codigo_pedido"),
                            rs.getDate("fecha_pedido"),
                            rs.getDate("fecha_esperada"),
                            rs.getDate("fecha_entrega"),
                            rs.getString("estado"),
                            rs.getString("comentarios"),
                            rs.getInt("codigo_cliente")
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pedido;
    }
public boolean modificarPedido(Pedido pedido) {
        String sql = "UPDATE pedido SET fecha_pedido = ?, fecha_esperada = ?, fecha_entrega = ?, estado = ?, comentarios = ?, codigo_cliente = ? WHERE codigo_pedido = ?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setDate(1, new java.sql.Date(pedido.getFechaPedido().getTime()));
            pstmt.setDate(2, new java.sql.Date(pedido.getFechaEsperada().getTime()));
            pstmt.setDate(3, new java.sql.Date(pedido.getFechaEntrega().getTime()));
            pstmt.setString(4, pedido.getEstado());
            pstmt.setString(5, pedido.getComentarios());
            pstmt.setInt(6, pedido.getCodigoCliente());
            pstmt.setInt(7, pedido.getCodigoPedido());

            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}











