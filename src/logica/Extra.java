package logica;

import java.util.ArrayList;

public class Extra
{
    private ArrayList<Acciones> eventos;
    private boolean terminar;
    private ArrayList<Jugador> tiradores;
    public static boolean TERMINAR_ALARGUE=false;
    public static boolean TERMINAR_PENALES=true;
    
    public Extra (int a, int b, ArrayList<Acciones> arr)  
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
        /*int contJug=0;
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
        }*/
        boolean[] arr=new boolean[tiradores.size()];
        int[][]lista=new int[tiradores.size()][2];
        int contador1=0;
        int contador2=0;
        for(Acciones a:eventos)
        {
            if(tiradores.contains(a.getPersonaje()))
            {
                    lista[contador1][0]=a.getPersonaje().getCedula();
                    lista[contador1][1]=0;
                    contador1++;
            }
        }
        for(Jugador j: tiradores)
        {
            for(Acciones a:eventos)
            {
                if(a.getPersonaje().equals(j))
                {
                    int aux=0;
                    for(int i=0;i<tiradores.size();i++)
                    {
                        if(j.getCedula()==lista[i][0])
                        {
                            aux=i;
                            continue;
                        }
                    }
                    arr[contador2]=a.devolverPenal(lista[aux][1]);
                    lista[aux][1]++;
                    contador2++;
                }
            }
        }
        return arr;
    }

    public String toString() 
    {
        return "Extra{" + "eventos=" + eventos + ", terminar=" + terminar + ", tiradores=" + tiradores + '}';
    }
    
}
