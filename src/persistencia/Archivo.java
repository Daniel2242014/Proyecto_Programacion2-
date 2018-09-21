package Persistencia;

import javax.swing.JFileChooser;

public class Archivo {
    /*AGUSTIN LA CLASE MUN (Mundial.java) ESTA EN LOGICA, ESTA ES LA CLASE ARCHIVO, QUIEN INTERATUCA 
    CON EL S.O PARA GUARDAR Y ABRIR DOCUMENTOS .MUN*/
    
    private static Archivo instancia;
    
    public static Archivo getInstancia()
    {
        if (instancia==null)
        {
            instancia=new Archivo();
        }
        return instancia;
    }
    
    public boolean abrirArchivo()
    {
        JFileChooser a=new JFileChooser(); 
            /*TODA GUI TIENE QUE ESTAR EN PRESENTACION, LO QUE PODEMOS 
                 HACER ES QUE A ABIR ARCHIVO SE LE PASE UN FILE CON LA DIRECION A BUSCAR*/ 
        
    return false; //PARA QUE NO DE ERROR
    }
    
    
}
