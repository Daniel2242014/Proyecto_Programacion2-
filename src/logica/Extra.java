package logica;

import java.util.ArrayList;

public class Extra
{
    private ArrayList<Acciones> eventos;
    private boolean terminar;
    private ArrayList<Jugador> tiradores;
    public static boolean TERMINAR_ALARGUE=false;
    public static boolean TERMINAR_PENALES=true;
    
    public Extra (int a, int b, ArrayList<Acciones> arr)  /*AGUSTIN TE PIDO QUE "A" SEA EL TIEMPO TOTAL Y "B" SEA EL AGREGADO 
                                                                                                        DANIEL*/
    {
        this.tiradores = new ArrayList<>();
        this.eventos = new ArrayList<>();
        if((a-b)>120)
        {
            terminar=true;
        }
    }
    
    public void penal(Jugador p, boolean gol, int n)
    {
        tiradores.add(p);
        
        //  int posicion=n;
    }
    
    public boolean[] devolverPenales()
    {
        
        return null;
    }
    
    public int getTiempoTotal()
    {
        return null;
    }

    public ArrayList<Acciones> getEventos() {
        return eventos;
    }

    public void setEventos(ArrayList<Acciones> eventos) {
        this.eventos = eventos;
    }

    public int getTerminar() {
        return terminar;
    }

    public void setTerminar(int terminar) {
        this.terminar = terminar;
    }

    public ArrayList<Jugador> getTiradores() {
        return tiradores;
    }

    public void setTiradores(ArrayList<Jugador> tiradores) {
        this.tiradores = tiradores;
    }

    public static int getTERMINAR_PRIMER_TIEMPO() {
        return TERMINAR_PRIMER_TIEMPO;
    }

    public static void setTERMINAR_PRIMER_TIEMPO(int TERMINAR_PRIMER_TIEMPO) {
        Extra.TERMINAR_PRIMER_TIEMPO = TERMINAR_PRIMER_TIEMPO;
    }

    public static int getTERMINAR_SEGUNDO_TIEMPO() {
        return TERMINAR_SEGUNDO_TIEMPO;
    }

    public static void setTERMINAR_SEGUNDO_TIEMPO(int TERMINAR_SEGUNDO_TIEMPO) {
        Extra.TERMINAR_SEGUNDO_TIEMPO = TERMINAR_SEGUNDO_TIEMPO;
    }

    public static int getET_PRIMER_TIEMPO() {
        return ET_PRIMER_TIEMPO;
    }

    public static void setET_PRIMER_TIEMPO(int ET_PRIMER_TIEMPO) {
        Extra.ET_PRIMER_TIEMPO = ET_PRIMER_TIEMPO;
    }

    public static int getET_SEGUNDO_TIEMPO() {
        return ET_SEGUNDO_TIEMPO;
    }

    public static void setET_SEGUNDO_TIEMPO(int ET_SEGUNDO_TIEMPO) {
        Extra.ET_SEGUNDO_TIEMPO = ET_SEGUNDO_TIEMPO;
    }

    public static int getTERMINAR_PENALES() {
        return TERMINAR_PENALES;
    }

    public static void setTERMINAR_PENALES(int TERMINAR_PENALES) {
        Extra.TERMINAR_PENALES = TERMINAR_PENALES;
    }
    
    
    
    @Override
    public String toString() 
    {
        return "Extra{" + "eventos=" + eventos + ", terminar=" + terminar + ", tiradores=" + tiradores + '}';
    }
    
}
