package logica;


public class Jugador {
    private String primeraPosicion,segundaPosicion,fechaDebut,apellido,club,
            cedula,nombre,fechaNacimiento,pais;
    private int edad,golesTotales,faltasTotales;
    private double altura;
  
    public Jugador(String nom,String apeli, String pai,String code ){
        this.nombre=nom;
        this.apellido=apeli;
        this.cedula=code;
        this.pais=pai;
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

    public void setSegundaPosicion(String segundaPosicion) {
        this.segundaPosicion = segundaPosicion;
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public void setGolesTotales(int golesTotales) {
        this.golesTotales = golesTotales;
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
        /*FALTA COMPLETAR*/
    }
    
    public void agregar_falta(int numero){
        /*FALTA COMPLETAR*/
    }

    @Override
    public String toString() {
        return "Jugador{" + "primeraPosicion=" + primeraPosicion + ", segundaPosicion=" + segundaPosicion 
                +  ", fechaDebut=" + fechaDebut + ", apellido=" + apellido + ", club=" + club + ", cedula=" + cedula +
                ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", pais=" + pais + ", edad="
                + edad + ", golesTotales=" + golesTotales + ", faltasTotales=" 
                + faltasTotales + ", altura=" + altura + '}';
    }
    
    
    
}
