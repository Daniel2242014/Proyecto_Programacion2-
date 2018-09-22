package logica;

import java.awt.Image;
import java.io.Serializable;

public class Persona implements Serializable {

    private int code,edad;
    private String apellido,nombre,fechaNacimiento,pais;
    private Image img;
    private Juez primero,segundo,tercero,cuarto;
    
    public Persona (int code,int edad, String nombre, String pais, Image img){
        this.code=code;
        this.edad=edad;
        this.nombre=nombre;
        this.pais=pais;
        this.img=img;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "code=" + code + "\n edad=" + edad + ", apellido=" + apellido + 
                "\n nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento +
                "\n pais=" + pais;
    }
    
    
    
}



// IMCOMPLETO, LO TERMINO HOY 