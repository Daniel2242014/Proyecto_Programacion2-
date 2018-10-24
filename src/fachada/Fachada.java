package fachada;
import persistencia.Archivo;
import java.util.ArrayList;
import java.util.Random;
import logica.*;

public class Fachada{

    private static Fachada instancia;
    private ArrayList<Fase> fases;
    private ArrayList<Jugador> jugadores;
    private ArrayList<Seleccion> selecciones;
    private ArrayList<Director> directores;
    private ArrayList<Juez> jueces;
    private ArrayList<ArrayList<Seleccion>> bombos; //Arraylist del estilo "multidimensional" para los bombos

    
    //------------ Fin de ArrayLists de simulación -------
    public ArrayList<Fase> getFases() {
        return fases;
    }

    public void setFases(ArrayList<Fase> fases) {
        this.fases = fases;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }


    public ArrayList<Seleccion> getSelecciones() {
        return selecciones;
    }

    public void setSelecciones(ArrayList<Seleccion> selecciones) {
        this.selecciones = selecciones;
    }

    public ArrayList<Director> getDirectores() {
        return directores;
    }

    public void setDirectores(ArrayList<Director> directores) {
        this.directores = directores;
    }

    public ArrayList<Juez> getJueces() {
        return jueces;
    }

    public void setJueces(ArrayList<Juez> jueces) {
        this.jueces = jueces;
    }

   
    public static Fachada getInstancia() //Instancia de fachada
    {
        if (instancia == null) 
        {
            instancia = new Fachada();
        }
        return instancia;
    }

    private Fachada() {
        fases = new ArrayList();
        jugadores = new ArrayList();
        selecciones = new ArrayList();
        directores = new ArrayList();
        jueces = new ArrayList();
        bombos = new ArrayList();
     }
    
    public boolean abrirMun(String a) //Llama al método de Archivo, tal como lo dice el patrón Facade
    {
        return Archivo.getInstancia().abrirArchivo(a);
    }
    
    public boolean guardarMun(String a) //Igual que el anterior, pero inverso
    {
        return Archivo.getInstancia().guardarArchivo(a);
    }
   
    public int sigienteCodigo(){
        int numeroAproximado = jugadores.size()+jueces.size()+directores.size(); 
        /*TECNINACMENTE ESE DEBERIA SER EL SIGIENTE CODIGO VALIDO,
        PERO PUEDE NO SERLO, POR ESO SE VERIFICA Y EN EL CASO DE NO SERVIR SE BUSCA UNO NUEVO*/
        boolean j=true;
        do{
            j=true;
            for(Jugador jug: jugadores){
                if(jug.getCode()==numeroAproximado){
                    j=false;
                    numeroAproximado++;
                }
            }
            for(Director direc: directores){
                if(direc.getCode()==numeroAproximado){
                    j=false;
                    numeroAproximado++;
                }
            }
            for(Juez jues: jueces){
                if(jues.getCode()==numeroAproximado){
                    j=false;
                    numeroAproximado++;
                }
            }
            
        }while (!j);
       return numeroAproximado;
    }
    
    
    public int numeroPersonas(){
        return jugadores.size()+directores.size()+jueces.size();
    }
    
    public Seleccion debolberSeleccionPorNombre(String nom){
        for (Seleccion s: selecciones){
            if(s.getNombre().equalsIgnoreCase(nom)){
                return s;
            }
        }
        return null;
    }
    
    public void agregarJugador(Jugador j){
       if(!jugadores.contains(j)){ 
            jugadores.add(j);
            this.debolberSeleccionPorNombre(j.getPais()).agregarJugador(j);
       }else{
           throw new ErrorException("No puede exsistir dos jugadores con el mismo codigo");
       } 
    }
    
    public void eliminarJugador(Jugador j){
        this.debolberSeleccionPorNombre(j.getPais()).eliminarJugador(j);
        jugadores.remove(j);
    }
    
    public int posicionSeleccion(Seleccion s){
        int posicion=0;
        for(Seleccion se : selecciones){
          if(se.equals(s)){
              return posicion; 
          }
          posicion++; 
        }
        return -1;
    }
    
    
    /*MOTOR DE BUSQUEDA*/
    
    public ArrayList <Persona> debolberTodasLasPersonas(){
        ArrayList <Persona> per= new ArrayList();
        for (Jugador juga: jugadores){
            per.add(juga);
        }
            
        for(Director direct: directores) { 
            per.add(direct);
        }    
            
        for(Juez juez:jueces){
            per.add(juez);
        }
        return per; 
    }
    
    public ArrayList <Jugador> debolberJugadoresPorNumeroCamisa(int index){
        ArrayList <Jugador> elegidos = new ArrayList();
        for(Jugador jug: jugadores){
            if(jug.getNumeroCamisa()==index){
                elegidos.add(jug);
            }
        }
        return elegidos;
    }
    
    public ArrayList <Persona>  debolberPersonasPorNombreSeleccion (String nom){
        ArrayList <Persona> pepin= new ArrayList();
        for(Seleccion s: selecciones){
           if(s.getNombre().length()>nom.length()){
               if(nom.equalsIgnoreCase(s.getNombre().substring(0, nom.length()))){
                   for(Persona ppp:s.getJugadores()){
                       pepin.add(ppp);
                   }
                   pepin.add(s.getMaestro());
               }
           }
        }
        return pepin;
    }
 
    public ArrayList <Persona> debolberPersonasPorEdad(int edad,int edad2, int tipoBusqueda){
        /*tipo de busqueda 0=busqueda simple, 1=rango, 2=de un numero en adelante, 3= de un numero hacia atras*/
        ArrayList <Persona> per = new ArrayList();
        if(tipoBusqueda==0){
           for(Persona p:this.debolberTodasLasPersonas()){
               if(p.getEdad()==edad){
                   per.add(p);
               }
           }
        }else if(tipoBusqueda==1){
            for(Persona p:this.debolberTodasLasPersonas()){
               if(p.getEdad()>=edad && p.getEdad()<=edad2){
                   per.add(p);
               }
           }
        }else if(tipoBusqueda==2){
            for(Persona p:this.debolberTodasLasPersonas()){
               if(p.getEdad()>edad){
                   per.add(p);
               }
           }
        }else{
            for(Persona p:this.debolberTodasLasPersonas()){
               if(p.getEdad()<edad){
                   per.add(p);
               }
           }
        }

        return per;
    }

    public ArrayList <Persona>  debolberPersonaPorNombre(String nombre){
       ArrayList <Persona>  personas= new ArrayList();

      for(Persona per:this.debolberTodasLasPersonas()){
          if(nombre.length()<=per.getNombre().length()){
               if(per.getNombre().substring(0, nombre.length()).equalsIgnoreCase(nombre)){
                    personas.add(per);
                 }
          }
      }

      return personas;
   }

   //-------------------------------- METODOS QUE OPERAN CON LOS DATOS DIRECTAMENTE ---------------------------------------
   public void sistemaBase() 
   { 
       //Se encarga de la creación y asignación de todos los datos base oficiales sobre el Mundial
       Director direcSuecia = new Director(0, "En su segunda etapa en el Alets IK, durante su primera"
               + " temporada, ejerció el cargo de jugador-entrenador durante un año. Desde 1990 hasta "
               + "1992, aun siendo jugador del Alets, se convirtió en el segundo entrenador del Halmstads "
               + "BK. Tras finalmente acabar su carrera como jugador en el Laholms FK, se convirtió en "
               + "entrenador del club durante cinco temporadas, llevando al club a jugar en la División 2. "
               + "Tras pasar de nuevo como segundo entrenador del Halmstads BK, finalmente en 2004 "
               + "se convirtió en el primer entrenador del club en la Allsvenskan. Consolidándose en clubes "
               + "de primera división, y tras un breve paso por el Örgryte IS, en 2011 se marchó al IFK "
               + "Norrköping,1​ donde llegó su primer título como entrenador con la Allsvenskan y la "
               + "Supercopa de Suecia, lo cual le llevó en la temporada siguiente a entrenar a la selección "
               + "de fútbol de Suecia.", 5, "Janee Andersson", "Suecia", "src/img/default.jpg");

       Director direcRusia = new Director(1, "Antes de su nombramiento como seleccionador de Rusia en "
               + "2016, había entrenado a clubes de Austria, Rusia y Polonia, donde conquistó con el Legia de"
               + " Varsovia el título de liga en la temporada 2"
               + "015-2016", 55, "CHERCHESOV STANISLAV", "Rusia", "src/img/default.jpg");

       Director direcSenegal = new Director(2, "Tras colgar las botas, Cisse ingresó en el cuerpo técnico "
               + "de la selección senegalesa. En 2015 sucedió a Alain"
               + " Giresse en el banquillo.", 42, "Cisse Aliou", "Senegal", "src/img/default.jpg");

       Director direcEgipto = new Director(3, "Llega a Rusia 2018 luego de tres años al frente de los Faraones"
               + ", a los que condujo hasta la final de la Copa Africana de Naciones 2017, y de nuevo a una fase"
               + " final mundialista tras 28 años de ausencia.", 62, "Cuper Hector", "Egipto", "src/img/default.jpg");

       Director direcCroacia = new Director(4, "Tras haber sustituido a Ante Cacic al frente de la selección"
               + " absoluta de Croacia en octubre de 2017, Dalic logró alcanzar la repesca con una victoria"
               + " decisiva en la última jornada y, tras imponerse en el doble enfrentamiento contra Grecia,"
               + " selló la clasificación de Croacia"
               + " para Rusia 2018.", 51, "Dalic Zalatko", "Croacia", "src/img/default.jpg");

       Director direcFrancia = new Director(5, "Didier Deschamps, uno de los jugadores más laureados"
               + " del fútbol francés, dirigió con éxito al Mónaco, a la Juventus y al Olympique de Marsella. "
               + "Fue nombrado seleccionador de Francia tras la Eurocopa 2012: cuartofinalista en el"
               + " Mundial de 2014 y "
               + "subcampeón en la Eurocopa 2016.", 49, "Deschamps Didier", "Francia", "src/img/default.jpg");

       Director direcPeru = new Director(6, "Tras ser un exitoso delantero centro, Ricardo Gareca empezó"
               + " como entrenador en Argentina. Tuvo experiencias en Colombia, Perú y Brasil. Ganó cuatro "
               + "títulos de liga. En marzo de 2015 asumió como DT de la selección peruana, a la que llevó al "
               + "Mundial tras 36 años de ausencia.", 60, "Gareca Ricardo", "Peru", "src/img/default.jpg");

       Director direcPanama = new Director(7, "SIN DESCRIPCION", 62, "Gomez Hernan", "Panama", "src/img/default.jpg");

       Director direcIslandia = new Director(8, "Ex dentista de profesión, Lallgrimsson fue nombrado en 2011 "
               + "ayudante del entonces seleccionador de Islandia, Lars Lagerback, y, dos años después, pasó a "
               + "dirigir al equipo conjuntamente con el sueco. Tras la histórica actuación en la Eurocopa 2016,"
               + " asumió en solitario las riendas, clasificándola"
               + " para su primer Mundial.", 51, "Hallgrimsson Heimir", "islandia", "src/img/default.jpg");

       Director direcDinamarca = new Director(9, "Age Hareide, un ex defensa con experiencia en la primera "
               + "división inglesa, fue internacional 50 veces con Noruega entre 1976 y 1986. Como entrenador, "
               + "ha ganado títulos de liga en tres países y dirigió a la selección noruega. En Dinamarca sucedió "
               + "a Morten Olsen a finales de 2015.", 63, "Hareider Age", "Dinamarca", "src/img/default.jpg");

       Director direcEspania = new Director(10, "SIN DESCRIPCION", 50, "Hierro Fernando", "España", "src/img/default.jpg");

       Director direcMexico = new Director(11, "SIN DESCRIPCION", 57, "Juan carlos osorio", "Mexico", "src/img/default.jpg");

       Director direcSerbia = new Director(12, "Elegido como seleccionador serbio a finales de 2017, Krstajic"
               + " desarrolló una carrera como defensor principalmente en Alemania. Disputó la Copa Mundial "
               + "de la FIFA Alemania 2006.", 44, "Krstajic MLaden", "Serbia", "src/img/default.jpg");

       Director direcAlemania = new Director(13, "Bajo la batuta de Loew, Alemania conquistó el Mundial"
               + " en 2014 tras haber quedado tercero en 2010, y ganó la Copa FIFA Confederaciones 2017. "
               + "Asimismo, ha alcanzado una final (2008) y dos semifinales (2012, 2016) en las tres últimas e"
               + "diciones de la Eurocopa.", 58, "Low Joachim", "Alemania", "src/img/default.jpg");

       Director direcTunez = new Director(14, "Nabil Maâloul fue ayudante de Roger Lemerre durante la "
               + "campaña triunfal de Túnez en la Copa Africana de Naciones 2004, disfrutó de un gran éxito a"
               + " su regreso al Esperance de su país y llevó a Kuwait a la Copa Asiática 2015. Es su segunda "
               + "etapa como seleccionador tunecino.", 56, "Maaloul Nabil", "Tunes","src/img/default.jpg");

       Director direcBelgica = new Director(15, "A las órdenes del técnico español, los  _Diablos Rojos_  "
               + "se convirtieron en el primer país de la UEFA en clasificarse para Rusia 2018, y lo hicieron sin"
               + " conocer la derrota.", 45, "Martinez Roberto", "Belgica", "src/img/default.jpg");

       Director direcPolonia = new Director(16, "Como técnico, ha acumulado experiencia con diferentes "
               + "equipos, primero como asistente y después como primer entrenador. Lleva la batuta de "
               + "Polonia desde 2013.", 60, "Nawalka Adam", "Polonia","src/img/default.jpg");

       Director direcJapon = new Director(30, "Este antiguo centrocampista fue 12 veces internacional entre "
               + "1977 y 1978. Tras colgar las botas, entrenó a los combinados nipones de"
               + " categorías menores.", 63, "NISHINO Akira", "Japon", "src/img/default.jpg");

       Director direcColombia = new Director(17, "Bajo su batuta, los _Cafeteros _consiguieron en Brasil "
               + "2014 su mejor resultado hasta la fecha en un Mundial, "
               + "accediendo a cuartos.", 69, "PEKERMAN Jose", "Colombia", "src/img/default.jpg");

       Director direcSuiza = new Director(18, "Tomó las riendas del equipo nacional luego de Brasil 2014 y,"
               + " hasta la fecha, ha conseguido clasificar al cuadro helvético a la EURO "
               + "2016 y ahora Rusia 2018", 55, "PETKOVIC Vladimir", "Suiza", "src/img/default.jpg");

       Director direcArabia = new Director(19, "Pizzi se ha desempeñado como entrenador en Perú, "
               + "Chile, España, México y Argentina. Con 'La Roja' quedó subcampeón de la Copa FIFA "
               + "Confederaciones 2017.", 50, "PIZZI Juan Antonio", "Arrabia Saudita", "src/img/default.jpg");

       Director direcIran = new Director(20, "Desde abril de 2011, Queiroz dirige a la selección de Irán, a "
               + "la que clasificó para el Mundial de 2014, para la Copa Asiática 2015 y, "
               + "ahora, para Rusia 2018.", 65, "QUEIROZ Carlos", "Iran", "src/img/default.jpg");

       Director direcCostaRica = new Director(21, "Como jugador de la Sele participó en Italia 1990 y "
               + "completó cuatro fases de clasificación mundialistas. En los banquillos, destaca su paso "
               + "por la Liga Deportiva Alajuelense y los tres años que lleva al frente del equipo tico, a quien"
               + " condujo hasta las semifinales de"
               + " la Copa Oro 2017", 50, "RAMIREZ Oscar", "Costa Rica", "src/img/default.jpg");

       Director direcMarruecos = new Director(22, "En febrero de 2016, el francés fue elegido para"
               + " hacerse cargo de la selección de Marruecos y logró clasificar a los norteafricanos para su"
               + " primer Mundial en 20 años", 50, "RENARD Herve", "Marruecos", "src/img/default.jpg");

       Director direcNigeria = new Director(23, "El alemán Gernot Rohr tiene basta experiencia como seleccionador"
               + ". De hecho, Nigeria es el cuarto país africano al que conduce. Los anteriores fueron Gabón"
               + ", Níger y Burkina Faso, a la que incluso dirigió en dos sus partidos del clasificatorio para Rusia "
               + "2018. Asumió el mando de Nigeria en 2016.", 65, "ROHR Gernot", "Nigeria", "src/img/default.jpg");

       Director direcArgentina = new Director(24, "En junio de 2017, Sampaoli dimitió como técnico del Sevilla para ser "
               + "nombrado seleccionador de su Argentina natal. Tras haber dirigido ya a Chile en 4 partidos de clasificación"
               + " para Rusia 2018, condujo a la_ Albiceleste_ a"
               + " clasificarse para ese Mundial", 58, "SAMPAOLI Jorge", "Argentina", "src/img/default.jpg");

       Director direcPortugal = new Director(25, "Dirige a Portugal desde septiembre de 2014, y ha guiado"
               + " a los portugueses hasta la victoria en la EURO 2016, además de en la Copa FIFA"
               + " Confederaciones, donde quedaron terceros.", 64, "SANTOS Fernando", "Portugal", "src/img/default.jpg");

       Director direcCorea = new Director(26, "En junio de 2017, Shin fue elegido para suceder a Uli Stielike "
               + "en el cargo de seleccionador del"
               + " combinado nacional absoluto.", 49, "SHIN Taeyong", "Correa", "src/img/default.jpg");

       Director direcInglaterra = new Director(27, "Su carrera de entrenador la inició en el Middlesbrough y,"
               + " en 2013, fue nombrado seleccionador nacional sub-21. En septiembre de 2016, asumió la"
               + " batuta de los Pross.", 48, "SOUTHGATE Gareth", "Inglaerra", "src/img/default.jpg");

       Director direcUruguay = new Director(28, "Tras aquel primer ciclo al frente de Uruguay,"
               + " en el que disputó el Mundial de Italia 1990, su segundo paso por la selección ha marcado"
               + " un antes y un después para la Celeste. No sólo ganó una Copa América, sino que se apresta"
               + " a disputar en Rusia su tercer Mundial"
               + "secutivo.", 71, "TABAREZ Oscar", "Uruguay", "src/img/default.jpg");

       Director direcBrasil = new Director(29, "En junio de 2016, Tite asumió en la selección de Brasil. "
               + "Gracias a una excepcional eliminatoria desde su llegada, el equipo se convirtió en "
               + "el primer país en obtener su billete a Rusia. Antes, sus mayores éxitos en clubes los"
               + " obtuvo durante sus tres etapas distintas al frente del"
               + " Corinthians.", 57, "TITE", "Brasil", "src/img/default.jpg");

       Director direcAustralia = new Director(31, "Van Marwijk dirigió a Países Bajos entre 2008 y 2012, "
               + "quedando  subcampeón en Sudáfrica 2010. En 2015 tomó las riendas de Arabia Saudí y "
               + "clasificó al equipo para Rusia 2018, pero dimitió poco después. En enero de 2018 fue "
               + "designado para entrenar a Au"
               + "stralia.", 66, "VAN MARWIJK Bert", "Australia", "src/img/default.jpg");

       directores.add(direcAlemania);
       directores.add(direcArgentina);
       directores.add(direcArabia);
       directores.add(direcAustralia);
       directores.add(direcBelgica);
       directores.add(direcBrasil);
       directores.add(direcColombia);
       directores.add(direcCorea);
       directores.add(direcCostaRica);
       directores.add(direcCroacia);
       directores.add(direcDinamarca);
       directores.add(direcEgipto);
       directores.add(direcEspania);
       directores.add(direcFrancia);
       directores.add(direcInglaterra);
       directores.add(direcIran);
       directores.add(direcIslandia);
       directores.add(direcJapon);
       directores.add(direcMarruecos);
       directores.add(direcMexico);
       directores.add(direcNigeria);
       directores.add(direcPanama);
       directores.add(direcPeru);
       directores.add(direcPolonia);
       directores.add(direcPortugal);
       directores.add(direcRusia);
       directores.add(direcSenegal);
       directores.add(direcSerbia);
       directores.add(direcSuecia);
       directores.add(direcSuiza);
       directores.add(direcTunez);
       directores.add(direcUruguay);

       Seleccion selecAlemania=new Seleccion("Alemania", direcAlemania, "UEFA", "src/img/selecciones/alemaniaR.jpg");
       Seleccion selecArgentina=new Seleccion("Argentina", direcArgentina, "CONMEBOL", "src/img/selecciones/argentinaR.jpg");
       Seleccion selecArabia=new Seleccion("Arabia", direcArabia, "AFC", "src/img/selecciones/arabiaSauditaR.jpg");
       Seleccion selecAustralia=new Seleccion("Australia", direcAustralia, "AFC", "src/img/selecciones/australiaR.jpg");
       Seleccion selecBelgica=new Seleccion("Bélgica", direcBelgica, "UEFA", "src/img/selecciones/belgicaR.jpg");
       Seleccion selecBrasil=new Seleccion("Brasil", direcBrasil, "CONMEBOL", "src/img/selecciones/brasilR.jpg");
       Seleccion selecColombia=new Seleccion("Colombia", direcColombia, "CONMEBOL", "src/img/selecciones/colombiaR.jpg");
       Seleccion selecCorea=new Seleccion("Corea", direcCorea, "AFC", "src/img/selecciones/coreaR.jpg");
       Seleccion selecCostaRica=new Seleccion("Costa Rica", direcCostaRica, "CONMEBOL", "src/img/selecciones/costaRicaR.jpg");
       Seleccion selecCroacia=new Seleccion("Croacia", direcCroacia, "UEFA", "src/img/selecciones/croaciaR.jpg");
       Seleccion selecDinamarca=new Seleccion("Dinamarca", direcDinamarca, "UEFA", "src/img/selecciones/dinamarcaR.jpg");
       Seleccion selecEgipto=new Seleccion("Egipto", direcEgipto, "CAF", "src/img/selecciones/egiptoR.jpg");
       Seleccion selecEspania=new Seleccion("España", direcEspania, "UEFA", "src/img/selecciones/espaniaR.jpg");
       Seleccion selecFrancia=new Seleccion("Francia", direcFrancia, "UEFA", "src/img/selecciones/franciaR.jpg");
       Seleccion selecInglaterra=new Seleccion("Inglaterra", direcInglaterra, "UEFA", "src/img/selecciones/inglaterraR.jpg");
       Seleccion selecIran=new Seleccion("Irán", direcIran, "AFC", "src/img/selecciones/iranR.jpg");
       Seleccion selecIslandia=new Seleccion("Islandia", direcIslandia, "UEFA", "src/img/selecciones/islandiaR.jpg");
       Seleccion selecJapon=new Seleccion("Japón", direcJapon, "AFC", "src/img/selecciones/japonR.jpg");
       Seleccion selecMarruecos=new Seleccion("Marruecos", direcMarruecos, "CAF", "src/img/selecciones/marruecosR.jpg");
       Seleccion selecMexico=new Seleccion("México", direcMexico, "CONCACAF", "src/img/selecciones/mexicoR.jpg");
       Seleccion selecNigeria=new Seleccion("Nigeria", direcNigeria, "CAF", "src/img/selecciones/nigeriaR.jpg");
       Seleccion selecPanama=new Seleccion("Panamá", direcPanama, "CONCACAF", "src/img/selecciones/panamaR.jpg");
       Seleccion selecPeru=new Seleccion("Perú", direcPeru, "CONMEBOL", "src/img/selecciones/peruR.jpg");
       Seleccion selecPolonia=new Seleccion("Polonia", direcPolonia, "UEFA", "src/img/selecciones/poloniaR.jpg");
       Seleccion selecPortugal=new Seleccion("Portugal", direcPortugal, "UEFA", "src/img/selecciones/portugalR.jpg");
       Seleccion selecRusia=new Seleccion("Rusia", direcRusia, "UEFA", "src/img/selecciones/rusiaR.jpg");
       Seleccion selecSenegal=new Seleccion("Senegal", direcSenegal, "CAF", "src/img/selecciones/senegalR.jpg");
       Seleccion selecSerbia=new Seleccion("Serbia", direcSerbia, "UEFA", "src/img/selecciones/serbiaR.jpg");
       Seleccion selecSuecia=new Seleccion("Suecia", direcSuecia, "UEFA", "src/img/selecciones/sueciaR.jpg");
       Seleccion selecSuiza=new Seleccion("Suiza", direcSuiza, "UEFA", "src/img/selecciones/suizaR.jpg");
       Seleccion selecTunez=new Seleccion("Túnez", direcTunez, "AFC", "src/img/selecciones/tunezR.jpg");
       Seleccion selecUruguay=new Seleccion("Uruguay", direcUruguay, "CONMEBOL", "src/img/selecciones/uruguayR.jpg");

       //1º Bombo
       selecciones.add(selecRusia);
       selecciones.add(selecAlemania);
       selecciones.add(selecBrasil);
       selecciones.add(selecPortugal);
       selecciones.add(selecArgentina);
       selecciones.add(selecBelgica);  
       selecciones.add(selecPolonia);
       selecciones.add(selecFrancia);

       //2º Bombo
       selecciones.add(selecEspania);
       selecciones.add(selecPeru);
       selecciones.add(selecSuiza);
       selecciones.add(selecInglaterra);
       selecciones.add(selecColombia);
       selecciones.add(selecCroacia);
       selecciones.add(selecMexico);
       selecciones.add(selecUruguay);

       //3º bombo
       selecciones.add(selecDinamarca);
       selecciones.add(selecSuecia);
       selecciones.add(selecIslandia);
       selecciones.add(selecCostaRica);
       selecciones.add(selecTunez);
       selecciones.add(selecEgipto);
       selecciones.add(selecSenegal);
       selecciones.add(selecIran);


       //4º bombo
       selecciones.add(selecSerbia);
       selecciones.add(selecNigeria);
       selecciones.add(selecJapon);
       selecciones.add(selecMarruecos);
       selecciones.add(selecPanama);
       selecciones.add(selecCorea);
       selecciones.add(selecArabia);
       selecciones.add(selecAustralia);


       //String nom,int numCamisa, String primPos, int edad, String pai, int code,ImageIcon img

       Jugador uruguay_godin = new Jugador("Diego godin" , 3 ,"Defensa",31,"Uruguay",32,"src/img/jugadores/Uruguay/dGodin.png");
       Jugador uruguay_muslera = new Jugador("Fernando MUSLERA" , 1 ,"Arquero",32,"Uruguay",34,"src/img/jugadores/Uruguay/fmuslera.png");
       Jugador uruguay_Cavani = new Jugador("Edinson CAVANI" , 21 ,"Delantero",31,"Uruguay",33,"src/img/jugadores/Uruguay/eCavani.png");

       Jugador alemania_Ginter = new Jugador("Matthias GINTER" , 4 ,"Defensa",24,"Alemania",35,"src/img/jugadores/Alemania/mGinter.png");
       Jugador alemania_Neuer = new Jugador("Manuel NEUER" , 1 ,"Arquero",32,"Alemania",36,"src/img/jugadores/Alemania/mNeuer.png");
       Jugador alemania_gomez= new Jugador("Mario GOMEZ" , 23 ,"Delantero",33,"Alemania",37,"src/img/jugadores/Alemania/mGomez.png");

       Jugador arabia_AlMayouf= new Jugador("ABDULLAH ALMUAIOUF" , 1 ,"Arquero",31,"Arabia saudi",38,"src/img/jugadores/Arabia Saudi/aAlmuaiouf.png");
       Jugador arabia_HAWSAWI= new Jugador("OSAMA HAWSAWI" , 3 ,"Defensa",34,"Arabia saudi",39,"src/img/jugadores/Arabia Saudi/oHawsawi.png");
       Jugador arabia_ABU_RADIYAH= new Jugador("MUHANNAD ABU RADIYAH" , 20 ,"Delantero",32,"Arabia saudi",40,"src/img/jugadores/Arabia Saudi/mAsiri.png");

       Jugador argentina_Ansalidi= new Jugador("Cristian ANSALDI" , 4 ,"Defensa",32,"Argentina",41,"src/img/jugadores/Argentina/cAnsalidi.png");
       Jugador argentina_Messi= new Jugador("Lionel MESSI" , 10 ,"Delantero",31,"Argentina",42,"src/img/jugadores/Argentina/lMessi.png");
       Jugador argentina_Guzman= new Jugador("Nahuel GUZMAN" , 1 ,"Arquero",32,"Argentina",43,"src/img/jugadores/Argentina/nGuzman.png");

       alemania_Ginter.setAltura(1.70);
       jugadores.add(uruguay_godin);
       jugadores.add(uruguay_muslera);
       jugadores.add(uruguay_Cavani);
       jugadores.add(alemania_Ginter );
       jugadores.add(alemania_Neuer);
       jugadores.add(alemania_gomez);
       jugadores.add(arabia_AlMayouf);
       jugadores.add(arabia_HAWSAWI);
       jugadores.add(arabia_ABU_RADIYAH);
       jugadores.add(argentina_Ansalidi);
       jugadores.add(argentina_Messi);
       jugadores.add(argentina_Guzman);

       selecUruguay.agregarJugador(uruguay_godin);
       selecUruguay.agregarJugador(uruguay_Cavani);
       selecUruguay.agregarJugador(uruguay_muslera);

       selecAlemania.agregarJugador(alemania_Ginter);
       selecAlemania.agregarJugador(alemania_Neuer);
       selecAlemania.agregarJugador(alemania_gomez);

       selecArabia.agregarJugador(arabia_ABU_RADIYAH);
       selecArabia.agregarJugador(arabia_AlMayouf);
       selecArabia.agregarJugador(arabia_HAWSAWI);

       selecArgentina.agregarJugador(argentina_Ansalidi);
       selecArgentina.agregarJugador(argentina_Guzman);
       selecArgentina.agregarJugador(argentina_Messi);

       //Declaración de los grupos OFICIALES
       Fase grupoA = new Fase(Fase.GRUPO_A );
       Fase grupoB = new Fase(Fase.GRUPO_B );
       Fase grupoC = new Fase(Fase.GRUPO_C );
       Fase grupoD = new Fase(Fase.GRUPO_D );
       Fase grupoE = new Fase(Fase.GRUPO_E );
       Fase grupoF = new Fase(Fase.GRUPO_F );
       Fase grupoG = new Fase(Fase.GRUPO_G );
       Fase grupoH = new Fase(Fase.GRUPO_H );

       //Carga de grupos OFICIALES - Grupo A
       grupoA.getSeleciones().add(selecRusia);
       grupoA.getSeleciones().add(selecArabia);
       grupoA.getSeleciones().add(selecEgipto);
       grupoA.getSeleciones().add(selecUruguay);
       //Grupo B
       grupoB.getSeleciones().add(selecPortugal);
       grupoB.getSeleciones().add(selecEspania);
       grupoB.getSeleciones().add(selecMarruecos);
       grupoB.getSeleciones().add(selecIran);
       //Grupo C
       grupoC.getSeleciones().add(selecFrancia);
       grupoC.getSeleciones().add(selecAustralia);
       grupoC.getSeleciones().add(selecPeru);
       grupoC.getSeleciones().add(selecDinamarca);
       //Grupo D
       grupoD.getSeleciones().add(selecArgentina);
       grupoD.getSeleciones().add(selecIslandia);
       grupoD.getSeleciones().add(selecCroacia);
       grupoD.getSeleciones().add(selecNigeria);
       //Grupo E
       grupoE.getSeleciones().add(selecBrasil);
       grupoE.getSeleciones().add(selecSuiza);
       grupoE.getSeleciones().add(selecCostaRica);
       grupoE.getSeleciones().add(selecSerbia);
       //Grupo F
       grupoF.getSeleciones().add(selecAlemania);
       grupoF.getSeleciones().add(selecMexico);
       grupoF.getSeleciones().add(selecSuecia);
       grupoF.getSeleciones().add(selecCorea);
       //Grupo G
       grupoG.getSeleciones().add(selecBelgica);
       grupoG.getSeleciones().add(selecPanama);
       grupoG.getSeleciones().add(selecTunez);
       grupoG.getSeleciones().add(selecInglaterra);
       //Grupo H
       grupoH.getSeleciones().add(selecPolonia);
       grupoH.getSeleciones().add(selecSenegal);
       grupoH.getSeleciones().add(selecColombia);
       grupoH.getSeleciones().add(selecJapon);

       //Carga de fases OFICIALES
       fases.add(grupoA); 
       fases.add(grupoB);
       fases.add(grupoC);
       fases.add(grupoD);
       fases.add(grupoE);
       fases.add(grupoF);
       fases.add(grupoG);
       fases.add(grupoH);
   }
    
    public void simularDatos() //Metodo que se encarga de simular todos los datos de Fases
    {
        boolean reintento=false;
        do
        {
            reintento=false;
            //Se agregan los ArrayList de "bombos" al ArrayList "multidimensional"
            bombos.add(new ArrayList <Seleccion>()); 
            bombos.add(new ArrayList <Seleccion>());
            bombos.add(new ArrayList <Seleccion>());
            bombos.add(new ArrayList <Seleccion>());
            
            /*Se limpia el ArrayList de fases para que no haya conflictos a la hora de realizar la simulación varias veces
            y para eliminar los datos OFICIALES*/
            fases.get(0).limpiar();
            fases.get(1).limpiar();
            fases.get(2).limpiar();
            fases.get(3).limpiar();
            fases.get(4).limpiar();
            fases.get(5).limpiar();
            fases.get(6).limpiar();
            fases.get(7).limpiar();
            //Carga de bombos - Bombo A
            bombos.get(0).add(selecciones.get(1));
            bombos.get(0).add(selecciones.get(2));
            bombos.get(0).add(selecciones.get(3));
            bombos.get(0).add(selecciones.get(4));
            bombos.get(0).add(selecciones.get(5));
            bombos.get(0).add(selecciones.get(6));
            bombos.get(0).add(selecciones.get(7));
            //Bombo B
            bombos.get(1).add(selecciones.get(8));
            bombos.get(1).add(selecciones.get(9));
            bombos.get(1).add(selecciones.get(10));
            bombos.get(1).add(selecciones.get(11));
            bombos.get(1).add(selecciones.get(12));
            bombos.get(1).add(selecciones.get(13));
            bombos.get(1).add(selecciones.get(14));
            bombos.get(1).add(selecciones.get(15));
            //Bombo C
            bombos.get(2).add(selecciones.get(16));
            bombos.get(2).add(selecciones.get(17));
            bombos.get(2).add(selecciones.get(18));
            bombos.get(2).add(selecciones.get(19));
            bombos.get(2).add(selecciones.get(20));
            bombos.get(2).add(selecciones.get(21));
            bombos.get(2).add(selecciones.get(22));
            bombos.get(2).add(selecciones.get(23));
            //Bombo D
            bombos.get(3).add(selecciones.get(24));
            bombos.get(3).add(selecciones.get(25));
            bombos.get(3).add(selecciones.get(26));
            bombos.get(3).add(selecciones.get(27));
            bombos.get(3).add(selecciones.get(28));
            bombos.get(3).add(selecciones.get(29));
            bombos.get(3).add(selecciones.get(30));
            bombos.get(3).add(selecciones.get(31));   
            //Fin de carga de bombos
            Random r=new Random(System.currentTimeMillis()); //El currentTimeMillis es para sincronizar el random con el reloj interno del CPU en milisegundos, para que sea realmente aleatorio
            //Empieza la carga de datos a los grupos
            for (int i=0; i<8; i++) 
            {               
                if(i==0)
                {
                    fases.get(0).agregarSeleccion(selecciones.get(0)); //Carga Rusia a la primera posición del primer grupo, ya que es el anfitrión
                }
                else
                {
                    int numRandom=r.nextInt(bombos.get(0).size()); //Setea el Random con el tamaño del primer Bombo
                    fases.get(i).agregarSeleccion(bombos.get(0).get(numRandom));  //Carga una selección del bombo A al grupo A
                    bombos.get(0).remove(numRandom);
                }
                for (int j=1; j<4; j++)
                {
                    boolean randomVerif; //Boolean que informa si la selección aleatoria no coincide con ninguna confederación, a excepción de UEFA
                    int contadorUEFA;
                    if (fases.get(0).devolverSeleccion(0).getConfederacion().equals("UEFA"))
                    { 
                        //Si detecta que en la primera posición hay una selección con la confederación UEFA, aumenta el contador a 1 
                        contadorUEFA =1; 
                    }
                    else
                    {
                        contadorUEFA=0;
                    }
                    int numeroRandom;
                    Seleccion s;
                    String nombreSeleccionFalla=""; //Selección que falla muchas veces, se declara con comillas para evitar NullPointerException
                    int falloRepeat=0;  //Número de fallos 
                    do
                    {            
                        randomVerif=true; //Por defecto se considera que la selección es válida
                        numeroRandom=r.nextInt(bombos.get(j).size());
                        s=bombos.get(j).get(numeroRandom);

                        for (int k=0; k<fases.get(i).numeroSeleciones();k++) //Se recorren las selecciones cargadas
                        {
                            if(fases.get(i).devolverSeleccion(k).getConfederacion().equals(s.getConfederacion()) && s.getConfederacion().equals("UEFA") && contadorUEFA<2) //Comprueba UEFA para agregar hasta 2 según las reglas
                            {
                                contadorUEFA++;
                            }
                            else if (fases.get(i).devolverSeleccion(k).getConfederacion().equals(s.getConfederacion()))
                            {
                                randomVerif=false; //Se cambia a false porque se repite la confederación
                                    
                                if(nombreSeleccionFalla.equals(s.getNombre())){
                                    falloRepeat++; //En el caso que el error haya sido el mismo que el anterior, se aumenta el contador de fallas 
                                }
                                else
                                {  
                                    nombreSeleccionFalla=s.getNombre(); //Si el origen del fallo es otro se resetea el contador, y se cambia el origen del fallo anterior 
                                    falloRepeat=0;
                                }

                                if(falloRepeat>=3) //En el caso que ocurran 3 fallos se considera que entramos en un bucle infinito
                                { 
                                    randomVerif=true;
                                    reintento=true; //Notifica que se permita terminar la simulacion, para volver a repetirla por fallo
                                    break; //Rompe el bucle
                                }
                            }
                        }
                        if(reintento)
                        {
                            break; //Como falló arriba se resetea todo
                        } 
                    }
                    while(!randomVerif); 
                    //Se agrega la fase verificada y se elimina del bombo correspondiente
                    fases.get(i).agregarSeleccion(s);  
                    bombos.get(j).remove(numeroRandom);
                }
            }
        }
        while (reintento);
        //Se imprimen resultados por consola para verificar las reglas
        for(int i=0;i<8;i++)
        {
            System.out.println("Grupo " + i);
            for(int j=0;j<4;j++)
            {
                System.out.println(fases.get(i).devolverSeleccion(j).getNombre()+" - "+fases.get(i).devolverSeleccion(j).getConfederacion());
            }
            System.out.println("-------------------");
        }
    }
}
