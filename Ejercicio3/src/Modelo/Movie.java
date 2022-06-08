package Modelo;

// @author samaelhg

import Controlador.TDA.ListaEnlazadaServices;
import Modelo.Enum.Tipo;
import java.time.LocalDate;

public class Movie {
    private String title;
    private String year;
    private String rated;
    private String released;
    private String runtime;
    private String genre;
    private String director;
    private String writer;
    private String actors;
    private String plot;
    private String lenguage;
    private String country;
    private Award awards;
    private String poster;
    private ListaEnlazadaServices<Ratings> ratings;
    private int metascore;
    private double imdbRating;
    private long imdVotes;
    private String imdbID;
    private Tipo type;
    private String DVD;
    private long boxOffice;
    private String production;
    private String Website;
    private boolean response;

    public Movie(String title, String year, String rated, String released, String runtime,String genre, String director, String writer, 
            String actors, String plot, String lenguage, String country, Award awards, String poster, ListaEnlazadaServices<Ratings> ratings, 
            int metascore, double imdbRating, long imdVotes, String imdbID, Tipo type, String DVD, long boxOffice, String production, 
            String Website, boolean response) {
        this.title = title;
        this.year = year;
        this.rated = rated;
        this.released = released;
        this.runtime = runtime;
        this.genre = genre;
        this.director = director;
        this.writer = writer;
        this.actors = actors;
        this.plot = plot;
        this.lenguage = lenguage;
        this.country = country;
        this.awards = awards;
        this.poster = poster;
        this.ratings = ratings;
        this.metascore = metascore;
        this.imdbRating = imdbRating;
        this.imdVotes = imdVotes;
        this.imdbID = imdbID;
        this.type = type;
        this.DVD = DVD;
        this.boxOffice = boxOffice;
        this.production = production;
        this.Website = Website;
        this.response = response;
    }
    
}
