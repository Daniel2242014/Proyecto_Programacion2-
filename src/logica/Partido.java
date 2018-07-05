/* ANTES
package logica;

public class Partido {
    private String fecha;
    private int tiempo_total;
    private int tiempo_agregado;
    private String ciudad;
    private String estadio;
    private Selecion equipo1;          //no
    private Seleecion equipo2;          //se
    private ArrayList<Accion> eventos;  //que
    private Extra parte_extra;          //pija esta mal
    private boolean tipo_frase;
    
    /*ESCRIBI BIEN LOS NOMBRE DE LAS CLASES; MIRA COMO ESTAN ESCRITAS A TU 
    DANIEL*/
    
    
    public  Partido(Selecion,Selecion,boolean,int){  //no se que falta
        return null;
        /*EL CONSTRUCTOR NO LLEVA RETURN Y PONE NOMBRE A LOS PARAMETOS
        DANIEL*/
    }
    public void agregarEvento(Accion){  //no se que falta
        return null;
        /*NO RETURN, NOMBRE A LOS PARAMETROS
        DANIEL*/
    } 
    public Accion devolverEvento(int){  //no se que falta
        return null;
        /*NOMBRE A LOS PARAMETROS
        DANIEL*/
    }
    public int cantidadEventos(){
        return 4; //ejemplo
    }
    public void cearAlargue(){ //LE PUSE VOID PORQUE SINO TIRA ERROR.
        
    }
    public int golesTotales(Selecion){  //no se que falta
        return 4; //LE PUSE 4 COMO EJEMPLO SINO ME TIRABA ERROR.
    }
    public String toString(){
        return "hola"; //LE PUSE "HOLA" COMO EJEMPLO SINO ME TIRABA ERROR.
        /*DEJA QUE LO CREE NETBEANDS
        DANIEL*/
    }
        
    
    
           
}
*/
//AHORA
package logica;

public class Partido {
    private String fecha;
    private int tiempo_total;
    private int tiempo_agregado;
    private String ciudad;
    private String estadio;
    private Seleccion equipo1;    
    private Seleeccion equipo2;     
    private ArrayList<Accion> eventos;  
    private Extra parte_extra;          
    private boolean tipo_fase;
    
    
    public  Partido(Seleccion a,Seleccion b,boolean fac,int temptot){
        //fac=tipo_fase, temptot=tiempo_total
    }
    public void agregarEvento(Accion acc){  
      //acc=accion  
      
    } 
    public Accion devolverEvento(int deveve){  
        return null;
        //deveve=devolverEvento
    }
    public int cantidadEventos(){
        return 4; 
    }
    public void cearAlargue(){ 
        
    }
    public int golesTotales(Seleccion){  
        return 4; 
    }
    public String toString() {
        return "Partido{" + "fecha=" + fecha + ", tiempo_total=" + tiempo_total + ", tiempo_agregado=" + tiempo_agregado + ", ciudad=" + ciudad + ", estadio=" + estadio + ", equipo1=" + equipo1 + ", equipo2=" + equipo2 + ", eventos=" + eventos + ", parte_extra=" + parte_extra + ", tipo_fase=" + tipo_fase + '}';
    } //deje que lo hiciera netbeans como dijiste
       
    
           
}
