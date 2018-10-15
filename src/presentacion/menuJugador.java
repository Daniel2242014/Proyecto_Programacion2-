package presentacion;

import javax.swing.JPanel;
import fachada.Fachada;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;
import logica.Jugador;
import logica.Seleccion;

public class menuJugador extends JPanel {
    
    public menuJugador(){
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
