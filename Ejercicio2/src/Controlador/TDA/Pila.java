package Controlador.TDA;

// @author samaelhg

import Exception.PosicionException;
import Exception.TopeException;

public class Pila <E> extends ListaEnlazada<E> {

    private Integer tope;
    
    public Pila (Integer tope){
        this.tope = tope;
    }
    
    public Pila(){
        this.tope = 0;
    }
    
    public Boolean estaLleno(){
        if (tope == 0) {
            return false;
        }else if(tope == getSize().intValue()){
            return true;
        }else{
            return false;
        }
    }
    
    public void push(E dato) throws TopeException{
        if (!estaLleno()) {
            insertarCabecera(dato);
        } else{
            throw new TopeException("La pila esta llena");
        }
    }
    
    public E pop(Integer pos) throws PosicionException, TopeException{
        E auxDato = null;
        if (!estaVacia()) {
            if (pos >= 0 && pos < getSize()) {
                for (int i = 0; i <= pos; i++) {
                    auxDato = eliminarDato(0);
                }
                return auxDato;

            } else {
                throw new PosicionException("Error al realizar pop: No existe la posicion dada");
            }
        }else{
            throw new TopeException("La pila esta vacia");
        }
    }
    
    public Integer getTope(){
        return tope;
    }
    
    public E ObtenerDato(Integer pos) throws PosicionException{
        return obtenerDato(pos);
    }
}
