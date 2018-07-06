package logica;

    public class Fase { 
        private Partidos parti2 = ArrayList<Partido> parti2 = new Arraylisy<>();  
        private String letra_posicion;
        private boolean grupo_eliminacion;
        public int eje; /*¿CUAL ES ESTA VARIABLE?*/ //EJE
        
        public void Fase(){ 
           
        }
        public void agregarPartido(Partido part){
            parti2.add(Partido);    
            /*AGREGA UNA UN OBJETO DE TIPO PARTIDO (EL QUE TENES EN EL PARAMETRO DEL METODO) 
                        AL ARRAYLIST, UTILIZA EL METODO ADD (PARTIDO)
                        DANIEL*/
        }
       
        
        public Partido devolverPartido(int devpart){  
            return null;
            //devpart=devolverPartido
            
            /*UTILIZA LOS METODOS DE ARRAYLIST PARA DEVOLVE EL PARTIDO QUE ESTE EN EL ARRAYLIST
            QUE CONCUERDE CON LA POSICION DEL INT DEL PARAMETRO, USA EL METODO GET(INT)
            DANIEL*/
            
        }
        public int cantidadPartidos(){
            return parti2.size();
            /*DEVOLVE LA CANTIDAD DE ELEMENTOS QUE TENGA EL ARRAYLIST (UTILIZA EL METODO SIZE()) */
            
        }
        public Selecion[] ganadores(){  //no se que falta
            return null; 
            /*EHH? QUIEN ES EJE Y ADEMAS UN INT NO ES UNA SELECION
             DANIEL*/
             //DANI EJE ES UN EJEMPLO
            //aiuda como lo hago
            /*ESTE METODO LO QUE HACE ES DEVOLBER UN ARRAY DE LAS SELECIONES QUE
                 GANARON ESA FACE, UTILIZA LOS METODOS DE PARTIDO PARA CALCULAR LOS PUNTOS 
                 Y GOLES, CON ESO SACAS QUIENES GANARON LA FACE (NO IMPORTA QUE AUN NO 
                 TENGAS LO VALORES, SOLO IMPORTA EL ALGORITMO).
                 PRIMERO SACA QUIENES SON LAS SELECIONES, TE ACONSEJO CREAR OTRO METODO PARA ESO.
                 DANIEL */
           
        }
        public Selecion[] devolverSelecciones(){  //no se que falta
            return null;
            
            /*LO MISMO QUE EL ANTERIOR, PERO SOLO QUE ESTE DEVUELBE LOS QUE NO GANARON, 
            IGUAL PARA OPTIMISAR CODIGO PODES UTILIZAR EL OTRO METODO Y VER CUALES SON 
            LAS SELECIONES QUE NO ESTAN  */
                
        
        }
        public int devolverPunto(Selecion a){ 
            return 0;
          //aiuda
            /*TIENE QUE DEVOLBER, LOS PUNTOS QUE TUBO LA SELECION ES ESA FACE, TE PUEDE SERVIR 
            REUTILIZAR ESTOS METODOS (ESTE Y EL SIGIENTE) EN LOS DOS ANTERIORES
            DANIEL*/
            
        }
        public int devolverGoles(Selecion a){  
            return 0;  
            
            /*TIENE QUE DEVOLBER LOS GOLES QUE HISO LA SELECION EN ESA FACE */
            
        }
        public String toString() {
            return "Fase{" + "letra_posicion=" + letra_posicion + ", grupo_eliminacion=" + 
                    grupo_eliminacion + ", eje=" + eje + '}';
            //deje que lo haga netbeans como dijiste
        
        }
               
    }
