package Den.RSA.Exception;

public class NotFoundImageException extends Exception{

    public NotFoundImageException() {
    }

    public NotFoundImageException(String message) {  //mess clients
        super(message);
    }

    public NotFoundImageException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotFoundImageException(Throwable cause) {
        super(cause);
    }
}
