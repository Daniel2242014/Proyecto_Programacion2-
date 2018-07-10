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

    
    public  Partido(Seleccion a,Seleccion b,int temptot, int tiempoe){
        equipo1=a;
        equipo2=b;
        tiempo_total=temptot;
        tiempo_agregado= tiempoe;
        this.eventos=new ArrayList<>();
    }
    
    //----------------------------------------------------------------------------------------------------------------------------------------------------
    
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
    
    //-----------------------------------------------------------------------------------------------------------------------------------------
    
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
    }
    public int golesTotales(Seleccion s){  
        int contador=0;
        for ( Acciones a: eventos){
            if(s.pertenece(a.getPersonaje())){
                contador+=a.getCant_goles();
            }
        }
        return contador;
    }
    
    public int fairPlay (Seleccion s) {
        int contador=0;
        if(!this.equipo1.equals(s) && !this.equipo2.equals(s)){
            return -1;
        }else{
            for(Acciones e:eventos){
                if(s.pertenece(e.getPersonaje())){
                    if(e.isRoja() && e.getAmarilias()<2){
                        contador+=3;
                    }else if(e.getAmarilias()==2){
                        contador+=2;
                    }else if(e.getAmarilias()==1){
                        contador++;
                    }
                }
            }
        }
        return contador;
    }
    
    public String toString() {
        return "Partido{" + "fecha=" + fecha + ", tiempo_total=" + tiempo_total + ", tiempo_agregado=" 
                + tiempo_agregado + ", ciudad=" + ciudad + ", estadio=" + estadio + ", equipo1=" + equipo1
                + ", equipo2=" + equipo2 + ", eventos=" + eventos + ", parte_extra=" + parte_extra
                + ", tipo_fase=" + tipo_fase + '}';
    } 
       
    
           
}
