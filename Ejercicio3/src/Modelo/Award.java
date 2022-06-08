package Modelo;

// @author samaelhg
public class Award {
    private int oscar;
    private int wins;
    private int nominations;
    
    public Award(int oscar, int wins, int nominations){
        this.oscar = oscar;
        this.wins = wins;
        this.nominations = nominations;
    }
    public Award(){
        this.oscar = 0;
        this.nominations = 0;
        this.wins = 0;
    }
    public int getAwards() {
        return oscar;
    }

    public void setAwards(int awards) {
        this.oscar = awards;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getNominations() {
        return nominations;
    }

    public void setNominations(int nominations) {
        this.nominations = nominations;
    }
}
