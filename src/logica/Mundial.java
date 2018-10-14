package logica;

import java.io.Serializable;
import java.util.ArrayList;

public class Mundial implements Serializable{
    public ArrayList<Acciones> acciones;
    public ArrayList<Fase> fases;
    public ArrayList<Jugador> jugadores;
    public ArrayList<Partido> partidos;
    public ArrayList<Seleccion> selecciones;
    public ArrayList<Director> directores;
    public ArrayList<Juez> jueces;
    public ArrayList<Extra> extras;
    
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
}
