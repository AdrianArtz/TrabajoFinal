package Controlador;
// @author samaelhg

import Controlador.TDA.PilaService;
import Exception.PosicionException;
import Modelo.Ticket;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class ControladorTicket {

    private PilaService <Ticket> pilaTicket = new PilaService(20);
    private static PilaService <Ticket> pilaTicketTemporal = new PilaService(20);
    
    public void crearTicket(int oficina, String nombre, String cedulaoRuc, String motivo, LocalDate fechaActual, LocalDate fechaSiguiente){
        pilaTicket.push(new Ticket(oficina, nombre, cedulaoRuc, motivo, fechaActual, fechaSiguiente));
    }
    
    public String[][] mostrarTickets() throws PosicionException {
        String listaDatos[][] = new String[pilaTicket.getSize()][6];
        for (int i = 0; i < pilaTicket.getSize(); i++) {
            listaDatos[i][0] = "" + pilaTicket.obtenerDato(i).getOficina();
            listaDatos[i][1] = "" + pilaTicket.obtenerDato(i).getNombre();
            listaDatos[i][2] = "" + pilaTicket.obtenerDato(i).getCedulaoRuc();
            listaDatos[i][3] = "" + pilaTicket.obtenerDato(i).getMotivo();
            listaDatos[i][4] = "" + pilaTicket.obtenerDato(i).getFechaActual();
            listaDatos[i][5] = "" + pilaTicket.obtenerDato(i).getFechaSiguiente();
        }
        return listaDatos;

    }
    
    public void guardarArchivo(int id) throws IOException, PosicionException{
        FileWriter fw = new FileWriter("C:\\Users\\jandr\\Documents\\UNL\\sandbox\\ESTRUCTURA DE DATOS\\U1\\Ejercicio2\\src\\Archivos\\Solicitudes.txt", true);
        for (int i = 0; i < pilaTicket.getSize(); i++) {
            if (pilaTicket.obtenerDato(i).getOficina() == id) {
                fw.write(getPilaTicket().obtenerDato(i).mostrarInformacion());
                fw.close();
            }
        }
        
    }
    public PilaService <Ticket> getPilaTicket() {
        return pilaTicket;
    }

    public void setPilaTicket(PilaService <Ticket> pilaTicket) {
        this.pilaTicket = pilaTicket;
    }

}
