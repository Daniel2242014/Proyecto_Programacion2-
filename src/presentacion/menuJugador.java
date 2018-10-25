package presentacion;
import fachada.Fachada;
import java.awt.Color;
import java.awt.GridLayout;
import logica.Jugador;
import logica.Seleccion;
/**
 * Clase que se encarga de cargar jugadores y directores al panel correspondiente
 * en la clase Listajugador y Listajugador, para luego ser mostrados en el
 * panelScroll-displayInterno de presentacion.Principal.
 */
public class menuJugador extends javax.swing.JPanel {
    /**
     * Constructor por defecto
     */
    public menuJugador(){
        //Carga al panel los jugadores y directores a aparecer en Jugador
        Principal.getInstancia().estiloMetal();
        this.setSize(750,260*Fachada.getInstancia().numeroPersonas());
        this.setLayout(new GridLayout(Fachada.getInstancia().numeroPersonas(),1));
        this.setBackground(Color.WHITE);
        for(Seleccion s: Fachada.getInstancia().getSelecciones()){
            for (Jugador a:s.debolberJugadores()){
                    this.add(new Listajugador(a));
            }
            this.add(new ListaDirector(s.getMaestro()));
        } 
    }
}
