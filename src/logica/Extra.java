package logica;

import java.util.ArrayList;

public class Extra extends Acciones
{
    private ArrayList<Acciones> eventos=new ArrayList<>();
    private int terminar;
    private ArrayList<Jugador> tiradores=new ArrayList<>();
    public static int TERMINAR_PRIMER_TIEMPO;
    public static int TERMINAR_PENALES;
           
    public Extra (int a, int b, boolean bool, ArrayList<Acciones> arr)
    {
        
    }
    
    public void penal(Jugador p, boolean bool, int n, double nn)
    {
        
    }
    
    public boolean devolverPenales()
    {
        return false;
    }

    @Override
    public String toString() 
    {
        return "Extra{" + "eventos=" + eventos + ", terminar=" + terminar + ", tiradores=" + tiradores + '}';
    }
    
}
