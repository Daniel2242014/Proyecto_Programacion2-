package logica;

import java.awt.Image;


public class Director extends Persona {
    
    int años_de_experiencia;
    String descripcion; //LA COPIAMOS DE LA PAGINA OFICIAL DEL MUNDIAL 
    
    public Director(int code,int años_ex, String desc,int edad, String nombre, String pais, Image img){
        super(code,edad, nombre, pais, img);
        descripcion=desc;
        años_de_experiencia=años_ex;
    }

    public int getAños_de_experiencia() {
        return años_de_experiencia;
    }

    public void setAños_de_experiencia(int años_de_experiencia) {
        this.años_de_experiencia = años_de_experiencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return super.toString() + "años_de_experiencia=" + años_de_experiencia + ",  \ndescripcion=" + descripcion ;
    }
    
    
    
}
