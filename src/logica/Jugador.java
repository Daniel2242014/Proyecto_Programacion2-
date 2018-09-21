package logica;

public class Jugador {
    private String primeraPosicion,segundaPosicion,fechaDebut,apellido,club,
            nombre,fechaNacimiento,pais;
    private int edad,golesTotales,faltasTotales,rojasTotales,amarillasTotales,code;
    private double altura;
  
    public Jugador(String nom,String apeli, String pai, int code){
        this.nombre=nom; 
        this.apellido=apeli;
        this.pais=pai;
        this.code=code;   
        
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code=code;
        
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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
        if(code==aux.code && this.pais.equalsIgnoreCase(aux.getPais())){
            return true;
        }else{
            return false;
        }
    }
    
    public String toString() {
        return "Jugador{" + "primeraPosicion=" + primeraPosicion + ", segundaPosicion=" + segundaPosicion 
                +  ", fechaDebut=" + fechaDebut + ", apellido=" + apellido + ", club=" + club + ", cedula=" + code +
                ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", pais=" + pais + ", edad="
                + edad + ", golesTotales=" + golesTotales + ", faltasTotales=" 
                + faltasTotales + ", altura=" + altura + '}';
    }

    
    
    
    
}
