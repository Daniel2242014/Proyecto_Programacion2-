package logica;

import java.awt.Image;

public class Juez extends Persona {
    
    private int targetasAmarilias,targetasRojas;
    
    public Juez(int code,int edad, String nombre, String pais, Image img){
        super(code,edad,nombre,pais,img);
    }

    public int getTargetasAmarilias() {
        return targetasAmarilias;
    }

    public void setTargetasAmarilias(int targetasAmarilias) {
        this.targetasAmarilias = targetasAmarilias;
    }

    public int getTargetasRojas() {
        return targetasRojas;
    }

    public void setTargetasRojas(int targetasRojas) {
        this.targetasRojas = targetasRojas;
    }

    @Override
    public String toString() {
        return super.toString() +"\ntargetasAmarilias="
                + targetasAmarilias + ", targetasRojas=" + targetasRojas;
    }
    
    
}
