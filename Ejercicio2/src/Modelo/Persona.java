package Modelo;

// @author samaelhg
public class Persona {
    private String nombre;
    private String cedulaoRuc;
    
    public Persona(String nombre, String cedulaoRuc){
        this.nombre = nombre;
        this.cedulaoRuc = cedulaoRuc;
   }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedulaoRuc() {
        return cedulaoRuc;
    }

    public void setCedulaoRuc(String cedulaoRuc) {
        this.cedulaoRuc = cedulaoRuc;
    }
    
    
}
