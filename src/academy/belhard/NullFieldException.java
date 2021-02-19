package academy.belhard;

// Непроверяемое исключение
public class NullFieldException extends RuntimeException {
    public NullFieldException(String message) {
        super(message);
    }

}
