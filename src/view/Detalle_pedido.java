/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author Benito
 */
public class Detalle_pedido {
    private int codPedido;
    private String codProduc;
    private int cantidad;
    private double precioUni;
    private int numeroLine;

    public Detalle_pedido(int codPedido, String codProduc, int cantidad, double precioUni, int numeroLine) {
        this.codPedido = codPedido;
        this.codProduc = codProduc;
        this.cantidad = cantidad;
        this.precioUni = precioUni;
        this.numeroLine = numeroLine;
    }

    public int getCodPedido() {
        return codPedido;
    }

    public String getCodProduc() {
        return codProduc;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioUni() {
        return precioUni;
    }

    public int getNumeroLine() {
        return numeroLine;
    }
    
    
    
}



