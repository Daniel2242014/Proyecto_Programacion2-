package logica;

public class Jugador extends Persona {
    private String primeraPosicion,segundaPosicion,fechaDebut,club;
    private int golesTotales,faltasTotales,rojasTotales,amarillasTotales,numeroCamisa;
    private double altura;
    
    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }
    
  
    public Jugador(String nom,int numCamisa, String primPos,int e, String pai, int code,String img){
        super(code,e,nom,pai,img);
        primeraPosicion=primPos;
        this.numeroCamisa=numCamisa;
        fechaDebut="10/10/1990";
    }

    public int getRojasTotales() {
        return rojasTotales;
    }

    public void setRojasTotales(int rojasTotales) {
        if(rojasTotales>0){
            this.rojasTotales = rojasTotales;
        }
    }

    public int getAmarillasTotales() {
        return amarillasTotales;
    }

    public void setAmarillasTotales(int amarillasTotales) {
        if(amarillasTotales>0){
            this.amarillasTotales = amarillasTotales;
        }
    }
    
    public String getPrimeraPosicion() {
        return primeraPosicion;
    }

    public void setPrimeraPosicion(String primeraPosicion) {
        this.primeraPosicion = primeraPosicion;
    }

    public String getSegundaPosicion() {
        return segundaPosicion;
    }

    public void setSegundaPosicion(String s) throws ErrorException{
            if(this.primeraPosicion==null ||this.primeraPosicion.equalsIgnoreCase("Arquero")){
                throw new ErrorException("Un Arquero no puede tener segunda posicion ");
            }else if(primeraPosicion.equalsIgnoreCase(s)){
                throw new ErrorException("La segunda posicion no puede ser igual que la primera");
            }else if(s.equalsIgnoreCase("Defensa") || s.equalsIgnoreCase("Volante") || s.equalsIgnoreCase("Delantero") ){
                this.segundaPosicion = s;
            }else{
                throw new ErrorException("La segunda posicion puede ser 'Defensa','Volante' o 'Delantero' ");
            }
            
    }
    

    public String getFechaDebut() {
        return fechaDebut;
    }

    public void setFechaDebut(String fechaDebut) {
        this.fechaDebut = fechaDebut;
    }


    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }




    public int getGolesTotales() {
        return golesTotales;
    }

   public void setGoles( int amarilia, int roja, int total){
       if((amarilia+roja)<total){
           this.amarillasTotales=amarilia;
           this.rojasTotales=roja;
           this.faltasTotales=total;
       }
   }

    public int getFaltasTotales() {
        return faltasTotales;
    }

    public void setFaltasTotales(int faltasTotales) {
        this.faltasTotales = faltasTotales;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void agregar_gol(int numero){
        this.golesTotales+=numero;
    }
    
    public void agregar_falta(int numero,int tipo) {
         if(tipo==Acciones.TOTAL){
            rojasTotales+=numero;
        }else if(tipo==Acciones.PARCIAL){
            amarillasTotales+=numero;
        }
        this.faltasTotales+=numero;
    }

    public boolean equals(Object obj) {
        Jugador aux = (Jugador) obj;
        if(super.getCode()==aux.getCode() && this.getPais().equalsIgnoreCase(aux.getPais())){
            return true;
        }else{
            return false;
        }
    }
    
    public String toString() {
        return  super.toString() +"\nprimeraPosicion=" + primeraPosicion + ", segundaPosicion=" + segundaPosicion 
                +  "\nfechaDebut=" + fechaDebut  + ", club=" + club + ", golesTotales=" + golesTotales + "\nfaltasTotales=" 
                + faltasTotales + ", altura=" + altura ;
    }

    
    
    
    
}
