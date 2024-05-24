/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 1daw
 */
public class MostrarPedidos extends javax.swing.JFrame {

    Conexion conexionBd;
    DefaultTableModel auxmodel = new DefaultTableModel();

    public MostrarPedidos() {
        initComponents();

        auxmodel = crearModelo();
        jTablaPedido.setModel(auxmodel);

    }

    public DefaultTableModel crearModelo() {
        DefaultTableModel auxmode2 = new DefaultTableModel();
        auxmode2.addColumn("Codigo Pedido");
        auxmode2.addColumn("Codigo Cliente");
        auxmode2.addColumn("Precio total mas iva");
        auxmode2.addColumn("Fecha pedido");
        auxmode2.addColumn("Fecha esperada");
        auxmode2.addColumn("Fecha entrega");
        auxmode2.addColumn("Estado");
        auxmode2.addColumn("Comentario");

        String line = "select codigo_pedido,codigo_cliente,round(sum((cantidad*precio_unidad)*1.21),2),fecha_pedido,fecha_esperada,fecha_entrega,estado,comentarios " +
"from pedido left join detalle_pedido using(codigo_pedido) " +
"group by codigo_pedido,codigo_cliente,fecha_pedido,fecha_esperada,fecha_entrega,estado,comentarios";

        try {
            Connection conn = conexionBd.getConnection();
            PreparedStatement sentencia = conn.prepareStatement(line);
            ResultSet rs = sentencia.executeQuery();


                while (rs.next()) {
                    
                    Object[] auxDatos = new Object[8];
                    auxDatos[0] = rs.getObject(1);
                    auxDatos[1] = rs.getObject(2);
                    auxDatos[2] = rs.getObject(3);
                    auxDatos[3] = rs.getObject(4);
                    auxDatos[4] = rs.getObject(5);
                    auxDatos[5] = rs.getObject(6);
                    auxDatos[6] = rs.getObject(7);
                    auxDatos[7] = rs.getObject(8);
                    auxmode2.addRow(auxDatos);
                }
            

        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }
        
        return auxmode2;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaPedido = new javax.swing.JTable();
        btnVolverIni = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Informe de pedidos");

        jTablaPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTablaPedido);

        btnVolverIni.setText("Cerrar");
        btnVolverIni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverIniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(btnVolverIni)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVolverIni)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverIniActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverIniActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolverIni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablaPedido;
    // End of variables declaration//GEN-END:variables
}
