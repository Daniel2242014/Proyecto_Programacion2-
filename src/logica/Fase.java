/* ANTES
package logica;


    public class Face { /*"FACE" CON "S" NO CON "C"
                                               DANIEL*/
        private partidos : ArrayList<Partido>;  //no se que falta
        
        /*CUIDADO CON LA SINTAXIS, NO SON : SINO UN  =,
        DANIEL */
        
        private String letra_posicion;
        private boolean grupo_eliminacion;
        
        
        public void Fase(){ //no se si tiene que ir void o no.
           
        }
        public void agregarPartido(Partido){ // ni idea de que esta mal
            return null;
       
        /*SI ES VOID NO LLEVA RETURN, ADEMAS NO TE OLVIDES DE PONERLE UN NOMBRE A LOS PARAMETOS 
            NO SOLO EL TIPO DE DATO 
            DANIEL */
        }
       
        
        public Partido devolverPartido(int){  //no se que falta
            return null;
            
            /*NOMBRE EN LOS TIPO DE PARAMETO 
            DANIEL */
            
        }
        public int cantidadPartidos(){
            
        }
        public Selecion[] ganadores(){  //no se que falta
            return null;
            /*PARA ELIMINAR LOS ERRORES DEBERIAS CREAR UNA VARIABLE FICTICIA, NO DEBUELVAS NULL
            DANIEL*/
        }
        public Selecion[] devolverSelecciones(){  //no se que falta
            return null;
            /*LO MISMO QUE LO ANTERIOR
            DANIEL*/
        }
        public int devolverPunto(Selecion){  //no se que falta
            return null;  //no se que falta
            /*NOMBRE DE LOS PARAMETOS Y NO DEBUELVAS NULL
            DANIEL*/
        }
        public int devolverGoles(Selecion){  //no se que falta
            return null;  //no se que falta
             /*NOMBRE DE LOS PARAMETOS Y NO DEBUELVAS NULL
            DANIEL*/
        }
        public String toString() {  
            return "hola"; //LE PUSE "HOLA" COMO EJEMPLO
            
            /*DEJA QUE NETBEANS LO HAGA 
            DANIEL*/
        }
        
        
    
                    
    }
  */ 
      
// ahora
package logica;

    public class Fase { 
        private partidos = ArrayList<Partido>; //sigue tirando error
        private String letra_posicion;
        private boolean grupo_eliminacion;
        public int eje;
        
        public void Fase(){ 
           
        }
        public void agregarPartido(Partido part){ 
       
       
        }
       
        
        public Partido devolverPartido(int devpart){  
            return null;
            //devpart=devolverPartido
            
        }
        public int cantidadPartidos(){
            
        }
        public Seleccion[] ganadores(){  //no se que falta
            return eje;
           
        }
        public Seleccion[] devolverSelecciones(){  //no se que falta
            return eje;
        
        }
        public int devolverPunto(Seleccion a){ 
            return eje;
          
        }
        public int devolverGoles(Seleccion a){  //no se que falta
            return eje;  
            
        }
        public String toString() {
            return "Fase{" + "letra_posicion=" + letra_posicion + ", grupo_eliminacion=" + grupo_eliminacion + ", eje=" + eje + '}';
            //deje que lo haga netbeans como dijiste
        
        }
        
        
        
    
                    
    }
