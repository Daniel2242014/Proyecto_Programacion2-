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
        public Seleccion[] ganadores(){  //no se que falta
            
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
                for (Partido p:lista){
                    /*FALTA*/
                }
            }
            
            return null; 
            
           
        }
        public Seleccion[] devolverSelecciones(){  //no se que falta
            return null;
            
            /*LO MISMO QUE EL ANTERIOR, PERO SOLO QUE ESTE DEVUELBE LOS QUE NO GANARON, 
            IGUAL PARA OPTIMISAR CODIGO PODES UTILIZAR EL OTRO METODO Y VER CUALES SON 
            LAS SELECIONES QUE NO ESTAN  */
                
        
        }
        public int devolverPunto(Seleccion a){ 
            return 0;
          //aiuda
            /*TIENE QUE DEVOLBER, LOS PUNTOS QUE TUBO LA SELECION ES ESA FACE, TE PUEDE SERVIR 
            REUTILIZAR ESTOS METODOS (ESTE Y EL SIGIENTE) EN LOS DOS ANTERIORES
            DANIEL*/
            
        }
        public int devolverGoles(Seleccion a){  
            return 0;  
            
            /*TIENE QUE DEVOLBER LOS GOLES QUE HISO LA SELECION EN ESA FACE */
            
        }
        public String toString() {
            return "Fase{" + "letra_posicion=" + letra_posicion + ", grupo_eliminacion=" + 
                    grupo_eliminacion + '}';
            //deje que lo haga netbeans como dijiste
        
        }
               
    }
