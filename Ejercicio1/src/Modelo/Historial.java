package Modelo;
// @author samaelhg

import java.time.LocalDate;

public class Historial {
    private Comando comando;
    private LocalDate fechaActual;
    
    public Historial(Comando comando, LocalDate fActual){
        this.comando = comando;
        this.fechaActual = fActual;
    }
    public Comando getComando() {
        return comando;
    }

    public void setComando(Comando comando) {
        this.comando = comando;
    }

    public LocalDate getFechaActual() {
        return fechaActual;
    }

    public void setFechaActual(LocalDate fActual) {
        this.fechaActual = fActual;
    }
}
