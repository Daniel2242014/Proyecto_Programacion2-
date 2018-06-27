package logica;
import java.util.ArrayList;
public class Acciones {
  
    private Jugador personaje;
    private int amarilias, cant_goles, faltasTotales;
    private static final int TOTAL=2;
    private static final int PARCIAL=1;
    private static final int NULA=0;
    private boolean roja, estadoInicial, estadoFinal;
    private double tiempo_actualizacion;
    private ArrayList <Boolean> penales = new ArrayList();
    private ArrayList <String> momento_goles = new ArrayList();
    
    public Acciones(Jugador g){
        this.personaje=g;
    }

    public Jugador getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Jugador personaje) {
        this.personaje = personaje;
    }

    public int getAmarilias() {
        return amarilias;
    }

    public void setAmarilias(int amarilias) {
        this.amarilias = amarilias;
    }

    public int getCant_goles() {
        return cant_goles;
    }

    public void setCant_goles(int cant_goles) {
        this.cant_goles = cant_goles;
    }

    public int getFaltasTotales() {
        return faltasTotales;
    }

    public void setFaltasTotales(int faltasTotales) {
        this.faltasTotales = faltasTotales;
    }

    public boolean isRoja() {
        return roja;
    }

    public void setRoja(boolean roja) {
        this.roja = roja;
    }

    public boolean isEstadoInicial() {
        return estadoInicial;
    }

    public void setEstadoInicial(boolean estadoInicial) {
        this.estadoInicial = estadoInicial;
    }

    public boolean isEstadoFinal() {
        return estadoFinal;
    }

    public void setEstadoFinal(boolean estadoFinal) {
        this.estadoFinal = estadoFinal;
    }

    public double getTiempo_actualizacion() {
        return tiempo_actualizacion;
    }

    public void setTiempo_actualizacion(double tiempo_actualizacion) {
        this.tiempo_actualizacion = tiempo_actualizacion;
    }

    public ArrayList<Boolean> getPenales() {
        return penales;
    }

    public void setPenales(ArrayList<Boolean> penales) {
        this.penales = penales;
    }

    public ArrayList<String> getMomento_goles() {
        return momento_goles;
    }

    public void setMomento_goles(ArrayList<String> momento_goles) {
        this.momento_goles = momento_goles;
    }
    
    public void cambio(boolean t,String tiempo){
    //  falta    
    }
    
    public void falta(int numero){
        // falta
    }
    
    public void gol(String momento){
        //falta
    }
    
    public void penal (boolean j){
        //falta
    }

    @Override
    public String toString() {
        return "Acciones{" + "personaje=" + personaje + ", amarilias=" + amarilias + ", cant_goles=" +
                cant_goles + ", faltasTotales=" + faltasTotales + ", roja=" + roja + ", estadoInicial=" + 
                estadoInicial + ", estadoFinal=" + estadoFinal + ", tiempo_actualizacion=" + 
                tiempo_actualizacion + ", penales=" + penales + ", momento_goles=" + momento_goles + '}';
    }
    
    
}
