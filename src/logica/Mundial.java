package logica;
import fachada.Fachada;
import java.io.Serializable;
import java.util.ArrayList;

public class Mundial implements Serializable
{
    //Mediante el funcionamiento interno de java, se crean referencias a los ArrayList de Fachada
    /*SE CAMBIA A PRIVATE*/
    private ArrayList<Acciones> acciones;
    private ArrayList<Fase> fases;
    private ArrayList<Jugador> jugadores;
    private ArrayList<Partido> partidos;
    private ArrayList<Seleccion> selecciones;
    private ArrayList<Director> directores;
    private ArrayList<Juez> jueces;
    private ArrayList<Extra> extras;
    //El constructor se encarga de pedir los datos a la clase Archivo, mediante Fachada, para su asignación a Fachada
    public Mundial(ArrayList<Acciones> a, ArrayList<Fase> f, ArrayList<Jugador> j, ArrayList<Partido> p, ArrayList<Seleccion> s, ArrayList<Director> d, ArrayList<Juez> jj, ArrayList<Extra> e)
    {
        this.acciones=a;
        this.fases=f;
        this.jugadores=j;
        this.partidos=p;
        this.selecciones=s;
        this.directores=d;
        this.jueces=jj;
        this.extras=e;
    }
    //----------------- Carga de datos ----------------------
    public void cargarFachada() //Asigna los datos para referenciarlos a Fachada
    {
        Fachada.getInstancia().setAcciones(this.acciones);
        Fachada.getInstancia().setFases(this.fases);
        Fachada.getInstancia().setJugadores(this.jugadores);
        Fachada.getInstancia().setPartidos(this.partidos);
        Fachada.getInstancia().setSelecciones(this.selecciones);
        Fachada.getInstancia().setDirectores(this.directores);
        Fachada.getInstancia().setJueces(this.jueces);
        Fachada.getInstancia().setExtras(this.extras);
    }
}
