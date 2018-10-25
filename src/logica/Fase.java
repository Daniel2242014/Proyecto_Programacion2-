package logica;
import java.io.Serializable;
import java.util.ArrayList;
public class Fase implements Serializable { 
    private ArrayList<Partido> lista = new ArrayList<>();  
    private ArrayList<Seleccion> seleciones = new ArrayList();
    private char letra_posicion;
    private boolean grupo_eliminacion; //false=grupo, true=eliminatoria
    public final static char GRUPO_A = 'A';
    public final static char GRUPO_B = 'B';
    public final static char GRUPO_C = 'C';
    public final static char GRUPO_D = 'D';
    public final static char GRUPO_E = 'E';
    public final static char GRUPO_F = 'F';
    public final static char GRUPO_G = 'G';
    public final static char GRUPO_H = 'H';
    public final static char OCTAVOS = '8';
    public final static char CUARTOS = '4';
    public final static char TERCER_Y_CUARTO  = '3';
    public final static char SEMI_FINAL = '2';
    public final static char FINAL = '1';

    public Fase(char r ){ 
       this.lista = new ArrayList<>();
       letra_posicion=r;
       if(letra_posicion=='a'||letra_posicion=='b'||letra_posicion=='c'||letra_posicion=='d'||letra_posicion=='e'||
               letra_posicion=='f'||letra_posicion=='g'||letra_posicion=='h'){
           grupo_eliminacion=false;
       }else{
           grupo_eliminacion=true;
       }
       seleciones=new ArrayList();
    }

    
    public ArrayList<Seleccion> getSeleciones() {
        return seleciones;
    }
    
    public void agregarSeleccion(Seleccion s){
        seleciones.add(s);
    }
    
    public Seleccion devolverSeleccion (int index){
        return seleciones.get(index);
    }
    
    public void limpiar (){
        seleciones.clear();
    }
    
    public int numeroSeleciones (){
        return seleciones.size();
    }

    public void setSeleciones(ArrayList<Seleccion> seleciones) {
        this.seleciones = seleciones;
    }
    
    public ArrayList<Partido> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Partido> lista) {
        this.lista = lista;
    }

    public char getLetra_posicion() {
        return letra_posicion;
    }

    public void setLetra_posicion(char letra_posicion) {
        this.letra_posicion = letra_posicion;
    }

    public boolean isGrupo_eliminacion() {
        return grupo_eliminacion;
    }

    public void setGrupo_eliminacion(boolean grupo_eliminacion) {
        this.grupo_eliminacion = grupo_eliminacion;
    }
        
    
    public void agregarPartido(Partido part){
         if(seleciones.contains(part.getEquipo1()) && seleciones.contains(part.getEquipo2())){
            lista.add(part);    
         }
        }
       
        public Partido devolverPartido(int devpart){  
            return lista.get(devpart);     
        }
        
        public int cantidadPartidos(){
            return lista.size();       
        }
       
       /* public Seleccion[] devolverSelecciones(){  
            
             Seleccion [] arry; 
            
            if(grupo_eliminacion){ 
                    arry=new Seleccion[lista.size()*2];
                    int contador=0;
                    for (Partido p:lista){
                            arry[contador]=p.getEquipo1();
                            arry[contador+1]=p.getEquipo2();
                            contador+=2;
                    }
            
            }else{
               
                arry = new Seleccion[4];
                int contador=0;
                for (Partido p:lista){
                    
                    Seleccion aux1=p.getEquipo1();
                    Seleccion aux2=p.getEquipo2();
                  
                   
                    if(arry[0]!=null && arry[1]!=null && arry[2]!=null &&arry[3]!=null){
                        continue;
                    }
                    
                    
                    
                    if(!aux1.equals(arry[0]) && !aux1.equals(arry[1]) && !aux1.equals(arry[2]) && !aux1.equals(arry[3]) ){
                        arry[contador]=aux1;
                        contador++;
                    }else if(   !aux2.equals(arry[0]) && !aux2.equals(arry[1]) && !aux2.equals(arry[2]) && !aux2.equals(arry[3])    ){
                         arry[contador]=aux2;
                        contador++;
                    }  
                }
            }
    
            return arry;
            
            
        }
*/
      
   
        
        public int devolverPunto(Seleccion a){ 
            
            int contador=0; //punto de cada partido
                for(Partido p:lista){
                    if(p.getEquipo1().equals(a) || p.getEquipo2().equals(a)){
                        Seleccion otro;
                        if(p.getEquipo1().equals(a)){
                            otro=p.getEquipo2();
                        }else{
                            otro=p.getEquipo1();
                        }
                        if(p.golesTotales(a)>p.golesTotales(otro)){
                            contador+=3;
                        }else if(p.golesTotales(a)<p.golesTotales(otro)){
                            contador+=0;
                        }else{
                            if(p.getParte_extra()!=null){
                                if(!p.getParte_extra().getTiradores().isEmpty()){
                                    int cont1=0;
                                    int cont2=0;
                                    boolean [] penal1 = p.getParte_extra().devolverPenales(a);
                                    boolean [] penal2 = p.getParte_extra().devolverPenales(otro);
                                    for(int i=0;i<penal1.length;i++){
                                        if(penal1[i]){
                                            cont1++;
                                        }
                                        if(penal2[i]){
                                            cont2++;
                                        }
                                    }
                                    if(cont1>cont2){
                                        contador+=3;
                                    }
                                }else{
                                    contador++;
                                }
                            }else{
                                contador++;
                            }
                        }
                    }
                }
            return contador;    
             
        }
        public int devolverGoles(Seleccion a, boolean j){  
             int contador=0;
            
                for (Partido p : lista){
                    if(p.golesTotales(a) != -1){
                        contador+=p.golesTotales(a);
                    }
                } 
            if(!j){
                 for(Partido p:lista){
                     if(p.getEquipo1().equals(a) ){
                         contador-=p.golesTotales(p.getEquipo2());
                     }else if(p.getEquipo2().equals(a)){
                         contador-=p.golesTotales(p.getEquipo1());
                     }
                 }
            }
             return contador;  
        }
        
        public int fairPlay(Seleccion s){
            int puntos=0;
            for(Partido p: lista){
                if(p.fairPlay(s)!=-1){
                    puntos+=p.fairPlay(s);
                }
            }
            
            return puntos;
        }
        
        public int partidosGanados(Seleccion s){
            int contador=0;
            for (Partido p:lista){
                if(p.getEquipo1().equals(s) || p.getEquipo2().equals(s)){
                    Seleccion otro;
                    if(p.getEquipo1().equals(s)){
                        otro=p.getEquipo2();
                    }else{
                        otro=p.getEquipo1();
                    }
                    if(p.golesTotales(s)>p.golesTotales(otro)){
                        contador++;
                    }else if(p.golesTotales(s)==p.golesTotales(otro)){
                            if(p.getParte_extra()!=null && p.getTiempo_total()>120){        
                                int cont1=0;
                                    int cont2=0;
                                    boolean [] penal1 = p.getParte_extra().devolverPenales(s);
                                    boolean [] penal2 = p.getParte_extra().devolverPenales(otro);
                                    for(int i=0;i<penal1.length;i++){
                                        if(penal1[i]){
                                            cont1++;
                                        }
                                        if(penal2[i]){
                                            cont2++;
                                        }
                                    }
                                    if(cont1>cont2){
                                        contador++;
                                    }
                            }
                    }
                }
            }
            return contador;
        }
        
        public int partidosEmpatados(Seleccion s){
         
            int contador=0;
            for (Partido p:lista){
                if(p.getEquipo1().equals(s) || p.getEquipo2().equals(s)){
                    Seleccion otro;
                    if(p.getEquipo1().equals(s)){
                        otro=p.getEquipo2();
                    }else{
                        otro=p.getEquipo1();
                    }
                    if(p.golesTotales(s)==p.golesTotales(otro) && p.getParte_extra()==null){
                        contador++;
                    }
                }
            }
            return contador;
   
        }
        
        public int partidosPerdidos(Seleccion s){
            int contador=0;
            if(grupo_eliminacion){
                if(this.partidosGanados(s)==1){
                    contador=0;
                }else if(this.partidosGanados(s)==0){
                    contador=1;
                }
            }else{
                contador = 3-(this.partidosGanados(s)+this.partidosEmpatados(s));
            }
            return contador;
        }
        
        public Seleccion[] SeleccionesGanadoras(boolean j){
          
            Seleccion[] todas=(Seleccion[]) seleciones.toArray();
            Seleccion[] ganadoras= new Seleccion [todas.length/2];
            Seleccion aux;
            for(int i=0;i<todas.length;i++){   
                for(int i2=0;i2<todas.length;i2++){
                        if(this.devolverPunto(todas[i2]) <  this.devolverPunto(todas[i])){
                            aux=todas[i];
                            todas[i]=todas[i2];
                            todas[i2]=aux;
                        }else if(this.devolverPunto(todas[i]) == this.devolverPunto(todas[i2])){
                            if( this.devolverGoles(todas[i2],false) < this.devolverGoles(todas[i],false) ){
                                aux=todas[i];
                                todas[i]=todas[i2];
                                todas[i2]=aux;
                            }else if(this.devolverGoles(todas[i2],false) == this.devolverGoles(todas[i],false) ){   
                                if(this.fairPlay(todas[i]) < this.fairPlay(todas[i2]) ){
                                    aux=todas[i];
                                    todas[i]=todas[i2];
                                    todas[i2]=aux;
                                }
                            }
                        }    
                }
            }
            
         if(j){
             for (int i=0;i<ganadoras.length;i++){
                 ganadoras[i]=todas[i];
             }
             return  ganadoras;
        
         }else{
             return todas;
         }
        }
        
          public Seleccion[] SeleccionesPerdedoras(){
            Seleccion [] todas = (Seleccion[]) seleciones.toArray();
            Seleccion [] ganadoras = this.SeleccionesGanadoras(true);
            Seleccion [] perdedoras = new Seleccion[ganadoras.length];
            int contador=0;
          
            for(int i=0; i<perdedoras.length;i++){
                boolean j=true;
                for(int i2=0; i2<ganadoras.length; i2++){
                    if(todas[contador].equals(ganadoras[i2])){
                        j=false;
                    }
                }  
                if(j){
                    perdedoras[i]=todas[contador];
                }else{
                    i--;
                }
                
                contador++;
            }
              return perdedoras; 
        }
        
       
          public String toString() {
            return "Fase{" + "letra_posicion=" + letra_posicion + ", grupo_eliminacion=" + 
                    grupo_eliminacion + '}';

        }
               
    }
