package fachada;
import persistencia.Archivo;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import logica.*;

public class Fachada{
    //---------- Arraylists de toda la información del programa ---------
    private static Fachada instancia;
    public ArrayList<Acciones> acciones;
    public ArrayList<Fase> fases;
    public ArrayList<Jugador> jugadores;
    public ArrayList<Partido> partidos;
    public ArrayList<Seleccion> selecciones;
    public ArrayList<Director> directores;
    public ArrayList<Juez> jueces;
    public ArrayList<Extra> extras;

    private Fachada() {
         acciones=new ArrayList();
         fases=new ArrayList();
         jugadores=new ArrayList();
         partidos=new ArrayList();
         selecciones=new ArrayList();
         directores=new ArrayList();
         jueces=new ArrayList();
         extras=new ArrayList();
     }
    
    public static Fachada getInstancia() //Instancia de fachada
    {
        if (instancia == null) 
        {
            instancia = new Fachada();
        }
        return instancia;
    }
    
    public boolean abrirMun(String a) //Llama al método de Archivo, tal como lo dice el patrón Facade
    {
        return Archivo.getInstancia().abrirArchivo(a);
    }
    
    public boolean guardarMun(String a) //Igual que el anterior, pero inverso
    {
        return Archivo.getInstancia().guardarArchivo(a);
    }
    
    //-------------------------------- METODOS QUE OPERAN CON LOS DATOS DIRECTAMENTE ---------------------------------------
    
    public void sistemaBase() { //Se encarga de la creación y asignación de todos los datos base oficiales sobre el Mundial
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
                + "de fútbol de Suecia.", 58, "Janee Andersson", "Suecia", new ImageIcon("src/img/default.jpg"));

        Director direcRusia = new Director(1, "Antes de su nombramiento como seleccionador de Rusia en "
                + "2016, había entrenado a clubes de Austria, Rusia y Polonia, donde conquistó con el Legia de"
                + " Varsovia el título de liga en la temporada 2"
                + "015-2016", 55, "CHERCHESOV STANISLAV", "Rusia", new ImageIcon("src/img/default.jpg"));

        Director direcSenegal = new Director(2, "Tras colgar las botas, Cisse ingresó en el cuerpo técnico "
                + "de la selección senegalesa. En 2015 sucedió a Alain"
                + " Giresse en el banquillo.", 42, "Cisse Aliou", "Senegal", new ImageIcon("src/img/default.jpg"));

        Director direcEgipto = new Director(3, "Llega a Rusia 2018 luego de tres años al frente de los Faraones"
                + ", a los que condujo hasta la final de la Copa Africana de Naciones 2017, y de nuevo a una fase"
                + " final mundialista tras 28 años de ausencia.", 62, "Cuper Hector", "Egipto", new ImageIcon("src/img/default.jpg"));

        Director direcCroacia = new Director(4, "Tras haber sustituido a Ante Cacic al frente de la selección"
                + " absoluta de Croacia en octubre de 2017, Dalic logró alcanzar la repesca con una victoria"
                + " decisiva en la última jornada y, tras imponerse en el doble enfrentamiento contra Grecia,"
                + " selló la clasificación de Croacia"
                + " para Rusia 2018.", 51, "Dalic Zalatko", "Croacia", new ImageIcon("src/img/default.jpg"));

        Director direcFrancia = new Director(5, "Didier Deschamps, uno de los jugadores más laureados"
                + " del fútbol francés, dirigió con éxito al Mónaco, a la Juventus y al Olympique de Marsella. "
                + "Fue nombrado seleccionador de Francia tras la Eurocopa 2012: cuartofinalista en el"
                + " Mundial de 2014 y "
                + "subcampeón en la Eurocopa 2016.", 49, "Deschamps Didier", "Francia", new ImageIcon("src/img/default.jpg"));

        Director direcPeru = new Director(6, "Tras ser un exitoso delantero centro, Ricardo Gareca empezó"
                + " como entrenador en Argentina. Tuvo experiencias en Colombia, Perú y Brasil. Ganó cuatro "
                + "títulos de liga. En marzo de 2015 asumió como DT de la selección peruana, a la que llevó al "
                + "Mundial tras 36 años de ausencia.", 60, "Gareca Ricardo", "Peru", new ImageIcon("src/img/default.jpg"));

        Director direcPanama = new Director(7, "SIN DESCRIPCION", 62, "Gomez Hernan", "Panama", new ImageIcon("src/img/default.jpg"));

        Director direcIslandia = new Director(8, "Ex dentista de profesión, Lallgrimsson fue nombrado en 2011 "
                + "ayudante del entonces seleccionador de Islandia, Lars Lagerback, y, dos años después, pasó a "
                + "dirigir al equipo conjuntamente con el sueco. Tras la histórica actuación en la Eurocopa 2016,"
                + " asumió en solitario las riendas, clasificándola"
                + " para su primer Mundial.", 51, "Hallgrimsson Heimir", "islandia", new ImageIcon("src/img/default.jpg"));

        Director direcDinamarca = new Director(9, "Age Hareide, un ex defensa con experiencia en la primera "
                + "división inglesa, fue internacional 50 veces con Noruega entre 1976 y 1986. Como entrenador, "
                + "ha ganado títulos de liga en tres países y dirigió a la selección noruega. En Dinamarca sucedió "
                + "a Morten Olsen a finales de 2015.", 63, "Hareider Age", "Dinamarca", new ImageIcon("src/img/default.jpg"));

        Director direcEspania = new Director(10, "SIN DESCRIPCION", 50, "Hierro Fernando", "España", new ImageIcon("src/img/default.jpg"));

        Director direcMexico = new Director(11, "SIN DESCRIPCION", 57, "Juan carlos osorio", "Mexico", new ImageIcon("src/img/default.jpg"));

        Director direcSerbia = new Director(12, "Elegido como seleccionador serbio a finales de 2017, Krstajic"
                + " desarrolló una carrera como defensor principalmente en Alemania. Disputó la Copa Mundial "
                + "de la FIFA Alemania 2006.", 44, "Krstajic MLaden", "Serbia", new ImageIcon("src/img/default.jpg"));

        Director direcAlemania = new Director(13, "Bajo la batuta de Loew, Alemania conquistó el Mundial"
                + " en 2014 tras haber quedado tercero en 2010, y ganó la Copa FIFA Confederaciones 2017. "
                + "Asimismo, ha alcanzado una final (2008) y dos semifinales (2012, 2016) en las tres últimas e"
                + "diciones de la Eurocopa.", 58, "Low Joachim", "Alemania", new ImageIcon("src/img/default.jpg"));

        Director direcTunez = new Director(14, "Nabil Maâloul fue ayudante de Roger Lemerre durante la "
                + "campaña triunfal de Túnez en la Copa Africana de Naciones 2004, disfrutó de un gran éxito a"
                + " su regreso al Esperance de su país y llevó a Kuwait a la Copa Asiática 2015. Es su segunda "
                + "etapa como seleccionador tunecino.", 56, "Maaloul Nabil", "Tunes", new ImageIcon("src/img/default.jpg"));

        Director direcBelgica = new Director(15, "A las órdenes del técnico español, los  _Diablos Rojos_  "
                + "se convirtieron en el primer país de la UEFA en clasificarse para Rusia 2018, y lo hicieron sin"
                + " conocer la derrota.", 45, "Martinez Roberto", "Belgica", new ImageIcon("src/img/default.jpg"));

        Director direcPolonia = new Director(16, "Como técnico, ha acumulado experiencia con diferentes "
                + "equipos, primero como asistente y después como primer entrenador. Lleva la batuta de "
                + "Polonia desde 2013.", 60, "Nawalka Adam", "Polonia", new ImageIcon("src/img/default.jpg"));

        Director direcJapon = new Director(30, "Este antiguo centrocampista fue 12 veces internacional entre "
                + "1977 y 1978. Tras colgar las botas, entrenó a los combinados nipones de"
                + " categorías menores.", 63, "NISHINO Akira", "Japon", new ImageIcon("src/img/default.jpg"));

        Director direcColombia = new Director(17, "Bajo su batuta, los _Cafeteros _consiguieron en Brasil "
                + "2014 su mejor resultado hasta la fecha en un Mundial, "
                + "accediendo a cuartos.", 69, "PEKERMAN Jose", "Colombia", new ImageIcon("src/img/default.jpg"));

        Director direcSuiza = new Director(18, "Tomó las riendas del equipo nacional luego de Brasil 2014 y,"
                + " hasta la fecha, ha conseguido clasificar al cuadro helvético a la EURO "
                + "2016 y ahora Rusia 2018", 55, "PETKOVIC Vladimir", "Suiza", new ImageIcon("src/img/default.jpg"));

        Director direcArabia = new Director(19, "Pizzi se ha desempeñado como entrenador en Perú, "
                + "Chile, España, México y Argentina. Con 'La Roja' quedó subcampeón de la Copa FIFA "
                + "Confederaciones 2017.", 50, "PIZZI Juan Antonio", "Arrabia Saudita", new ImageIcon("src/img/default.jpg"));

        Director direcIran = new Director(20, "Desde abril de 2011, Queiroz dirige a la selección de Irán, a "
                + "la que clasificó para el Mundial de 2014, para la Copa Asiática 2015 y, "
                + "ahora, para Rusia 2018.", 65, "QUEIROZ Carlos", "Iran", new ImageIcon("src/img/default.jpg"));

        Director direcCostaRica = new Director(21, "Como jugador de la Sele participó en Italia 1990 y "
                + "completó cuatro fases de clasificación mundialistas. En los banquillos, destaca su paso "
                + "por la Liga Deportiva Alajuelense y los tres años que lleva al frente del equipo tico, a quien"
                + " condujo hasta las semifinales de"
                + " la Copa Oro 2017", 50, "RAMIREZ Oscar", "Costa Rica", new ImageIcon("src/img/default.jpg"));

        Director direcMarruecos = new Director(22, "En febrero de 2016, el francés fue elegido para"
                + " hacerse cargo de la selección de Marruecos y logró clasificar a los norteafricanos para su"
                + " primer Mundial en 20 años", 50, "RENARD Herve", "Marruecos", new ImageIcon("src/img/default.jpg"));

        Director direcNigeria = new Director(23, "El alemán Gernot Rohr tiene basta experiencia como seleccionador"
                + ". De hecho, Nigeria es el cuarto país africano al que conduce. Los anteriores fueron Gabón"
                + ", Níger y Burkina Faso, a la que incluso dirigió en dos sus partidos del clasificatorio para Rusia "
                + "2018. Asumió el mando de Nigeria en 2016.", 65, "ROHR Gernot", "Nigeria", new ImageIcon("src/img/default.jpg"));

        Director direcArgentina = new Director(24, "En junio de 2017, Sampaoli dimitió como técnico del Sevilla para ser "
                + "nombrado seleccionador de su Argentina natal. Tras haber dirigido ya a Chile en 4 partidos de clasificación"
                + " para Rusia 2018, condujo a la_ Albiceleste_ a"
                + " clasificarse para ese Mundial", 58, "SAMPAOLI Jorge", "Argentina", new ImageIcon("src/img/default.jpg"));

        Director direcPortugal = new Director(25, "Dirige a Portugal desde septiembre de 2014, y ha guiado"
                + " a los portugueses hasta la victoria en la EURO 2016, además de en la Copa FIFA"
                + " Confederaciones, donde quedaron terceros.", 64, "SANTOS Fernando", "Portugal", new ImageIcon("src/img/default.jpg"));

        Director direcCorea = new Director(26, "En junio de 2017, Shin fue elegido para suceder a Uli Stielike "
                + "en el cargo de seleccionador del"
                + " combinado nacional absoluto.", 49, "SHIN Taeyong", "Correa", new ImageIcon("src/img/default.jpg"));

        Director direcInglaterra = new Director(27, "Su carrera de entrenador la inició en el Middlesbrough y,"
                + " en 2013, fue nombrado seleccionador nacional sub-21. En septiembre de 2016, asumió la"
                + " batuta de los Pross.", 48, "SOUTHGATE Gareth", "Inglaerra", new ImageIcon("src/img/default.jpg"));

        Director direcUruguay = new Director(28, "Tras aquel primer ciclo al frente de Uruguay,"
                + " en el que disputó el Mundial de Italia 1990, su segundo paso por la selección ha marcado"
                + " un antes y un después para la Celeste. No sólo ganó una Copa América, sino que se apresta"
                + " a disputar en Rusia su tercer Mundial"
                + "secutivo.", 71, "TABAREZ Oscar", "Uruguay", new ImageIcon("src/img/default.jpg"));

        Director direcBrasil = new Director(29, "En junio de 2016, Tite asumió en la selección de Brasil. "
                + "Gracias a una excepcional eliminatoria desde su llegada, el equipo se convirtió en "
                + "el primer país en obtener su billete a Rusia. Antes, sus mayores éxitos en clubes los"
                + " obtuvo durante sus tres etapas distintas al frente del"
                + " Corinthians.", 57, "TITE", "Brasil", new ImageIcon("src/img/default.jpg"));

        Director direcAustralia = new Director(31, "Van Marwijk dirigió a Países Bajos entre 2008 y 2012, "
                + "quedando  subcampeón en Sudáfrica 2010. En 2015 tomó las riendas de Arabia Saudí y "
                + "clasificó al equipo para Rusia 2018, pero dimitió poco después. En enero de 2018 fue "
                + "designado para entrenar a Au"
                + "stralia.", 66, "VAN MARWIJK Bert", "Australia", new ImageIcon("src/img/default.jpg"));

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
        
        Seleccion selecAlemania=new Seleccion("Alemania", direcAlemania, "UEFA", new ImageIcon("src/img/selecciones/alemaniaR.jpg"));
        Seleccion selecArgentina=new Seleccion("Argentina", direcArgentina, "CONMEBOL", new ImageIcon("src/img/selecciones/argentinaR.jpg"));
        Seleccion selecArabia=new Seleccion("Arabia", direcArabia, "AFC", new ImageIcon("src/img/selecciones/arabiaSauditaR.jpg"));
        Seleccion selecAustralia=new Seleccion("Australia", direcAustralia, "AFC", new ImageIcon("src/img/selecciones/australiaR.jpg"));
        Seleccion selecBelgica=new Seleccion("Bélgica", direcBelgica, "UEFA", new ImageIcon("src/img/selecciones/belgicaR.jpg"));
        Seleccion selecBrasil=new Seleccion("Brasil", direcBrasil, "CONMEBOL", new ImageIcon("src/img/selecciones/brasilR.jpg"));
        Seleccion selecColombia=new Seleccion("Colombia", direcColombia, "CONMEBOL", new ImageIcon("src/img/selecciones/colombiaR.jpg"));
        Seleccion selecCorea=new Seleccion("Corea", direcCorea, "AFC", new ImageIcon("src/img/selecciones/coreaR.jpg"));
        Seleccion selecCostaRica=new Seleccion("Costa Rica", direcCostaRica, "CONMEBOL", new ImageIcon("src/img/selecciones/costaRicaR.jpg"));
        Seleccion selecCroacia=new Seleccion("Croacia", direcCroacia, "UEFA", new ImageIcon("src/img/selecciones/croaciaR.jpg"));
        Seleccion selecDinamarca=new Seleccion("Dinamarca", direcDinamarca, "UEFA", new ImageIcon("src/img/selecciones/dinamarcaR.jpg"));
        Seleccion selecEgipto=new Seleccion("Egipto", direcEgipto, "CAF", new ImageIcon("src/img/selecciones/egiptoR.jpg"));
        Seleccion selecEspania=new Seleccion("España", direcEspania, "UEFA", new ImageIcon("src/img/selecciones/espaniaR.jpg"));
        Seleccion selecFrancia=new Seleccion("Francia", direcFrancia, "UEFA", new ImageIcon("src/img/selecciones/franciaR.jpg"));
        Seleccion selecInglaterra=new Seleccion("Inglaterra", direcInglaterra, "UEFA", new ImageIcon("src/img/selecciones/inglaterraR.jpg"));
        Seleccion selecIran=new Seleccion("Irán", direcIran, "AFC", new ImageIcon("src/img/selecciones/iranR.jpg"));
        Seleccion selecIslandia=new Seleccion("Islandia", direcIslandia, "UEFA", new ImageIcon("src/img/selecciones/islandiaR.jpg"));
        Seleccion selecJapon=new Seleccion("Japón", direcJapon, "AFC", new ImageIcon("src/img/selecciones/japonR.jpg"));
        Seleccion selecMarruecos=new Seleccion("Marruecos", direcMarruecos, "CAF", new ImageIcon("src/img/selecciones/marruecosR.jpg"));
        Seleccion selecMexico=new Seleccion("México", direcMexico, "CONCACAF", new ImageIcon("src/img/selecciones/mexicoR.jpg"));
        Seleccion selecNigeria=new Seleccion("Nigeria", direcNigeria, "CAF", new ImageIcon("src/img/selecciones/nigeriaR.jpg"));
        Seleccion selecPanama=new Seleccion("Panamá", direcPanama, "CONCACAF", new ImageIcon("src/img/selecciones/panamaR.jpg"));
        Seleccion selecPeru=new Seleccion("Perú", direcPeru, "CONMEBOL", new ImageIcon("src/img/selecciones/peruR.jpg"));
        Seleccion selecPolonia=new Seleccion("Polonia", direcPolonia, "UEFA", new ImageIcon("src/img/selecciones/poloniaR.jpg"));
        Seleccion selecPortugal=new Seleccion("Portugal", direcPortugal, "UEFA", new ImageIcon("src/img/selecciones/portugalR.jpg"));
        Seleccion selecRusia=new Seleccion("Rusia", direcRusia, "UEFA", new ImageIcon("src/img/selecciones/rusiaR.jpg"));
        Seleccion selecSenegal=new Seleccion("Senegal", direcSenegal, "CAF", new ImageIcon("src/img/selecciones/senegalR.jpg"));
        Seleccion selecSerbia=new Seleccion("Serbia", direcSerbia, "UEFA", new ImageIcon("src/img/selecciones/serbiaR.jpg"));
        Seleccion selecSuecia=new Seleccion("Suecia", direcSuecia, "UEFA", new ImageIcon("src/img/selecciones/sueciaR.jpg"));
        Seleccion selecSuiza=new Seleccion("Suiza", direcSuiza, "UEFA", new ImageIcon("src/img/selecciones/suizaR.jpg"));
        Seleccion selecTunez=new Seleccion("Túnez", direcTunez, "AFC", new ImageIcon("src/img/selecciones/tunezR.jpg"));
        Seleccion selecUruguay=new Seleccion("Uruguay", direcUruguay, "CONMEBOL", new ImageIcon("src/img/selecciones/uruguayR.jpg"));
   
        selecciones.add(selecAlemania);
        selecciones.add(selecArgentina);
        selecciones.add(selecArabia);
        selecciones.add(selecAustralia);
        selecciones.add(selecBelgica);
        selecciones.add(selecBrasil);
        selecciones.add(selecColombia);
        selecciones.add(selecCorea);
        selecciones.add(selecCostaRica);
        selecciones.add(selecCroacia);
        selecciones.add(selecDinamarca);
        selecciones.add(selecEgipto);
        selecciones.add(selecEspania);
        selecciones.add(selecFrancia);
        selecciones.add(selecInglaterra);
        selecciones.add(selecIran);
        selecciones.add(selecIslandia);
        selecciones.add(selecJapon);
        selecciones.add(selecMarruecos);
        selecciones.add(selecMexico);
        selecciones.add(selecNigeria);
        selecciones.add(selecPanama);
        selecciones.add(selecPeru);
        selecciones.add(selecPolonia);
        selecciones.add(selecPortugal);
        selecciones.add(selecRusia);
        selecciones.add(selecSenegal);
        selecciones.add(selecSerbia);
        selecciones.add(selecSuecia);
        selecciones.add(selecSuiza);
        selecciones.add(selecTunez);
        selecciones.add(selecUruguay);
    }
}
