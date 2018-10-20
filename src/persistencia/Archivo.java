package persistencia;
import logica.Mundial;
import fachada.Fachada;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Archivo {
    private static Archivo instancia;
    public static Archivo getInstancia() //Instancia de Archivo
    {
        if (instancia==null)
        {
            instancia=new Archivo();
        }
        return instancia;
       
    }
    //------- MANEJO DE ARCHIVOS ----------
    public boolean abrirArchivo(String ruta) //Ambos métodos de manejo de archivos son del tipo boolean para el manejo de errores
    {
        try
        {
            FileInputStream fis=new FileInputStream(ruta); //Toma los datos del Archivo
            ObjectInputStream ois=new ObjectInputStream(fis); //Pasa los datos del archivo a un objeto
            Mundial m=(Mundial) ois.readObject(); //Asigna los datos del InputStream a un objeto Mundial, el cual se va a encargar de pasar los datos a Fachada
            m.cargarFachada(); //Llama al método de Mundial que carga los datos a Fachada
            fis.close();
            ois.close();
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }
    
    public boolean guardarArchivo(String ruta) //Funciona igual que el método anterior, pero a la inversa
    {
        try
        {
            //Comprueba la extensión al guardar, si esta es incorrecta; lo corrije
            if (!ruta.substring(ruta.length()-4, ruta.length()).equalsIgnoreCase(".mun")){
                ruta+=".mun";
            }
            FileOutputStream fis=new FileOutputStream(ruta);
            ObjectOutputStream ois=new ObjectOutputStream(fis);
            ois.writeObject(new Mundial(Fachada.getInstancia().getFases(), Fachada.getInstancia().getJugadores(), Fachada.getInstancia().getSelecciones(), Fachada.getInstancia().getDirectores(), Fachada.getInstancia().getJueces())); //Vuelca los datos serializados al archivo *.mun 
            fis.close();
            ois.close();
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
}