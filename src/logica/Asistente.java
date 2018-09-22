package logica;

import java.awt.Image;

public class Asistente extends Persona {
    
    private String posicion;
    
    public Asistente (int code,String posicion,int edad, String nombre, String pais){
        super(code,edad, nombre, pais, null);
        this.posicion=posicion;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return super.toString() + "posicion=" + posicion ;
    }
    
    
    
}
