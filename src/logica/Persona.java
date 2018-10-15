package logica;
import java.awt.Image;
import java.io.Serializable;
import javax.swing.ImageIcon;

public class Persona implements Serializable {

    private int code,edad;
    private String nombre,pais;
    private ImageIcon img;
    
    public Persona (int code,int edad, String nombre, String pais, ImageIcon img){
        this.code=code;
        this.edad=edad;
        this.pais=pais;
        this.img=img;
        this.nombre=nombre;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public ImageIcon getImg() {
        return img;
    }

    public void setImg(ImageIcon img) {
        this.img = img;
    }

    public boolean equals(Object o){
        Persona p = (Persona) o;
        if(this.code==p.getCode()){
            return true;
        }else{
            return false;
        }
            
    }
    
    @Override
    public String toString() {
        return "code=" + code + "\n edad=" + edad + 
                "\n nombre=" + nombre +
                "\n pais=" + pais;
    }
    
    
    
}



// IMCOMPLETO, LO TERMINO HOY 