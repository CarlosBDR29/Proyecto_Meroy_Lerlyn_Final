

package view;

import java.time.LocalDate;


import java.time.LocalDate;

public class Pedido2 {

    private int codigo;
    private LocalDate fechaPedi;
    private LocalDate fechaEspera;
    private LocalDate fechaEntrega;
    private String estado;
    private String comentario;
    private int codCliente;

    public Pedido2(int codigo, int codCliente) {
        this.codigo = codigo;
        this.fechaPedi = LocalDate.now();
        this.fechaEspera = fechaPedi.plusDays(7);
        this.estado = "Pendiente";
        this.codCliente = codCliente;
    }

    public LocalDate getFechaEspera() {
        return fechaEspera;
    }

    public void setFechaEspera(LocalDate fechaEspera) {
        this.fechaEspera = fechaEspera;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getComentario() {
        return comentario;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getCodigo() {
        return codigo;
    }

    public LocalDate getFechaPedi() {
        return fechaPedi;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public int getCodCliente() {
        return codCliente;
    }
    
    
    
    
}
