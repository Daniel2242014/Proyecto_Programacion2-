package logica;
import fachada.Fachada;
import java.io.Serializable;
import java.util.ArrayList;

public class Mundial implements Serializable
{
    //Mediante el funcionamiento interno de java, se crean referencias a los ArrayList de Fachada
    /*SE CAMBIA A PRIVATE*/

    private ArrayList<Fase> fases;
    private ArrayList<Jugador> jugadores;
    private ArrayList<Seleccion> selecciones;
    private ArrayList<Director> directores;
    private ArrayList<Juez> jueces;

    //El constructor se encarga de pedir los datos a la clase Archivo, mediante Fachada, para su asignación a Fachada
    public Mundial( ArrayList<Fase> f, ArrayList<Jugador> j,  ArrayList<Seleccion> s, ArrayList<Director> d, ArrayList<Juez> jj)
    {
        this.fases=f;
        this.jugadores=j;
        this.selecciones=s;
        this.directores=d;
        this.jueces=jj;
    }
    //----------------- Carga de datos ----------------------
    public void cargarFachada() //Asigna los datos para referenciarlos a Fachada
    {
  
        Fachada.getInstancia().setFases(this.fases);
        Fachada.getInstancia().setJugadores(this.jugadores);
        Fachada.getInstancia().setSelecciones(this.selecciones);
        Fachada.getInstancia().setDirectores(this.directores);
        Fachada.getInstancia().setJueces(this.jueces);
    }
}
