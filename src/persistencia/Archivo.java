package persistencia;

import logica.*;
import fachada.Fachada;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
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
    
    public boolean abrirArchivo(String ruta)
    {
        try
        {
            Mundial m=new Mundial(Fachada.getInstancia().acciones, Fachada.getInstancia().fases, Fachada.getInstancia().jugadores, Fachada.getInstancia().partidos, Fachada.getInstancia().selecciones, Fachada.getInstancia().directores, Fachada.getInstancia().jueces, Fachada.getInstancia().extras);
            FileInputStream fis=new FileInputStream(ruta);
            ObjectInputStream ois=new ObjectInputStream(fis);
            m=(Mundial) ois.readObject(); 
            m.cargarFachada();
            fis.close();
            ois.close();
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean guardarArchivo(String ruta)
    {
        try
        {
            FileOutputStream fis=new FileOutputStream(ruta);
            ObjectOutputStream ois=new ObjectOutputStream(fis);
            if(Fachada.getInstancia().selecciones.isEmpty())
            {
                Fachada.getInstancia().sistemaBase();
            }
            Mundial s=new Mundial(Fachada.getInstancia().acciones, Fachada.getInstancia().fases, Fachada.getInstancia().jugadores, Fachada.getInstancia().partidos, Fachada.getInstancia().selecciones, Fachada.getInstancia().directores, Fachada.getInstancia().jueces, Fachada.getInstancia().extras);
            ois.writeObject(s);
            fis.close();
            ois.close();
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }
    
    
    
}
