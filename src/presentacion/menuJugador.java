package presentacion;

import javax.swing.JPanel;
import fachada.Fachada;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;
import logica.Jugador;

public class menuJugador extends JPanel {
    
    private static menuJugador initi;
    
    public static menuJugador getInstancia(){
        if(initi==null){
            initi= new menuJugador();
        }
        return initi; 
    }
    
    private menuJugador(){
         for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) 
        {
            if ("Metal".equals(info.getName())) 
            {
                try {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            }
        }
       
        this.setSize(800,250*Fachada.getInstancia().jugadores.size());
        this.setLayout(new GridLayout(Fachada.getInstancia().jugadores.size(),1));
        this.setBackground(Color.WHITE);
        for (Jugador a:Fachada.getInstancia().jugadores){
                this.add(new jugador(a));
        }
    }
    
}
