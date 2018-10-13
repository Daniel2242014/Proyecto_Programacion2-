package persistencia;

import java.io.File;
import javax.swing.JFileChooser;

public class Archivo {

    private static Archivo instancia;
    public static Archivo getInstancia()
    {
        if (instancia==null)
        {
            instancia=new Archivo();
        }
        return instancia;
    }
    
    public boolean abrirArchivo(File a)
    {
        return false;
    }
    
    public boolean guardarArchivo(File a)
    {
        return false;
    }
    
    
    
}
