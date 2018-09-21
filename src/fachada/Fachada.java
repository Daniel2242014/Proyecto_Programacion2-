package fachada;
import java.util.ArrayList;
import logica.*;
import persistencia.*;
public class Fachada {
    
    private static Fachada instancia;
    
     private ArrayList<Acciones> acciones;
     private ArrayList<Fase> faces;
     private ArrayList<Jugador> jugadores;
     private ArrayList<Partido> partidos;
     private ArrayList<Seleccion> seleciones;
     private ArrayList<Director> directores;
      private ArrayList<Estadio> estadios;
      private ArrayList<Juez> jueces;
     private ArrayList<Extra> extras;
     
     public static final int ACCIONES=1;
     public static final int FACES=2;
     public static final int JUGADORES=3;
     public static final int PARTIDOS=4;
     public static final int SELECIONES=5;
     public static final int DIRECTORES=6;
     public static final int ESTADIOS=7;
     public static final int JUECES=8;
     public static final int EXTRAS=9;
     
      /*CADA METODO QUE SE HAGA SI RETIRA INFORMACION BASICA DE UN ARRAYLIST, DEBE TENER 
     UN PARAMETRO INT QUE HAGA REFERENCIA A QUE ARRAYLIST SE CONSULTRA, POR ESO LAS 
     CONSTANTES*/
     
     
     private Fachada(){
         acciones=new ArrayList();
         faces=new ArrayList();
         jugadores=new ArrayList();
         partidos=new ArrayList();
         seleciones=new ArrayList();
         directores=new ArrayList();
         estadios=new ArrayList();
         jueces=new ArrayList();
         extras=new ArrayList();
     }
    
    public static Fachada getInstancia() {
        if (instancia == null) {
            instancia = new Fachada();
        }
        return instancia;
    }
    
    public boolean abrirMun()
    {
        return false;//PARA QUE NO DE ERROR
    }
    
    public void cargarDatos(Mun datos){
        //SE ENCARGA DE CARGAR LOS DATOS 
    }
    
    
    /*----------------------------------------------------------------------------------------------------------------------------------------*/
    /*METODOS QUE OPERAN CON LOS DATOS DIRECTAMENTE */
    
    
    
}
