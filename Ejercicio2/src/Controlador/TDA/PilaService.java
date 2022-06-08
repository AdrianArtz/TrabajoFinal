package Controlador.TDA;

// @author samaelhg

import Exception.PosicionException;
import Exception.TopeException;

public class PilaService <E> {
    
    private Pila <E> pila;
    
    public PilaService(Integer tope){
        if (tope == 0) {
           pila = new Pila<>();
        }else{
           pila = new Pila<>(tope); 
        }
    }
    public Boolean push(E dato){
        try{
        pila.push(dato);
        return true;
        }catch(TopeException e){
            System.out.println("Error: "+ e);
        }
        return false;
    }
    
    public E pop(Integer pos) throws PosicionException{
        try{
        return pila.pop(pos);
        }catch(TopeException e){
            System.out.println("Error: "+ e);
        }
        return null;
    }
    
    public Integer getSize(){
        return pila.getSize();
    }
    
    public E obtenerDato (int pos) throws PosicionException{
        return pila.ObtenerDato(pos);
    }
}
