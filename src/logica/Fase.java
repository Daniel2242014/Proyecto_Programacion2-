package logica;
    import java.util.ArrayList;
    public class Fase { 
        private ArrayList<Partido> lista = new ArrayList<>();  
        private String letra_posicion;
        private boolean grupo_eliminacion; //false=grupo, true=eliminatoria
        
        public void Fase(){ 
           
        }
        public void agregarPartido(Partido part){
            lista.add(part);    
        }
       
        public Partido devolverPartido(int devpart){  
            return lista.get(devpart);     
        }
        
        public int cantidadPartidos(){
            return lista.size();       
        }
       
        public Seleccion[] devolverSelecciones(){  
            
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
                    
                    if(!arry[0].equals(aux1) && !arry[1].equals(aux1) && !arry[2].equals(aux1) && !arry[3].equals(aux1)){
                        arry[contador]=aux1;
                        contador++;
                    }else if(!arry[0].equals(aux2) && !arry[1].equals(aux2)  && !arry[2].equals(aux2)  && !arry[3].equals(aux2) ){
                         arry[contador]=aux2;
                        contador++;
                    }  
                }
            }
    
            return arry;
        }
      
   
        
        public int devolverPunto(Seleccion a){ 
           
          if(!grupo_eliminacion){  
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
                            contador++;
                        }
                    }
                }
            return contador;    
          }else{
            return -1;
          }
            
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
        
        public int ferPlay(Seleccion s){
            int puntos=0;
            for (Partido p: lista){
                if(p.ferPlay(s)!=-1){
                    puntos+=p.ferPlay(s);
                }
            }
            
            return puntos;
        }
        
        public Seleccion[] SeleccionesGanadoras(){
           
            Seleccion[] todas= this.devolverSelecciones();
            Seleccion[] ganadoras= new Seleccion [todas.length/2];
            Seleccion aux;
            for(int i=0;i<todas.length;i++){   
                for(int i2=1;i2<todas.length;i2++){
                        if(this.devolverPunto(todas[i2]) >  this.devolverPunto(todas[i])){
                            aux=todas[i];
                            todas[i]=todas[i2];
                            todas[i2]=aux;
                        }else if(this.devolverPunto(todas[i]) == this.devolverPunto(todas[i2])){
                            if( this.devolverGoles(todas[i2],false) > this.devolverGoles(todas[i],false) ){
                                aux=todas[i];
                                todas[i]=todas[i2];
                                todas[i2]=aux;
                            }else if(this.devolverGoles(todas[i2],false) == this.devolverGoles(todas[i],false) ){   
                                if(this.ferPlay(todas[i]) > this.ferPlay(todas[i2]) ){
                                    aux=todas[i];
                                    todas[i]=todas[i2];
                                    todas[i2]=aux;
                                }
                            }
                        }    
                }
            }
            
            for(int i3=0;   i3<todas.length/2; i3++){
                ganadoras[i3]=todas[i3];
            }
            return  ganadoras;
        }
        
          public Seleccion[] SeleccionesPerdedoras(){
            Seleccion [] todas = this.devolverSelecciones();
            Seleccion [] ganadoras = this.SeleccionesGanadoras();
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
