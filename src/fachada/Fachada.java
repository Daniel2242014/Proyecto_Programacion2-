package fachada;
import Persistencia.Archivo;
import java.io.File;
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
      private ArrayList<Juez> jueces;
     private ArrayList<Extra> extras;
     
     private Fachada(){
         acciones=new ArrayList();
         faces=new ArrayList();
         jugadores=new ArrayList();
         partidos=new ArrayList();
         seleciones=new ArrayList();
         directores=new ArrayList();
         jueces=new ArrayList();
         extras=new ArrayList();
     }
    
    public static Fachada getInstancia() {
        if (instancia == null) {
            instancia = new Fachada();
        }
        return instancia;
    }
    
    
    public boolean abrirMun(File a)
    {
        return Archivo.getInstancia().abrirArchivo(a);
    }
    
    public boolean guardarMun(File a)
    {
        return Archivo.getInstancia().guardarArchivo(a);
    }
    
    public void cargarDatos(Mundial datos){
        //SE ENCARGA DE CARGAR LOS DATOS 
    }
    
    
    /*----------------------------------------------------------------------------------------------------------------------------------------*/
    /*METODOS QUE OPERAN CON LOS DATOS DIRECTAMENTE */
    
    public void sistemaBase(){
        
       // Jugador  Al_NEUER = new Jugador () 
        
        
    }
    
}
