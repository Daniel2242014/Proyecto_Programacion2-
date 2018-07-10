package logica;

import java.util.ArrayList;

public class Seleccion 
{
    private String nombre;
    private int ranking_FIFA;
    private int posicion_grupo;
    private char letra_grupo;
    private boolean estado;
    private String fecha_salida;
    private String confederacion;
    private ArrayList<Jugador> jugadores;
    
    public Seleccion(String nombre)
    {
        this.jugadores=new ArrayList<>();
        this.nombre=nombre;
    }
    
    public void agregarJugador(Jugador jug)
    {
        jugadores.add(jug);
    }
    
    public Jugador devolverJugador(int a)
    {
        return jugadores.get(a);
    }
    
    public int cantidadJugadores()
    {
        return jugadores.size();
    }
    
    public boolean pertenece(Jugador j)
    {  
        if(jugadores.contains(j))
        {
            return true;
        }
        return false;
    }
    
    public boolean equals(Object a)
    {
       if(a==null){
           return false;
       }
        Seleccion verif=(Seleccion) a;
        if(this.nombre.equals(verif.nombre))
        {
            return true;
        }
        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRanking_FIFA() {
        return ranking_FIFA;
    }

    public void setRanking_FIFA(int ranking_FIFA) {
        this.ranking_FIFA = ranking_FIFA;
    }

    public int getPosicion_grupo() {
        return posicion_grupo;
    }

    public char getLetra_grupo() {
        return letra_grupo;
    }

    public void setLetra_grupo(char letra_grupo) {
        this.letra_grupo = letra_grupo;
    }

    public void setPosicion_grupo(int posicion_grupo) {
        this.posicion_grupo = posicion_grupo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(String fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public String getConfederacion() {
        return confederacion;
    }

    public void setConfederacion(String confederacion) {
        this.confederacion = confederacion;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }    
 
    @Override
    public String toString() {
        return "Seleccion{" + "nombre=" + nombre + ", ranking_FIFA=" + ranking_FIFA + ", posicion_grupo=" + 
                posicion_grupo + ", estado=" + estado + ", fecha_salida=" + fecha_salida + ", confederacion=" + 
                confederacion + ", jugadores=" + jugadores + '}';
    }
     
}
