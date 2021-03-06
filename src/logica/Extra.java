package logica;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class Extra implements Serializable
{
    private ArrayList<Acciones> eventos;
    private boolean terminar;
    private ArrayList<Jugador> tiradores;
    public final static boolean TERMINAR_ALARGUE=false;
    public final static boolean TERMINAR_PENALES=true;
    
    public Extra (int a, ArrayList<Acciones> arr)  
    {
        this.tiradores = new ArrayList<>(6);
        this.eventos = arr;
        if((a)>120)
        {
            terminar=true;
        }
        else{
            terminar=false;
        }
            
    }

    public ArrayList<Acciones> getEventos() {
        return eventos;
    }

    public void setEventos(ArrayList<Acciones> eventos) {
        this.eventos = eventos;
    }

    public boolean isTerminar() {
        return terminar;
    }

    public void setTerminar(boolean terminar) {
        this.terminar = terminar;
    }

    public ArrayList<Jugador> getTiradores() {
        return tiradores;
    }

    public void setTiradores(ArrayList<Jugador> tiradores) {
        this.tiradores = tiradores;
    }

 
    
    public void penal(Jugador p, boolean gol)
    {
        tiradores.add(p);
        for(Acciones buscar:eventos)
        {
            if(buscar.getPersonaje().equals(p))
            {
                buscar.penal(gol);
            }
        }
    }
    
    public boolean[] devolverPenales(Seleccion s)
    {
    
        boolean[] arr=new boolean[tiradores.size()/2];
        int[][]lista=new int[tiradores.size()/2][2];
      
        int contador1=0;
        int contador2=0;
        for(Acciones a:eventos)
        {
            if(tiradores.contains(a.getPersonaje()) && s.pertenece(a.getPersonaje()))
            {
                    lista[contador1][0]=a.getPersonaje().getCode();
                    lista[contador1][1]=0;
                    contador1++;
            }
        }
        for(Jugador j: tiradores)
        {
            for(Acciones a:eventos)
            {
  
                if(a.getPersonaje().equals(j) && s.pertenece(j) )
                {
                    int aux=0;
                    for(int i=0;i<tiradores.size()/2;i++)
                    {
                        if(j.getCode()==lista[i][0])
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
