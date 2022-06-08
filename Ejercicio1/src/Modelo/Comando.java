package Modelo;

// @author samaelhg
public class Comando {
    private String comando;
    private String funtion;
    
    public Comando(String comando, String funtion){
        this.comando = comando;
        this.funtion = funtion;
    }

    public String getComando() {
        return comando;
    }

    public void setComando(String comando) {
        this.comando = comando;
    }

    public String getFuntion() {
        return funtion;
    }

    public void setFuntion(String funtion) {
        this.funtion = funtion;
    }
}
