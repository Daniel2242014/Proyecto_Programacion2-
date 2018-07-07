package logica;

import java.util.ArrayList; //mira como se hace 

public class Partido {
    private String fecha;
    private int tiempo_total;
    private int tiempo_agregado;
    private String ciudad;
    private String estadio;
    private Seleccion equipo1;    
    private Seleccion equipo2;     
    private ArrayList<Acciones> eventos;  
    private Extra parte_extra;          
    private boolean tipo_fase;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getTiempo_total() {
        return tiempo_total;
    }

    public void setTiempo_total(int tiempo_total) {
        this.tiempo_total = tiempo_total;
    }

    public int getTiempo_agregado() {
        return tiempo_agregado;
    }

    public void setTiempo_agregado(int tiempo_agregado) {
        this.tiempo_agregado = tiempo_agregado;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public Seleccion getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Seleccion equipo1) {
        this.equipo1 = equipo1;
    }

    public Seleccion getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Seleccion equipo2) {
        this.equipo2 = equipo2;
    }

    public ArrayList<Acciones> getEventos() {
        return eventos;
    }

    public void setEventos(ArrayList<Acciones> eventos) {
        this.eventos = eventos;
    }

    public Extra getParte_extra() {
        return parte_extra;
    }

    public void setParte_extra(Extra parte_extra) {
        this.parte_extra = parte_extra;
    }

    public boolean isTipo_fase() {
        return tipo_fase;
    }

    public void setTipo_fase(boolean tipo_fase) {
        this.tipo_fase = tipo_fase;
    }
    
    
    
    
    
    public  Partido(Seleccion a,Seleccion b,int temptot){
        equipo1=a;
        equipo2=b;
        tiempo_total=temptot;

    }
    public void agregarEvento(Acciones acc){  
      eventos.add(acc);
    } 
    
    public Acciones devolverEvento(int deveve){  
        return eventos.get(deveve);
         
    }
    public int cantidadEventos(){
        return eventos.size(); 
    }
    public Extra cearAlargue(){ 
       parte_extra=new Extra(tiempo_total,tiempo_agregado,eventos);
       return parte_extra;
       //como se hace?
       /*CREA UN OBJETO DE TIPO EXTRA Y PASALE LAS COSAS CORESPONDIENTES AL CONSTRUCTOR
        DANIEL*/
    }
    public int golesTotales(Seleccion sele){  
        for ( Acciones a: eventos){
            // la variable "a" es un objeto de tipo selecion
        }
       
        /*SI LA SELECION INGRESADA NO PERTENECE A ESE PARTIDO HACE QUE EL METODO DEBUELVA -1 POR FAVOR
        DANIEL
        */
        
        /*MIRANDO EN LAS ACCIONES CALCULA CUANTOS FUERON LOS GOLES TOTALES DE CADA SELECION 
        EN EL PARTIDO, RECORDA QUE SABES CUALES SON LOS JUGADORES DE CADA SELECION, PORQUE LOS 
        TENES METIDOS EN UN ARRAYLIST EN LA CLASE SELECION
        DANIEL*/
        
        return 0;
    }
    public String toString() {
        return "Partido{" + "fecha=" + fecha + ", tiempo_total=" + tiempo_total + ", tiempo_agregado=" 
                + tiempo_agregado + ", ciudad=" + ciudad + ", estadio=" + estadio + ", equipo1=" + equipo1
                + ", equipo2=" + equipo2 + ", eventos=" + eventos + ", parte_extra=" + parte_extra
                + ", tipo_fase=" + tipo_fase + '}';
    } 
       
    
           
}
