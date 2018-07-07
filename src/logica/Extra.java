package logica;

import java.util.ArrayList;

public class Extra
{
    private ArrayList<Acciones> eventos;
    private int terminar;
    private ArrayList<Jugador> tiradores;
    public static int TERMINAR_PRIMER_TIEMPO;
    public static int TERMINAR_SEGUNDO_TIEMPO;
    public static int TERMINAR_PENALES;
    
    public Extra()
    {
    }
    public Extra (int a, int b, ArrayList<Acciones> arr)  /*AGUSTIN TE PIDO QUE "A" SEA EL TIEMPO TOTAL Y "B" SEA EL AGREGADO 
                                                                                                        DANIEL*/
    {
        this.tiradores = new ArrayList<>();
        this.eventos = new ArrayList<>();
    }
    
    public void penal(Jugador p, boolean gol, int n)
    {
        if (TERMINAR_SEGUNDO_TIEMPO<=15)
        {
            tiradores.add(p);
            gol=true;
          //  int posicion=n;
        }
    }
    
    public boolean devolverPenales()
    {
        //boolean[][] pos=new boolean[10][2];
    }

    @Override
    public String toString() 
    {
        return "Extra{" + "eventos=" + eventos + ", terminar=" + terminar + ", tiradores=" + tiradores + '}';
    }
    
}
