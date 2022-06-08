package Controlador;

// @author samaelhg
import Controlador.TDA.ColaService;
import Exception.PosicionException;
import Modelo.Comando;
import Modelo.Historial;
import java.time.LocalDate;

public class ControladorHistorial {

    private ColaService<Historial> colaHistorial = new ColaService(10);
    private Historial historial;
    private Comando comandoConsola;

    public void crearComando(int max, String comando, String funtion, LocalDate fechaActual) throws PosicionException {
        comandoConsola = new Comando(comando, funtion);
        if (max > 9) {
            
            historial = new Historial(comandoConsola, fechaActual);
            colaHistorial.dequeue(0);
            colaHistorial.queue(historial);
             
        }else{
            
            historial = new Historial(comandoConsola, fechaActual);
            colaHistorial.queue(historial);
        }
    }
    
    
    public String[][] mostrarComandos() throws PosicionException {
        String listaDatos[][] = new String[colaHistorial.getSize()][3];
        for (int i = 0; i < colaHistorial.getSize(); i++) {
            listaDatos[i][0] = "" + colaHistorial.obtenerDato(i).getComando().getComando();
            listaDatos[i][1] = "" + colaHistorial.obtenerDato(i).getComando().getFuntion();
            listaDatos[i][2] = "" + colaHistorial.obtenerDato(i).getFechaActual();
        }
        return listaDatos;

    }
}
