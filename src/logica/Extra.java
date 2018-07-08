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
        this.eventos = arr;
        if((a-b)>120)
        {
            terminar=true;
        }
    }
    
    public void penal(Jugador p, boolean gol, int n)
    {
        tiradores.set(n, p);
        for(Acciones buscar:eventos)
        {
            if(buscar.getPersonaje().equals(p))
            {
                buscar.penal(gol);
            }
        }
    }
    
    public boolean[] devolverPenales()
    {
        int contJug=0;
        int contPen=0;
        boolean[] arr=new boolean[tiradores.size()];
        ArrayList<Integer> arr2=new ArrayList<>();
        for(Jugador a:tiradores)
        {
            if(arr2.contains(contJug))
            {
                contPen++;
            }
            for(Acciones b:eventos)
            {
                b.devolverPenal(contPen);
                arr2.add(contJug);
                contJug++;
                if(contJug==5)
                {
                    contJug=0;
                }
            }
        }
        return arr;
    }
    
    public int getTiempoTotal()
    {
        return 0;
    }


    @Override
    public String toString() 
    {
        return "Extra{" + "eventos=" + eventos + ", terminar=" + terminar + ", tiradores=" + tiradores + '}';
    }
    
}
