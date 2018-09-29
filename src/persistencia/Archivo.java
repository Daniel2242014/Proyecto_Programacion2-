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
        return false;
    }
    
    
}
