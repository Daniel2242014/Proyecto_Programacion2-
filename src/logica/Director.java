package logica;

import java.awt.Image;
import javax.swing.ImageIcon;


public class Director extends Persona {
    

    String descripcion; //LA COPIAMOS DE LA PAGINA OFICIAL DEL MUNDIAL 
    
    public Director(int code, String desc,int edad, String nombre, String pais, String img){
        super(code,edad, nombre, pais, img);
        descripcion=desc;

    }
    


    public String getDescripcion() {
        
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return super.toString()  + ",  \ndescripcion=" + descripcion ;
    }
    
    
    
}
