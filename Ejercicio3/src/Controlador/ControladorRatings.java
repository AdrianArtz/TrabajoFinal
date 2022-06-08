package Controlador;

// @author samaelhg

import Controlador.TDA.ListaEnlazadaServices;
import Modelo.Ratings;

public class ControladorRatings {
    
    ListaEnlazadaServices <Ratings> listaRatings= new ListaEnlazadaServices();

    public void crearRating(String source, String value){
       listaRatings.insertarAlFinal(new Ratings(source, value));
    }
    
    public ListaEnlazadaServices<Ratings> getListaRatings() {
        return listaRatings;
    }

    public void setListaRatings(ListaEnlazadaServices<Ratings> listaRatings) {
        this.listaRatings = listaRatings;
    }
    
    
}
