package Modelo;

// @author samaelhg

import java.time.LocalDate;

public class Ticket extends Persona implements mostarInfo {
    private int oficina;
    private String motivo;
    private LocalDate fechaActual, fechaSiguiente;
    
    public Ticket(int oficina, String nombre, String cedulaoRuc, String motivo, LocalDate fechaActual, LocalDate fechaSiguiente) {
        super(nombre, cedulaoRuc);
        this.oficina = oficina;
        this.motivo = motivo;
        this.fechaActual = fechaActual;
        this.fechaSiguiente = fechaSiguiente;
    }

    public int getOficina() {
        return oficina;
    }

    public void setOficina(int oficina) {
        this.oficina = oficina;
    }

    public LocalDate getFechaActual() {
        return fechaActual;
    }

    public void setFechaActual(LocalDate fechaActual) {
        this.fechaActual = fechaActual;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public LocalDate getFechaSiguiente() {
        return fechaSiguiente;
    }

    public void setFechaSiguiente(LocalDate fechaSiguiente) {
        this.fechaSiguiente = fechaSiguiente;
    }

    @Override
    public String mostrarInformacion() {
        return "\n========================================"+
               "\nBANCO PICHINCHA EN CONFIANZA''\n Nombre del que consulta: "+getNombre()+
               "\n Cedula o Ruc : "+getCedulaoRuc()+
               "\n Motivo de la consulta: "+getMotivo()+
               "\n Nro de Oficina atiende: "+getOficina()+
               "\n Fecha Actual: "+getFechaActual()+
               "\n Fecha de Reserva: "+getFechaSiguiente()+
               "\n========================================";
                
    }
}
