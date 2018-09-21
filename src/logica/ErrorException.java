package logica;

public class ErrorException extends RuntimeException {
    public ErrorException (){
        super();
    }
    public ErrorException(String e){
        super(e);
    }
}
