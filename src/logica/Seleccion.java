package logica;

import java.util.ArrayList;


public class Seleccion 
{
    private String nombre;
    private int ranking_FIFA;
    private int posicion_grupo;
    private boolean estado;
    private String fecha_salida;
    private String confederacion;
    private ArrayList<Jugador> jugadores;
    
    public Seleccion(String nombre)
    {
        
    }
    
    public void agregarJugador(Jugador jug)
    {
        
    }
    
    public Jugador devolverJugador(int a)
    {
        return null;
    }
    
    public int cantidadJugadores()
    {
      return 0;  
    }

    @Override
    public String toString() {
        return "Seleccion{" + "nombre=" + nombre + ", ranking_FIFA=" + ranking_FIFA + ", posicion_grupo=" + posicion_grupo + ", estado=" + estado + ", fecha_salida=" + fecha_salida + ", confederacion=" + confederacion + ", jugadores=" + jugadores + '}';
    }
    
    
    
}
