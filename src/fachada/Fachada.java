package fachada;

public class Fachada {
    
    private static Fachada instancia;
    
    public static Fachada getInstancia() {
        if (instancia == null) {
            instancia = new Fachada();
        }
        return instancia;
    }
    
    public boolean abrirMun()
    {
        
    }
    
}
