package logica;
import java.util.*;
public class Acciones {
  
    private Jugador personaje;
    private int amarilias, cant_goles, faltasInsignificantes;
    public static final int TOTAL=2;
    public static final int PARCIAL=1;
    public static final int NULA=0;
    private boolean roja, estadoInicial, estadoFinal;
    private String tiempo_actualizacion;
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
        if(amarilias<=2){
            this.amarilias = amarilias;
        }
     }

    public int getCant_goles() {
        return cant_goles;
    }

    public void setCant_goles(int cant_goles,ArrayList <String> momentos) {
        this.cant_goles = cant_goles;
        this.momento_goles=momentos;
    }

    public int getFaltasInsignificantes() {
        return faltasInsignificantes;
    }

    public void setFaltasInsignificantes(int faltasInsignificantes) {
        this.faltasInsignificantes = faltasInsignificantes;
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
        /* Talvez se deberia modificar la variable "momentoCambio" a 0, pero este puede producir errores
             a la hora de cargar los datos, por ejemplo primero modificar "estadoFinal" antes de "estado inicial"
             ¿Ustedes que opinan?
        */
    }

    public String getTiempo_actualizacion() {
        return tiempo_actualizacion;
    }

    public void setTiempo_actualizacion(String tiempo_actualizacion) {
        this.tiempo_actualizacion = tiempo_actualizacion;
        /*Talves deberiamos de restringir que este datos solo de modifique en el caso de que los dos estados 
        sean diferentes ¿que opinan?*/
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
        this.cant_goles=momento_goles.size();
    }
    
    public boolean devolverPenal(int index){
        return penales.get(index);
    } 
    
    public void cambio(boolean t,String tiempo){
        this.tiempo_actualizacion=tiempo;
        this.estadoFinal=t;
    }
    
    public void falta(int numero,int tipo) throws ErrorException{
        ErrorException error = new ErrorException("no se pueden ingresar mas de"
                + " una targeta roja, si ingresa una targeta roja el valor del primer parameto es 1");
        
        if(numero !=1 && tipo==Acciones.TOTAL){ 
            throw error;
        }else if(tipo==Acciones.TOTAL){
            this.roja=!roja;   /*Tiene que ser lo puesto a lo que estaba antes de la modificacion*/
        }else if(tipo==Acciones.NULA){
            this.faltasInsignificantes+=numero;
        }else if(tipo==Acciones.PARCIAL && (this.amarilias+numero)<=2 ){
             this.amarilias+=numero;
        } 
        this.personaje.agregar_falta(numero, tipo);
    }
    
    public void gol(String momento){
       this.cant_goles++;
       this.momento_goles.add(momento);
    }
    
    public void penal (boolean j){
       this.penales.add(new Boolean(j));
    }

    public boolean equals(Object o){
        Acciones aux=(Acciones) o;
        if(this.personaje.equals(aux.personaje)){
            return true;
        }else{
            return false;
        }
    }
  
    @Override
    public String toString() {
        return "Acciones{" + "personaje=" + personaje + ", amarilias=" + amarilias + ", cant_goles=" +
                cant_goles + ", faltasTotales=" + faltasInsignificantes + ", roja=" + roja + ", estadoInicial=" + 
                estadoInicial + ", estadoFinal=" + estadoFinal + ", tiempo_actualizacion=" + 
                tiempo_actualizacion + ", penales=" + penales + ", momento_goles=" + momento_goles + '}';
    }
    
    
}
