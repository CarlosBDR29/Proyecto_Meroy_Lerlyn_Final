package view;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JTextField;

public class Principal extends javax.swing.JFrame {

    Conexion conexionBd;
    private PedidoDAO pedidoDAO; // Asegúrate de tener esto declarado en tu clase Principal

    public Principal() {
        initComponents();
        pedidoDAO = new PedidoDAO();

        this.setLocationRelativeTo(null);
    }

    private Date convertirStringADate(String fechaString) {
        Date fecha = null;
        DateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        try {
            fecha = formatoFecha.parse(fechaString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return fecha;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnCambiarEstado = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnInformeRechazados = new javax.swing.JButton();
        btnBuscarPedido = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnModificarPedido = new javax.swing.JButton();
        btnCrearPedido = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnCrearDetalle = new javax.swing.JButton();
        btnDatosPedido = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 204, 0));

        btnCambiarEstado.setText("Actualizar Estado");
        btnCambiarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarEstadoActionPerformed(evt);
            }
        });

        jButton2.setText("Mostrar Pedido");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnInformeRechazados.setText("Informe Rechazados");
        btnInformeRechazados.setBorder(null);
        btnInformeRechazados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformeRechazadosActionPerformed(evt);
            }
        });

        btnBuscarPedido.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btnBuscarPedido.setText("Buscar Pedido");
        btnBuscarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPedidoActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedido"));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Id Pedido: ");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Fecha Pedido:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Fecha Entrega:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Fecha Esperada:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Estado Pedido:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createTitledBorder("Comentarios"));
        jScrollPane2.setViewportView(jTextArea1);

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Código Cliente:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(jTextField3)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField6)))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 72, Short.MAX_VALUE)))
                .addGap(46, 46, 46))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btnModificarPedido.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btnModificarPedido.setText("Modificar");
        btnModificarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarPedidoActionPerformed(evt);
            }
        });

        btnCrearPedido.setText("Crear Pedido");
        btnCrearPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPedidoActionPerformed(evt);
            }
        });

        jButton3.setText("Borrar Pedido");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código Pedido", "Número Línea", "Código Producto", "Nombre Producto", "Precio Unidad", "Cantidad"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        btnCrearDetalle.setText("Crear Detalle");
        btnCrearDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearDetalleActionPerformed(evt);
            }
        });

        btnDatosPedido.setText("Datos Pedido");
        btnDatosPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatosPedidoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DETALLES PEDIDO");

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("GESTIÓN DE PEDIDOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnInformeRechazados, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCambiarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDatosPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addComponent(btnBuscarPedido))
                            .addComponent(jLabel1)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnModificarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(236, 236, 236))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(btnInformeRechazados, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(btnCrearPedido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCambiarEstado)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscarPedido)
                            .addComponent(btnModificarPedido))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(btnCrearDetalle)
                        .addGap(18, 18, 18)
                        .addComponent(btnDatosPedido))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Pedido", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDatosPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatosPedidoActionPerformed
        DefaultTableModel auxmodel = new DefaultTableModel();
        auxmodel.addColumn("Codigo Pedido");
        auxmodel.addColumn("Numero Linea");
        auxmodel.addColumn("Codigo Producto");
        auxmodel.addColumn("Nombre Producto");
        auxmodel.addColumn("Precio Unitario");
        auxmodel.addColumn("Cantidad");

        int cant = 0;

        int auxPediCod = Integer.parseInt(JOptionPane.showInputDialog("Introduce el código del pedido: "));

        String line = " SELECT p.codigo_pedido, p.numero_linea, p.codigo_producto, po.nombre, p.precio_unidad, p.cantidad  FROM detalle_pedido p JOIN producto po USING (codigo_producto) WHERE p.codigo_pedido = ? ORDER BY 2";

        try {

            Connection conn = conexionBd.getConnection();
            PreparedStatement sentencia = conn.prepareStatement(line);
            sentencia.setInt(1, auxPediCod);
            ResultSet rs = sentencia.executeQuery();

            while (rs.next()) {

                Object[] auxDatos = new Object[6];
                auxDatos[0] = rs.getObject(1);
                auxDatos[1] = rs.getObject(2);
                auxDatos[2] = rs.getObject(3);
                auxDatos[3] = rs.getObject(4);
                auxDatos[4] = rs.getObject(5);
                auxDatos[5] = rs.getObject(6);
                auxmodel.addRow(auxDatos);
                cant++;

            }

            if (cant == 0) {
                JOptionPane.showMessageDialog(this, "Este pedido no existe o no tiene ningun producto", "Carga", JOptionPane.INFORMATION_MESSAGE);
            }

            jTable2.setModel(auxmodel);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDatosPedidoActionPerformed

    private void btnCrearDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearDetalleActionPerformed
        boolean formatVali;
        int auxPediCod = 0;
        do {
            formatVali = true;
            try {
                auxPediCod = Integer.parseInt(JOptionPane.showInputDialog("Introduce El codigo de pedido:"));
            } catch (Exception p) {
                JOptionPane.showMessageDialog(this, "El formato no es valido", "error", JOptionPane.INFORMATION_MESSAGE);
                formatVali = false;
            }
        } while (!formatVali);

        String line = "SELECT codigo_pedido,estado FROM pedido where codigo_pedido = ?";

        try {
            Connection conn = conexionBd.getConnection();
            PreparedStatement sentencia = conn.prepareStatement(line);
            sentencia.setInt(1, auxPediCod);
            ResultSet rs = sentencia.executeQuery();

            String auxEstado = null;
            boolean esta = false;
            while (rs.next()) {
                esta = true;
                auxEstado = rs.getString(2);
            }

            if (esta) {
                if (auxEstado.equals("Pendiente")) {

                    String auxNomProduc;
                    do {
                        auxNomProduc = JOptionPane.showInputDialog("Introduce el codigo del Producto:");
                        if (auxNomProduc.isEmpty()) {
                            JOptionPane.showMessageDialog(this, "Rellena el campo", "error", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } while (auxNomProduc.isEmpty());

                    String line2 = "SELECT cantidad_en_stock,precio_venta FROM producto where codigo_producto like ?";

                    PreparedStatement sentencia2 = conn.prepareStatement(line2);
                    sentencia2.setString(1, auxNomProduc);
                    ResultSet rs2 = sentencia2.executeQuery();

                    boolean esta2 = false;
                    float auxPreUni = 0;
                    int auxStock = 0;

                    while (rs2.next()) {
                        esta2 = true;
                        auxPreUni = rs2.getFloat(2);
                        auxStock = rs2.getInt(1);
                    }

                    if (esta2) {

                        boolean formatVali2;
                        int auxCantiPedi = 0;
                        do {
                            formatVali2 = true;
                            try {
                                auxCantiPedi = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad que deseas:"));
                                if (auxCantiPedi <= 0) {
                                    JOptionPane.showMessageDialog(this, "La cantidad no puede ser 0 o inferior", "error", JOptionPane.INFORMATION_MESSAGE);
                                }
                            } catch (Exception p) {
                                JOptionPane.showMessageDialog(this, "El formato no es valido", "error", JOptionPane.INFORMATION_MESSAGE);
                                formatVali2 = false;
                            }

                        } while (!formatVali2 || auxCantiPedi <= 0);

                        if (auxCantiPedi > auxStock) {
                            JOptionPane.showMessageDialog(this, "No hay stock suficiente", "vaya", JOptionPane.INFORMATION_MESSAGE);
                        } else {

                            String line3 = "SELECT max(numero_linea) FROM detalle_pedido where codigo_pedido = ?";

                            PreparedStatement sentencia3 = conn.prepareStatement(line3);
                            sentencia3.setInt(1, auxPediCod);
                            ResultSet rs3 = sentencia3.executeQuery();

                            int auxNumFila = 1;
                            while (rs3.next()) {
                                auxNumFila = (rs3.getInt(1) + 1);
                            }

                            Detalle_pedido auxDetallePedi = new Detalle_pedido(auxPediCod, auxNomProduc, auxCantiPedi, auxPreUni, auxNumFila);

                            String line4 = "INSERT INTO detalle_pedido VALUES (?,?,?,?,?)";

                            PreparedStatement sentencia4 = conn.prepareStatement(line4);

                            sentencia4.setInt(1, auxDetallePedi.getCodPedido());
                            sentencia4.setString(2, auxDetallePedi.getCodProduc());
                            sentencia4.setInt(3, auxDetallePedi.getCantidad());
                            sentencia4.setDouble(4, auxDetallePedi.getPrecioUni());
                            sentencia4.setInt(5, auxDetallePedi.getNumeroLine());

                            int nr = sentencia4.executeUpdate();

                            JOptionPane.showMessageDialog(this, "Se ha creado " + nr + " detalle de pedido.", "Creado", JOptionPane.INFORMATION_MESSAGE);

                            String line5 = "UPDATE producto Set cantidad_en_stock = cantidad_en_stock - ? WHERE codigo_producto like ?";

                            PreparedStatement sentencia5 = conn.prepareStatement(line5);

                            sentencia5.setInt(1, auxDetallePedi.getCantidad());
                            sentencia5.setString(2, auxDetallePedi.getCodProduc());

                            int nr2 = sentencia5.executeUpdate();

                            JOptionPane.showMessageDialog(this, "Se ha cambiado " + nr2 + " stock de un producto.", "Creado", JOptionPane.INFORMATION_MESSAGE);

                        }

                    } else {
                        JOptionPane.showMessageDialog(this, "Este producto no existe.", "Vaya", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "No se puede a?adir detalles a un pedido que este entregado o rechazado.", "Vaya", JOptionPane.INFORMATION_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(this, "Este pedido no existe.", "Vaya", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnCrearDetalleActionPerformed

    private void btnModificarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarPedidoActionPerformed
        String idText = JOptionPane.showInputDialog(this, "Introduce el ID del pedido a modificar:");

        if (idText != null && !idText.isEmpty()) {
            try {
                int pedidoId = Integer.parseInt(idText);
                Pedido pedidoExistente = pedidoDAO.buscarPedido(pedidoId);

                if (pedidoExistente != null) {

                    /*JTextField txtFechaPedido = new JTextField(
                        pedidoExistente.getFechaPedido() != null ? pedidoExistente.getFechaPedido().toString() : ""
                    );
                    JTextField txtFechaEsperada = new JTextField(
                        pedidoExistente.getFechaEsperada() != null ? pedidoExistente.getFechaEsperada().toString() : ""
                    );*/
                    JTextField txtFechaEntrega = new JTextField(
                            pedidoExistente.getFechaEntrega() != null ? pedidoExistente.getFechaEntrega().toString() : ""
                    );
                    //JTextField txtEstado = new JTextField(pedidoExistente.getEstado());
                    JTextField txtComentarios = new JTextField(pedidoExistente.getComentarios());
                    //JTextField txtCodigoCliente = new JTextField(String.valueOf(pedidoExistente.getCodigoCliente()));

                    Object[] message = {
                        "Fecha Pedido:", jTextField6,
                        "Fecha Esperada:", jTextField5,
                        "Fecha Entrega:", this.jTextField4,
                        "Estado:", jTextField7,
                        "Comentarios:", jTextArea1,
                        "Código Cliente:", jTextField3
                    };

                    int option = JOptionPane.showConfirmDialog(this, message, "Modificar Pedido", JOptionPane.OK_CANCEL_OPTION);
                    if (option == JOptionPane.OK_OPTION) {
                        // Obtener los valores modificados del JTextField y convertirlos a Date si es necesario
                        Date fechaPedido = convertirStringADate(jTextField6.getText());
                        Date fechaEsperada = convertirStringADate(jTextField5.getText());
                        Date fechaEntrega = convertirStringADate(txtFechaEntrega.getText());
                        String estado = jTextField7.getText();
                        String comentarios = jTextArea1.getText();
                        int codigoCliente = Integer.parseInt(jTextField3.getText());

                        // Crear un nuevo objeto Pedido con los valores modificados
                        Pedido pedidoModificado = new Pedido(
                                pedidoId,
                                fechaPedido,
                                fechaEsperada,
                                fechaEntrega,
                                estado,
                                comentarios,
                                codigoCliente
                        );

                        // Llamar al método actualizarPedido en PedidoDAO para modificar el pedido en la base de datos
                        boolean resultado = pedidoDAO.modificarPedido(pedidoModificado);

                        // Mostrar un mensaje de éxito o error según el resultado
                        if (resultado) {
                            JOptionPane.showMessageDialog(this, "Pedido modificado exitosamente");
                        } else {
                            JOptionPane.showMessageDialog(this, "Error al modificar el pedido");
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Pedido no encontrado");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Por favor, introduce un ID válido");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, introduce el ID del pedido");
        }
    }//GEN-LAST:event_btnModificarPedidoActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void btnBuscarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPedidoActionPerformed
        String idText = JOptionPane.showInputDialog(this, "Introduce el ID del pedido a buscar:");
        jTextField2.enable(false);
        jTextField3.enable(false);
        jTextField6.enable(false);
        jTextField5.enable(false);
        jTextField4.enable(true);
        jTextField7.enable(false);
        jTextArea1.enable(true);

        if (idText != null && !idText.isEmpty()) {
            try {

                int pedidoId = Integer.parseInt(idText);
                Pedido pedido = pedidoDAO.buscarPedido(pedidoId);

                if (pedido != null) {
                    jTextField2.setText(String.valueOf(pedido.getCodigoPedido()));
                    jTextField3.setText(String.valueOf(pedido.getCodigoCliente()));
                    jTextField6.setText(String.valueOf(pedido.getFechaPedido()));
                    jTextField5.setText(String.valueOf(pedido.getFechaEsperada()));
                    jTextField4.setText(String.valueOf(pedido.getFechaEntrega()));
                    jTextField7.setText(String.valueOf(pedido.getEstado()));
                    jTextArea1.setText(String.valueOf(pedido.getComentarios()));

                } else {

                    JOptionPane.showMessageDialog(this, "El pedido con ID " + pedidoId + " no fue encontrado");
                }
            } catch (NumberFormatException e) {

                JOptionPane.showMessageDialog(this, "Por favor, introduce un ID válido");
            }
        } else {

            JOptionPane.showMessageDialog(this, "Por favor, introduce el ID del pedido");
        }
    }//GEN-LAST:event_btnBuscarPedidoActionPerformed

    private void btnInformeRechazadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformeRechazadosActionPerformed

        int auxClienId = Integer.parseInt(JOptionPane.showInputDialog("Introduce la el ID del cliente para ver sus pedidos rechazados:"));

        String line = "SELECT codigo_cliente,nombre_cliente FROM cliente where codigo_cliente = ?";

        try {
            Connection conn = conexionBd.getConnection();
            PreparedStatement sentencia = conn.prepareStatement(line);
            sentencia.setInt(1, auxClienId);
            ResultSet rs = sentencia.executeQuery();

            boolean esta = false;
            String auxNombre = null;
            while (rs.next()) {
                auxNombre = rs.getString(2);
                esta = true;
            }

            if (esta) {

                List<String> informe = new ArrayList<>();
                informe.add("Codigo Cliente: " + auxClienId + " - Nombre Cliente: " + auxNombre + ".");

                String line2 = "select codigo_pedido,fecha_pedido,fecha_esperada,estado,COALESCE(comentarios,'Sin comentarios') from pedido where codigo_cliente = ? AND estado like ?;";
                PreparedStatement sentencia2 = conn.prepareStatement(line2);
                sentencia2.setInt(1, auxClienId);
                sentencia2.setString(2, "Rechazado");
                ResultSet rs2 = sentencia2.executeQuery();

                int numFilas = 0;
                while (rs2.next()) {
                    int auxPediCodi = rs2.getInt(1);
                    String auxFechaPedi = "" + rs2.getDate(2);
                    String auxFechaEspe = "" + rs2.getDate(3);
                    String auxEstado = rs2.getString(4);
                    String auxComen = rs2.getString(5);
                    String auxCadena = "Codigo pedido: " + auxPediCodi + " - f.Pedido: " + auxFechaPedi + " - f.Esperada: " + auxFechaEspe + " - Estado: " + auxEstado + " - Comentario: " + auxComen;
                    informe.add(auxCadena);
                    numFilas++;
                }

                String cadeMensaje = informe.get(0);

                if (numFilas == 0) {
                    informe.add("No tiene pedidos rechazados");
                }

                for (int i = 1; i < informe.size(); i++) {
                    cadeMensaje = cadeMensaje + "\n" + informe.get(i);
                }

                JOptionPane.showMessageDialog(this, cadeMensaje, "Informe", JOptionPane.INFORMATION_MESSAGE);

                int opcion = JOptionPane.showConfirmDialog(this,
                        "Crear Informe de rechazados?",
                        "Informe rechazados",
                        JOptionPane.YES_NO_CANCEL_OPTION);

                if (opcion == 0) {
                    FileWriter fw = new FileWriter("src\\view\\Rechazados.txt");
                    PrintWriter pw = new PrintWriter(fw);

                    for (int i = 0; i < informe.size(); i++) {
                        pw.println(informe.get(i));
                    }

                    pw.close();
                    fw.close();

                    JOptionPane.showMessageDialog(this, "Informe creado", "Informe", JOptionPane.INFORMATION_MESSAGE);

                }

            } else {
                 JOptionPane.showMessageDialog(this, "Este cliente no existe.", "Vaya", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnInformeRechazadosActionPerformed

    private void btnCambiarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarEstadoActionPerformed
        boolean formatVali;
        int auxPediCod = 0;
        do {
            formatVali = true;
            try {
                auxPediCod = Integer.parseInt(JOptionPane.showInputDialog("Introduce la codigo del pedido que quieras cambiar:"));
            } catch (Exception p) {
                JOptionPane.showMessageDialog(this, "El formato no es valido", "error", JOptionPane.INFORMATION_MESSAGE);
                formatVali = false;
            }
        } while (!formatVali);

        String line = "SELECT codigo_pedido,estado FROM pedido where codigo_pedido = ?";

        try {
            Connection conn = conexionBd.getConnection();
            PreparedStatement sentencia = conn.prepareStatement(line);
            sentencia.setFloat(1, auxPediCod);
            ResultSet rs = sentencia.executeQuery();

            String auxEstado = null;

            boolean esta = false;
            while (rs.next()) {
                esta = true;

                auxEstado = rs.getString(2);
            }

            if (esta) {

                if (auxEstado.equals("Entregado") || auxEstado.equals("Rechazado")) {
                    JOptionPane.showMessageDialog(this, "No se puede cambiar el estado de un pedido que a sido entregado o rechazado", "error", JOptionPane.INFORMATION_MESSAGE);
                } else {

                    String[] opciones = {"Pendiente", "Entregado", "Rechazado"};

                    int opc = JOptionPane.showOptionDialog(this, "Elije el estado del pedido", "Estado Pedido",
                            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

                    if (opc == 1) {

                        String auxFechaEn;
                        LocalDate fecha = null;

                        boolean vali = false;
                        do {
                            String regex = "^(?!0000)\\d{4}-(?:(?:0[1-9]|1[0-2])-(?:0[1-9]|1\\d|2[0-8])|(?:0[13-9]|1[0-2])-(?:29|30)|(?:0[13578]|1[02])-31)|"
                                    + "(?:\\d{2}(?:0[48]|[2468][048]|[13579][26])|(?:[02468][048]|[13579][26])00)-02-29$";

                            do {
                                auxFechaEn = JOptionPane.showInputDialog("Introduce la fecha de entrega:");
                            } while (auxFechaEn == null);

                            Pattern pattern = Pattern.compile(regex);
                            Matcher matcher = pattern.matcher(auxFechaEn);

                            if (matcher.matches()) {
                                vali = true;
                                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                                fecha = LocalDate.parse(auxFechaEn, formatter);
                            } else {
                                JOptionPane.showMessageDialog(this, "La fecha no cumple el formato valido (yyyy-mm-dd).", "Error", JOptionPane.INFORMATION_MESSAGE);
                            }
                        } while (!vali);

                        String line2 = "UPDATE pedido Set fecha_entrega = ?,estado=? WHERE fecha_pedido < ? AND codigo_pedido = ?";

                        PreparedStatement sentencia2 = conn.prepareStatement(line2);
                        sentencia2.setDate(1, java.sql.Date.valueOf(fecha));
                        sentencia2.setString(2, "Entregado");
                        sentencia2.setDate(3, java.sql.Date.valueOf(fecha));
                        sentencia2.setInt(4, auxPediCod);

                        int numFilas = sentencia2.executeUpdate();

                        if (numFilas == 0) {
                            JOptionPane.showMessageDialog(this, "La fecha de entrega no puede ser menor a la del pedido", "error", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(this, "Estado Cambiado", "Estado", JOptionPane.INFORMATION_MESSAGE);
                        }

                    } else if (opc == 2) {

                        String line3 = "SELECT codigo_producto,cantidad FROM detalle_pedido WHERE codigo_pedido = ?";
                        PreparedStatement sentencia3 = conn.prepareStatement(line3);
                        sentencia3.setInt(1, auxPediCod);
                        ResultSet rs2 = sentencia3.executeQuery();

                        int cambioStock = 0;
                        while (rs2.next()) {

                            String auxProdu = rs2.getString(1);
                            int auxCanti = rs2.getInt(2);

                            String line4 = "UPDATE producto Set cantidad_en_stock = cantidad_en_stock + ? WHERE codigo_producto = ?";
                            PreparedStatement sentencia4 = conn.prepareStatement(line4);
                            sentencia4.setInt(1, auxCanti);
                            sentencia4.setString(2, auxProdu);
                            int numFilas = sentencia4.executeUpdate();
                            cambioStock = numFilas + cambioStock;

                        }

                        JOptionPane.showMessageDialog(this, "Se a devuelto el stock a " + cambioStock + " productos", "Stock", JOptionPane.INFORMATION_MESSAGE);

                        String line5 = "UPDATE pedido Set estado=? WHERE codigo_pedido = ?";

                        PreparedStatement sentencia5 = conn.prepareStatement(line5);
                        sentencia5.setString(1, "Rechazado");
                        sentencia5.setInt(2, auxPediCod);
                        int numFilas2 = sentencia5.executeUpdate();

                        if (numFilas2 == 0) {
                            JOptionPane.showMessageDialog(this, "El pedido no se a podido rechazar", "error", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(this, "Pedido rechazado", "Estado", JOptionPane.INFORMATION_MESSAGE);
                        }

                    } else {
                        JOptionPane.showMessageDialog(this, "El estado seguira estando en pendiente", "Estado", JOptionPane.INFORMATION_MESSAGE);
                    }
                }

            } else {
                JOptionPane.showMessageDialog(this, "Este pedido no existe.", "Vaya", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnCambiarEstadoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MostrarPedidos Pedidos = new MostrarPedidos();
        Pedidos.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        boolean formatVali;
        int auxPediCod = 0;
        do {
            formatVali = true;
            try {
                auxPediCod = Integer.parseInt(JOptionPane.showInputDialog("Introduce la codigo del pedido que quieras borrar:"));
            } catch (Exception p) {
                JOptionPane.showMessageDialog(this, "El formato no es valido", "error", JOptionPane.INFORMATION_MESSAGE);
                formatVali = false;
            }
        } while (!formatVali);
        
         String line = "SELECT codigo_pedido,estado FROM pedido where codigo_pedido = ?";

        try {
            Connection conn = conexionBd.getConnection();
            PreparedStatement sentencia = conn.prepareStatement(line);
            sentencia.setFloat(1, auxPediCod);
            ResultSet rs = sentencia.executeQuery();

            String auxEstado = "No esta";

            boolean esta = false;
            while (rs.next()) {
                esta = true;

                auxEstado = rs.getString(2);
            }

            if (esta && !auxEstado.equals("Pendiente")) {

                int opcion = JOptionPane.showConfirmDialog(this, "Seguro que quieres borra el pedido,se borrara todo lo asociado.","Seguro",JOptionPane.YES_NO_CANCEL_OPTION);
                
                if(opcion==0){
                
                    String line2 ="DELETE  FROM detalle_pedido where codigo_pedido = ?";
                    PreparedStatement sentencia2 = conn.prepareStatement(line2);
                    sentencia2.setFloat(1, auxPediCod);
                    int numFilas2 = sentencia2.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Borrados " + numFilas2+" detalles de pedido ", "borrado", JOptionPane.INFORMATION_MESSAGE);
                    
                    String line3 ="DELETE  FROM pedido where codigo_pedido = ?";
                    PreparedStatement sentencia3 = conn.prepareStatement(line3);
                    sentencia3.setFloat(1, auxPediCod);
                    int numFilas3 = sentencia3.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Borrados " + numFilas3+"  pedido ", "borrado", JOptionPane.INFORMATION_MESSAGE);
                    
                }else{
                    JOptionPane.showMessageDialog(this, "No borrado", "ok", JOptionPane.INFORMATION_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(this, "Este pedido no existe o esta aun por entregar.", "Vaya", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnCrearPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPedidoActionPerformed
        int auxClienId = Integer.parseInt(JOptionPane.showInputDialog("Introduce la el ID del cliente:"));

        String line = "SELECT codigo_cliente FROM cliente where codigo_cliente = ?";

        try {
            Connection conn = conexionBd.getConnection();
            PreparedStatement sentencia = conn.prepareStatement(line);
            sentencia.setInt(1, auxClienId);
            ResultSet rs = sentencia.executeQuery();

            boolean esta = false;
            while (rs.next()) {
                esta = true;
            }

            if (esta) {

                String line2 = "SELECT MAX(codigo_pedido) FROM pedido";
                Statement st = conn.createStatement();
                ResultSet rs2 = st.executeQuery(line2);
                int auxPediId = 1;

                while (rs2.next()) {
                    auxPediId = (int) rs2.getObject(1);
                    auxPediId = auxPediId + 1;
                }

                Pedido2 auxPedido = new Pedido2(auxPediId, auxClienId);

                String line3 = "INSERT INTO pedido (codigo_pedido,fecha_pedido,fecha_esperada,estado,codigo_cliente) VALUES (?,?,?,?,?)";

                PreparedStatement sentencia3 = conn.prepareStatement(line3);

                sentencia3.setInt(1, auxPedido.getCodigo());
                sentencia3.setDate(2, java.sql.Date.valueOf(auxPedido.getFechaPedi()));
                sentencia3.setDate(3, java.sql.Date.valueOf(auxPedido.getFechaEspera()));
                sentencia3.setString(4, auxPedido.getEstado());
                sentencia3.setInt(5, auxPedido.getCodCliente());

                int nr = sentencia3.executeUpdate();

                JOptionPane.showMessageDialog(this, "Se ha creado " + nr + " pedido. Su id es "+auxPedido.getCodigo(), "Creado", JOptionPane.INFORMATION_MESSAGE);

            } else {
                System.out.println("Este cliente no existe");
            }

        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnCrearPedidoActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarPedido;
    private javax.swing.JButton btnCambiarEstado;
    private javax.swing.JButton btnCrearDetalle;
    private javax.swing.JButton btnCrearPedido;
    private javax.swing.JButton btnDatosPedido;
    private javax.swing.JButton btnInformeRechazados;
    private javax.swing.JButton btnModificarPedido;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables

    private void modificarPedido() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
