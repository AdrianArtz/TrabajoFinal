package Modelo.Enum;

public enum Tipo {
    MOVIE("Movie"),CORTOMETRAJE("Cortometraje");
    private String abreviature;
    
    private Tipo(String abreviature){
        this.abreviature = abreviature;
    }

    public String getAbreviature() {
        return abreviature;
    }

    public void setAbreviature(String abreviature) {
        this.abreviature = abreviature;
    }
}
