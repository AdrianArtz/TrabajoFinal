package Controlador.TDA;

// @author samaelhg

import Exception.PosicionException;
import Exception.TopeException;

public class ColaService <E> {
    
    private Cola <E> cola;
    
    public ColaService(Integer tope){
        if (tope == 0) {
           cola = new Cola<>();
        }else{
           cola = new Cola<>(tope); 
        }
    }
    public Boolean queue(E dato) throws PosicionException{
        try{
        cola.queue(dato);
        return true;
        }catch(TopeException e){
            System.out.println("Error: "+ e);
        }
        return false;
    }
    
    public E dequeue(Integer pos) throws PosicionException{
        try{
        return cola.dequeue(pos);
        }catch(TopeException e){
            System.out.println("Error: "+ e);
        }
        return null;
    }
    
    public Integer getSize(){
        return cola.getSize();
    }
    
    public E obtenerDato (int pos) throws PosicionException{
        return cola.obtenerDato(pos);
    }
}
