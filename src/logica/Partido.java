package logica;
import.java.util;
public class Partido {
    private String fecha;
    private int tiempo_total;
    private int tiempo_agregado;
    private String ciudad;
    private String estadio;
    private Selecion equipo1;    
    private Selecion equipo2;     
    private ArrayList<Acciones> eventos;  
    private Extra parte_extra;          
    private boolean tipo_fase;
    
    
    public  Partido(Selecion a,Selecion b,boolean fac,int temptot){
        //fac=tipo_fase, temptot=tiempo_total
        equipo1=a;
        equipo2=b;
        tipfase=fac;
        timetotal=temptot;
 
    }
    public void agregarEvento(Acciones acc){  
      //acc=accion  
      eventos.add(Acciones);
        /*TENES QUE AGREGAR LA ACCION QUE TE MANDARON POR PARAMETRO Y AGREGARLA 
      AL ARRAYLIST, UTILIZA EL METODO ADD(ACCIONES)
      DANIEL*/
    } 
    
    public Acciones devolverEvento(int deveve){  
        getInt()=a;
        return eventos.get(a);
            
            /*UTILIZANDO EL METODO GET(INT) DEVOLBE LA ACCION QUE CORESPONDA AL NUMERO QUE TE
        PASARON POR PARAMETRO
        DANIEL*/
    }
    public int cantidadEventos(){
        return eventos.size(); 
        /*UTILIZA EL METODO SIZE() PARA SABER Y DEBOLVER CUANTAS ACCIONES HAY EN EL ARRAYLIST
        DANIEL*/
    }
    public void cearAlargue(){ 
        //como es?
        /*CREA UN OBJETO DE TIPO EXTRA Y PASALE LAS COSAS CORESPONDIENTES AL CONSTRUCTOR
        DANIEL*/
    }
    public int golesTotales(Selecion /*NOMBRE*/){  
        for ( eventos : //no me acuerdo que iba aca para correr toda la lista
        /*MIRANDO EN LAS ACCIONES CALCULA CUANTOS FUERON LOS GOLES TOTALES DE CADA SELECION 
        EN EL PARTIDO, RECORDA QUE SABES CUALES SON LOS JUGADORES DE CADA SELECION, PORQUE LOS 
        TENES METIDOS EN UN ARRAYLIST EN LA CLASE SELECION
        DANIEL*/
    }
    public String toString() {
        return "Partido{" + "fecha=" + fecha + ", tiempo_total=" + tiempo_total + ", tiempo_agregado=" 
                + tiempo_agregado + ", ciudad=" + ciudad + ", estadio=" + estadio + ", equipo1=" + equipo1
                + ", equipo2=" + equipo2 + ", eventos=" + eventos + ", parte_extra=" + parte_extra
                + ", tipo_fase=" + tipo_fase + '}';
    } //deje que lo hiciera netbeans como dijiste
       
    
           
}
