package Controlador;

// @author samaelhg

import Controlador.TDA.ListaEnlazadaServices;
import Modelo.Award;
import Modelo.Enum.Tipo;
import Modelo.Movie;
import Modelo.Ratings;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;


public class ControladorMovie {
    ListaEnlazadaServices <Movie> listaMovies = new ListaEnlazadaServices();
    
    public void crearMovie(String title, String year, String rated, String released, String runtime, String genre, String director, 
            String writer, String actors,String plot, String lenguage, String country, Award awards, String poster, ListaEnlazadaServices<Ratings> ratings, 
            int metascore, double imdbRating, long imdbVotes, String imdbID, Tipo type, String DVD, long boxOffice, String production, String Website, 
            boolean response){

        listaMovies.insertarAlFinal(new Movie(title, year, rated, released, runtime, genre, director, writer, actors, plot, lenguage, country, awards, 
                poster, ratings, metascore, imdbRating, imdbVotes, imdbID, type, DVD, boxOffice, production, Website, response));
    }
    
    public void generarArchivoJson(){
        try {  
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String jsoString = gson.toJson(listaMovies);
                FileWriter fw = new FileWriter("C:\\Users\\jandr\\Documents\\UNL\\sandbox\\ESTRUCTURA DE DATOS\\U1\\Ejercicio3\\src\\Archivos\\Movie.json", true);
                fw.write("\n");
                fw.write(jsoString);
                fw.close();
        } catch (IOException e) {
            System.out.println("El error fue: "+e);
        }
    }
           
}
