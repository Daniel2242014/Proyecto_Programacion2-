package Persistencia;

import javax.swing.JFileChooser;

public class Mun {
    private static Mun instancia;
    
    public static Mun getInstancia()
    {
        if (instancia==null)
        {
            instancia=new Mun();
        }
        return instancia;
    }
    
    public boolean abrirArchivo()
    {
        JFileChooser a=new JFileChooser();
        
    }
    
    
}
